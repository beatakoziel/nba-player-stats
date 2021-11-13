<template>
  <div class="routes">
    <router-link :to="{ name: `radar` }">Radar chart</router-link>
    <router-link :to="{ name: `court` }">Court</router-link>
    <router-link :to="{ name: `map` }">Map</router-link>
    <router-link :to="{ name: `scatter` }">Scatter plot</router-link>
  </div>
</template>
<style lang="scss" scoped>
a {
  text-decoration: none;
  color: #808080;
  font-size: 24px;
  &:hover {
    color: orange;
  }
  &.router-link-exact-active {
    color: orange;
    text-decoration: underline;
  }
}
.routes {
  width: 67%;
  height: 100%;
  display: flex;
  justify-content: space-between;
  line-height: 100px;
}
</style>
