<template>
    <div>
        <!--main content-->
        <div class="row">
            <div class="col-md-6">
                <div class="panel ">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                                <i class="fa fa-fw ti-star"></i> Basic Form Validation
                            </h3>
                        <span class="pull-right">
                                    <i class="fa fa-fw ti-angle-up clickable"></i>
                                    <i class="fa fa-fw ti-close removepanel clickable"></i>
                                </span>
                    </div>
                    <div class="panel-body">
                        <form id="form-validation" class="form-horizontal" v-on:submit.prevent>
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="val-username">
                                    Username
                                    <span class="text-danger">*</span>
                                </label>
                                <div class="col-md-6">
                                    <input type="text" id="val-username" name="firstName" class="form-control" placeholder="Enter your name">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="email">
                                    Email
                                    <span class="text-danger">*</span>
                                </label>
                                <div class="col-md-6">
                                    <input type="text" id="email" name="email" class="form-control" placeholder="Enter your valid email">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="password">
                                    Password
                                    <span class="text-danger">*</span>
                                </label>
                                <div class="col-md-6">
                                    <input type="password" id="password" name="password" class="form-control" placeholder="Enter your password">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="confirmpassword">
                                    Confirm Password
                                    <span class="text-danger">*</span>
                                </label>
                                <div class="col-md-6">
                                    <input type="password" id="confirmpassword" name="confirmpassword" class="form-control" placeholder="Confirm password">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="message">
                                    Message
                                    <span class="text-danger">*</span>
                                </label>
                                <div class="col-md-6">
                                    <textarea id="message" name="message" rows="7" class="form-control resize_vertical" placeholder="Enter your message"></textarea>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="skill">
                                    Best Skill
                                    <span class="text-danger">*</span>
                                </label>
                                <div class="col-md-6">
                                    <select id="skill" name="skill" class="form-control">
                                        <option value="">
                                            Please select
                                        </option>
                                        <option value="html">HTML</option>
                                        <option value="css">CSS</option>
                                        <option value="javascript">Javascript</option>
                                        <option value="php">PHP</option>
                                        <option value="mysql">MySQL</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="url">
                                    Website
                                    <span class="text-danger">*</span>
                                </label>
                                <div class="col-md-6">
                                    <input type="text" id="url" name="url" class="form-control" placeholder="http://example.com">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="number">
                                    Phone Number
                                    <span class="text-danger">*</span>
                                </label>
                                <div class="col-md-6">
                                    <input type="text" id="number" name="number" class="form-control" placeholder="Enter your phone number">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-4 control-label">Gender
                                    <span class="text-danger">*</span>
                                </label>
                                <div class="col-md-6">
                                    <div>
                                        <label>
                                            <input class="custom_radio" type="radio" name="gender" value="male" /> Male
                                        </label>
                                    </div>
                                    <div>
                                        <label>
                                            <input class="custom_radio" type="radio" name="gender" value="female" /> Female
                                        </label>
                                    </div>
                                    <div>
                                        <label>
                                            <input class="custom_radio" type="radio" name="gender" value="other" /> Other
                                        </label>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-8 col-md-offset-4">
                                    <label class="padding7" for="terms">
                                        <input type="checkbox" class="custom_icheck" id="terms" name="terms" value="1">&nbsp;&nbsp;I agree to
                                        <a href="#modal-terms" data-toggle="modal">Terms &amp; Conditions</a>
                                    </label>
                                </div>
                            </div>
                            <div class="form-group form-actions">
                                <div class="col-md-8 col-md-offset-4">
                                    <button type="submit" class="btn btn-effect-ripple btn-primary">Submit</button>
                                    <button type="reset" class="btn btn-effect-ripple btn-default reset_btn">Reset
                                    </button>
                                </div>
                            </div>
                        </form>
                        <div id="modal-terms" class="modal fade" tabindex="-1" role="dialog" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h3 class="modal-title text-center">
                                                <strong>
                                                    Terms and Conditions
                                                </strong>
                                            </h3>
                                    </div>
                                    <div class="modal-body">
                                        <h4 class="page-header">
                                                1.
                                                <strong>General</strong>
                                            </h4>
                                        <p>
                                            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas ultrices, justo vel imperdiet gravida, urna ligula hendrerit nibh, ac cursus nibh sapien in purus. Mauris tincidunt tincidunt turpis in porta. Integer fermentum tincidunt auctor.
                                        </p>
                                        <h4 class="page-header">
                                                2.
                                                <strong>Account</strong>
                                            </h4>
                                        <p>
                                            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas ultrices, justo vel imperdiet gravida, urna ligula hendrerit nibh, ac cursus nibh sapien in purus. Mauris tincidunt tincidunt turpis in porta. Integer fermentum tincidunt auctor.
                                        </p>
                                        <h4 class="page-header">
                                                3.
                                                <strong>Service</strong>
                                            </h4>
                                        <p>
                                            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas ultrices, justo vel imperdiet gravida, urna ligula hendrerit nibh, ac cursus nibh sapien in purus. Mauris tincidunt tincidunt turpis in porta. Integer fermentum tincidunt auctor.
                                        </p>
                                        <h4 class="page-header">
                                                4.
                                                <strong>Payments</strong>
                                            </h4>
                                        <p>
                                            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas ultrices, justo vel imperdiet gravida, urna ligula hendrerit nibh, ac cursus nibh sapien in purus. Mauris tincidunt tincidunt turpis in porta. Integer fermentum tincidunt auctor.
                                        </p>
                                    </div>
                                    <div class="modal-footer">
                                        <div class="text-center">
                                            <button type="button" class="btn btn-effect-ripple btn-primary" data-dismiss="modal">
                                                I've read them!
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="panel ">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                                <i class="fa fa-fw ti-folder"></i> Validations In Modal
                            </h3>
                        <span class="pull-right">
                                    <i class="fa fa-fw ti-angle-up clickable"></i>
                                    <i class="fa fa-fw ti-close removepanel clickable"></i>

                                </span>
                    </div>
                    <div class="panel-body">
                        <div class="row">
                            <button type="button" class="btn btn-primary btn-lg center-block" data-toggle="modal" data-target="#myModal">
                                Click to open form in modal
                            </button>
                            <!-- Modal -->
                            <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×
                                            </button>
                                            <h4 class="modal-title" id="myModalLabel">Form Modal</h4>
                                        </div>
                                        <div class="modal-body">
                                            <form role="form" id="form-validation3" action="#" method="post" @submit.stop.prevent>
                                                <div class="row">
                                                    <div class="col-xs-12 col-sm-6 col-md-6">
                                                        <div class="form-group">
                                                            <input type="text" name="modalfirst_name" id="modalfirst_name" class="form-control input-md" placeholder="First Name" tabindex="1" data-error="First name must be entered" required>
                                                        </div>
                                                    </div>
                                                    <div class="col-xs-12 col-sm-6 col-md-6">
                                                        <div class="form-group">
                                                            <input type="text" name="modallast_name" id="modallast_name" class="form-control input-md" placeholder="Last Name" tabindex="2" data-error="Last name must be entered" required>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-12">
                                                        <div class="form-group">
                                                            <input type="text" name="display_name" id="display_name" class="form-control input-md" placeholder="Display Name" tabindex="3" data-error="Username must be enetered" required>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-12">
                                                        <div class="form-group">
                                                            <input type="text" name="email" class="form-control input-md" placeholder="Email Address" tabindex="4" data-error="that email address is invalid" required>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-xs-12 col-sm-6 col-md-6">
                                                        <div class="form-group">
                                                            <input type="password" name="modalpassword" id="modalpassword" class="form-control input-md" placeholder="Password" tabindex="5" required>
                                                        </div>
                                                    </div>
                                                    <div class="col-xs-12 col-sm-6 col-md-6">
                                                        <div class="form-group">
                                                            <input type="password" name="confirmpassword" class="form-control input-md" placeholder="Confirm Password" data-match="#password" data-match-error="conform passwork should be same as password" tabindex="6" required>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-12">
                                                        <div class="form-group">
                                                            <div class="col-md-8">
                                                                <label class="padding7" for="modalterms">
                                                                    <input type="checkbox" class="custom_icheck" id="modalterms" name="modalterms" value="1">&nbsp;&nbsp;I agree
                                                                </label>
                                                            </div>
                                                            <div class="help-block with-errors"></div>
                                                        </div>
                                                    </div>
                                                    <div class="col-md-12">
                                                        <p class="margin-top">
                                                            By clicking on the
                                                            <strong class="label label-primary">Register</strong> , you agree the following
                                                            <a href="#">Terms and Conditions</a> liability as set out in this site, including our Cookie Use.
                                                        </p>
                                                    </div>
                                                </div>
                                                <div class="row marginTop">
                                                    <div class="col-xs-6 col-md-6">
                                                        <input type="submit" id="btncheck" value="Register" class="btn btn-primary btn-block btn-md btn-responsive" tabindex="7">
                                                    </div>
                                                    <div class="col-xs-6 col-md-6">
                                                        <a class="btn btn-success btn-block btn-md btn-responsive">Sign
                                                                In</a>
                                                    </div>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                    <!-- /.modal-content -->
                                </div>
                                <!-- /.modal-dialog -->
                            </div>
                            <!-- /.modal -->
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="panel ">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                                <i class="fa fa-fw ti-key"></i> Password Strength
                            </h3>
                        <span class="pull-right">
                                        <i class="fa fa-fw ti-angle-up clickable"></i>
                                     <i class="fa fa-fw ti-close removepanel clickable"></i>
                                    </span>
                    </div>
                    <div class="panel-body">
                        <form action="#" method="post" id="passwordForm">
                            <!-- CSRF Token -->
                            <div class="form-group">
                                <input type="password" class="input-md form-control" name="password1" id="password1" placeholder="New Password" autocomplete="off">
                            </div>
                            <div class="form-group">
                                <input type="password" class="input-md form-control" name="password2" id="password2" placeholder="Repeat Password" autocomplete="off">
                            </div>
                            <div>
                                <div class="col-sm-12 padding">
                                    <span id="pwmatch" class="glyphicon glyphicon-ok" style="color:#2ECC71;"></span> Passwords Match
                                </div>
                            </div>
                            <div class="col-sm-12">
                                <a href="javascript:void(0)" class="col-xs-12 btn btn-primary btn-load btn-md m-t-10" data-loading-text="Changing Password...">Change Password</a>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="panel ">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                                <i class="fa fa-fw ti-credit-card"></i> Payment Gateway
                            </h3>
                        <span class="pull-right">
                                        <i class="fa fa-fw ti-angle-up clickable"></i>
                                     <i class="fa fa-fw ti-close removepanel clickable"></i>
                                    </span>
                    </div>
                    <div class="panel-body">
                        <div class="card-wrapper"></div>
                        <form id="card-form">
                            <div id="card">
                                <div class="row">
                                    <div class="col-xs-12">
                                        <div class="form-group label-floating">
                                            <label class="control-label m-t-10">Card Number</label>
                                            <input name="number" required type="text" placeholder="" class="form-control" />
                                        </div>
                                    </div>
                                    <div class="col-xs-6">
                                        <div class="form-group label-floating">
                                            <label class="control-label">Expiry Date</label>
                                            <input name="expiry" id="cardexpire" placeholder="" class="form-control" />
                                        </div>
                                    </div>
                                    <div class="col-xs-6">
                                        <div class="form-group label-floating">
                                            <label class="control-label">CVV</label>
                                            <input name="cvc" required type="text" placeholder="" class="form-control" />
                                        </div>
                                    </div>
                                    <div class="col-xs-12">
                                        <div class="form-group label-floating">
                                            <label class="control-label">Name on Card</label>
                                            <input name="name" type="text" class="form-control" maxlength="40" required/>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <button class="btn btn-warning btn-block">Save and Pay</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <!--image upload -->
                <div class="row">
                    <div class="col-md-12">
                        <div class="panel">
                            <div class="panel-heading">
                                <h3 class="panel-title">
                                        <i class="fa fa-fw ti-ink-pen"></i> Bootstrap Input MaxLength
                                    </h3>
                                <span class="pull-right">
                                    <i class="fa fa-fw ti-close removepanel clickable"></i>
                                </span>
                            </div>
                            <div class="panel-body">
                                <!--max length starts-->
                                <div class="form-group">
                                    <label for="placement" class="control-label">
                                        Custom Position
                                    </label>
                                    <input type="text" class="form-control" maxlength="25" name="placement" id="placement" />
                                </div>
                                <div class="form-group">
                                    <label for="moreoptions" class="control-label">Options</label>
                                    <input type="text" class="form-control" maxlength="25" name="moreoptions" id="moreoptions" />
                                </div>
                                <div class="form-group">
                                    <label for="alloptions" class="control-label">
                                        All the options
                                    </label>
                                    <input type="text" class="form-control" maxlength="25" name="alloptions" id="alloptions" />
                                </div>
                                <div class="form-group">
                                    <label for="textarea" class="control-label">Text Area</label>
                                    <textarea id="textarea" class="form-control resize_vertical" maxlength="225" rows="4" placeholder="This textarea has a limit of 225 chars."></textarea>
                                </div>
                                <!--min length ends-->
                            </div>
                        </div>
                    </div>
                </div>
                <!-- col-md-6 -->
            </div>
        </div>
    </div>
