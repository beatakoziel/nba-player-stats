import Vue from "vue";
import VueRouter from "vue-router";

Vue.use(VueRouter);

const routes = [
  {
    path: "/radar",
    name: "radar",
    component: () => import("../views/RadarChart/Index.vue"),
  },
  {
    path: "/court",
    name: "court",
    component: () => import("../views/Court/Index.vue"),
  },
  {
    path: "/map",
    name: "map",
    component: () => import("../views/Map/Index.vue"),
  },
  {
    path: "/scatter",
    name: "scatter",
    component: () => import("../views/ScatterPlot/Index.vue"),
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
