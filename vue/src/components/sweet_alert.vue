<template>
    <div>
        <div class="row">
            <div class="col-md-12">
                <div class="panel ">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                                <i class="ti-bell" aria-hidden="true"></i>
                                Sweet Alerts
                            </h3>
                        <span class="pull-right">
                                    <i class="fa fa-fw ti-angle-up clickable"></i>
                                    <i class="fa fa-fw ti-close removepanel clickable"></i>
                                </span>
                    </div>
                    <div class="panel-body">
                        <!--=============panel content starting=============-->
                        <div class="row m-a-10">
                            <div class="col-md-3 col-sm-3">
                                <div class="panel  panel-default hvr-sweep-to-right">
                                    <div class="panel-body success_alert text-center">
                                        <h5> Success Alert <i class="fa fa-check-circle-o"></i></h5>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3 col-sm-3">
                                <div class="panel  panel-default hvr-sweep-to-right">
                                    <div class="panel-body ok_message text-center">
                                        <h5> Ok Message <i class="fa fa-thumbs-o-up"></i></h5>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3 col-sm-3">
                                <div class="panel  panel-default hvr-sweep-to-right">
                                    <div class="panel-body basicalert text-center ">
                                        <h5> Alert <i class="fa fa-bell-o"></i></h5>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3 col-sm-3">
                                <div class="panel  panel-default hvr-sweep-to-right">
                                    <div class="panel-body ip_alert text-center">
                                        <h5> Ip Alert <i class="fa fa-info-circle"></i></h5>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--first row end-->
                        <div class="row m-a-10">
                            <div class="col-md-3 col-sm-3">
                                <div class="panel  panel-default hvr-sweep-to-right">
                                    <div class="panel-body custom_icon text-center">
                                        <h5> Custom Image <i class="fa fa-picture-o"></i></h5>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3 col-sm-3">
                                <div class="panel  panel-default hvr-sweep-to-right">
                                    <div class="panel-body custom_html text-center">
                                        <h5> Custom Html <i class="fa fa-code"></i></h5>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3 col-sm-3">
                                <div class="panel  panel-default hvr-sweep-to-right">
                                    <div class="panel-body auto_close text-center">
                                        <h5> Alert Auto Close <i class="fa fa-magic"></i></h5>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3 col-sm-3">
                                <div class="panel  panel-default hvr-sweep-to-right">
                                    <div class="panel-body prom_alert text-center">
                                        <h5> Prompt Alert <i class="fa fa-tree"></i></h5>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--second row end-->
                        <div class="row m-a-10">
                            <div class="col-md-3 col-sm-3">
                                <div class="panel  panel-default hvr-sweep-to-right">
                                    <div class="panel-body text-center" id="info-alert">
                                        <h5> Info Alert <i class="fa fa-info"></i></h5>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3 col-sm-3">
                                <div class="panel  panel-default hvr-sweep-to-right">
                                    <div class="panel-body text-center" id="success-alert">
                                        <h5> Successfully <i class="fa fa-check"></i></h5>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3 col-sm-3">
                                <div class="panel  panel-default hvr-sweep-to-right">
                                    <div class="panel-body text-center" id="warning-alert">
                                        <h5> Warning Alert <i class="fa fa-exclamation"></i></h5>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3 col-sm-3">
                                <div class="panel  panel-default hvr-sweep-to-right">
                                    <div class="panel-body text-center" id="danger-alert">
                                        <h5> Danger Alert <i class="fa fa-times"></i></h5>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--third row end-->
                        <!--=================== panel content end ======================-->
                    </div>
                    <!--end of panel body-->
                </div>
            </div>
        </div>
        <!--main content ends-->
    </div>
