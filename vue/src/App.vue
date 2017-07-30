<template>
    <div id="app">
        <preloader></preloader>
        <router-view></router-view>
    </div>
</template>
<script>
import preloader from "./components/layout/preloader";
import layout from "./layout";
import bootstrap from './vendors/bootstrap/dist/js/bootstrap.min.js';
import icheck from "../static/iCheck/icheck.min.js";
export default {
    name: 'app',
    components: {
        layout,
        preloader
    }
}
</script>
<style lang="sass">
@import ./assets/sass/bootstrap/bootstrap.scss
</style>
<style src="./vendors/font-awesome/css/font-awesome.min.css"></style>
<style src="./vendors/themify-icons/css/themify-icons.css"></style>
