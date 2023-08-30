<template>
  <div>
    <Header></Header>
    <p>this is historical : {{ places }}</p>
    <Footer></Footer>
  </div>
</template>

<script>
import Header from "@/components/layouts/Header";
import Footer from "@/components/layouts/Footer";

export default {
  name: "index",
  components: {Footer, Header},
  data() {
    return {
      places: null
    }
  },
  watch() {
    showData();
  },
  methods: {
    async getPlaces(){
      this.$store.dispatch("setPlaces", {
        this.$axios.get("");
      });
    }
  }

}
</script>

<style scoped>

</style>
