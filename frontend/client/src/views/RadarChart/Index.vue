<template>
  <div>
    <app-header text="Średnie zdobycze punktowe zawodników wg. pozycji" />
    <div class="chart-wrapper">
      <radar-chart />
    </div>
  </div>
</template>
<script>
import RadarChart from "@/components/Charts/RadarChart";
import AppHeader from "@/components/App/AppHeader";

export default {
  name: "RadarChartIndex",
  components: {
    RadarChart,
    AppHeader,
  },
};
</script>
<style scoped>
.chart-wrapper {
  display: flex;
  justify-content: center;
}
</style>
