package com.psk.nbaplayerstats.controllers.assemblers;

import com.psk.nbaplayerstats.controllers.NbaPlayerStatsController;
import com.psk.nbaplayerstats.controllers.resources.NbaPlayerStatsResource;
import com.psk.nbaplayerstats.repositories.entities.NbaPlayerStats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

@Component
public class NbaPlayerStatsAssembler extends RepresentationModelAssemblerSupport<NbaPlayerStats,
        NbaPlayerStatsResource> {

    @Autowired
    public NbaPlayerStatsAssembler() {
        super(NbaPlayerStatsController.class, NbaPlayerStatsResource.class);
    }

    @Override
    public NbaPlayerStatsResource toModel(NbaPlayerStats entity) {
        return NbaPlayerStatsResource.builder()
                .id(entity.getId())
                .player(entity.getPlayer())
                .position(entity.getPosition())
                .age(entity.getAge())
                .team(entity.getTeam())
                .games(entity.getGames())
                .minutesPlayed(entity.getMinutesPlayed())
                .playerEfficiencyRating(entity.getPlayerEfficiencyRating())
                .trueShootingPercentage(entity.getTrueShootingPercentage())
                .threePointAttemptRate(entity.getThreePointAttemptRate())
                .freeThrowAttemptRate(entity.getFreeThrowAttemptRate())
                .defensiveReboundPercentage(entity.getDefensiveReboundPercentage())
                .totalReboundPercentage(entity.getTotalReboundPercentage())
                .assistPercentage(entity.getAssistPercentage())
                .stealPercentage(entity.getStealPercentage())
                .blockPercentage(entity.getBlockPercentage())
                .turnoverPercentage(entity.getTurnoverPercentage())
                .usageRate(entity.getUsageRate())
                .offensiveWinShares(entity.getOffensiveWinShares())
                .defensiveWinShares(entity.getDefensiveWinShares())
                .winShares(entity.getWinShares())
                .winSharesPer48Minutes(entity.getWinSharesPer48Minutes())
                .offensiveBoxPlusMinus(entity.getOffensiveBoxPlusMinus())
                .defensiveBoxPlusMinus(entity.getDefensiveBoxPlusMinus())
                .boxPlusMinus(entity.getBoxPlusMinus())
                .valueOverReplacement(entity.getValueOverReplacement())
                .build();
    }

}
