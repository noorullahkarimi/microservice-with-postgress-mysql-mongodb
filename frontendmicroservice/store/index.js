
export const state = () => ({
  tours:null,
  places:null
})
export const mutation = {
  SET_TOUR(state,data){
    state.tours = data;
  },
  SET_PLACES(state, data){
    state.places = data;
  }
}
export const action = {
  // async setTours({commit},data){
  //   return this.$axios.get('/api' + "/")
  //     .then(response => {
  //       commit('SET_TOUR', response.data);
  //     })
  //     .catch(error => {
  //       console.error('Error fetching data:', error);
  //     });
  // }
  async setPlaces({commit}, data){
    commit('SET_PLACES', data);
  }
}
