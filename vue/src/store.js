import 'es6-promise/auto';
import Vue from 'vue';
import Vuex from 'vuex';
Vue.use(Vuex);

//=======vuex store start===========
const store = new Vuex.Store({
    state: {
        user: {
            name: "Addison",
            picture: "src/assets/img/authors/avatar1.jpg",
            job: "Project Manager"
        }
    }
});
//=======vuex store end===========
export default store
