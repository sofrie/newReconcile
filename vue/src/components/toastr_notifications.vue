<template>
    <div>
        <div class="row">
            <div class="col-md-12">
                <div class="panel ">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                                <i class="ti-bell"></i> Toastr Notifications
                            </h3>
                        <span class="pull-right">
                                    <i class="fa fa-fw ti-angle-up clickable"></i>
                                    <i class="fa fa-fw ti-close removepanel clickable"></i>
                                </span>
                    </div>
                    <div class="panel-body">
                        <div class="portlet-body">
                            <div class="row">
                                <div class="col-md-12">
                                    <h4><i class="fa fa-fw ti-info-alt text-info message"></i> When changing
                                            toastr position clear all toasts to see the effect</h4></div>
                                <div class="col-md-3">
                                    <div class="form-group">
                                        <label class="control-label" for="title"><b>Title</b></label>
                                        <input id="title" type="text" class="form-control" v-model="title" placeholder="Enter a title ...">
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label" for="message"><b>Message</b></label>
                                        <textarea class="form-control resize_vertical" id="message" rows="3" placeholder="Enter a message ..." v-model="msg"></textarea>
                                    </div>
                                    <form>
                                        <div class="form-group" id="positionGroup">
                                            <label class="position-type"><b>Toaster Position</b></label>
                                            <select name="toast-position" class="form-control" id="position-change" v-model="positionClass">
                                                <option value="toast-top-left">Top Left</option>
                                                <option value="toast-top-right">Top Right</option>
                                                <option value="toast-top-center">Top Center</option>
                                                <option value="toast-top-full-width">Top Full Width</option>
                                                <option value="toast-bottom-left">Bottom Left</option>
                                                <option value="toast-bottom-right">Bottom Right</option>
                                                <option value="toast-bottom-center">Bottom Center</option>
                                                <option value="toast-bottom-full-width">Bottom Full Width</option>
                                            </select>
                                        </div>
                                    </form>
                                </div>
                                <div class="col-md-3 ">
                                    <div class="form-group" id="toastTypeGroup">
                                        <label class="toast-type">Toast Type</label>
                                        <div>
                                            <label class="text-success">
                                                <input type="radio" name="toasts" class="custom-radio" value="success" v-model="type"> Success
                                            </label>
                                        </div>
                                        <div>
                                            <label class="text-info">
                                                <input type="radio" name="toasts" class="custom-radio" value="info" v-model="type"> Info
                                            </label>
                                        </div>
                                        <div>
                                            <label class="text-warning">
                                                <input type="radio" name="toasts" class="custom-radio" value="warning" v-model="type"> Warning
                                            </label>
                                        </div>
                                        <div>
                                            <label class="text-danger">
                                                <input type="radio" name="toasts" class="custom-radio" value="error" v-model="type"> Error
                                            </label>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div>
                                            <label for="closeButton">
                                                <input id="closeButton" type="checkbox" v-model="closeButton" class="input-small custom-checkbox"> Close Button
                                            </label>
                                        </div>
                                        <div>
                                            <label for="progressBar">
                                                <input id="progressBar" type="checkbox" class="input-small custom-checkbox" v-model="progressBar" /> Progress Bar
                                            </label>
                                        </div>
                                        <div>
                                            <label for="preventDuplicates">
                                                <input id="preventDuplicates" type="checkbox" class="input-small custom-checkbox" v-model="preventDuplicates" /> Prevent Duplicates
                                            </label>
                                        </div>
                                        <div>
                                            <label for="newestOnTop">
                                                <input id="newestOnTop" type="checkbox" class="input-small custom-checkbox" v-model="newestOnTop" /> Newest on top
                                            </label>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="controls">
                                        <div class="form-group">
                                            <label class="control-label" for="showEasing">Show Easing</label>
                                            <select class="form-control input-small" id="showEasing" v-model="showEasing">
                                                <option value="swing">swing</option>
                                                <option value="linear">linear</option>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label" for="hideEasing">Hide Easing</label>
                                            <select id="hideEasing" class="form-control input-small" v-model="hideEasing">
                                                <option value="swing">swing</option>
                                                <option value="linear">linear</option>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label" for="showMethod">Show Method</label>
                                            <select id="showMethod" class="form-control input-small" v-model="showMethod">
                                                <option value="show">show</option>
                                                <option value="fadeIn">fadeIn</option>
                                                <option value="slideDown">slideDown</option>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label" for="hideMethod">Hide Method</label>
                                            <select class="form-control input-small" id="hideMethod" v-model="hideMethod">
                                                <option value="hide">hide</option>
                                                <option value="fadeOut">fadeOut</option>
                                                <option value="slideUp">slideUp</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="controls">
                                        <div class="form-group">
                                            <label class="control-label" for="showDuration">Show Duration</label>
                                            <input id="showDuration" v-model="showDuration" type="text" placeholder="ms" class="form-control input-small">
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label" for="hideDuration">Hide Duration</label>
                                            <input id="hideDuration" v-model="hideDuration" type="text" placeholder="ms" class="form-control input-small">
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label" for="timeOut">Time out</label>
                                            <input id="timeOut" type="text" placeholder="ms" class="form-control input-small" v-model="timeOut">
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label" for="timeOut">Extended time out</label>
                                            <input id="extendedTimeOut" type="text" placeholder="ms" class="form-control input-small" v-model="extendedTimeOut">
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-12">
                                    <div class="col-sm-2 col-xs-6">
                                        <button type="button" class="btn btn-success btn-raised toastrshow" id="showtoast" @click="show_toast">
                                            Show Toast
                                        </button>
                                    </div>
                                    <div class="col-sm-2 col-xs-6">
                                        <button type="button" class="btn btn-danger btn-raised toastrshow" id="cleartoasts" @click="clearall">
                                            Clear Toasts
                                        </button>
                                    </div>
                                    <div class="col-sm-2 col-xs-6">
                                        <button type="button" class="btn btn-warning btn-raised toastrshow" id="clearlasttoast" @click="clearlast">
                                            Clear Last Toast
                                        </button>
                                    </div>
                                </div>
                            </div>
                            <br/>
                            <div class="row margin-top-10">
                                <div class="col-md-12">
                                    <pre id="toastrOptions" v-model="toastrOptions"></pre>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
