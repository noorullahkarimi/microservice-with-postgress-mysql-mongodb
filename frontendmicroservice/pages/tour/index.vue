<template>
  <div>
    <Header></Header>
      <p>lkdfjlkajflk</p>
      <p>this is the tour : {{ tours}}</p>
    <Footer></Footer>
  </div>
</template>

<script>
import Header from "../../components/layouts/Header";
import Footer from "../../components/layouts/Footer";
export default {
name: "index.js",
  components: {Footer, Header},
  data(){
    return{
      tours:null
    }
  },
  methods:{
    showtour(){
     this.tours = this.$store.state.tours;
    }
  }
}
</script>

<style scoped>

</style>
