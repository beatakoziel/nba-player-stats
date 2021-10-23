package com.psk.nbaplayerstats.utilities.filters;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NbaPlayerStatsQueryFilters {

    @ApiModelProperty(
            notes = "Player name like",
            example = "Jarrett Allen")
    private String player;

}
