package com.psk.nbaplayerstats.services;

import com.opencsv.bean.CsvToBeanBuilder;
import com.psk.nbaplayerstats.repositories.NbaPlayerStatsRepository;
import com.psk.nbaplayerstats.repositories.entities.NbaPlayerStats;
import com.psk.nbaplayerstats.utilities.filters.NbaPlayerStatsQueryFilters;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import static com.psk.nbaplayerstats.utilities.specifications.NbaPlayerStatsSpecifications.getNbaPlayerStatsSpecification;

@Slf4j
@Service
@RequiredArgsConstructor
public class NbaPlayerStatsService {

    private final NbaPlayerStatsRepository nbaPlayerStatsRepository;

    @Value("${files.paths.nba-player-stats}")
    private String nbaPlayerStatsPath;

    public Page<NbaPlayerStats> getNbaPlayerStatsPage(NbaPlayerStatsQueryFilters filters, Pageable pageable) {
        Specification<NbaPlayerStats> specification = getNbaPlayerStatsSpecification(filters);
        return nbaPlayerStatsRepository.findAll(specification, pageable);
    }

    @EventListener(ApplicationReadyEvent.class)
    private void loadStatsRecordsFromFile() {
        log.info("Initializing database with stats data");
        if (nbaPlayerStatsRepository.count() != 0) {
            log.info("Database already initialized - use reload method to delete records and load again");
            return;
        }
        List<NbaPlayerStats> records = null;
        try {
            records = new CsvToBeanBuilder(new FileReader(getClass().getResource(nbaPlayerStatsPath).getPath()))
                    .withType(NbaPlayerStats.class)
                    .build()
                    .parse();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        nbaPlayerStatsRepository.saveAll(records);
        log.info(String.format("Finished initialization with %s records", nbaPlayerStatsRepository.count()));
    }

    public void reloadRecordsFromFile() {
        nbaPlayerStatsRepository.deleteAll();
        List<NbaPlayerStats> stats = nbaPlayerStatsRepository.findAll();
        loadStatsRecordsFromFile();
    }
}
