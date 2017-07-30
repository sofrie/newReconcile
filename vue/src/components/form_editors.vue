<template>
    <div>
        <!--main content-->
        <div class="panel ">
            <div class="panel-heading">
                <div class=" bootstrap-admin-box-title ">
                    <h3 class="panel-title">
                            Flip Editor</h3>
                </div>
            </div>
            <div class="panel-body">
                <div class="row">
                    <div class="bootstrap-admin-panel-content flip_editing">
                        <textarea class="" id="split_editor"></textarea>
                    </div>
                </div>
            </div>
        </div>
        <!--main content ends-->
    </div>
</template>
<script>
import trumbowyg from "../vendors/trumbowyg/dist/trumbowyg.min.js"
export default {
    name: "form_editors",
    mounted: function() {
        "use strict";
        $("textarea#split_editor").trumbowyg({
            _dir: "ltr", // This line is optionnal, but usefull to override the `dir` option
            svgPath: "/static/data/icons.svg",
            bold: "Gras",
            close: "Fermer"
        });
        if ($(window).width() < 700) {
            $("<br>").insertAfter(".summer_noted .dropdown-menu li .btn-group");
        }


    },
    destroyed: function() {

    }
}
</script>
<style src="../vendors/trumbowyg/dist/ui/trumbowyg.min.css"></style>
<style src="../assets/css/form_editors.css"></style>
