import data from "@/assets/data/data.json";

export default function getPtsByPos() {
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
