<template>
    <div>
        <!--main content-->
        <div class="row">
            <div class="col-md-6">
                <div class="panel ">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                                <i class="ti-paint-roller"></i> Color Picker
                            </h3>
                        <span class="pull-right">
                                <i class="fa fa-fw ti-angle-up clickable"></i>
                                    <i class="fa fa-fw ti-close removepanel clickable"></i>
                                </span>
                    </div>
                    <div class="panel-body">
                        <div class="box-body">
                            <!-- Color Picker -->
                            <div class="form-group">
                                <label>Default</label>
                                <input type="text" class="form-control my-colorpicker1" id="cp1">
                            </div>
                            <!-- /.form group -->
                            <!-- Color Picker -->
                            <div class="form-group">
                                <label>
                                    Color picker with RGBA notation
                                </label>
                                <input type="text" class="form-control my-colorpicker2" id="cp2" data-color-format="rgba">
                            </div>
                            <!-- /.form group -->
                        </div>
                        <!-- /.box-body -->
                    </div>
                </div>
                <!--time picker-->
                <div class="panel ">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                                <i class="ti-pin"></i> Bootstrap TouchSpin
                            </h3>
                        <span class="pull-right">
                                <i class="fa fa-fw ti-angle-up clickable"></i>
                                    <i class="fa fa-fw ti-close removepanel clickable"></i>

                                </span>
                    </div>
                    <div class="panel-body">
                        <div class="box-body">
                            <!-- Touch spin -->
                            <div class="form-group">
                                <label>Postfix</label>
                                <input id="demo1" type="text" value="55" name="demo1" class="form-control">
                            </div>
                            <!-- /.form group -->
                            <!-- Touch spin -->
                            <div class="form-group">
                                <label>Prefix</label>
                                <div class="form-group">
                                    <input id="demo2" type="text" value="0" name="demo2" class="form-control">
                                </div>
                            </div>
                            <!-- /.form group -->
                            <!-- Touch spin -->
                            <div class="form-group">
                                <label>
                                    Vertical button alignment
                                </label>
                                <div class="form-group">
                                    <input id="demo_vertical" type="text" value="" name="demo_vertical">
                                </div>
                            </div>
                            <!-- /.form group -->
                            <!-- Touch spin -->
                            <div class="form-group">
                                <label>
                                    Vertical buttons with custom icons
                                </label>
                                <div class="form-group">
                                    <input id="demo_vertical2" type="text" value="" name="demo_vertical2">
                                </div>
                            </div>
                            <!-- /.form group -->
                            <!-- Touch spin -->
                            <div class="form-group">
                                <label>
                                    Init with empty value
                                </label>
                                <div class="form-group">
                                    <input id="demo3" type="text" value="" name="demo3">
                                </div>
                            </div>
                            <!-- /.form group -->
                            <!-- Touch spin -->
                            <div class="form-group">
                                <label>
                                    Value attribute is not set (applying settings.initval)
                                </label>
                                <div class="form-group">
                                    <input id="demo3_21" type="text" value="" name="demo3_21">
                                </div>
                            </div>
                            <!-- /.form group -->
                            <!-- Touch spin -->
                            <div class="form-group">
                                <label>
                                    Button postfix (small)
                                </label>
                                <div class="form-group">
                                    <input id="demo4" type="text" value="" name="demo4" class="input-sm">
                                </div>
                            </div>
                            <!-- /.form group -->
                            <!-- Touch spin -->
                            <div class="form-group">
                                <label>
                                    Button postfix (large)
                                </label>
                                <div class="form-group">
                                    <input id="demo4_2" type="text" value="" name="demo4_2" class="form-control input-lg">
                                </div>
                            </div>
                            <!-- /.form group -->
                            <!-- Touch spin -->
                            <div class="form-group">
                                <label>
                                    Button group
                                </label>
                                <div class="form-group">
                                    <div class="input-group">
                                        <input id="demo5" type="text" class="form-control" name="demo5" value="50">
                                    </div>
                                </div>
                            </div>
                            <!-- /.form group -->
                            <!-- Touch spin -->
                            <!-- /.form group -->
                        </div>
                        <!-- /.box-body -->
                    </div>
                </div>
                <!--time picker ends-->
                <!--Switch-->
                <div class="panel ">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                                <i class="ti-infinite"></i> Bootstrap Switch
                            </h3>
                        <span class="pull-right">
                                <i class="fa fa-fw ti-angle-up clickable"></i>
                                    <i class="fa fa-fw ti-close removepanel clickable"></i>

                                </span>
                    </div>
                    <div class="panel-body">
                        <!--switch -->
                        <div class="form-group">
                            <label>
                                Default Sizes
                            </label>
                            <div class="form-group">
                                <input type="checkbox" name="my-checkbox" data-size="mini" checked id="switchsize">
                            </div>
                            <div class="btn-group">
                                <button type="button" class="btn btn-default changesize">mini</button>
                                <button type="button" class="btn btn-default changesize">small</button>
                                <button type="button" class="btn btn-default changesize">normal</button>
                                <button type="button" class="btn btn-default changesize">large</button>
                            </div>
                        </div>
                        <!-- /.form group -->
                        <!--toggle Indeterminate-->
                        <div class="form-group">
                            <label>
                                Indeterminate State
                            </label>
                            <div class="form-group">
                                <input type="checkbox" name="my-checkbox" data-size="large" checked id="indeterminate">
                            </div>
                            <button type="button" class="btn btn-default changeindeterminate">Indeterminate</button>
                        </div>
                        <!--end-->
                        <!--On And Off Text-->
                        <div class="form-group">
                            <label>
                                Custom On And Off Text
                            </label>
                            <div class="form-group">
                                <input type="checkbox" name="my-checkbox" data-size="large" checked id="onofftext">
                            </div>
                            <div class="form-group">
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="input-group">
                                            <label class="sr-only">On Text</label>
                                            <input type="text" class="ontext form-control m-t-10" maxlength="5" placeholder="On Text">
                                        </div>
                                    </div>
                                    <div class="col-md-6 ">
                                        <div class="input-group">
                                            <label class="sr-only">Off Text</label>
                                            <input type="text" class="offtext form-control m-t-10" maxlength="5" placeholder="Off Text">
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--End-->
                        <!--switch -->
                        <div class="form-group">
                            <label>
                                Color Switch
                            </label>
                            <div class="form-group">
                                <div class="row">
                                    <div class="col-md-4 col-sm-4 m-t-10">
                                        <input type="checkbox" name="my-checkbox" checked data-on-color="primary" data-off-color="info">
                                    </div>
                                    <div class="col-md-4 col-sm-4 m-t-10">
                                        <input type="checkbox" name="my-checkbox" checked data-on-color="success" data-off-color="warning">
                                    </div>
                                    <div class="col-md-4 col-sm-4 m-t-10">
                                        <input type="checkbox" name="my-checkbox" checked data-on-color="warning" data-off-color="danger">
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- /.form group -->
                        <!--switch -->
                        <div class="form-group">
                            <label>Without Animation</label>
                            <div class="form-group">
                                <div class="row">
                                    <div class="col-md-4 col-sm-4 m-t-10">
                                        <input type="checkbox" name="my-checkbox" data-on-color="info" data-off-color="primary" data-animate>
                                    </div>
                                    <div class="col-md-4 col-sm-4 m-t-10">
                                        <input type="checkbox" name="my-checkbox" checked data-on-color="danger" data-off-color="warning" data-animate>
                                    </div>
                                    <div class="col-md-4 col-sm-4 m-t-10">
                                        <input type="checkbox" name="my-checkbox" checked data-on-color="warning" data-off-color="success" data-animate>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- /.form group -->
                        <!--switch -->
                        <div class="form-group">
                            <label>
                                Disabled / Readonly
                            </label>
                            <div class="form-group">
                                <input type="checkbox" checked disabled name="my-checkbox" />
                                <input type="checkbox" disabled name="my-checkbox" />
                            </div>
                        </div>
                        <!-- /.form group -->
                    </div>
                </div>
            </div>
            <!--col-md-6 ends-->
            <div class="col-md-6">
                <div class="panel ">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                                <i class="ti-alarm-clock"></i> Clock Face Picker
                            </h3>
                        <span class="pull-right">
                                <i class="fa fa-fw ti-angle-up clickable"></i>
                                    <i class="fa fa-fw ti-close removepanel clickable"></i>
                                </span>
                    </div>
                    <div class="panel-body">
                        <div class="form-group">
                            <label for="t1" class="control-label">
                                Default clock
                            </label>
                            <input id="t1" class="form-control input-small" value="2:30 PM" data-format="hh:mm A" type="text">
                        </div>
                        <div class="form-group">
                            <label for="t2" class="control-label">Button</label>
                            <div class="input-group">
                                <input type="text" class="form-control input-small" id="t2" value="14:30" readonly>
                                <span class="input-group-btn">
                                            <button class="btn" type="button" id="toggle-btn">
                                                <i class="fa fa-fw fa-clock-o"></i>
                                            </button>
                                        </span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="t2" class="control-label">
                                Clock picker
                            </label>
                            <div class="input-group form-inline">
                                <input type="text" class="form-control" id="input-a" value="" data-default="20:48">
                                <span class="input-group-btn">
                                        <button class="btn btn-info" type="button"
                                                id="button-a"> Pick your time</button>
                                      </span>
                            </div>
                        </div>
                    </div>
                </div>
                <!--date picker-->
                <div class="panel ">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                                <i class="ti-calendar"></i> Date Picker
                            </h3>
                        <span class="pull-right">
                                <i class="fa fa-fw ti-angle-up clickable"></i>
                                        <i class="fa fa-fw ti-close removepanel clickable"></i>

                                    </span>
                    </div>
                    <div class="panel-body">
                        <div class="form-group">
                            <label>Default:</label>
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <i class="fa fa-laptop"></i>
                                </div>
                                <input type="text" class="form-control" id="datetime1" />
                            </div>
                            <!-- /.input group -->
                        </div>
                        <div class="form-group">
                            <label>Custom Format:</label>
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <i class="fa fa-laptop"></i>
                                </div>
                                <input type="text" class="form-control" id="datetime2" />
                            </div>
                            <!-- /.input group -->
                        </div>
                        <div class="form-group">
                            <label>Custom View:</label>
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <i class="fa fa-laptop"></i>
                                </div>
                                <input type="text" class="form-control" id="datetime3" />
                            </div>
                            <!-- /.input group -->
                        </div>
                        <div class="form-group">
                            <label>Min View:</label>
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <i class="fa fa-laptop"></i>
                                </div>
                                <input type="text" class="form-control" id="datetime4" />
                            </div>
                            <!-- /.input group -->
                        </div>
                        <label>Inline View:</label>
                        <div id="datetime5"></div>
                        <!-- /.input group -->
                    </div>
                </div>
                <!--multi select-->
                <div class="panel ">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                                <i class="ti-check-box"></i> Multiselect
                            </h3>
                        <span class="pull-right">
                                <i class="fa fa-fw ti-angle-up clickable"></i>
                                    <i class="fa fa-fw ti-close removepanel clickable"></i>

                                </span>
                    </div>
                    <div class="panel-body">
                        <div class="row">
                            <div class="form-group col-md-5 col-sm-6 col-xs-12">
                                <label>
                                    Normal Select
                                </label>
                                <div class="input-group  col-md-8">
                                    <select class="multiselect" multiple="multiple">
                                        <option value="cheese">Cheese</option>
                                        <option value="tomatoes">Tomatoes</option>
                                        <option value="mozarella">Mozzarella</option>
                                        <option value="mushrooms">Mushrooms</option>
                                        <option value="pepperoni">Pepperoni</option>
                                        <option value="onions">Onions</option>
                                    </select>
                                </div>
                            </div>
                            <!-- /.form group -->
                            <div class="form-group col-md-5 col-sm-6 col-xs-12">
                                <label>
                                    Preselected
                                </label>
                                <div class="input-group  col-md-8">
                                    <select id="example2" multiple="multiple">
                                        <option value="cheese" selected>Cheese</option>
                                        <option value="tomatoes" selected>Tomatoes</option>
                                        <option value="mozarella">Mozzarella</option>
                                        <option value="mushrooms">Mushrooms</option>
                                        <option value="pepperoni">Pepperoni</option>
                                        <option value="onions">Onions</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <!-- /.form group -->
                        <div class="row">
                            <div class="form-group col-md-5 col-sm-6 col-xs-12">
                                <label>Select All</label>
                                <div class="input-group  col-md-8">
                                    <select id="example27" multiple="multiple">
                                        <option value="cheese">Cheese</option>
                                        <option value="tomatoes">Tomatoes</option>
                                        <option value="mozarella">Mozzarella</option>
                                        <option value="mushrooms">Mushrooms</option>
                                        <option value="pepperoni">Pepperoni</option>
                                        <option value="onions">Onions</option>
                                    </select>
                                </div>
                            </div>
                            <!-- /.form group -->
                            <div class="form-group col-md-5 col-sm-6 col-xs-12">
                                <label>
                                    Link Select
                                </label>
                                <div class="input-group  col-md-8">
                                    <div class="btn-group">
                                        <select id="example3" multiple="multiple">
                                            <option value="cheese">Cheese</option>
                                            <option value="tomatoes">Tomatoes</option>
                                            <option value="mozarella">Mozzarella</option>
                                            <option value="mushrooms">Mushrooms</option>
                                            <option value="pepperoni">Pepperoni</option>
                                            <option value="onions">Onions</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- /.form group -->
                        <div class="row">
                            <div class="form-group col-md-5 col-sm-6 col-xs-12">
                                <label>
                                    Group Label
                                </label>
                                <div class="input-group  col-md-8">
                                    <div class="btn-group">
                                        <select id="example19" multiple="multiple">
                                            <optgroup label="Mathematics">
                                                <option value="analysis">Analysis</option>
                                                <option value="algebra">
                                                    Linear Algebra
                                                </option>
                                                <option value="discrete">
                                                    Discrete Mathematics
                                                </option>
                                                <option value="numerical">
                                                    Numerical Analysis
                                                </option>
                                                <option value="probability">
                                                    Probability Theory
                                                </option>
                                            </optgroup>
                                            <optgroup label="Computer Science">
                                                <option value="programming">
                                                    Programming
                                                </option>
                                                <option value="automata">
                                                    Automata Theory
                                                </option>
                                                <option value="complexity">
                                                    Complexity Theory
                                                </option>
                                                <option value="software">
                                                    Software Engineering
                                                </option>
                                            </optgroup>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <!-- /.form group -->
                            <div class="form-group col-md-5 col-sm-6 col-xs-12">
                                <label>Add-ons</label>
                                <div class="input-group  col-md-8">
                                    <div class="input-group btn-group">
                                        <span class="input-group-addon"> <b
                                                        class="glyphicon glyphicon-list-alt"></b>
                                            </span>
                                        <select id="example6" multiple="multiple">
                                            <option value="cheese">Cheese</option>
                                            <option value="tomatoes">Tomatoes</option>
                                            <option value="mozarella">Mozzarella</option>
                                            <option value="mushrooms">Mushrooms</option>
                                            <option value="pepperoni">Pepperoni</option>
                                            <option value="onions">Onions</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- /.form group -->
                        <div class="row">
                            <div class="form-group col-md-5 col-sm-6 col-xs-12">
                                <label>On Change</label>
                                <div class="input-group  col-md-8">
                                    <div class="btn-group">
                                        <select id="example9" multiple="multiple">
                                            <option value="cheese">Cheese</option>
                                            <option value="tomatoes">Tomatoes</option>
                                            <option value="mozarella">Mozzarella</option>
                                            <option value="mushrooms">Mushrooms</option>
                                            <option value="pepperoni">Pepperoni</option>
                                            <option value="onions">Onions</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <!-- /.form group -->
                            <div class="form-group col-md-5 col-sm-6 col-xs-12">
                                <label>Disable</label>
                                <div class="input-group  col-md-8">
                                    <div class="btn-group">
                                        <select id="example13" multiple="multiple">
                                            <option value="enabled1">Enabled 1</option>
                                            <option value="enabled2">Enabled 2</option>
                                            <option value="disabled2" disabled="disabled">Disabled 1</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- /.form group -->
                        <div class="row">
                            <div class="form-group col-md-5 col-sm-6 col-xs-12">
                                <label>Select All</label>
                                <div class="input-group col-md-8">
                                    <select id="example28" multiple="multiple"></select>
                                </div>
                                <div class="col-md-8 m-t-10 input-group">
                                    <button id="example28-values" class="btn btn-primary">Chosen</button>
                                </div>
                            </div>
                            <!-- /.form group -->
                            <div class="form-group col-md-5 col-sm-6 col-xs-12">
                                <label>
                                    Multiselect
                                </label>
                                <div class="input-group  col-md-8">
                                    <select id="example35" multiple="multiple" disabled>
                                        <option value="cheese">Cheese</option>
                                        <option value="tomatoes">Tomatoes</option>
                                        <option value="mozarella">Mozzarella</option>
                                        <option value="mushrooms">Mushrooms</option>
                                        <option value="pepperoni">Pepperoni</option>
                                        <option value="onions">Onions</option>
                                    </select>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <button id="example35-enable" class="btn btn-default m-t-10">Enable
                                            </button>
                                        </div>
                                        <div class="col-md-6">
                                            <button id="example35-disable" class="btn btn-default m-t-10">Disable
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- /.form group -->
                    </div>
                </div>
            </div>
            <!--col-md-6 ends-->
        </div>
        <div class="background-overlay"></div>
    </div>
