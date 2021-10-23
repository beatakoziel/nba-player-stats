package com.psk.nbaplayerstats.utilities.specifications;

import com.psk.nbaplayerstats.repositories.entities.NbaPlayerStats;
import com.psk.nbaplayerstats.repositories.entities.NbaPlayerStats_;
import com.psk.nbaplayerstats.utilities.filters.NbaPlayerStatsQueryFilters;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.Specification;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class NbaPlayerStatsSpecifications {

    public static Specification<NbaPlayerStats> getNbaPlayerStatsSpecification(NbaPlayerStatsQueryFilters filters) {
        Specification<NbaPlayerStats> specification = Specification.where(null);
        if (filters.getPlayer() != null) {
            specification = specification.and(playerNameLike(filters.getPlayer()));
        }
        return specification;
    }

    public static Specification<NbaPlayerStats> playerNameLike(String name) {
        String pattern = "%" + name.toLowerCase() + "%";
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.like(criteriaBuilder.lower(root.get(NbaPlayerStats_.PLAYER)), pattern);
    }

}
