<template>
    <div>
        <!--main content-->
        <div class="row">
            <div class="col-md-6">
                <div class="panel ">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                                <i class="ti-calendar"></i> Air Date Picker
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
                                <label for="my-element">
                                    Date Picker:
                                </label>
                                <div class="input-group">
                                    <div class="input-group-addon">
                                        <i class="fa fa-fw ti-calendar"></i>
                                    </div>
                                    <input type="text" class="form-control pull-right" data-language='en' id="my-element" />
                                </div>
                                <!-- /.input group -->
                            </div>
                            <!-- /.form group -->
                            <!-- Date and time range -->
                            <div class="form-group">
                                <label for="my-element1">
                                    Multiple Date Picker:
                                </label>
                                <div class="input-group clockpicker" data-placement="left" data-align="top" data-autoclose="true">
                                    <input type="text" class="form-control" data-language='en' data-multiple-dates="3" data-multiple-dates-separator=", " id="my-element1" />
                                    <span class="input-group-addon">
                                            <i class="fa fa-fw ti-calendar"></i>
                                            </span>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="monthpicker">
                                    Month and Year selection:
                                </label>
                                <div class="input-group clockpicker-with-callbacks">
                                    <input type="text" class="form-control" data-language='en' data-min-view="months" data-view="months" data-date-format="MM yyyy" id="monthpicker" />
                                    <span class="input-group-addon">
                                            <i class="fa fa-fw ti-calendar"></i>
                                            </span>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="minMaxExample">
                                    Minimum and Maximum Dates:
                                </label>
                                <div class="input-group">
                                    <div class="input-group-addon">
                                        <i class="fa fa-fw ti-time"></i>
                                    </div>
                                    <input type="text" class="form-control pull-right" id="minMaxExample">
                                </div>
                                <!-- /.input group -->
                            </div>
                            <!-- /.form group -->
                            <!-- Date and time range -->
                            <div class="form-group">
                                <label for="timepick">
                                    Date and Time Picker:
                                </label>
                                <div class="input-group">
                                    <div class="input-group-addon">
                                        <i class="fa fa-fw ti-calendar"></i>
                                    </div>
                                    <input id="timepick" class="form-control pull-right" data-language='en' data-timepicker="true" data-time-format='hh:ii aa' />
                                </div>
                            </div>
                            <!-- /.form group -->
                            <!-- time picker -->
                            <!-- range of dates -->
                            <div class="form-group">
                                <label for="dateranges">
                                    Range of Dates:
                                </label>
                                <div class="input-group">
                                    <div class="input-group-addon">
                                        <i class="fa fa-fw ti-calendar"></i>
                                    </div>
                                    <input type="text" data-range="true" data-multiple-dates-separator=" - " data-language="en" class="form-control" id="dateranges" />
                                </div>
                            </div>
                            <!-- /.form group -->
                            <!-- Disable days of week -->
                            <div class="form-group">
                                <label for="disabled-days">
                                    Disable Days of Week:
                                </label>
                                <div class="input-group">
                                    <div class="input-group-addon">
                                        <i class="fa fa-fw ti-calendar"></i>
                                    </div>
                                    <input type="text" class="form-control" id="disabled-days" />
                                </div>
                            </div>
                            <!-- /.end Disable days of week -->
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
import airdatepicker from "../vendors/air-datepicker/dist/js/datepicker.min.js";
import en from "../vendors/air-datepicker/dist/js/i18n/datepicker.en.js";
export default {
    name: "advanced_date_pickers",
    mounted: function() {
        "use strict";

        $(document).ready(function() {

            Date.prototype.addDays = function(days) {
                var dat = new Date(this.valueOf());
                dat.setDate(dat.getDate() + days);
                return dat;
            };
            var dat = new Date();
            $('#my-element').datepicker();
            $('#my-element1').datepicker({
                multipleDates: true
            });
            $('#monthpicker').datepicker();
            $('#minMaxExample').datepicker({
                language: 'en',
                minDate: new Date(),
                maxDate: dat.addDays(6)
            });
            $('#timepick').datepicker();
            $('#dateranges').datepicker();
            var disabledDays = [0, 6];

            $('#disabled-days').datepicker({
                language: 'en',
                onRenderCell: function(date, cellType) {
                    if (cellType == 'day') {
                        var day = date.getDay(),
                            isDisabled = disabledDays.indexOf(day) != -1;

                        return {
                            disabled: isDisabled
                        }
                    }
                }
            });

        });
    },
    destroyed: function() {

    }
}
</script>
<style src="../vendors/air-datepicker/dist/css/datepicker.min.css"></style>
