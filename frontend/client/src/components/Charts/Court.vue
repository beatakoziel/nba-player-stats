<template>
  <div>
    <dot-loader class="loader" v-if="isLoading" />
    <div class="court" v-if="!isLoading">
      <div class="section">
        <div class="col">
          <player-tile
            :name="stats.pf.name"
            :image="stats.pf.image"
            :team="stats.pf.team"
            :avg="stats.pf.avg"
          />
        </div>
        <div class="col">
          <player-tile
            :name="stats.c.name"
            :image="stats.c.image"
            :team="stats.c.team"
            :avg="stats.c.avg"
          />
        </div>
      </div>
      <div class="section">
        <div class="col">
          <player-tile
            :name="stats.sg.name"
            :image="stats.sg.image"
            :team="stats.sg.team"
            :avg="stats.sg.avg"
          />
        </div>
        <div class="col">
          <player-tile
            :name="stats.sf.name"
            :image="stats.sf.image"
            :team="stats.sf.team"
            :avg="stats.sf.avg"
          />
        </div>
      </div>
      <div class="section bottom-section">
        <div class="middle">
          <player-tile
            :name="stats.pg.name"
            :image="stats.pg.image"
            :team="stats.pg.team"
            :avg="stats.pg.avg"
          />
        </div>
      </div>
    </div>
  </div>
</template>
<script>
// components
import DotLoader from "@/components/App/DotLoader";
import PlayerTile from "@/components/Charts/PlayerTile";

// service
import { getLeagueLeaders } from "@/services/dataService";

export default {
  name: "Court",
  components: {
    DotLoader,
    PlayerTile,
  },
  data() {
    return {
      isLoading: false,
      stats: null,
    };
  },
  mounted() {
    this.isLoading = true;
    this.stats = getLeagueLeaders();
    setTimeout(() => {
      this.isLoading = false;
    }, 1000);
  },
};
</script>
<style scoped>
.loader {
  margin-top: 64px;
}
.court {
  background-image: url("../../assets/images/courts/court.svg");
  width: 800px;
  height: 500px;
  background-repeat: no-repeat;
  background-size: contain;
}
.section {
  height: 33%;
  width: 100%;
  display: flex;
  justify-content: center;
}
.col {
  width: 50%;
  height: 100%;
  display: flex;
  justify-content: center;
}
</style>
