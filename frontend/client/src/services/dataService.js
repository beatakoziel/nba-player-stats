import data from "@/assets/data/data.json";

export function getPtsByPos() {
  const pg = [];
  const sg = [];
  const sf = [];
  const pf = [];
  const c = [];

  for (let i = 0; i < data.length; i++) {
    if (data[i].Pos === "PG") {
      pg.push(data[i].PTS);
    } else if (data[i].Pos === "SG") {
      sg.push(data[i].PTS);
    } else if (data[i].Pos === "SF") {
      sf.push(data[i].PTS);
    } else if (data[i].Pos === "PF") {
      pf.push(data[i].PTS);
    } else if (data[i].Pos === "C") {
      c.push(data[i].PTS);
    }
  }

  const pgSum = pg.reduce((a, b) => a + b, 0);
  const pgAvg = pgSum / pg.length || 0;

  const sgSum = sg.reduce((a, b) => a + b, 0);
  const sgAvg = sgSum / sg.length || 0;

  const sfSum = sf.reduce((a, b) => a + b, 0);
  const sfAvg = sfSum / sf.length || 0;

  const pfSum = pf.reduce((a, b) => a + b, 0);
  const pfAvg = pfSum / pf.length || 0;

  const cSum = c.reduce((a, b) => a + b, 0);
  const cAvg = cSum / c.length || 0;

  return { pg: pgAvg, sg: sgAvg, sf: sfAvg, pf: pfAvg, c: cAvg };
}

export function getMinsByAgeRange() {
  const range1 = {
    name: "Ages -23",
  };
  const range2 = {
    name: "Ages 24-27",
  };
  const range3 = {
    name: "Ages 28-31",
  };
  const range4 = {
    name: "Ages 32-",
  };

  let range1Arr = [];
  let range2Arr = [];
  let range3Arr = [];
  let range4Arr = [];

  for (let i = 0; i < data.length; i++) {
    if (data[i].Age <= 23) {
      range1Arr.push([data[i].MP, data[i].Age]);
    } else if (data[i].Age >= 24 && data[i].Age <= 27) {
      range2Arr.push([data[i].MP, data[i].Age]);
    } else if (data[i].Age >= 28 && data[i].Age <= 31) {
      range3Arr.push([data[i].MP, data[i].Age]);
    } else if (data[i].Age >= 32) {
      range4Arr.push([data[i].MP, data[i].Age]);
    }
  }

  range1["data"] = range1Arr;
  range2["data"] = range2Arr;
  range3["data"] = range3Arr;
  range4["data"] = range4Arr;

  return { range1: range1, range2: range2, range3: range3, range4: range4 };
}

