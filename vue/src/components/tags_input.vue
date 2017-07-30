<template>
    <div>
        <div class="row">
            <div class="col-md-6">
                <div class="panel ">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                                <i class="ti-tag"></i> Markup
                            </h3>
                        <span class="pull-right">
                                    <i class="fa fa-fw ti-angle-up clickable"></i>
                                    <i class="fa fa-fw ti-close removepanel clickable"></i>
                                </span>
                    </div>
                    <div class="panel-body">
                        <div class="example example_markup">
                            <div class='parent'>
                                <label for='ty' class="m-t-b-15">Enter a space-separated list of tags:</label>
                                <div class='input'>
                                    <input id='ty' value="hi">
                                </div>
                            </div>
                            <label for='custom' class="m-t-b-15">Enter a list of tags using a custom delimiter: </label>
                            <div class='input'>
                                <input id='custom' value="hello">
                            </div>
                            <label for='del' class="m-t-b-15">If you want, you can allow humans to remove tags by clicking on the crosses.
                            </label>
                            <div class='input'>
                                <input id='del' value="welcome">
                            </div>
                            <label for='def' class="m-t-b-15">Default values are naturally welcome.</label>
                            <div class='input'>
                                <input id='def' value='tagging as a service'>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="panel ">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                                <i class="ti-tag"></i> Categorizing tags
                            </h3>
                        <span class="pull-right">
                                    <i class="fa fa-fw ti-angle-up clickable"></i>
                                    <i class="fa fa-fw ti-close removepanel clickable"></i>
                                </span>
                    </div>
                    <div class="panel-body">
                        <div class="example example_tagclass">
                            <label for='dup' class="m-t-b-15">Duplicates are okay sometimes: </label>
                            <div class='input'>
                                <input id='dup' value='hello hello hello'>
                            </div>
                            <label for='lng' class="m-t-b-15">Really long lists behave reasonably well, too.</label>
                            <div class='input'>
                                <input id='lng' value='Really long lists behave reasonably well, too. Especially if you take into account this is JavaScript!'>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
import insignia from "../vendors/insignia/dist/insignia.min.js"
export default {
    name: "tags_input",
    mounted: function() {
        'use strict';
        void
        function() {

            insignia(ty);
            insignia(custom, {
                delimiter: ','
            });
            insignia(del, {
                deletion: true
            });
            insignia(def);
            insignia(lng);
            insignia(dup, {
                validate: function() {
                    return true;
                }
            });

            function events(el, type, fn) {
                if (el.addEventListener) {
                    el.addEventListener(type, fn);
                } else if (el.attachEvent) {
                    el.attachEvent('on' + type, wrap(fn));
                } else {
                    el['on' + type] = wrap(fn);
                }

                function wrap(originalEvent) {
                    var e = originalEvent || global.event;
                    e.target = e.target || e.srcElement;
                    e.preventDefault = e.preventDefault || function preventDefault() {
                        e.returnValue = false;
                    };
                    e.stopPropagation = e.stopPropagation || function stopPropagation() {
                        e.cancelBubble = true;
                    };
                    fn.call(el, e);
                }
            }
        }();
    },
    destroyed: function() {

    }
}
</script>
<style src="../vendors/insignia/dist/insignia.min.css"></style>
<style src="../assets/css/custom_css/insignia_custom.css"></style>
