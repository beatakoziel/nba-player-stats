package com.psk.nbaplayerstats.repositories.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "NBA_PLAYER_STATS")
@Builder
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class NbaPlayerStats {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "PLAYER", nullable = false)
    private String player;

    @Column(name = "POSITION", nullable = false)
    private String position;

    @Column(name = "AGE", nullable = false)
    private String age;

    @Column(name = "TEAM", nullable = false)
    private String team;

    @Column(name = "GAMES", nullable = false)
    private int games;

    @Column(name = "MINUTES_PLAYED", nullable = false)
    private int minutesPlayed;

    @Column(name = "PLAYER_EFFICIENCY_RATING", nullable = false)
    private BigDecimal playerEfficiencyRating;

    @Column(name = "TRUE_SHOOTING_PERCENTAGE", nullable = false)
    private BigDecimal trueShootingPercentage;

    @Column(name = "THREE_POINT_ATTEMPT_RATE", nullable = false)
    private BigDecimal threePointAttemptRate;

    @Column(name = "FREE_THROW_ATTEMPT_RATE", nullable = false)
    private BigDecimal freeThrowAttemptRate;

    @Column(name = "DEFENSIVE_REBOUND_PERCENTAGE", nullable = false)
    private BigDecimal defensiveReboundPercentage;

    @Column(name = "TOTAL_REBOUND_PERCENTAGE", nullable = false)
    private BigDecimal totalReboundPercentage;

    @Column(name = "ASSIST_PERCENTAGE", nullable = false)
    private BigDecimal assistPercentage;

    @Column(name = "STEAL_PERCENTAGE", nullable = false)
    private BigDecimal stealPercentage;

    @Column(name = "BLOCK_PERCENTAGE", nullable = false)
    private BigDecimal blockPercentage;

    @Column(name = "TURNOVER_PERCENTAGE", nullable = false)
    private BigDecimal turnoverPercentage;

    @Column(name = "USAGE_RATE", nullable = false)
    private BigDecimal usageRate;

    @Column(name = "OFFENSIVE_WIN_SHARES", nullable = false)
    private BigDecimal offensiveWinShares;

    @Column(name = "DEFENSIVE_WIN_SHARES", nullable = false)
    private BigDecimal defensiveWinShares;

    @Column(name = "WIN_SHARES", nullable = false)
    private BigDecimal winShares;

    @Column(name = "WIN_SHARES_PER_48_MINUTES", nullable = false)
    private BigDecimal winSharesPer48Minutes;

    @Column(name = "OFFENSIVE_BOX_PLUS_MINUS", nullable = false)
    private BigDecimal offensiveBoxPlusMinus;

    @Column(name = "DEFENSIVE_BOX_PLUS_MINUS", nullable = false)
    private BigDecimal defensiveBoxPlusMinus;

    @Column(name = "BOX_PLUS_MINUS", nullable = false)
    private BigDecimal boxPlusMinus;

    @Column(name = "VALUE_OVER_REPLACEMENT", nullable = false)
    private BigDecimal valueOverReplacement;
}