</template>
<script>
import sweetalert from "../vendors/sweetalert2/dist/sweetalert2.min.js"
import validator from "../vendors/bootstrapvalidator/dist/js/bootstrapValidator.min.js"
import max_length from "../vendors/bootstrap-maxlength/src/bootstrap-maxlength.js"
import card from "../vendors/card/dist/jquery.card.js"
import passtrength from "../assets/js/passtrength/passtrength.js"
export default {
    name: "blank",
    mounted: function() {
        "use strict";
        $(document).ready(function() {

            $('#form-validation').bootstrapValidator({
                fields: {
                    firstName: {
                        validators: {
                            notEmpty: {
                                message: 'The user name is required and cannot be empty'
                            }
                        }
                    },
                    message: {
                        validators: {
                            notEmpty: {
                                message: 'The field is required and cannot be empty'
                            }
                        }
                    },
                    password: {
                        validators: {

                            notEmpty: {
                                message: 'Please provide a password'
                            }
                        }
                    },
                    confirmpassword: {
                        validators: {
                            notEmpty: {
                                message: 'The confirm password is required and can\'t be empty'
                            },
                            identical: {
                                field: 'password',
                                message: 'Please enter the password same as above'
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
                                message: 'Please enter valid email format'
                            }
                        }
                    },
                    skill: {
                        validators: {
                            notEmpty: {
                                message: 'The field is required and cannot be empty'
                            }
                        }
                    },
                    url: {
                        validators: {
                            notEmpty: {
                                message: 'The web url is required'
                            },
                            uri: {
                                allowLocal: true,
                                message: 'The input is not a valid URL'
                            }
                        }
                    },
                    number: {
                        validators: {
                            notEmpty: {
                                message: 'The number is required and cannot be empty'
                            },
                            regexp: {
                                regexp: /[2-9]{2}\d{8}/,
                                message: 'The phone number can only consist of numbers'
                            }
                        }
                    },
                    terms: {
                        validators: {
                            notEmpty: {
                                message: 'You have to accept the terms and conditions'
                            }
                        }
                    },
                    gender: {
                        validators: {
                            notEmpty: {
                                message: 'The gender is required'
                            }
                        }
                    }
                },
                submitHandler: function(validator, form, submitButton) {
                    var fullName = [validator.getFieldElements('firstName').val(),
                        validator.getFieldElements('lastName').val()
                    ].join(' ');
                    $('#helloModal')
                        .find('.modal-title').html('Hello ' + fullName).end()
                        .modal();
                }
            }).on('reset', function(event) {
                $('#form-validation').data('bootstrapValidator').resetForm();
            });
            $('input[type="checkbox"].custom_icheck, input[type="radio"].custom_radio').iCheck({
                checkboxClass: 'icheckbox_square-blue',
                radioClass: 'iradio_square-blue',
                increaseArea: '20%'
            });
            $('#terms').on('ifChanged', function(event) {
                $('#form-validation').bootstrapValidator('revalidateField', $('#terms'));
            });
            $('.custom_radio').on('ifChanged', function(event) {
                $('#form-validation').bootstrapValidator('revalidateField', $('.custom_radio'));
            });
            $('.reset_btn').on('click', function() {
                var icheckbox = $('.custom_icheck');
                var radiobox = $('.custom_radio');
                icheckbox.prop('defaultChecked') == false ? icheckbox.iCheck('uncheck') : icheckbox.iCheck('check').iCheck('update');

                radiobox.prop('defaultChecked') == false ? radiobox.iCheck('uncheck') : radiobox.iCheck('check').iCheck('update');
            });
            $('#form-validation3').bootstrapValidator({
                fields: {
                    modalfirst_name: {
                        validators: {
                            notEmpty: {
                                message: 'The first name is required and cannot be empty'
                            }
                        }
                    },
                    modallast_name: {
                        validators: {
                            notEmpty: {
                                message: 'The last name is required and cannot be empty'
                            }
                        }
                    },
                    display_name: {
                        validators: {
                            notEmpty: {
                                message: 'The display name is required and cannot be empty'
                            }
                        }
                    },
                    modalpassword: {
                        validators: {

                            notEmpty: {
                                message: 'Please provide a password'
                            }
                        }
                    },
                    confirmpassword: {
                        validators: {
                            notEmpty: {
                                message: 'The confirm password is required and can\'t be empty'
                            },
                            identical: {
                                field: 'modalpassword',
                                message: 'Please enter the same password as before'
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
                                message: 'Please enter valid email format'
                            }
                        }
                    },
                    modalterms: {
                        validators: {
                            notEmpty: {
                                message: 'You have to accept the terms and conditions'
                            }
                        }
                    }
                }
            });
            $('#modalterms').on('ifChanged', function(event) {
                $('#form-validation3').bootstrapValidator('revalidateField', $('#modalterms'));
            });
            $('input#defaultconfig').maxlength();

            $('input#thresholdconfig').maxlength({
                threshold: 20

            });
            $('input#moreoptions').maxlength({
                alwaysShow: true,
                warningClass: "label label-success",
                limitReachedClass: "label label-danger"
            });

            $('input#alloptions').maxlength({
                alwaysShow: true,
                warningClass: "label label-success",
                limitReachedClass: "label label-danger",
                separator: ' chars out of ',
                preText: 'You typed ',
                postText: ' chars.',
                validate: true
            });


            $('#textarea').maxlength({
                alwaysShow: true,
                appendToParent: true
            });

            $('input#placement').maxlength({
                alwaysShow: true,
                placement: 'top'
            });

        });
        // password strength init
        $('#password1').passtrength({
            minChars: 5,
            passwordToggle: true,
            tooltip: true
        });

        function Validation() {

            var Name = document.frmOnline.txtName;

            var lastname = document.frmOnline.txtlastname;

            var Email = document.frmOnline.txtEmail;

            var Address1 = document.frmOnline.txtAddress1;
            var Address2 = document.frmOnline.txtAddress2;
            var Phone = document.frmOnline.txtPhone;
            var Conditions = document.frmOnline.e1;
            var chkConditions = document.frmOnline.chkConditions;

            if (Name.value == "") {
                alert("Enter your first name");
                Name.focus();
                return false;

            }

            if (Name.value != "") {
                var ck_name1 = /^[A-Za-z ]{3,50}$/;
                if (!ck_name1.test(Name.value)) {
                    alert("You can not enter Numeric values (or) your name should be 3 - 20 characters...");
                    Name.focus();
                    return false;
                }
            }
            //lastname Validation
            if (lastname.value == "") {
                alert("Enter your last name");
                lastname.focus();
                return false;
            }
            if (lastname.value != "") {
                var ck_name = /^[A-Za-z ]{3,20}$/;
                if (!ck_name.test(lastname.value)) {
                    alert("You can not enter Numeric values (or) your name should be 3 - 20 characters...");
                    lastname.focus();
                    return false;
                }
            }
            //lastname Validation Completed

            //email validation
            if (Email.value == "") {
                alert("Enter your Email_Id");
                txtEmail.focus();
                return false;
            }


            var x = document.forms["frmOnline"]["txtEmail"].value;
            var atpos = x.indexOf("@");
            var dotpos = x.lastIndexOf(".");
            if (atpos < 1 || dotpos < atpos + 2 || dotpos + 2 >= x.length) {
                alert("Not a valid e-mail address");
                txtEmail.focus();
                return false;
            }
            //address validation

            if (Address1.value == "") {
                alert("Enter your address line1");
                txtAddress1.focus();
                return false;
            }
            //address validation

            if (Address2.value == "") {
                alert("Enter your address line2");
                txtAddress2.focus();
                return false;
            }
            if (Conditions.value == "") {

                alert("Please Select State");
                Conditions.focus();
                return false;
            }
            //mobile Validation
            if (Phone.value == "") {
                alert("Please Enter your Phone number");
                txtPhone.focus();
                return false;
            }
            if (Phone.value != "") {
                var reg = /^[987][0-9]{9}$/;
                if (reg.test(Phone.value) == false) {
                    alert("Please Enter Correct Phone Number");
                    txtPhone.focus();
                    return false;
                }
            }
            //Mobile Validation Completed
            //Condtion validtion
            if (chkConditions.checked == false) {
                alert("Please Check the Terms and Conditions");
                chkConditions.focus();
                return false;
            }
            return true;
        }
        // payment gateway card
        $('#card').card({
            container: $('.card-wrapper')
        });
        $('#card-form').bootstrapValidator({
                fields: {
                    number: {
                        message: 'card number should be given',
                        validators: {
                            stringLength: {
                                min: 16,
                                message: 'The length of card number must be between 16 and above'
                            }
                        }
                    },
                    name: {
                        message: 'card name should be given',
                        validators: {
                            notEmpty: {
                                message: 'The name on card is required and can\'t be empty'
                            }
                        }
                    },
                    cvc: {
                        message: 'cvc shoulsd be given',
                        validators: {
                            notEmpty: {
                                message: 'The cvc is required and can\'t be empty'
                            }
                        }
                    },
                    expiry: {
                        message: 'expiry date shoulsd be given',
                        validators: {
                            notEmpty: {
                                message: 'The expiry date is required and can\'t be empty'
                            }
                        }
                    }
                }
            }).on('error.form.bv', function(e) {
                // Prevent submit form
                e.preventDefault();
                var list = '<ul style="list-style: none">';
                list += '</ul>';
                swal({
                    type: "error",
                    title: 'Error',
                    html: 'Please Fill The Mandatory Fields' + list
                });
            })
            .on('success.form.bv', function(a) {
                a.preventDefault();
                swal({
                    type: "success",
                    title: "Transaction Successful",
                    html: 'This card is saved for better Payment experience'
                });
            });

        $('#cardexpire')
            .on('keypress', function(ev) {
                // Validate the date when user change it
                $('#orderitem').bootstrapValidator('revalidateField', 'expiry');
            });
        // payment gateway card end
        $("input[type=password]").on('input', function() {
            if ($("#password1").val() == $("#password2").val()) {
                $("#pwmatch").removeClass("glyphicon-remove").addClass("glyphicon-ok").css("color", "#00A41E");
            } else {
                $("#pwmatch").removeClass("glyphicon-ok").addClass("glyphicon-remove").css("color", "#FF0004");
            }
        });
    },
    destroyed: function() {

    }
}
</script>
<style src="../assets/css/passtrength/passtrength.css"></style>
<style src="../vendors/sweetalert2/dist/sweetalert2.min.css"></style>
<style src="../vendors/bootstrapvalidator/dist/css/bootstrapValidator.min.css"></style>
<style src "../assets/css/custom_css/form2.css"></style>
<style src "../assets/css/custom_css/form3.css"></style>
