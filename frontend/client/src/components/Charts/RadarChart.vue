<template>
  <div>
    <div class="loader-wrapper">
      <dot-loader class="loader" style- v-if="isLoading" />
    </div>
    <div class="chart-wrapper">
      <apexchart
        type="radar"
        height="550"
        :options="chartOptions"
        :series="series"
        v-if="!isLoading && series[0].data.length === 5"
      />
    </div>
  </div>
</template>
<script>
// service
import getPtsByPos from "@/services/dataService";
// components
import DotLoader from "@/components/App/DotLoader";

export default {
  name: "RadarChart",
  components: {
    DotLoader,
  },
  data() {
    return {
      isLoading: false,
      series: [
        {
          name: "Average points",
          data: [],
        },
      ],
      chartOptions: {
        chart: {
          height: 550,
          type: "radar",
          toolbar: {
            show: false,
          },
        },
        xaxis: {
          categories: [
            "Point Guards",
            "Shooting Guards",
            "Small Forwards",
            "Power Forwards",
            "Centers",
          ],
          labels: {
            style: {
              fontSize: "20px",
            },
          },
        },
        stroke: {
          width: 2,
          colors: ["#be7c00"],
        },
        markers: {
          size: 5,
          colors: ["orange"],
          hover: {
            size: 10,
          },
        },
        fill: {
          colors: ["#ffcd6f"],
        },
        // dataLabels: {
        //   enabled: true,
        //   background: {
        //     foreColor: "#ffcd6f",
        //     borderColor: "#ffcd6f",
        //   },
        // },
      },
    };
  },
  mounted() {
    this.isLoading = true;
    const data = getPtsByPos();

    this.series[0].data.push(data.pg.toFixed(2));
    this.series[0].data.push(data.sg.toFixed(2));
    this.series[0].data.push(data.sf.toFixed(2));
    this.series[0].data.push(data.pf.toFixed(2));
    this.series[0].data.push(data.c.toFixed(2));

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
.chart-wrapper {
  /* display: flex;
  justify-content: center;
  align-items: center; 
   width: 100%;
  height: 100%;  */
}
.loader {
  margin-top: 64px;
}
</style>
