<template>
    <div>
        <div class="row">
            <div class="col-lg-12">
                <div class="panel" style="padding-bottom:70px;">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                                <i class="livicon" data-name="zoom-in" data-c="#fff" data-hc="#fff" data-size="18"
                                   data-loop="true"></i>
                                Image Magnifier
                            </h3>
                    </div>
                    <div class="panel-body">
                        <div class="row">
                            <div class="col-md-3 col-xs-6">
                                <a class="mag img-responsive">
                                    <br/>
                                    <img data-toggle="magnify" class="mag-style img-responsive" src="../assets/img/gallery/thumbs/24.jpg" alt="image">
                                </a>
                            </div>
                            <div class="col-md-3 col-xs-6">
                                <a class="mag img-responsive">
                                    <br/>
                                    <img data-toggle="magnify" src="../assets/img/gallery/thumbs/30.jpg" alt="image" class="mag-style img-responsive">
                                </a>
                            </div>
                            <div class="col-md-3 col-xs-6">
                                <a class="mag img-responsive">
                                    <br/>
                                    <img data-toggle="magnify" src="../assets/img/gallery/thumbs/20.jpg" alt="image" class="mag-style img-responsive">
                                </a>
                            </div>
                            <div class="col-md-3 col-xs-6">
                                <a class="mag img-responsive">
                                    <br/>
                                    <img data-toggle="magnify" src="../assets/img/gallery/thumbs/29.jpg" alt="image" class="mag-style img-responsive">
                                </a>
                            </div>
                        </div>
                        <!--row-->
                        <div class="row" style="margin-top:40px;">
                            <div class="col-md-3 col-xs-6">
                                <a class="mag img-responsive">
                                    <br/>
                                    <img data-toggle="magnify" src="../assets/img/gallery/thumbs/29.jpg" alt="image" class="mag-style img-responsive">
                                </a>
                            </div>
                            <div class="col-md-3 col-xs-6">
                                <a class="mag img-responsive">
                                    <br/>
                                    <img data-toggle="magnify" src="../assets/img/gallery/thumbs/8.jpg" alt="image" class="mag-style img-responsive">
                                </a>
                            </div>
                            <div class="col-md-3 col-xs-6">
                                <a class="mag img-responsive">
                                    <br/>
                                    <img data-toggle="magnify" src="../assets/img/gallery/thumbs/31.jpg" alt="image" class="mag-style img-responsive">
                                </a>
                            </div>
                            <div class="col-md-3 col-xs-6">
                                <a class="mag img-responsive">
                                    <br/>
                                    <img data-toggle="magnify" src="../assets/img/gallery/thumbs/20.jpg" alt="image" class="mag-style img-responsive">
                                </a>
                            </div>
                        </div>
                        <div class="row" style="margin-top:40px;">
                            <div class="col-md-3 col-xs-6">
                                <a class="mag img-responsive">
                                    <br/>
                                    <img data-toggle="magnify" src="../assets/img/gallery/thumbs/30.jpg" alt="image" class="mag-style img-responsive">
                                </a>
                            </div>
                            <div class="col-md-3 col-xs-6">
                                <a class="mag img-responsive">
                                    <br/>
                                    <img data-toggle="magnify" src="../assets/img/gallery/thumbs/32.jpg" alt="image" class="mag-style img-responsive">
                                </a>
                            </div>
                            <div class="col-md-3 col-xs-6">
                                <a class="mag img-responsive">
                                    <br/>
                                    <img data-toggle="magnify" src="../assets/img/gallery/thumbs/17.jpg" alt="image" class="mag-style img-responsive">
                                </a>
                            </div>
                            <div class="col-md-3 col-xs-6">
                                <a class="mag img-responsive">
                                    <br/>
                                    <img data-toggle="magnify" src="../assets/img/gallery/thumbs/8.jpg" alt="image" class="mag-style img-responsive">
                                </a>
                            </div>
                        </div>
                        <div class="row" style="margin-top:40px;">
                            <div class="col-md-3 col-xs-6">
                                <a class="mag img-responsive">
                                    <br/>
                                    <img data-toggle="magnify" src="../assets/img/gallery/thumbs/31.jpg" alt="image" class="mag-style img-responsive">
                                </a>
                            </div>
                            <div class="col-md-3 col-xs-6">
                                <a class="mag img-responsive">
                                    <br/>
                                    <img data-toggle="magnify" src="../assets/img/gallery/thumbs/8.jpg" alt="image" class="mag-style img-responsive">
                                </a>
                            </div>
                            <div class="col-md-3 col-xs-6">
                                <a class="mag img-responsive">
                                    <br/>
                                    <img data-toggle="magnify" src="../assets/img/gallery/thumbs/30.jpg" alt="image" class="mag-style img-responsive">
                                </a>
                            </div>
                            <div class="col-md-3 col-xs-6">
                                <a class="mag img-responsive">
                                    <br/>
                                    <img data-toggle="magnify" src="../assets/img/gallery/thumbs/29.jpg" alt="image" class="mag-style img-responsive">
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!--row-->
    </div>
</template>
<script>
import magnify from "../vendors/bootstrap-magnify/js/bootstrap-magnify.min.js"
export default {
    name: "image_magnifier",
    mounted: function() {
        $('[data-toggle="magnify"]').magnify();
    },
    destroyed: function() {

    }
}
</script>
<style src="../vendors/bootstrap-magnify/css/bootstrap-magnify.min.css"></style>
<style>
/*image overlapping in magification*/

.magnify .magnify {
    z-index: 2;
}

.magnify .magnify-large {
    z-index: 4;
}
</style>
