package com.psk.nbaplayerstats.repositories.entities;

import com.opencsv.bean.CsvBindByName;
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

    @CsvBindByName(column = "Player")
    @Column(name = "PLAYER", nullable = false)
    private String player;

    @CsvBindByName(column = "Pos")
    @Column(name = "POSITION", nullable = false)
    private String position;

    @CsvBindByName(column = "Age")
    @Column(name = "AGE", nullable = false)
    private String age;

    @CsvBindByName(column = "Tm")
    @Column(name = "TEAM", nullable = false)
    private String team;

    @CsvBindByName(column = "G")
    @Column(name = "GAMES", nullable = false)
    private int games;

    @CsvBindByName(column = "MP")
    @Column(name = "MINUTES_PLAYED", nullable = false)
    private int minutesPlayed;

    @CsvBindByName(column = "PER")
    @Column(name = "PLAYER_EFFICIENCY_RATING", nullable = false)
    private BigDecimal playerEfficiencyRating;

    @CsvBindByName(column = "TS%")
    @Column(name = "TRUE_SHOOTING_PERCENTAGE", nullable = false)
    private BigDecimal trueShootingPercentage;

    @CsvBindByName(column = "3PAr")
    @Column(name = "THREE_POINT_ATTEMPT_RATE", nullable = false)
    private BigDecimal threePointAttemptRate;

    @CsvBindByName(column = "FTr")
    @Column(name = "FREE_THROW_ATTEMPT_RATE", nullable = false)
    private BigDecimal freeThrowAttemptRate;

    @CsvBindByName(column = "ORB%")
    @Column(name = "OFFENSIVE_REBOUND_PERCENTAGE", nullable = false)
    private BigDecimal offensiveReboundPercentage;

    @CsvBindByName(column = "DRB%")
    @Column(name = "DEFENSIVE_REBOUND_PERCENTAGE", nullable = false)
    private BigDecimal defensiveReboundPercentage;

    @CsvBindByName(column = "TRB%")
    @Column(name = "TOTAL_REBOUND_PERCENTAGE", nullable = false)
    private BigDecimal totalReboundPercentage;

    @CsvBindByName(column = "AST%")
    @Column(name = "ASSIST_PERCENTAGE", nullable = false)
    private BigDecimal assistPercentage;

    @CsvBindByName(column = "STL%")
    @Column(name = "STEAL_PERCENTAGE", nullable = false)
    private BigDecimal stealPercentage;

    @CsvBindByName(column = "BLK%")
    @Column(name = "BLOCK_PERCENTAGE", nullable = false)
    private BigDecimal blockPercentage;

    @CsvBindByName(column = "TOV%")
    @Column(name = "TURNOVER_PERCENTAGE", nullable = false)
    private BigDecimal turnoverPercentage;

    @CsvBindByName(column = "USG%")
    @Column(name = "USAGE_RATE", nullable = false)
    private BigDecimal usageRate;

    @CsvBindByName(column = "OWS")
    @Column(name = "OFFENSIVE_WIN_SHARES", nullable = false)
    private BigDecimal offensiveWinShares;

    @CsvBindByName(column = "DWS")
    @Column(name = "DEFENSIVE_WIN_SHARES", nullable = false)
    private BigDecimal defensiveWinShares;

    @CsvBindByName(column = "WS")
    @Column(name = "WIN_SHARES", nullable = false)
    private BigDecimal winShares;

    @CsvBindByName(column = "WS/48")
    @Column(name = "WIN_SHARES_PER_48_MINUTES", nullable = false)
    private BigDecimal winSharesPer48Minutes;

    @CsvBindByName(column = "OBPM")
    @Column(name = "OFFENSIVE_BOX_PLUS_MINUS", nullable = false)
    private BigDecimal offensiveBoxPlusMinus;

    @CsvBindByName(column = "DBPM")
    @Column(name = "DEFENSIVE_BOX_PLUS_MINUS", nullable = false)
    private BigDecimal defensiveBoxPlusMinus;

    @CsvBindByName(column = "BPM")
    @Column(name = "BOX_PLUS_MINUS", nullable = false)
    private BigDecimal boxPlusMinus;

    @CsvBindByName(column = "VORP")
    @Column(name = "VALUE_OVER_REPLACEMENT", nullable = false)
    private BigDecimal valueOverReplacement;
}
