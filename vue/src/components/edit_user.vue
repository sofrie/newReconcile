<template>
    <div>
        <div class="row">
            <div class="col-md-12">
                <div class="panel">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                                <i class="livicon" data-name="user-add" data-size="18" data-c="#fff" data-hc="#fff"
                                   data-loop="true"></i> Add New User
                            </h3>
                        <span class="pull-right">
                                    <i class="fa fa-fw ti-angle-up clickable"></i>
                                </span>
                    </div>
                    <div class="panel-body">
                        <!-- errors -->
                        <!--main content-->
                        <form id="adduser_form" method="POST" enctype="multipart/form-data" class="form-horizontal">
                            <!-- CSRF Token -->
                            <input type="hidden" name="_token" />
                            <div id="pager_wizard">
                                <ul>
                                    <li>
                                        <a href="#tab1" data-toggle="tab">User Profile</a>
                                    </li>
                                    <li>
                                        <a href="#tab2" data-toggle="tab">Bio</a>
                                    </li>
                                    <li>
                                        <a href="#tab3" data-toggle="tab">Address</a>
                                    </li>
                                    <li>
                                        <a href="#tab4" data-toggle="tab">User Group</a>
                                    </li>
                                </ul>
                                <div class="tab-content">
                                    <div class="tab-pane" id="tab1">
                                        <h2 class="hidden">&nbsp;</h2>
                                        <div class="form-group">
                                            <label for="first_name" class="col-sm-3 control-label">First Name *
                                            </label>
                                            <div class="col-sm-9">
                                                <input id="first_name" name="first_name" type="text" placeholder="First Name" class="form-control required" value="Addison" />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="last_name" class="col-sm-3 control-label">Last Name *
                                            </label>
                                            <div class="col-sm-9">
                                                <input id="last_name" name="last_name" type="text" placeholder="Last Name" class="form-control required" value="Schmeler" />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="email" class="  col-sm-3 control-label">Email *</label>
                                            <div class="col-sm-9">
                                                <input id="email" name="email" placeholder="E-mail" type="text" class="form-control required email" value="Addisone@sf.com" />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="password" class="  col-sm-3 control-label">Password *
                                            </label>
                                            <div class="col-sm-9">
                                                <input id="password" name="password" type="password" placeholder="Password" class="form-control required" />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="password_confirm" class="  col-sm-3 control-label">Confirm Password *
                                            </label>
                                            <div class="col-sm-9">
                                                <input id="password_confirm" name="password_confirm" type="password" placeholder="Confirm Password " class="form-control required" />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="tab-pane" id="tab2">
                                        <h2 class="hidden">&nbsp;</h2>
                                        <div class="form-group required">
                                            <label for="dob" class="  col-sm-3 control-label">Date of Birth</label>
                                            <div class="col-sm-9">
                                                <input id="dob" name="dob" type="text" class="form-control" placeholder="dd/mm/yyyy" />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="pic" class="  col-sm-3 control-label">Profile picture
                                            </label>
                                            <div class="col-sm-9">
                                                <div class="fileinput fileinput-new" data-provides="fileinput">
                                                    <div class="fileinput-new thumbnail" style="width: 200px; height: 200px;">
                                                        <img src="../assets/img/authors/avatar1.jpg" alt="profile pic holder">
                                                    </div>
                                                    <div class="fileinput-preview fileinput-exists thumbnail" style="max-width: 200px; max-height: 200px;"></div>
                                                    <div>
                                                        <span class="btn btn-default btn-file">
                                    <span class="fileinput-new">Select image</span>
                                                        <span class="fileinput-exists">Change</span>
                                                        <input id="pic" name="pic_file" type="file" class="form-control" />
                                                        </span>
                                                        <a href="#" class="btn btn-danger fileinput-exists" data-dismiss="fileinput">Remove</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group required">
                                            <label for="bio" class="  col-sm-3 control-label">Bio
                                                <small>(brief intro) *</small>
                                            </label>
                                            <div class="col-sm-9">
                                                <textarea name="bio" id="bio" class="form-control resize_vertical" rows="4"></textarea>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="tab-pane" id="tab3">
                                        <div class="form-group">
                                            <label for="gender" class="  col-sm-3 control-label">Gender *</label>
                                            <div class="col-sm-9">
                                                <select class="form-control select21" id="gender" title="Select Gender..." name="gender">
                                                    <option disabled selected>Select Gender</option>
                                                    <option value="male">MALE</option>
                                                    <option value="female">FEMALE</option>
                                                    <option value="other">OTHER</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="country" class="  col-sm-3 control-label">Country</label>
                                            <div class="col-sm-9">
                                                <select class="select21 form-control" name="country" id="country">
                                                    <optgroup label="Alaskan/Hawaiian Time Zone">
                                                        <option>Select Country</option>
                                                        <option value="AK">Alaska</option>
                                                        <option value="HI">Hawaii</option>
                                                    </optgroup>
                                                    <optgroup label="Pacific Time Zone">
                                                        <option value="CA">California</option>
                                                        <option value="NV">Nevada</option>
                                                        <option value="OR">Oregon</option>
                                                        <option value="WA">Washington</option>
                                                    </optgroup>
                                                    <optgroup label="Mountain Time Zone">
                                                        <option value="AZ">Arizona</option>
                                                        <option value="CO">Colorado</option>
                                                        <option value="ID">Idaho</option>
                                                        <option value="MT">Montana</option>
                                                        <option value="NE">Nebraska</option>
                                                        <option value="NM">New Mexico</option>
                                                        <option value="ND">North Dakota</option>
                                                        <option value="UT">Utah</option>
                                                        <option value="WY">Wyoming</option>
                                                    </optgroup>
                                                    <optgroup label="Central Time Zone">
                                                        <option value="AL">Alabama</option>
                                                        <option value="AR">Arkansas</option>
                                                        <option value="IL">Illinois</option>
                                                        <option value="IA">Iowa</option>
                                                        <option value="KS">Kansas</option>
                                                        <option value="KY">Kentucky</option>
                                                        <option value="LA">Louisiana</option>
                                                        <option value="MN">Minnesota</option>
                                                        <option value="MS">Mississippi</option>
                                                        <option value="MO">Missouri</option>
                                                        <option value="OK">Oklahoma</option>
                                                        <option value="SD">South Dakota</option>
                                                        <option value="TX">Texas</option>
                                                        <option value="TN">Tennessee</option>
                                                        <option value="WI">Wisconsin</option>
                                                    </optgroup>
                                                    <optgroup label="Eastern Time Zone">
                                                        <option value="CT">Connecticut</option>
                                                        <option value="DE">Delaware</option>
                                                        <option value="FL">Florida</option>
                                                        <option value="GA">Georgia</option>
                                                        <option value="IN">Indiana</option>
                                                        <option value="ME">Maine</option>
                                                        <option value="MD">Maryland</option>
                                                        <option value="MA">Massachusetts</option>
                                                        <option value="MI">Michigan</option>
                                                        <option value="NH">New Hampshire</option>
                                                        <option value="NJ">New Jersey</option>
                                                        <option value="NY">New York</option>
                                                        <option value="NC">North Carolina</option>
                                                        <option value="OH">Ohio</option>
                                                        <option value="PA">Pennsylvania</option>
                                                        <option value="RI">Rhode Island</option>
                                                        <option value="SC">South Carolina</option>
                                                        <option value="VT">Vermont</option>
                                                        <option value="VA">Virginia</option>
                                                        <option value="WV">West Virginia</option>
                                                    </optgroup>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group ">
                                            <label for="state" class="  col-sm-3 control-label">State </label>
                                            <div class="col-sm-9">
                                                <input id="state" name="state" type="text" class="form-control" />
                                            </div>
                                        </div>
                                        <div class="form-group required">
                                            <label for="city" class="  col-sm-3 control-label">City </label>
                                            <div class="col-sm-9">
                                                <input id="city" name="city" type="text" class="form-control" />
                                            </div>
                                        </div>
                                        <div class="form-group required">
                                            <label for="address" class="  col-sm-3 control-label">Address </label>
                                            <div class="col-sm-9">
                                                <input id="address" name="address" type="text" class="form-control" />
                                            </div>
                                        </div>
                                        <div class="form-group required">
                                            <label for="postal" class="  col-sm-3 control-label">Postal/zip</label>
                                            <div class="col-sm-9">
                                                <input id="postal" name="postal" type="text" class="form-control" />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="tab-pane" id="tab4">
                                        <p class="text-danger"><strong>Be careful with group selection, if you give
                                                admin access.. they can access admin section</strong></p>
                                        <div class="form-group required">
                                            <label for="group" class="  col-sm-3 control-label">Group *</label>
                                            <div class="col-sm-9">
                                                <select class="form-control required select21" title="Select group..." name="group" id="group">
                                                    <option disabled selected>Select Group</option>
                                                    <option value="admin">admin</option>
                                                    <option value="user">user</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="activate" class="  col-sm-3 control-label"> Activate User
                                            </label>
                                            <div class="col-sm-9">
                                                <label for="activate">
                                                    <input id="activate" name="activate" type="checkbox" class="pos-rel p-l-30 custom-checkbox" value="1"> &nbsp;Activate the user otherwise the user won't be able to access their account.
                                                </label>
                                            </div>
                                        </div>
                                    </div>
                                    <ul class="pager wizard">
                                        <li class="previous">
                                            <a href="javascript:void(0)">Previous</a>
                                        </li>
                                        <li class="next">
                                            <a href="javascript:void(0)">Next</a>
                                        </li>
                                        <li class="next finish" style="display:none;">
                                            <a href="javascript:;">Finish</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                            <div id="myModal" class="modal fade" role="dialog">
                                <div class="modal-dialog">
                                    <!-- Modal content-->
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                                            <h4 class="modal-title">User Register</h4>
                                        </div>
                                        <div class="modal-body">
                                            <p>Account Registered Successfully.</p>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-default" data-dismiss="modal">Ok
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!--row end-->
    </div>
