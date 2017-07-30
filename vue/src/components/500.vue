<template>
    <div class="container five">
        <div class="row">
            <div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2 col-xs-10 col-xs-offset-1">
                <div class="text-center">
                    <div class="error_msg">
                        <img src="../assets/img/pages/500.gif" alt="500 error image">
                    </div>
                    <hr class="seperator">
                    <a href="/" class="btn btn-primary link-home">Try Home</a>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
export default {
    name: "err500",
    mounted: function() {
        $(window).on('load', function() {
            $('.preloader img').fadeOut();
            $('.preloader').fadeOut();
            $("html,body").css("height", "auto");
        });
    },
    destroyed: function() {

    }
}
</script>
<style src="../assets/css/404.css"></style>
<style type="text/css">
div.container.five {
    position: fixed;
    width: 100%;
    top: 0;
    bottom: 0;
    left: 0;
    right: 0;
    background-color: #C79D6F;
}
</style>
