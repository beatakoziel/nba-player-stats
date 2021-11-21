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
