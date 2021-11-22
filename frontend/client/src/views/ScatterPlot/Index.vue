<template>
  <div>
    <app-header
      text="Średnia ilość minut spędzonych na boisku wg. przedziału wieku"
    />
    <div class="chart-wrapper">
      <scatter-plot />
    </div>
  </div>
</template>
<script>
import ScatterPlot from "@/components/Charts/ScatterPlot";
import AppHeader from "@/components/App/AppHeader";

export default {
  name: "ScatterPlotIndex",
  components: {
    ScatterPlot,
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
