<template>
  <div>
    <div class="loader-wrapper">
      <dot-loader class="loader" v-if="isLoading" />
    </div>
    <div>
      <apexchart
        type="scatter"
        height="550"
        :options="chartOptions"
        :series="series"
        v-if="!isLoading && series.length === 4"
      />
    </div>
  </div>
</template>
<script>
// service
import { getMinsByAgeRange } from "@/services/dataService";
// components
import DotLoader from "@/components/App/DotLoader";

export default {
  name: "ScatterPlot",
  components: {
    DotLoader,
  },
  data() {
    return {
      isLoading: false,
      series: [],
      chartOptions: {
        chart: {
          height: 350,
          type: "scatter",
          zoom: {
            enabled: true,
            type: "xy",
          },
          toolbar: {
            show: false,
          },
        },
        xaxis: {
          tickAmount: 10,
          labels: {
            formatter: function (val) {
              return `${parseFloat(val).toFixed(2)} MPG`;
            },
          },
          title: {
            text: "Minutes per game",
            style: {
              fontSize: "20px",
              fontFamily: "Roboto, sans-serif",
              color: "#808080",
              fontWeight: 300,
            },
          },
        },
        yaxis: {
          tickAmount: 7,
          labels: {
            show: true,
            formatter: function (val) {
              return `${val} years old`;
            },
          },
          title: {
            text: "Players age",
            style: {
              fontSize: "20px",
              fontFamily: "Roboto, sans-serif",
              color: "#808080",
              fontWeight: 300,
            },
          },
        },
      },
    };
  },
  mounted() {
    this.isLoading = true;
    const ranges = getMinsByAgeRange();

    this.series.push(ranges.range1);
    this.series.push(ranges.range2);
    this.series.push(ranges.range3);
    this.series.push(ranges.range4);

    setTimeout(() => {
      this.isLoading = false;
    }, 1000);
  },
};
</script>
<style scoped>
.loader-wrapper {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 100%;
  height: 100%;
}
.loader {
  margin-top: 64px;
}
</style>
