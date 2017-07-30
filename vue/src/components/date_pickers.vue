<template>
    <div>
        <!--main content-->
        <div class="row">
            <div class="col-md-6">
                <div class="panel ">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                                <i class="ti-calendar"></i> Date and Time range picker
                            </h3>
                        <span class="pull-right">
                                    <i class="fa fa-fw ti-angle-up clickable"></i>
                                    <i class="fa fa-fw ti-close removepanel clickable"></i>
                                </span>
                    </div>
                    <div class="panel-body">
                        <div class="box-body">
                            <!-- Date range -->
                            <div class="form-group">
                                <label>
                                    Date picker:
                                </label>
                                <div class="input-group">
                                    <div class="input-group-addon">
                                        <i class="fa fa-fw ti-calendar"></i>
                                    </div>
                                    <input type="text" class="form-control pull-right" id="date-range0" placeholder="YYYY-MM-DD to YYYY-MM-DD" />
                                </div>
                                <!-- /.input group -->
                            </div>
                            <!-- /.form group -->
                            <!-- Date and time range -->
                            <div class="form-group">
                                <label>
                                    Date and Time Picker:
                                </label>
                                <div class="input-group ">
                                    <input type="text" class="form-control" id="dateclock" placeholder="YYYY-MM-DD HH:MM ~ YYYY-MM-DD HH:MM">
                                    <span class="input-group-addon">
                                                <span class="glyphicon glyphicon-time"></span>
                                    </span>
                                </div>
                            </div>
                            <div class="form-group">
                                <label>
                                    Span instead of Input:
                                </label>
                                <div class="input-group">
                                    <span id="date-range9" style="background-color:#6699cc; color:white;padding:3px; cursor:pointer; border-radius:4px;">YYYY-MM-DD to YYYY-MM-DD</span>
                                </div>
                            </div>
                            <div class="form-group">
                                <label>
                                    Date picker with Animation:
                                </label>
                                <div class="input-group">
                                    <div class="input-group-addon">
                                        <i class="fa fa-fw ti-time"></i>
                                    </div>
                                    <input id="date-range50" size="30" value="" class="form-control" placeholder="YYYY-MM-DD to YYYY-MM-DD">
                                </div>
                                <!-- /.input group -->
                            </div>
                            <!-- /.form group -->
                            <!-- Date and time range -->
                            <div class="form-group">
                                <label>
                                    Hotel booking:
                                </label>
                                <div class="input-group">
                                    <input id="hotel-booking" class="form-control" size="60" value="" placeholder="Days Booked">
                                    <span></span>
                                    <div class="input-group-addon">
                                        <i class="fa fa-fw ti-calendar"></i>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label>
                                    Select backward:
                                </label>
                                <div class="input-group">
                                    <div class="input-group-addon">
                                        <i class="fa fa-fw ti-calendar"></i>
                                    </div>
                                    <input class="form-control" id="date-range26" size="30" value="" placeholder="YYYY-MM-DD to YYYY-MM-DD">
                                </div>
                                <!-- /.input group -->
                            </div>
                            <!-- /.form group -->
                            <div class="form-group">
                                <label>
                                    Single Date mode with single month:
                                </label>
                                <div class="input-group">
                                    <div class="input-group-addon">
                                        <i class="fa fa-fw ti-calendar"></i>
                                    </div>
                                    <input class="form-control" id="date-range13-2" size="40" placeholder="YYYY-MM-DD">
                                </div>
                                <!-- /.input group -->
                            </div>
                            <!-- /.form group -->
                            <div class="form-group">
                                <label>
                                    Batch mode ( week ):
                                </label>
                                <div class="input-group">
                                    <div class="input-group-addon">
                                        <i class="fa fa-fw ti-calendar"></i>
                                    </div>
                                    <input class="form-control" id="date-range14" size="60" value="" placeholder="YYYY-MM-DD to YYYY-MM-DD">
                                </div>
                                <!-- /.input group -->
                            </div>
                            <!-- /.form group -->
                        </div>
                        <!-- /.form group -->
                        <!-- time picker -->
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="panel ">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                                <i class="ti-paint-bucket"></i> Date & Time Dropper
                            </h3>
                        <span class="pull-right">
                                    <i class="fa fa-fw ti-angle-up clickable"></i>
                                    <i class="fa fa-fw ti-close removepanel clickable"></i>
                                </span>
                    </div>
                    <div class="panel-body">
                        <div class="form-group">
                            <label>
                                Date dropper:
                            </label>
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <i class="fa fa-fw ti-calendar"></i>
                                </div>
                                <input type="text" class="form-control" id="departure" placeholder="DD/MM/YYYY" />
                            </div>
                            <!-- /.input group -->
                        </div>
                        <!-- /.form group -->
                        <div class="form-group">
                            <label>
                                Date format:
                            </label>
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <i class="fa fa-fw ti-calendar"></i>
                                </div>
                                <input type="text" class="form-control" id="departure1" placeholder="YYYY-MM-DD" />
                            </div>
                            <!-- /.input group -->
                        </div>
                        <!-- /.form group -->
                        <div class="form-group">
                            <label>
                                Maximum Year:
                            </label>
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <i class="fa fa-fw ti-calendar"></i>
                                </div>
                                <input type="text" class="form-control" id="departure2" placeholder="DD/MM/YYYY" />
                            </div>
                            <!-- /.input group -->
                        </div>
                        <div class="form-group">
                            <label>
                                Animate date dropper
                            </label>
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <i class="fa fa-fw ti-calendar"></i>
                                </div>
                                <input type="text" class="form-control" id="departure3" placeholder="DD/MM/YYYY" />
                            </div>
                            <!-- /.input group -->
                        </div>
                        <!-- /.form group -->
                        <div class="form-group">
                            <label>
                                Time dropper:
                            </label>
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <i class="fa fa-fw ti-time"></i>
                                </div>
                                <input type="text" class="form-control" id="alarm" placeholder="HH-MM" />
                            </div>
                            <!-- /.input group -->
                        </div>
                        <!-- /.form group -->
                        <div class="form-group">
                            <label>
                                Meridian time dropper:
                            </label>
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <i class="fa fa-fw ti-time"></i>
                                </div>
                                <input type="text" class="form-control" id="alarm1" placeholder="HH-MM" />
                            </div>
                            <!-- /.input group -->
                        </div>
                        <div class="form-group">
                            <label>
                                Animate time dropper:
                            </label>
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <i class="fa fa-fw ti-time"></i>
                                </div>
                                <input type="text" class="form-control" id="alarm2" placeholder="HH-MM" />
                            </div>
                            <!-- /.input group -->
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <div class="panel ">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                                <i class="ti-calendar"></i> Date Range picker
                            </h3>
                        <span class="pull-right">
                                    <i class="fa fa-fw ti-angle-up clickable"></i>
                                    <i class="fa fa-fw ti-close removepanel clickable"></i>
                                </span>
                    </div>
                    <div class="panel-body">
                        <div class="box-body">
                            <!-- Date range -->
                            <div class="form-group">
                                <label>
                                    Date range:
                                </label>
                                <div class="input-group">
                                    <div class="input-group-addon">
                                        <i class="fa fa-fw ti-calendar"></i>
                                    </div>
                                    <input type="text" class="form-control pull-right" id="reservation" placeholder="MM/DD/YYYY - MM/DD/YYYY" />
                                </div>
                                <!-- /.input group -->
                            </div>
                            <!-- /.form group -->
                            <!-- Date and time range -->
                            <div class="form-group">
                                <label>
                                    Clock Picker:
                                </label>
                                <div class="input-group clockpicker" data-placement="left" data-align="top" data-autoclose="true">
                                    <input type="text" class="form-control" value="Now" placeholder="HH:MM">
                                    <span class="input-group-addon">
                                                <span class="glyphicon glyphicon-time"></span>
                                    </span>
                                </div>
                            </div>
                            <div class="form-group">
                                <label>
                                    Call Backs Clock Picker:
                                </label>
                                <div class="input-group clockpicker-with-callbacks">
                                    <input type="text" class="form-control" value="Now" placeholder="HH:MM">
                                    <span class="input-group-addon">
                                                <span class="glyphicon glyphicon-time"></span>
                                    </span>
                                </div>
                            </div>
                            <div class="form-group">
                                <label>
                                    Date and time range:
                                </label>
                                <div class="input-group">
                                    <div class="input-group-addon">
                                        <i class="fa fa-fw ti-time"></i>
                                    </div>
                                    <input type="text" class="form-control pull-right" id="reservationtime" placeholder="MM/DD/YYYY HH:MM-MM/DD/YYYY HH:MM">
                                </div>
                                <!-- /.input group -->
                            </div>
                            <!-- /.form group -->
                            <!-- Date and time range -->
                            <div class="form-group">
                                <label>
                                    Predefined Date range:
                                </label>
                                <div class="input-group">
                                    <span class="input-group-addon">
                                                    <i class="fa ti-calendar"></i>
                                                </span>
                                    <input type="text" class="form-control" id="reportrange" placeholder="DD/MM/YYYY-DD/MM/YYYY">
                                </div>
                            </div>
                            <!-- /.form group -->
                            <!-- time picker -->
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="panel ">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                                <i class="ti-book"></i> Input masks
                            </h3>
                        <span class="pull-right">
                                    <i class="fa fa-fw ti-angle-up clickable"></i>
                                    <i class="fa fa-fw ti-close removepanel clickable"></i>
                                </span>
                    </div>
                    <div class="panel-body">
                        <div class="box-body">
                            <!-- Date dd/mm/yyyy -->
                            <div class="form-group">
                                <label>
                                    Date masks:
                                </label>
                                <div class="input-group">
                                    <div class="input-group-addon">
                                        <i class="fa fa-fw ti-calendar"></i>
                                    </div>
                                    <input type="text" class="form-control" data-inputmask="'alias': 'dd/mm/yyyy'" data-mask/>
                                </div>
                                <!-- /.input group -->
                            </div>
                            <!-- /.form group -->
                            <!-- Date mm/dd/yyyy -->
                            <div class="form-group">
                                <div class="input-group">
                                    <div class="input-group-addon">
                                        <i class="fa fa-fw ti-calendar"></i>
                                    </div>
                                    <input type="text" class="form-control" data-inputmask="'alias': 'mm/dd/yyyy'" data-mask/>
                                </div>
                                <!-- /.input group -->
                            </div>
                            <!-- /.form group -->
                            <!-- phone mask -->
                            <div class="form-group">
                                <label>
                                    US phone mask:
                                </label>
                                <div class="input-group">
                                    <div class="input-group-addon">
                                        <i class="fa fa-fw ti-mobile"></i>
                                    </div>
                                    <input type="text" class="form-control" data-inputmask='"mask": "(999) 999-9999"' data-mask/>
                                </div>
                                <!-- /.input group -->
                            </div>
                            <!-- /.form group -->
                            <!-- phone mask -->
                            <div class="form-group">
                                <label>
                                    Intl US phone mask:
                                </label>
                                <div class="input-group">
                                    <div class="input-group-addon">
                                        <i class="fa fa-fw ti-mobile"></i>
                                    </div>
                                    <input type="text" class="form-control" data-inputmask="'mask': ['999-999-9999 [x99999]', '+099 99 99 9999[9]-9999']" data-mask/>
                                </div>
                                <!-- /.input group -->
                            </div>
                            <!-- /.form group -->
                            <!-- IP mask -->
                            <div class="form-group">
                                <label>IP mask:</label>
                                <div class="input-group">
                                    <div class="input-group-addon">
                                        <i class="fa fa-fw ti-desktop"></i>
                                    </div>
                                    <input type="text" class="form-control" data-inputmask="'alias': 'ip'" data-mask/>
                                </div>
                                <!-- /.input group -->
                            </div>
                            <!-- /.form group -->
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!--main content ends-->
    </div>
