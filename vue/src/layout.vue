<template>
    <div>
        <clear_header></clear_header>
        <div class="wrapper row-offcanvas row-offcanvas-left">
            <left_side></left_side>
            <right_side>
                <router-view></router-view>
            </right_side>
        </div>
        <div class="background-overlay" @click="right_close"></div>
    </div>
</template>
<script>
import clear_header from "./components/layout/clear_header";
import left_side from "./components/layout/left-side";
import right_side from "./components/layout/right-side";
import niceScroll from './vendors/jquery.nicescroll/jquery.nicescroll.min.js';
import bootstrap_switch from 'bootstrap-switch';
require("bootstrap-switch/dist/css/bootstrap3/bootstrap-switch.min.css");
import slimscroll from "jquery-slimscroll";
import metisMenu from './assets/js/metisMenu.js';
import left_menu from './assets/js/custom_js/leftmenu.js';
import rightside_bar from './assets/js/custom_js/rightside_bar.js';
import cookie from './assets/js/cookie.js';
export default {
    name: 'layout1',
    components: {
        clear_header,
        left_side,
        right_side
    },
    created: function() {
        window.$ = window.jQuery = require('jquery');
    },
    mounted: function() {
        /*
         * Make sure that the sidebar is streched full height
         * ---------------------------------------------
         * We are gonna assign a min-height value every time the
         * wrapper gets resized and upon page load. We will use
         * Ben Alman's method for detecting the resize event.
         *
         **/
        // left full width code start
        function _fix() {
            //Get window height and the wrapper height
            var height = $(window).height() - $("body > .header").height();
            $(".wrapper").css("min-height", height + "px");
            var content = $(".wrapper").height();
            //If the wrapper height is greater than the window
            if ($(window).width() > 992) {
                if ($("body").hasClass("movable-header")) {
                    if (content > height) {
                        //then set sidebar height to the wrapper
                        $(".left-side, html, body").css("min-height", content + "px");
                    } else {
                        //Otherwise, set the sidebar to the height of the window
                        $(".left-side, html, body").css("min-height", height + "px");
                    }
                } else {
                    if (content > height) {
                        //then set sidebar height to the wrapper
                        $(".left-side, html, body").css("min-height", content - 50 + "px");
                    } else {
                        //Otherwise, set the sidebar to the height of the window
                        $(".left-side, html, body").css("min-height", height - 50 + "px");
                    }
                }

            } else {
                if (content > height) {
                    //then set sidebar height to the wrapper
                    $(".left-side, html, body").css("min-height", content + 1 + "px");
                } else {
                    //Otherwise, set the sidebar to the height of the window
                    $(".left-side, html, body").css("min-height", height + 1 + "px");
                }
            }
        }

        //     //Fire upon load Clear
        _fix();
        //     //Fire when wrapper is resized
        $(".wrapper").on('resize', function() {
            _fix();
            fix_sidebar();
        });

        //     //Fix the fixed layout sidebar scroll bug
        fix_sidebar();

        function fix_sidebar() {
            //Make sure the body tag has the .fixed class
            if (!$("body").hasClass("fixed-menu")) {
                return;
            }
            //Add slimscroll
            if ($(window).width() <= 992 && $(window).width() >= 561) {
                $(".left_slim").slimscroll({
                    height: ($(window).height() - $(".header").height()) + "px",
                    color: "rgba(0,0,0,0.2)"
                });
            } else if ($(window).width() <= 560) {
                $(".left_slim").slimscroll({
                    height: ($(window).height() - $(".header").height() + 104) + "px",
                    color: "rgba(0,0,0,0.2)"
                });
            } else {
                $(".left_slim").slimscroll({
                    height: ($(window).height() - $(".header>nav").height()) + "px",
                    color: "rgba(0,0,0,0.2)"
                });
            }
        }

        // =================nice scroll below 560px for nav dropdown===========//
        function fix_dropdown() {
            if ($(window).height() <= 560) {
                $(".navbar .dropdown .dropdown-menu.dropdown-messages").addClass("nice_dropdown").niceScroll({
                    cursorcolor: "rgba(0,0,0,0)",
                    cursorborder: "none"
                });
            } else {
                $(".navbar .dropdown .dropdown-menu.dropdown-messages").removeClass("nice_dropdown");
            }
        }
        fix_dropdown();
        $(window).on("resize", fix_dropdown);
        // =================nice scroll below 560px for nav dropdown ends===========//

        // left full width code end
        if (!$('#right').length) {
            $('.toggle-right').addClass('hidden');
        }
        $("#slim_t3").find(" [name='my-checkbox']").bootstrapSwitch("size", 'mini');
        //slim scroll for right side bar
        $('#right-slim').slimscroll({
            height: '100vh',
            size: '3px',
            color: '#6699cc',
            opacity: .4
        });
    },
    methods: {
        right_close() {
            $("body").removeClass("sidebar-right-opened");
            if ($("body").hasClass("boxed")) {
                $('#right').css('right', '-270px');
            }
        }
    }
}
</script>
<style src="./assets/css/custom_css/metisMenu.css"></style>
<style lang="sass">
@import ./assets/sass/custom.scss
</style>
