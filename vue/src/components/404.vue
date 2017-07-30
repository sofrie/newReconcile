<template>
    <div class="container">
        <div class="row">
            <div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2 col-xs-10 col-xs-offset-1">
                <div class="text-center">
                    <div>
                        <div class="error_img">
                            <img src="../assets/img/pages/404.gif" alt="404 error image">
                        </div>
                        <hr class="seperator">
                        <a href="/" class="btn btn-primary link-home">Go Home</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
export default {
    name: "err404",
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