</template>
<script>
const moment = require("moment");
import date_range from "../vendors/jquery-date-range-picker/dist/jquery.daterangepicker.min.js";
import date_dropper from "../vendors/datedropper/datedropper.min.js";
import timedropper from "../vendors/timedropper/timedropper.min.js";
import input_mask from "../vendors/jquery.inputmask/dist/jquery.inputmask.bundle.js"
import clockpicker from "../vendors/clockpicker/dist/bootstrap-clockpicker.min.js";
import datetimepicker from "../vendors/bootstrap-daterangepicker/daterangepicker.js";
export default {
    name: "date_pickers",
    mounted: function() {
        "use strict";
        $(document).ready(function() {

            // $('#datetimepicker1').datetimepicker();
            $("#departure").dateDropper({
                format: "d/m/Y",
                dropPrimaryColor: "#6699cc"
            });
            $("#alarm").timeDropper({
                primaryColor: "#6699cc",
                format: "hh:mm A"
            });
            $("#alarm1").timeDropper({
                primaryColor: "#6699cc",
                meridians: true,
                format: "hh:mm A"
            });
            $("#alarm2").timeDropper({
                primaryColor: "#6699cc",
                init_animation: 'dropdown',
                format: "hh:mm A"
            });
            $('#date-range0').dateRangePicker({
                autoClose: true,
                getValue: function() {
                    $(this).val("");
                }
            });
            $('#dateclock').dateRangePicker({
                autoClose: true,
                startOfWeek: 'monday',
                separator: ' ~ ',
                format: 'YYYY-MM-DD HH:mm',
                time: {
                    enabled: true
                },
                getValue: function() {
                    $(this).val("");
                }
            });
            $('#date-range9').dateRangePicker({
                autoClose: true,
                setValue: function(s) {
                    this.innerHTML = s;
                }
            });
            $('#date-range50').dateRangePicker({
                autoClose: true,
                customOpenAnimation: function(cb) {
                    $(this).fadeIn(300, cb);
                },
                customCloseAnimation: function(cb) {
                    $(this).fadeOut(400, cb);
                },
                getValue: function() {
                    $(this).val("");
                }
            });
            $('#hotel-booking').dateRangePicker({
                autoClose: true,
                startDate: new Date(),
                selectForward: true,
                showDateFilter: function(time, date) {
                    return '<div style="padding:0 1px;">\
                    <span style="font-weight:bold">' + date + '</span>\
                    <div style="opacity:0.3;">$' + Math.round(Math.random() * 999) + '</div>\
                </div>';
                },
                beforeShowDay: function(t) {
                    var valid = !(t.getDay() == 0 || t.getDay() == 6); //disable saturday and sunday
                    var _class = '';
                    var _tooltip = valid ? '' : 'sold out';
                    return [valid, _class, _tooltip];
                },
                getValue: function() {
                    $(this).val("");
                }
            });
            $('#date-range26').dateRangePicker({
                autoClose: true,
                selectBackward: true,
                getValue: function() {
                    $(this).val("");
                }
            });
            $('#date-range13-2').dateRangePicker({
                singleDate: true,
                showShortcuts: false,
                singleMonth: true,
                getValue: function() {
                    $(this).val("");
                }
            });
            $('#date-range14').dateRangePicker({
                autoClose: true,
                batchMode: 'week',
                showShortcuts: false,
                getValue: function() {
                    $(this).val("");
                }
            });

            // date and time dropper

            var options1 = {
                format: "Y-M-d",
                dropPrimaryColor: "#6699cc"
            };
            $('#departure1').dateDropper($.extend({}, options1));

            var options2 = {
                format: "d/m/Y",
                maxYear: "2030",
                dropPrimaryColor: "#6699cc"
            };
            $('#departure2').dateDropper($.extend({}, options2));

            var options3 = {
                format: "d/m/Y",
                init_animation: "dropdown",
                dropPrimaryColor: "#6699cc"
            };
            $('#departure3').dateDropper($.extend({}, options3));

            // date and time dropper ends


            //Datemask dd/mm/yyyy
            $("#datemask").inputmask("dd/mm/yyyy", {
                "placeholder": "dd/mm/yyyy"
            });
            //Datemask2 mm/dd/yyyy
            $("#datemask2").inputmask("mm/dd/yyyy", {
                "placeholder": "mm/dd/yyyy"
            });
            //Money Euro
            $("[data-mask]").inputmask();

            //Date range picker
            $('#reservation').daterangepicker({
                autoUpdateInput: false,
                locale: {
                    cancelLabel: 'Clear'
                }
            }).on('apply.daterangepicker', function(ev, picker) {
                $(this).val(picker.startDate.format('MM/DD/YYYY') + ' - ' + picker.endDate.format('MM/DD/YYYY'));
            }).on('cancel.daterangepicker', function(ev, picker) {
                $(this).val('');
            });


            //Date range picker with time picker
            $("#reservationtime").daterangepicker({
                timePicker: true,
                autoUpdateInput: false,
                timePickerIncrement: 30,
                locale: {
                    cancelLabel: 'Clear'
                },
                drops: "up"
            }).on('apply.daterangepicker', function(ev, picker) {
                $(this).val(picker.startDate.format('MM/DD/YYYY h:mm A') + ' - ' + picker.endDate.format('MM/DD/YYYY h:mm A'));
            }).on('cancel.daterangepicker', function(ev, picker) {
                $(this).val('');
            });
            // Date range as a button
            $('#reportrange').daterangepicker({
                    autoUpdateInput: false,
                    locale: {
                        cancelLabel: 'Clear'
                    },
                    ranges: {
                        'Today': [moment(), moment()],
                        'Yesterday': [moment().subtract('days', 1), moment()],
                        'Last 7 Days': [moment().subtract('days', 6), moment()],
                        'Last 30 Days': [moment().subtract('days', 29), moment()],
                        'This Month': [moment().startOf('month'), moment().endOf('month')],
                        'Last Month': [moment().subtract('month', 1).startOf('month'), moment().subtract('month', 1).endOf('month')]
                    },
                    drops: "up"
                },
                function(start, end) {
                    $('#reportrange').find('span').html(start.format('MMMM D, YYYY') + ' - ' + end.format('MMMM D, YYYY'));
                });
            $('#reportrange').on('show.daterangepicker', function(ev, picker) {
                $(this).val("");
            }).on('apply.daterangepicker', function(ev, picker) {
                $(this).val(picker.startDate.format('DD/MM/YYYY') + ' - ' + picker.endDate.format('DD/MM/YYYY'));
            }).on('cancel.daterangepicker', function(ev, picker) {
                $(this).val('');
            });

            //clock pickers and call back

            $('.clockpicker').clockpicker({
                placement: 'bottom',
                align: 'left',
                donetext: 'Done'
            });
            var input = $('.clockpicker-with-callbacks').clockpicker({
                donetext: 'Done',
                placement: "top",
                init: function() {
                    console.log("colorpicker initiated");
                },
                beforeShow: function() {
                    console.log("before show");
                },
                afterShow: function() {
                    console.log("after show");
                },
                beforeHide: function() {
                    console.log("before hide");
                },
                afterHide: function() {
                    console.log("after hide");
                },
                beforeHourSelect: function() {
                    console.log("before hour selected");
                },
                afterHourSelect: function() {
                    console.log("after hour selected");
                },
                beforeDone: function() {
                    console.log("before done");
                },
                afterDone: function() {
                    console.log("after done");
                }
            });

            // Manually toggle to the minutes view
            $('#check-minutes').on('click', function(e) {
                // Have to stop propagation here
                e.stopPropagation();
                input.clockpicker('show')
                    .clockpicker('toggleView', 'minutes');
            });

            // $('input[name="datefilter"]').daterangepicker({});


        });
    },
    destroyed: function() {

    }
}
</script>
<style src="../vendors/jquery-date-range-picker/dist/daterangepicker.min.css"></style>
<style src="../vendors/datedropper/datedropper.min.css"></style>
<style src="../vendors/bootstrap-daterangepicker/daterangepicker.css"></style>
<style src="../vendors/clockpicker/dist/bootstrap-clockpicker.min.css"></style>
<style src="../vendors/timedropper/timedropper.min.css"></style>
<style src="../assets/css/datepicker.css"></style>
