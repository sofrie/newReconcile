<template>
    <div>
        <!--main content-->
        <div class="row">
            <div class="col-md-12 ">
                <div class="panel ">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                                <i class="ti-layout-menu-v"></i> Responsive Grid Examples
                            </h3>
                        <span class="pull-right hidden-xs">
                                    <i class="fa fa-fw ti-angle-up clickable"></i>
                                    <i class="fa fa-fw ti-close removepanel clickable"></i>
                                </span>
                    </div>
                    <div class="panel-body">
                        <div class="row">
                            <div class="col-md-12">
                                <p>
                                    This demostrates Bootstrap Grid system and how it responds to different screen sizes.
                                </p>
                                <div class="">
                                    <p class="visible-lg">
                                        lg indicates that the large grid displaying. The grid stacks horizontally &lt; 1200px.
                                    </p>
                                    <p class="visible-md">
                                        md indicates that the medium grid displaying. The grid stacks horizontally &lt; 992px.
                                    </p>
                                    <p class="visible-sm">
                                        sm indicates that the small grid displaying. The grid stacks horizontally &lt; 768px.
                                    </p>
                                    <p class="visible-xs">
                                        xs indicates that the extra small grid displaying. This grid is always horizontal.
                                    </p>
                                </div>
                            </div>
                            <div class="col-md-12 col-xs-12">
                                <div class="col-lg-4 col-md-4 col-sm-3 col-xs-4">
                                    <div class="text-center grid-property">
                                        <span class="visible-lg">.col-lg-4</span>
                                        <span class="visible-md">.col-md-4</span>
                                        <span class="visible-sm">.col-sm-3</span>
                                        <span class="visible-xs">.col-xs-4</span>
                                    </div>
                                </div>
                                <div class="col-lg-4 col-md-2 col-sm-3 col-xs-4">
                                    <div class="text-center grid-property">
                                        <span class="visible-lg">.col-lg-4</span>
                                        <span class="visible-md">.col-md-2</span>
                                        <span class="visible-sm">.col-sm-3</span>
                                        <span class="visible-xs">.col-xs-4</span>
                                    </div>
                                </div>
                                <div class="col-lg-4 col-md-6 col-sm-6 col-xs-4">
                                    <div class="text-center grid-property">
                                        <span class="visible-lg">.col-lg-4</span>
                                        <span class="visible-md">.col-md-6</span>
                                        <span class="visible-sm">.col-sm-6</span>
                                        <span class="visible-xs">.col-xs-4</span>
                                    </div>
                                </div>
                                <div class="grid-section">
                                    <h3>xs Grid</h3>
                                    <div class="col-xs-5">
                                        <div class="text-center grid-property">
                                            <span>.col-xs-5</span>
                                        </div>
                                    </div>
                                    <div class="col-xs-4">
                                        <div class="text-center grid-property">
                                            <span>.col-xs-4</span>
                                        </div>
                                    </div>
                                    <div class="col-xs-3">
                                        <div class="text-center grid-property">
                                            <span>.col-xs-3</span>
                                        </div>
                                    </div>
                                </div>
                                <!-- end row -->
                                <div class="grid-section">
                                    <h3>sm Grid</h3>
                                    <div class="col-sm-2">
                                        <div class="text-center grid-property">
                                            <span>.col-sm-2</span>
                                        </div>
                                    </div>
                                    <div class="col-sm-4">
                                        <div class=" text-center grid-property">
                                            <span>.col-sm-4</span>
                                        </div>
                                    </div>
                                    <div class="col-sm-6">
                                        <div class="text-center grid-property">
                                            <span>.col-sm-6</span>
                                        </div>
                                    </div>
                                </div>
                                <!-- end row -->
                                <div class="grid-section grid-selection1">
                                    <h3>md Grid</h3>
                                    <div class="col-md-2">
                                        <div class=" text-center grid-property">
                                            <span>.col-md-2</span>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="text-center grid-property">
                                            <span>.col-md-4</span>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="text-center grid-property">
                                            <span>.col-md-6</span>
                                        </div>
                                    </div>
                                </div>
                                <!-- end row -->
                                <div class="grid-section grid-selection2">
                                    <h3>lg Grid</h3>
                                    <div class="col-lg-4">
                                        <div class=" text-center grid-property">
                                            <span>.col-lg-4</span>
                                        </div>
                                    </div>
                                    <div class="col-lg-4">
                                        <div class="text-center grid-property">
                                            <span>.col-lg-4</span>
                                        </div>
                                    </div>
                                    <div class="col-lg-4">
                                        <div class="text-center grid-property">
                                            <span>.col-lg-4</span>
                                        </div>
                                    </div>
                                </div>
                                <!-- end row -->
                            </div>
                            <!-- end row -->
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!--main content ends-->
        <div class="background-overlay"></div>
    </div>
</template>
<script>
// import gridstack from "../vendors/gridstack/dist/gridstack.min.js"
// var gridstack = require("gridstack");
export default {
    name: "grid_layout",
    mounted: function() {
        "use strict";
        $(document).ready(function() {
            // $(function() {
            //     $('.grid-stack').gridstack({
            //         width: 12,
            //         alwaysShowResizeHandle: /Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent),
            //         resizable: {
            //             handles: 'e, se, s, sw, w'
            //         }
            //     });
            // });
        });
    },
    destroyed: function() {

    }
}
</script>
<!-- <style src="../vendors/gridstack/dist/gridstack.min.css"></style> -->
<style src="../assets/css/custom_css/grids_layout.css"></style>
