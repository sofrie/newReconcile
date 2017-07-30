<template>
    <div>
        <div class="row">
            <div class="col-md-12">
                <div class="panel">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                                <i class="fa fa-fw ti-dropbox"></i> Dropify
                            </h3>
                    </div>
                    <div class="panel-body p-30">
                        <div class="row">
                            <div class="col-md-6">
                                <h5>Dropify Basic</h5>
                                <input type="file" class="dropify" />
                            </div>
                            <div class="col-md-6">
                                <h5>AllowedFileExtensions (PDF, PNG and PSD )</h5>
                                <input type="file" class="dropify" data-allowed-file-extensions="pdf png psd" />
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <h5>Max File Size</h5>
                                <input type="file" data-max-file-size="3M" />
                            </div>
                            <div class="col-md-6">
                                <h5>Disabled</h5>
                                <input type="file" class="dropify" disabled="disabled" />
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <h5>Default File</h5>
                                <input type="file" class="dropify" data-default-file="/static/img/pages/slider2.jpg" />
                            </div>
                            <div class="col-md-6">
                                <h5>Without Remove Button</h5>
                                <input type="file" class="dropify" data-show-remove="false" />
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
import dropify from "../vendors/dropify/dist/js/dropify.min.js"
export default {
    name: "dropify",
    mounted: function() {
        "use strict";
        $(document).ready(function() {
            $('.dropify').dropify();
            $("[data-max-file-size]").dropify({
                error: {
                    'fileSize': 'The file size is too big ({{ value }}B max).'
                }
            });
        });
    },
    destroyed: function() {

    }
}
</script>
<style src="../vendors/dropify/dist/css/dropify.min.css"></style>
<style src="../assets/css/custom_css/dropify.css"></style>
