<template>
  <div id="app">
    <div class="nav">
      <the-navigation />
    </div>
    <div class="main-content">
      <router-view />
    </div>
  </div>
</template>
<script>
import "@/assets/styles/main.scss";
import TheNavigation from "@/components/App/TheNavigation";
export default {
  components: { TheNavigation },
};
</script>
<style lang="scss" scoped>
.main-content {
  margin: 32px;
  width: 75%;
  margin-left: auto;
  margin-right: auto;
  // display: flex;
  // justify-content: center;
  min-width: 1200px;
  margin-top: 80px;
}
.nav {
  width: 100%;
  height: 60px;
  margin-bottom: 32px;
  border-bottom: 2px solid orange;
  display: flex;
  justify-content: center;
  position: fixed;
  top: 0;
  overflow: hidden;
}
</style>
