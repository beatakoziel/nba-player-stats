package com.psk.nbaplayerstats.repositories;

import com.psk.nbaplayerstats.repositories.entities.NbaPlayerStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface NbaPlayerStatsRepository extends JpaRepository<NbaPlayerStats, UUID>,
        JpaSpecificationExecutor<NbaPlayerStats> {
}
