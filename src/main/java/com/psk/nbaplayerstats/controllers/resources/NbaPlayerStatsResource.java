package com.psk.nbaplayerstats.controllers.resources;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NbaPlayerStatsResource extends RepresentationModel<NbaPlayerStatsResource> {
    private Long id;
    private String player;
    private String position;
    private String age;
    private String team;
    private int games;
    private int minutesPlayed;
    private BigDecimal playerEfficiencyRating;
    private BigDecimal trueShootingPercentage;
    private BigDecimal threePointAttemptRate;
    private BigDecimal freeThrowAttemptRate;
    private BigDecimal defensiveReboundPercentage;
    private BigDecimal totalReboundPercentage;
    private BigDecimal assistPercentage;
    private BigDecimal stealPercentage;
    private BigDecimal blockPercentage;
    private BigDecimal turnoverPercentage;
    private BigDecimal usageRate;
    private BigDecimal offensiveWinShares;
    private BigDecimal defensiveWinShares;
    private BigDecimal winShares;
    private BigDecimal winSharesPer48Minutes;
    private BigDecimal offensiveBoxPlusMinus;
    private BigDecimal defensiveBoxPlusMinus;
    private BigDecimal boxPlusMinus;
    private BigDecimal valueOverReplacement;
}