</template>
<script>
import sweetalert from "../vendors/sweetalert2/dist/sweetalert2.min.js"
export default {
    name: "sweet_alert",
    mounted: function() {
        "use strict";
        $(document).ready(function() {

            $('.basicalert').on('click', function(e) {
                e.preventDefault();
                swal({
                    title: "Are you sure?",
                    text: "You will not be able to recover this imaginary file!",
                    confirmButtonColor: "#ff6666"
                });
            });

            $('.success_alert').on('click', function(e) {
                e.preventDefault();
                swal({
                    title: "Success",
                    text: "You have successfully clicked",
                    type: "success",
                    confirmButtonColor: "#66cc99"
                });
            });

            $('.ok_message').on('click', function(e) {
                swal({
                    title: 'Are you sure?',
                    text: "You will not be able to recover this imaginary file!",
                    type: 'warning',
                    showCancelButton: true,
                    confirmButtonColor: '#66cc99',
                    cancelButtonColor: '#ff6666',
                    confirmButtonText: 'Yes, delete it!',
                    cancelButtonText: 'No, cancel!',
                    confirmButtonClass: 'btn btn-success',
                    cancelButtonClass: 'btn btn-danger'
                }).then(function() {
                    swal(
                        'Deleted!',
                        'Your file has been deleted.',
                        'success'
                    );
                }, function(dismiss) {
                    // dismiss can be 'cancel', 'overlay',
                    // 'close', and 'timer'
                    if (dismiss === 'cancel') {
                        swal(
                            'Cancelled',
                            'Your imaginary file is safe :)',
                            'error'
                        );
                    }
                })
            });
            $('.custom_icon').on('click', function(e) {
                e.preventDefault();
                swal({
                    title: "Sweet!",
                    text: "Here's a custom image.",
                    imageUrl: "/static/img/authors/avatar1.jpg",
                    imageWidth: 100,
                    imageHeight: 100,
                    animation: false
                });
            });

            $('.custom_html').on('click', function(e) {
                e.preventDefault();
                swal({
                    title: "HTML Title!",
                    text: 'A custom <span style="color:#F8BB86">html<span> message.',
                    html: true
                });
            });

            $('.auto_close').on('click', function(e) {
                e.preventDefault();
                swal({
                    title: "Auto close alert!",
                    text: "I will close in 3 seconds.",
                    timer: 3000,
                    showConfirmButton: false
                });
            });
            $('.prom_alert').on('click', function(e) {
                swal({
                    title: 'Input something',
                    input: 'text',
                    showCancelButton: true,
                    inputPlacehokder: 'write something!',
                    inputValidator: function(value) {
                        return new Promise(function(resolve, reject) {
                            if (value) {
                                resolve();
                            } else {
                                reject('You need to write something!');
                            }
                        });
                    }
                }).then(function(result) {
                    swal({
                        type: 'success',
                        html: 'You entered text is: ' + result
                    });
                })
            });
            $('.ip_alert').on('click', function(e) {
                swal.queue([{
                    title: 'Your IP Address',
                    confirmButtonText: 'Show my IP',
                    text: 'Your public IP will be received ' +
                        'via  request',
                    showLoaderOnConfirm: true,
                    preConfirm: function() {
                        return new Promise(function(resolve) {
                            $.get('https://api.ipify.org?format=json')
                                .done(function(data) {
                                    swal.insertQueueStep(data.ip);
                                    resolve();
                                });
                        });
                    }
                }]).then(function() {
                    swal(
                        'Good job!',
                        'Successfully checked your Ip',
                        'success'
                    )
                })
            });
            //Info
            $('#info-alert').on('click', function() {
                swal({
                    title: "Are you sure?",
                    text: "You will not be able to recover this imaginary file!",
                    type: "info",
                    confirmButtonClass: 'btn btn-info',
                    confirmButtonText: 'Info!'
                });
            });

            //Success
            $('#success-alert').on('click', function() {
                swal({
                    title: "Are you sure?",
                    text: "You will not be able to recover this imaginary file!",
                    type: "success",
                    confirmButtonClass: 'btn btn-success',
                    confirmButtonText: 'Success!'
                });
            });

            //Warning
            $('#warning-alert').on('click', function() {
                swal({
                    title: "Are you sure?",
                    text: "You will not be able to recover this imaginary file!",
                    type: "warning",
                    confirmButtonClass: 'btn btn-warning',
                    confirmButtonText: 'Warning!'
                });
            });

            //Danger
            $('#danger-alert').on('click', function() {
                swal({
                    title: "Are you sure?",
                    text: "You will not be able to recover this imaginary file!",
                    type: "error",
                    confirmButtonClass: 'btn btn-danger',
                    confirmButtonText: 'Danger!'
                });
            });
        });
    },
    destroyed: function() {

    }
}
</script>
<style src="../vendors/sweetalert2/dist/sweetalert2.min.css"></style>
<style src="../assets/css/custom_css/sweet_alert2.css"></style>
