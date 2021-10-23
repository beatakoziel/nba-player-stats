package com.psk.nbaplayerstats;

import com.psk.nbaplayerstats.repositories.NbaPlayerStatsRepository;
import com.psk.nbaplayerstats.repositories.entities.NbaPlayerStats;
import com.psk.nbaplayerstats.utilities.filters.NbaPlayerStatsQueryFilters;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import static com.psk.nbaplayerstats.utilities.specifications.NbaPlayerStatsSpecifications.getNbaPlayerStatsSpecification;

@Service
@RequiredArgsConstructor
public class NbaPlayerStatsService {

    private final NbaPlayerStatsRepository nbaPlayerStatsRepository;

    public Page<NbaPlayerStats> getNbaPlayerStatsPage(NbaPlayerStatsQueryFilters filters, Pageable pageable) {
        Specification<NbaPlayerStats> specification = getNbaPlayerStatsSpecification(filters);
        return nbaPlayerStatsRepository.findAll(specification, pageable);
    }
}
