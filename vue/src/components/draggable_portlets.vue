<template>
    <div>
        <div class="row ui-sortable" id="sortable_portlets">
            <div class="col-md-4 sortable">
                <!-- BEGIN Portlet PORTLET-->
                <div class=" portlet box">
                    <div class="portlet-title bg-primary">
                        <div class="caption">
                            <i class="ti-menu"></i> Portlet
                        </div>
                    </div>
                    <div class="portlet-body">
                        <div>
                            <p>Tom loves Canada. Angela and Tom met. Angela and Tom want to play. Angela and Tom want to jump. Angela and Tom want to yell. Angela and Tom play, jump and yell.
                            </p>
                        </div>
                    </div>
                </div>
                <!-- END Portlet PORTLET-->
                <!-- BEGIN Portlet PORTLET-->
                <div class=" portlet box">
                    <div class="portlet-title bg-success">
                        <div class="caption">
                            <i class="ti-menu"></i> Portlet
                        </div>
                    </div>
                    <div class="portlet-body">
                        <div>
                            <p>Tom loves Canada. Angela and Tom met. Angela and Tom want to play. Angela and Tom want to jump. Angela and Tom want to yell. Angela and Tom play, jump and yell.
                            </p>
                        </div>
                    </div>
                </div>
                <!-- END Portlet PORTLET-->
                <!-- BEGIN Portlet PORTLET-->
                <div class=" portlet box">
                    <div class="portlet-title bg-info">
                        <div class="caption">
                            <i class="ti-menu"></i> Portlet
                        </div>
                    </div>
                    <div class="portlet-body">
                        <div>
                            <p>Tom loves Canada. Angela and Tom met. Angela and Tom want to play. Angela and Tom want to jump. Angela and Tom want to yell. Angela and Tom play, jump and yell.
                            </p>
                        </div>
                    </div>
                </div>
                <!-- END Portlet PORTLET-->
            </div>
            <div class="col-md-4 sortable">
                <!-- BEGIN Portlet PORTLET-->
                <div class=" portlet box">
                    <div class="portlet-title bg-danger">
                        <div class="caption">
                            <i class="ti-menu"></i> Portlet
                        </div>
                    </div>
                    <div class="portlet-body">
                        <div>
                            <p>Tom loves Canada. Angela and Tom met. Angela and Tom want to play. Angela and Tom want to jump. Angela and Tom want to yell. Angela and Tom play, jump and yell.
                            </p>
                        </div>
                    </div>
                </div>
                <!-- END Portlet PORTLET-->
                <!-- BEGIN Portlet PORTLET-->
                <div class=" portlet box">
                    <div class="portlet-title bg-info">
                        <div class="caption">
                            <i class="ti-menu"></i> Portlet
                        </div>
                    </div>
                    <div class="portlet-body">
                        <div>
                            <p>Tom loves Canada. Angela and Tom met. Angela and Tom want to play. Angela and Tom want to jump. Angela and Tom want to yell. Angela and Tom play, jump and yell.
                            </p>
                        </div>
                    </div>
                </div>
                <!-- END Portlet PORTLET-->
                <!-- BEGIN Portlet PORTLET-->
                <div class=" portlet box">
                    <div class="portlet-title bg-warning">
                        <div class="caption">
                            <i class="ti-menu"></i> Portlet
                        </div>
                    </div>
                    <div class="portlet-body">
                        <div>
                            <p>Tom loves Canada. Angela and Tom met. Angela and Tom want to play. Angela and Tom want to jump. Angela and Tom want to yell. Angela and Tom play, jump and yell.
                            </p>
                        </div>
                    </div>
                </div>
                <!-- END Portlet PORTLET-->
            </div>
            <div class="col-md-4 sortable">
                <!-- BEGIN Portlet PORTLET-->
                <div class=" portlet box">
                    <div class="portlet-title bg-warning">
                        <div class="caption">
                            <i class="ti-menu"></i> Portlet
                        </div>
                    </div>
                    <div class="portlet-body">
                        <div>
                            <p>Tom loves Canada. Angela and Tom met. Angela and Tom want to play. Angela and Tom want to jump. Angela and Tom want to yell. Angela and Tom play, jump and yell.
                            </p>
                        </div>
                    </div>
                </div>
                <!-- END Portlet PORTLET-->
                <!-- BEGIN Portlet PORTLET-->
                <div class=" portlet box">
                    <div class="portlet-title bg-primary">
                        <div class="caption">
                            <i class="ti-menu"></i> Portlet
                        </div>
                    </div>
                    <div class="portlet-body">
                        <div>
                            <p>Tom loves Canada. Angela and Tom met. Angela and Tom want to play. Angela and Tom want to jump. Angela and Tom want to yell. Angela and Tom play, jump and yell.
                            </p>
                        </div>
                    </div>
                </div>
                <!-- END Portlet PORTLET-->
                <!-- BEGIN Portlet PORTLET-->
                <div class=" portlet box notsort">
                    <div class="portlet-title bg-danger">
                        <div class="caption">
                            <i class="ti-alert"></i> Non Draggable Portlet
                        </div>
                    </div>
                    <div class="portlet-body">
                        <div>
                            <p>Tom loves Canada. Angela and Tom met. Angela and Tom want to play. Angela and Tom want to jump. Angela and Tom want to yell. Angela and Tom play, jump and yell.
                            </p>
                        </div>
                    </div>
                </div>
                <!-- END Portlet PORTLET-->
            </div>
        </div>
    </div>
</template>
<script>
import jqueryUI from "../assets/js/jquery.ui.min.js";
export default {
    name: "draggable_portlets",
    mounted: function() {
        "use strict";
        $(document).ready(function() {
            $("#sortable_portlets").find(".sortable").sortable({
                connectWith: "#sortable_portlets .sortable",
                items: ".portlet",
                cancel: ".notsort",
                opacity: 0.8,
                placeholder: 'portlet-placeholder ui-corner-all',
                forcePlaceholderSize: true,
                tolerance: "pointer"
            });
        });
    },
    destroyed: function() {

    }
}
</script>
<style src="../assets/css/portlet.css"></style>
