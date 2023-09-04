<template>
  <div>
    <Header></Header>
    <div v-for="(historical, index) in historicals" :key="index" class="row">

      <div class="card col-lg-3 col-md-3" style="width: 18rem;">
        <img class="card-img-top" src="#" alt="Card image cap">
        <div class="card-body">
          <h5 class="card-title">{{historical.name}}</h5>
          <p class="card-text">{{historical.descrition}}</p>
          <p class="card-text">{{historical.location}}</p>
          <a href="#" class="btn btn-primary">Go somewhere</a>
        </div>
      </div>

    </div>
<!--    <button @click="getDataFromServer">Show Data</button>-->
<!--    <div>{{ historicals }}</div>-->
    <Footer></Footer>
  </div>
</template>

<script>
import Header from "~/components/layouts/Header";
import Footer from "~/components/layouts/Footer";
export default {
  name: "index",
  components: {Footer, Header},
  data() {
    return {
      historicals: null
    }
  },
  // mounted() {
  //   this.getDataFromServer();
  // },
  mounted: function () {
    this.$nextTick(function () {
      this.getDataFromServer();
    })
  },
  methods: {
    async getDataFromServer() {
      this.$axios.get('/api' + '/v1/index')
        .then(response => {
          console.log(response.data);
          this.$store.dispatch("setPalaces",response.data);
          this.setPlaces();
        })
        .catch(error => {
          console.log("this is error")
        })
    },
    setPlaces(){
     this.historicals = this.$store.state.places;
    }
  }
}
</script>

<style scoped>

</style>
