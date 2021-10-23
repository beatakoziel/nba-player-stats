package com.psk.nbaplayerstats.controllers;

import com.psk.nbaplayerstats.NbaPlayerStatsService;
import com.psk.nbaplayerstats.controllers.assemblers.NbaPlayerStatsAssembler;
import com.psk.nbaplayerstats.controllers.resources.NbaPlayerStatsResource;
import com.psk.nbaplayerstats.repositories.entities.NbaPlayerStats;
import com.psk.nbaplayerstats.utilities.filters.NbaPlayerStatsQueryFilters;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/stats")
@RequiredArgsConstructor
public class NbaPlayerStatsController {

    private final NbaPlayerStatsService nbaPlayerStatsService;
    private final NbaPlayerStatsAssembler assembler;

    @GetMapping("test")
    public String test() {
        return "Hello";
    }

    @GetMapping
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", dataType = "integer", paramType = "query", value = "Results page you " +
                    "want to retrieve (0..N)", defaultValue = "0"),
            @ApiImplicitParam(name = "size", dataType = "integer", paramType = "query", value = "Number of records " +
                    "per page", defaultValue = "10")
    })
    public PagedModel<NbaPlayerStatsResource> get(NbaPlayerStatsQueryFilters filters,
            PagedResourcesAssembler<NbaPlayerStats> paged, @ApiIgnore @PageableDefault Pageable pageable) {
        return paged.toModel(nbaPlayerStatsService.getNbaPlayerStatsPage(filters, pageable), assembler);
    }
}