</template>
<script>
import jasney from "../vendors/jasny-bootstrap/dist/js/jasny-bootstrap.min.js";

import select2 from "../vendors/select2/dist/js/select2.min.js";
import validator from "../vendors/bootstrapvalidator/dist/js/bootstrapValidator.min.js";
require("imports-loader?moment=moment!../vendors/eonasdan-bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js")
import datepicker from "../vendors/eonasdan-bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"
import wizard from "../vendors/twitter-bootstrap-wizard/jquery.bootstrap.wizard.min.js"
export default {
    name: "edit_user",
    mounted: function() {
        "use strict";

        $(document).ready(function() {

            // bootstrap wizard//
            $(".select21").select2({
                theme: "bootstrap",
                placeholder: "",
                width: '100%'
            });
            $('input[type="checkbox"].custom-checkbox, input[type="radio"].custom-radio').iCheck({
                checkboxClass: 'icheckbox_square-blue',
                radioClass: 'iradio_minimal-blue',
                increaseArea: '20%'
            });
            $("#dob").datetimepicker({
                widgetPositioning: {
                    vertical: 'bottom'
                },
                format: 'DD/MM/YYYY',
                useCurrent: false,
                maxDate: 'now'
            });
            $("#adduser_form").bootstrapValidator({
                fields: {
                    first_name: {
                        validators: {
                            notEmpty: {
                                message: 'The first name is required'
                            }
                        },
                        required: true,
                        minlength: 3
                    },
                    last_name: {
                        validators: {
                            notEmpty: {
                                message: 'The last name is required'
                            }
                        },
                        required: true,
                        minlength: 3
                    },
                    password: {
                        validators: {
                            notEmpty: {
                                message: 'Password is required'
                            },
                            different: {
                                field: 'first_name,last_name',
                                message: 'Password should not match first or last name'
                            }
                        }
                    },
                    password_confirm: {
                        validators: {
                            notEmpty: {
                                message: 'Confirm Password is required'
                            },
                            identical: {
                                field: 'password'
                            },
                            different: {
                                field: 'first_name,last_name',
                                message: 'Confirm Password should match with password'
                            }
                        }
                    },
                    email: {
                        validators: {
                            notEmpty: {
                                message: 'The email address is required'
                            },
                            regexp: {
                                regexp: /^\S+@\S{1,}\.\S{1,}$/,
                                message: 'The input is not a valid email address'
                            }
                        }
                    },
                    bio: {
                        validators: {
                            notEmpty: {
                                message: 'Bio is required and cannot be empty'
                            }
                        },
                        minlength: 20
                    },

                    gender: {
                        validators: {
                            notEmpty: {
                                message: 'Please select a gender'
                            }
                        }
                    },
                    activate: {
                        validators: {
                            notEmpty: {
                                message: 'Please check the checkbox to activate'
                            }
                        }
                    },
                    group: {
                        validators: {
                            notEmpty: {
                                message: 'You must select a group'
                            }
                        }
                    }
                }
            });

            $('#activate').on('ifChanged', function(event) {
                $('#adduser_form').bootstrapValidator('revalidateField', $('#activate'));
            });

            $('#pager_wizard').bootstrapWizard({
                'tabClass': 'nav nav-pills',
                'onNext': function(tab, navigation, index) {
                    var $validator = $('#adduser_form').data('bootstrapValidator').validate();
                    return $validator.isValid();
                },
                onTabClick: function(tab, navigation, index) {
                    return false;
                },
                onTabShow: function(tab, navigation, index) {
                    var $total = navigation.find('li').length;
                    var $current = index + 1;
                    var $percent = ($current / $total) * 100;

                    // If it's the last tab then hide the last button and show the finish instead
                    var wizard = $('#pager_wizard');
                    if ($current >= $total) {
                        wizard.find('.pager .next').hide();
                        wizard.find('.pager .finish').show();
                        wizard.find('.pager .finish').removeClass('disabled');
                    } else {
                        wizard.find('.pager .next').show();
                        wizard.find('.pager .finish').hide();
                    }
                    wizard.find('.finish').on('click', function() {
                        var $validator = $('#adduser_form').data('bootstrapValidator').validate();
                        if ($validator.isValid()) {
                            $('#myModal').modal('show');
                            return $validator.isValid();
                            wizard.find("a[href='#tab1']").tab('show');
                        }
                    });
                    $('#myModal').on('hide.bs.modal', function(e) {
                        location.reload();
                    });

                }
            });

        });
    },
    destroyed: function() {

    }
}
</script>
<style src="../vendors/jasny-bootstrap/dist/css/jasny-bootstrap.min.css"></style>
<style src="../vendors/select2/dist/css/select2.min.css"></style>
<style src="../vendors/select2-bootstrap-theme/dist/select2-bootstrap.min.css"></style>
<style src="../vendors/bootstrapvalidator/dist/css/bootstrapValidator.min.css"></style>
<style src="../vendors/eonasdan-bootstrap-datetimepicker/build/css/bootstrap-datetimepicker.min.css"></style>
<style src="../assets/css/custom_css/wizard.css"></style>
