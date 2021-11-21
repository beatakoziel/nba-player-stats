<template>
  <div>
    <apexchart
      type="scatter"
      height="350"
      :options="chartOptions"
      :series="series"
    />
  </div>
</template>
<script>
export default {
  name: "ScatterPlot",
  data() {
    return {
      series: [
        {
          name: "19-23",
          data: [
            [34.1, 19],
            [21.2, 20],
            [16.4, 21],
            [29.7, 22],
            [38.6, 23],
          ],
        },
        {
          name: "24-27",
          data: [
            [41.1, 24],
            [38.8, 25],
            [31.4, 26],
            [22.3, 27],
          ],
        },
        {
          name: "28-31",
          data: [
            [42.5, 28],
            [43.0, 29],
            [39.2, 30],
            [37.5, 31],
          ],
        },
        {
          name: "32-",
          data: [
            [16.3, 32],
            [20.5, 33],
            [12.2, 34],
          ],
        },
      ],
      chartOptions: {
        chart: {
          height: 350,
          type: "scatter",
          zoom: {
            enabled: true,
            type: "xy",
          },
          title: "Minutes per game by age range of player",
        },
        xaxis: {
          tickAmount: 10,
          lables: {
            formatter: function (val) {
              return parseFloat(val).toFixed(1);
            },
          },
        },
        yaxis: {
          tickAmount: 7,
        },
      },
    };
  },
};
</script>
