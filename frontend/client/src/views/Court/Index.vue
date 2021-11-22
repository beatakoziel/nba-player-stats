<template>
  <div>
    <app-header text="Najlepsi strzelcy wg. pozycji" />
    <div class="chart-wrapper">
      <court />
    </div>
  </div>
</template>
<script>
import Court from "@/components/Charts/Court";
import AppHeader from "@/components/App/AppHeader";

export default {
  name: "CourtIndex",
  components: {
    Court,
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
