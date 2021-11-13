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
  margin: 64px;
  width: 60%;
  margin-left: auto;
  margin-right: auto;
}
.nav {
  width: 100%;
  height: 100px;
  margin-top: 32px;
  margin-bottom: 32px;
  border-bottom: 2px solid orange;
  display: flex;
  justify-content: center;
}
</style>