</template>
<script>
const moment = require("moment");
import clockface from "../vendors/clockface.js/js/clockface.js"
import colorpicker from "../vendors/mjolnic-bootstrap-colorpicker/dist/js/bootstrap-colorpicker.min.js"
import clockpicker from "../vendors/clockpicker/dist/bootstrap-clockpicker.min.js"
import datetimepicker from "../vendors/eonasdan-bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"
import touchspin from "../vendors/bootstrap-touchspin/dist/jquery.bootstrap-touchspin.min.js"
import multiselect from "../vendors/bootstrap-multiselect/dist/js/bootstrap-multiselect.js"
export default {
    name: "pickers",
    mounted: function() {
        "use strict";
        $(document).ready(function() {

            $('#t1').clockface();
            $('#t3').clockface({
                format: 'H:mm'
            }).clockface('show', '14:30');

            $('#t2').clockface({
                format: 'HH:mm',
                trigger: 'manual'
            });

            $('#toggle-btn').on('click', function(e) {
                e.stopPropagation();
                $('#t2').clockface('toggle');
            });
            //Colorpicker
            $(".my-colorpicker1").colorpicker();

            $(".my-colorpicker2").colorpicker({
                format: 'rgba'
            });

            $(".my-colorpicker3").colorpicker();
            // clock picker

            var input = $('#input-a');
            input.clockpicker({
                autoclose: true
            });

            // Manual operations
            $('#button-a').click(function(e) {
                // Have to stop propagation here
                e.stopPropagation();
                input.clockpicker('show')
                    .clockpicker('toggleView', 'minutes');
            });
            $('#button-b').click(function(e) {
                // Have to stop propagation here
                e.stopPropagation();
                input.clockpicker('show')
                    .clockpicker('toggleView', 'hours');
            });


            //datetimepicker


            $("#datetime1").datetimepicker().parent().css("position :relative");
            $("#datetime2").datetimepicker({
                format: 'LT'
            }).parent().css("position :relative");
            $("#datetime3").datetimepicker({
                viewMode: 'years'
            }).parent().css("position :relative");
            $("#datetime4").datetimepicker({
                viewMode: 'years',
                format: 'MM/YYYY'
            }).parent().css("position :relative");
            $("#datetime5").datetimepicker({
                inline: true,
                sideBySide: false
            });
            //dtetime picker end
            $("input[name='demo1']").TouchSpin({
                min: 0,
                max: 100,
                step: 0.1,
                decimals: 2,
                boostat: 5,
                maxboostedstep: 10,
                postfix: '%'
            });

            $("input[name='demo2']").TouchSpin({
                min: -1000000000,
                max: 1000000000,
                stepinterval: 50,
                maxboostedstep: 10000000,
                prefix: '$'
            });

            $("input[name='demo_vertical']").TouchSpin({
                verticalbuttons: true
            });

            $("input[name='demo_vertical2']").TouchSpin({
                verticalbuttons: true,
                verticalupclass: 'glyphicon glyphicon-plus',
                verticaldownclass: 'glyphicon glyphicon-minus'
            });

            $("input[name='demo3']").TouchSpin();

            $("input[name='demo3_21']").TouchSpin({
                initval: 40
            });

            $("input[name='demo3_22']").TouchSpin({
                initval: 40
            });

            $("input[name='demo4']").TouchSpin({
                postfix: "a button",
                postfix_extraclass: "btn btn-default"
            });

            $("input[name='demo4_2']").TouchSpin({
                postfix: "a button",
                postfix_extraclass: "btn btn-default"
            });

            $("input[name='demo5']").TouchSpin({
                prefix: "pre",
                postfix: "post"
            });

            $("input[name='demo6']").TouchSpin({
                buttondown_class: "btn btn-link",
                buttonup_class: "btn btn-link"
            });


            $('.multiselect').multiselect({
                numberDisplayed: 2
            });
            $('#example2').multiselect({
                numberDisplayed: 2
            });
            $('#example27').multiselect({
                includeSelectAllOption: true,
                numberDisplayed: 2
            });

            // Add options for example 28.
            for (var i = 1; i <= 100; i++) {
                $('#example28').append('<option value="' + i + '">' + i + '</option>');
            }

            $('#example28').multiselect({
                includeSelectAllOption: true,
                enableFiltering: true,
                maxHeight: 150,
                numberDisplayed: 2
            });

            $('#example28-values').on('click', function() {
                var values = [];

                $('option:selected', $('#example28')).each(function() {
                    values.push($(this).val());
                });

                alert(values);
            });

            $('#example3').multiselect({
                buttonClass: 'btn btn-link',
                numberDisplayed: 2
            });
            $('#example6').multiselect({
                numberDisplayed: 2
            });

            $('#example9').multiselect({
                onChange: function(element, checked) {
                    alert('Change event invoked!');
                    console.log(element);
                },
                numberDisplayed: 2
            });

            $('#example13').multiselect({
                numberDisplayed: 2
            });

            $('#example19').multiselect({
                numberDisplayed: 1
            });

            $('#example35').multiselect({
                numberDisplayed: 2
            });
            $('#example35-enable').on('click', function() {
                $('#example35').multiselect('enable');
            });
            $('#example35-disable').on('click', function() {
                $('#example35').multiselect('disable');
            });

            $("[name='my-checkbox']").bootstrapSwitch();
            //============button-size-change=======
            $(".changesize").on("click", function() {
                $("#switchsize").bootstrapSwitch("size", $(this).text());
            });
            //=========Indeterminate State==========
            $('.changeindeterminate').on("click", function() {
                $('#indeterminate').bootstrapSwitch('toggleIndeterminate');
            });
            //==============On Off Text==========
            $(".ontext,.offtext").on("keyup", function() {
                $('#onofftext').bootstrapSwitch('onText', $('.ontext').val());
                if ($('.ontext').val() == "") {
                    $('#onofftext').bootstrapSwitch('onText', "ON");
                }
                $('#onofftext').bootstrapSwitch('offText', $('.offtext').val());
                if ($('.offtext').val() == "") {
                    $('#onofftext').bootstrapSwitch('offText', "OFF");
                }
            });
        });
    },
    destroyed: function() {

    }
}
</script>
<style src="../vendors/clockface.js/css/clockface.css"></style>
<style src="../vendors/mjolnic-bootstrap-colorpicker/dist/css/bootstrap-colorpicker.min.css"></style>
<style src="../vendors/eonasdan-bootstrap-datetimepicker/build/css/bootstrap-datetimepicker.min.css"></style>
<style src="../vendors/clockpicker/dist/bootstrap-clockpicker.min.css"></style>
<style src="../vendors/bootstrap-touchspin/dist/jquery.bootstrap-touchspin.min.css"></style>
<style src="../vendors/bootstrap-multiselect/dist/css/bootstrap-multiselect.css"></style>
<style src="../assets/css/pickers.css"></style>