import toastr from "../vendors/toastr/toastr.min.js";

export default {
    name: "toastr_notification",
    data() {
        return {
            lasttoast: "",
            toastCount: 0,
            msg: "Gnome &amp; Growl type non-blocking notifications",
            title: "Toastr Notifications",
            type: "success",
            showDuration: "1000",
            hideDuration: "1000",
            timeOut: "5000",
            extendedTimeOut: "1000",
            closeButton: true,
            newestOnTop: false,
            progressBar: false,
            preventDuplicates: false,
            positionClass: "toast-top-right",
            showEasing: "swing",
            hideEasing: "swing",
            showMethod: "show",
            hideMethod: "hide"
        }
    },
    computed: {
        toastrOptions() {
            return 'Command: toastr["' + this.type + '"]("' + this.msg + (this.title ? '", "' + this.title : '') + '")\n\ntoastr.options = ' + JSON.stringify(toastr.options, null, 2)
        }
    },
    methods: {
        show_toast() {
            this.toastCount++;

            toastr.options = {
                closeButton: this.closeButton,
                newestOnTop: this.newestOnTop,
                progressBar: this.progressBar,
                positionClass: this.positionClass,
                preventDuplicates: this.preventDuplicates,
                onclick: null
            };

            if (this.showDuration) {
                toastr.options.showDuration = this.showDuration;
            }
            if (this.timeOut) {
                toastr.options.timeOut = this.timeOut;
            }

            if (this.extendedTimeOut) {
                toastr.options.extendedTimeOut = this.extendedTimeOut;
            }
            if (this.hideDuration) {
                toastr.options.hideDuration = this.hideDuration;
            }
            if (this.showEasing) {
                toastr.options.showEasing = this.showEasing;
            }

            if (this.hideEasing) {
                toastr.options.hideEasing = this.hideEasing;
            }

            if (this.showMethod) {
                toastr.options.showMethod = this.showMethod;
            }

            if (this.hideMethod) {
                toastr.options.hideMethod = this.hideMethod;
            }

            var $toast = toastr[this.type](this.msg, this.title); // Wire up an event handler to a button in the toast, if it exists
            this.lasttoast = $toast;

            if (typeof $toast === 'undefined') {
                return;
            }
        },
        getLastToast() {
            return this.lasttoast;
        },
        clearlast() {
            toastr.clear(this.getLastToast());
        },
        clearall() {
            toastr.clear();
        }
    },
    mounted: function() {},
    destroyed: function() {}
}
</script>
<style src="../vendors/toastr/toastr.min.css"></style>
<style src="../assets/css/custom_css/toastr_notificatons.css"></style>