export function getStatsByTeam() {
  let teams = [
    {
      type: "Feature",
      name: "ATL",
      geometry: { type: "Point", coordinates: [-84.423058, 33.763191] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "BOS",
      geometry: { type: "Point", coordinates: [-70.016251, 44.904758] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "BRK",
      geometry: { type: "Point", coordinates: [-74.632408, 39.584151] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "CHI",
      geometry: { type: "Point", coordinates: [-87.932408, 41.484151] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "CHO",
      geometry: { type: "Point", coordinates: [-79.823058, 34.763191] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "CLE",
      geometry: { type: "Point", coordinates: [-81.632408, 40.584151] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "DAL",
      geometry: { type: "Point", coordinates: [-98.245003, 32.653501] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "DEN",
      geometry: { type: "Point", coordinates: [-104.991997, 39.740002] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "DET",
      geometry: { type: "Point", coordinates: [-83.632408, 43.984151] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "GSW",
      geometry: { type: "Point", coordinates: [-120.245003, 38.053501] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "HOU",
      geometry: { type: "Point", coordinates: [-95.381889, 29.775419] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "IND",
      geometry: { type: "Point", coordinates: [-84.823058, 38.263191] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "LAC",
      geometry: { type: "Point", coordinates: [-116.245003, 32.053501] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "LAL",
      geometry: { type: "Point", coordinates: [-118.245003, 35.053501] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "MEM",
      geometry: { type: "Point", coordinates: [-88.823058, 35.763191] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "MIA",
      geometry: { type: "Point", coordinates: [-80.823058, 26.263191] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "MIL",
      geometry: { type: "Point", coordinates: [-89.632408, 45.484151] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "MIN",
      geometry: { type: "Point", coordinates: [-94.632408, 47.884151] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "NOP",
      geometry: { type: "Point", coordinates: [-89.823058, 29.763191] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "NYK",
      geometry: { type: "Point", coordinates: [-74.016251, 41.904758] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "OKC",
      geometry: { type: "Point", coordinates: [-97.514839, 35.466179] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "ORL",
      geometry: { type: "Point", coordinates: [-81.823058, 29.763191] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "PHI",
      geometry: { type: "Point", coordinates: [-77.632408, 41.584151] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "PHO",
      geometry: { type: "Point", coordinates: [-111.245003, 34.653501] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "POR",
      geometry: { type: "Point", coordinates: [-122.245003, 44.653501] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "SAC",
      geometry: { type: "Point", coordinates: [-122.245003, 41.453501] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "SAS",
      geometry: { type: "Point", coordinates: [-102.245003, 30.653501] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "UTA",
      geometry: { type: "Point", coordinates: [-112.245003, 40.653501] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
    {
      type: "Feature",
      name: "WAS",
      geometry: { type: "Point", coordinates: [-77.016251, 38.904758] },
      properties: {
        text: null,
        tooltip: null,
        pt: [],
        ast: [],
        rb: [],
        st: [],
        bl: [],
      },
    },
  ];

  for (let i = 0; i < data.length; i++) {
    for (let team of teams) {
      if (data[i].Tm === team.name) {
        team.properties.pt.push(data[i].PTS);
        team.properties.ast.push(data[i].AST);
        team.properties.rb.push(data[i].TRB);
        team.properties.st.push(data[i].STL);
        team.properties.bl.push(data[i].BLK);
      }
    }
  }

  for (let team of teams) {
    team.properties.pt = team.properties.pt.reduce((a, b) => a + b, 0);

    team.properties.ast = team.properties.ast.reduce((a, b) => a + b, 0);

    team.properties.rb = team.properties.rb.reduce((a, b) => a + b, 0);

    team.properties.st = team.properties.st.reduce((a, b) => a + b, 0);

    team.properties.bl = team.properties.bl.reduce((a, b) => a + b, 0);
  }

  for (let team of teams) {
    team.properties.tooltip = `<b>${
      team.name
    }</b>\nPoints per game: ${team.properties.pt.toFixed(
      2
    )}\nAssists per game: ${team.properties.ast.toFixed(
      2
    )}\nRebounds per game: ${team.properties.rb.toFixed(
      2
    )}\nSteals per game: ${team.properties.st.toFixed(
      2
    )}\nBlocks per game: ${team.properties.bl.toFixed(2)}`;
  }

  return teams;
}

export function getLeagueLeaders() {
  const pg = {
    avg: 0,
    name: null,
    team: null,
    image: "https://cdn.nba.com/headshots/nba/latest/1040x760/201939.png",
  };
  const sg = {
    avg: 0,
    name: null,
    team: null,
    image: "https://cdn.nba.com/headshots/nba/latest/1040x760/203078.png",
  };
  const sf = {
    avg: 0,
    name: null,
    team: null,
    image: "https://cdn.nba.com/headshots/nba/latest/1040x760/202695.png",
  };
  const pf = {
    avg: 0,
    name: null,
    team: null,
    image: "https://cdn.nba.com/headshots/nba/latest/1040x760/201142.png",
  };
  const c = {
    avg: 0,
    name: null,
    team: null,
    image: "https://cdn.nba.com/headshots/nba/latest/1040x760/203954.png",
  };

  for (let i = 0; i < data.length; i++) {
    if (data[i].Pos === "PG" && data[i].PTS > pg.avg) {
      pg.avg = data[i].PTS;
      pg.name = data[i].Player;
      pg.team = data[i].Tm;
    }
    if (data[i].Pos === "SG" && data[i].PTS > sg.avg) {
      sg.avg = data[i].PTS;
      sg.name = data[i].Player;
      sg.team = data[i].Tm;
    }
    if (data[i].Pos === "SF" && data[i].PTS > sf.avg) {
      sf.avg = data[i].PTS;
      sf.name = data[i].Player;
      sf.team = data[i].Tm;
    }
    if (data[i].Pos === "PF" && data[i].PTS > pf.avg) {
      pf.avg = data[i].PTS;
      pf.name = data[i].Player;
      pf.team = data[i].Tm;
    }
    if (data[i].Pos === "C" && data[i].PTS > c.avg) {
      c.avg = data[i].PTS;
      c.name = data[i].Player;
      c.team = data[i].Tm;
    }
  }

  return { pg, sg, sf, pf, c };
}
