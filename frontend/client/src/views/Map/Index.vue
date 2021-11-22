<template>
  <div>
    <app-header text="Drużyny NBA wraz z ich średnimi zdobyczami" />
    <div class="chart-wrapper">
      <Map />
    </div>
  </div>
</template>
<script>
import Map from "@/components/Charts/Map";
import AppHeader from "@/components/App/AppHeader";

export default {
  name: "MapIndex",
  components: {
    Map,
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
