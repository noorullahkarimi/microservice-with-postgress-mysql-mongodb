export const state = () =>({
    places : null
})
export const mutations = {
  SET_pLACES(state, data){
    state.places = data;
  }
}
export const actions = {
  setPalaces({commit}, data){
    commit("SET_pLACES", data);
  }
}
