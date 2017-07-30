<template>
    <div>
        <div class="row">
            <div class="col-md-12">
                <div class="panel ">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                                Bootstrap Wizard
                            </h3>
                        <span class="pull-right">
                                    <i class="fa fa-fw ti-angle-up clickable"></i>
                                </span>
                    </div>
                    <div class="panel-body">
                        <div class="stepwizard">
                            <div class="stepwizard-row setup-panel">
                                <div class="stepwizard-step">
                                    <a href="#step-1" class="btn btn-primary btn-block">1</a>
                                    <p>Step 1</p>
                                </div>
                                <div class="stepwizard-step">
                                    <a href="#step-2" class="btn btn-default btn-block">2</a>
                                    <p>Step 2</p>
                                </div>
                                <div class="stepwizard-step">
                                    <a href="#step-3" class="btn btn-default btn-block">3</a>
                                    <p>Step 3</p>
                                </div>
                            </div>
                        </div>
                        <form role="form">
                            <div class="row setup-content" id="step-1">
                                <div class="col-xs-12">
                                    <div class="col-md-12">
                                        <h3> Step 1</h3>
                                        <div class="form-group">
                                            <label for="step_fname" class="control-label">First Name</label>
                                            <input id="step_fname" maxlength="100" type="text" class="form-control" placeholder="Enter First Name" />
                                        </div>
                                        <div class="form-group">
                                            <label for="step_lname" class="control-label">Last Name</label>
                                            <input id="step_lname" maxlength="100" type="text" class="form-control" placeholder="Enter Last Name" />
                                        </div>
                                        <div class="form-group">
                                            <label for="step_email" class="control-label">Email</label>
                                            <input id="step_email" maxlength="100" type="email" class="form-control" placeholder="Enter Email Address" />
                                        </div>
                                        <div class="form-group">
                                            <label for="step_cemail" class="control-label">Confirm Email</label>
                                            <input id="step_cemail" maxlength="100" type="email" class="form-control" placeholder="Re-enter Your Email" />
                                        </div>
                                        <button class="btn btn-primary nextBtn pull-right" type="button">
                                            Next
                                        </button>
                                    </div>
                                </div>
                            </div>
                            <div class="row setup-content" id="step-2">
                                <div class="col-xs-12">
                                    <div class="col-md-12">
                                        <h3> Step 2</h3>
                                        <div class="form-group">
                                            <label for="step_cname" class="control-label">Company Name</label>
                                            <input id="step_cname" maxlength="200" type="text" class="form-control" placeholder="Enter Company Name" />
                                        </div>
                                        <div class="form-group">
                                            <label for="step_cadd" class="control-label">Company Address</label>
                                            <input id="step_cadd" maxlength="200" type="text" class="form-control" placeholder="Enter Company Address" />
                                        </div>
                                        <div class="form-group">
                                            <label for="step_pwd" class="control-label">Password</label>
                                            <input id="step_pwd" maxlength="12" type="password" class="form-control" placeholder="Enter password" />
                                        </div>
                                        <div class="form-group">
                                            <label for="step_cpwd" class="control-label">Confirm Password</label>
                                            <input id="step_cpwd" maxlength="12" type="password" class="form-control" placeholder="Confirm password" />
                                        </div>
                                        <button class="btn btn-primary prevBtn pull-left" type="button">
                                            Previous
                                        </button>
                                        <button class="btn btn-primary nextBtn pull-right" type="button">
                                            Next
                                        </button>
                                    </div>
                                </div>
                            </div>
                            <div class="row setup-content" id="step-3">
                                <div class="col-xs-12">
                                    <div class="col-md-12">
                                        <h3> Step 3</h3>
                                        <div class="form-group">
                                            <label for="acceptTerms1">
                                                <input id="acceptTerms1" name="acceptTerms" type="checkbox" class="custom-checkbox"> I agree with the <a href="javascript:void(0)">terms &amp; Conditions</a>.
                                            </label>
                                        </div>
                                        <div class="form-group">
                                            <button class="btn btn-primary prevBtn pull-left" type="button">
                                                Previous
                                            </button>
                                            <button class="btn btn-success pull-right" type="submit">
                                                Finish!
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
        <div class="row">
            <div class="col-md-12">
                <div class="panel ">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                                <i class="livicon" data-name="bell" data-size="16" data-loop="true" data-c="#fff"
                                   data-hc="white"></i> Bootstrap Wizard 2
                            </h3>
                        <span class="pull-right">
                                    <i class="fa fa-fw ti-angle-up clickable"></i>
                                </span>
                    </div>
                    <div class="panel-body">
                        <form id="commentForm" method="post" action="#">
                            <div id="rootwizard">
                                <ul>
                                    <li>
                                        <a href="#tab1" data-toggle="tab">First</a>
                                    </li>
                                    <li>
                                        <a href="#tab2" data-toggle="tab">Second</a>
                                    </li>
                                    <li>
                                        <a href="#tab3" data-toggle="tab">Third</a>
                                    </li>
                                </ul>
                                <div class="tab-content">
                                    <div class="tab-pane" id="tab1">
                                        <h2 class="hidden">&nbsp;</h2>
                                        <div class="form-group">
                                            <label for="userName" class="control-label">User name *</label>
                                            <input id="userName" name="username" type="text" placeholder="Enter user name" class="form-control required">
                                        </div>
                                        <div class="form-group">
                                            <label for="email" class="control-label">Email *</label>
                                            <input id="email" name="email" placeholder="Enter your Email" type="text" class="form-control required email">
                                        </div>
                                        <div class="form-group">
                                            <label for="password" class="control-label">Password *</label>
                                            <input id="password" name="password" type="password" placeholder="Enter your password" class="form-control required">
                                        </div>
                                        <div class="form-group">
                                            <label for="confirm" class="control-label">Confirm Password *</label>
                                            <input id="confirm" name="confirm" type="password" placeholder="Confirm your password " class="form-control required">
                                        </div>
                                    </div>
                                    <div class="tab-pane" id="tab2">
                                        <h2 class="hidden">&nbsp;</h2>
                                        <div class="form-group">
                                            <label for="name" class="control-label">First name *</label>
                                            <input id="name" name="fname" placeholder="Enter your First name" type="text" class="form-control required">
                                        </div>
                                        <div class="form-group">
                                            <label for="surname" class="control-label">Last name *</label>
                                            <input id="surname" name="lname" type="text" placeholder=" Enter your Last name" class="form-control required">
                                        </div>
                                        <div class="form-group">
                                            <label for="email">Gender</label>
                                            <select class="form-control" name="gender" id="gender" title="Select an account type...">
                                                <option disabled="" selected="">Select</option>
                                                <option>MALE</option>
                                                <option>FEMALE</option>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="address">Address</label>
                                            <input id="address" name="address" type="text" class="form-control">
                                        </div>
                                        <div class="form-group">
                                            <label for="age" class="control-label">Age *</label>
                                            <input id="age" name="age" type="text" maxlength="3" class="form-control required number" data-bv-greaterthan-inclusive="false" data-bv-lessthan-inclusive="true">
                                        </div>
                                    </div>
                                    <div class="tab-pane" id="tab3">
                                        <div class="form-group">
                                             <label for="phone1" class="control-label">Home number *</label>
                                            <input type="text" class="form-control" id="phone1" name="phone1" placeholder="(999)999-9999">
                                        </div>
                                        <div class="form-group">
                                            <label for="phone2" class="control-label">Personal number *</label>
                                            <input type="text" class="form-control" id="phone2" name="phone2" placeholder="(999)999-9999">
                                        </div>
                                        <div class="form-group">
                                             <label for="phone3" class="control-label">Alternate number *</label>
                                            <input type="text" class="form-control" id="phone3" name="phone3" placeholder="(999)999-9999">
                                        </div>
                                        <h2 class="hidden">&nbsp;</h2>
                                        <div class="form-group">
                                            <label>
                                                <input id="acceptTerms" name="acceptTerms" type="checkbox" class="custom-checkbox"> *I agree with the <a href="javascript:void(0)">terms &amp; Conditions</a>.
                                            </label>
                                        </div>
                                    </div>
                                    <ul class="pager wizard">
                                        <li class="previous">
                                            <a>Previous</a>
                                        </li>
                                        <li class="next">
                                            <a>Next</a>
                                        </li>
                                        <li class="next finish" style="display:none;">
                                            <a>Finish</a>
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
                                            <p>You have Submitted Successfully.</p>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-default" data-dismiss="modal">OK
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
    </div>
</template>
<script>
import select2 from "../vendors/select2/dist/js/select2.min.js"

import validator from "../vendors/bootstrapvalidator/dist/js/bootstrapValidator.min.js"
import wizard from "../vendors/twitter-bootstrap-wizard/jquery.bootstrap.wizard.min.js"
export default {
    name: "form_wizards",
    mounted: function() {
        "use strict";
        $(document).ready(function() {

            // bootstrap wizard//
            $("#gender, #gender1").select2({
                theme: "bootstrap",
                placeholder: "",
                width: '100%'
            });
            $("#commentForm").bootstrapValidator({
                fields: {
                    username: {
                        validators: {
                            notEmpty: {
                                message: 'The User name is required'
                            }
                        },
                        required: true,
                        minlength: 3
                    },
                    password: {
                        validators: {
                            notEmpty: {
                                message: 'The password is required'
                            },
                            different: {
                                field: 'first_name,last_name',
                                message: 'Password should not match user Name'
                            }
                        }
                    },
                    confirm: {
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
                                message: 'Please enter valid email format'
                            }
                        }
                    },
                    fname: {
                        validators: {
                            notEmpty: {
                                message: 'The first name is required '
                            }
                        }
                    },
                    lname: {
                        validators: {
                            notEmpty: {
                                message: 'The last name is required '
                            }
                        }
                    },
                    password3: {
                        validators: {
                            notEmpty: {
                                message: 'This field is required and mandatory'
                            }
                        },
                        required: true,
                        minlength: 3
                    },
                    age: {
                        validators: {
                            notEmpty: {},
                            digits: {},
                            greaterThan: {
                                value: 18,
                                message: 'The Age must be greater than or equal to 18'
                            },
                            lessThan: {
                                value: 100,
                                message: 'The Age must be less than or equal to 100'
                            }
                        }
                    },
                    phone1: {
                        validators: {
                            notEmpty: {
                                message: 'The home number is required'
                            },
                            regexp: {
                                regexp: /^(\+?1-?)?(\([2-9]\d{2}\)|[2-9]\d{2})-?[2-9]\d{2}-?\d{4}$/,
                                message: 'Enter valid phone number'
                            }
                        }
                    },
                    phone2: {
                        validators: {
                            notEmpty: {
                                message: 'The personal number is required'
                            },
                            regexp: {
                                regexp: /^(\+?1-?)?(\([2-9]\d{2}\)|[2-9]\d{2})-?[2-9]\d{2}-?\d{4}$/,
                                message: 'Enter valid phone number'
                            }
                        }
                    },
                    phone3: {
                        validators: {
                            notEmpty: {
                                message: 'Alternate number is required'
                            },
                            different: {
                                field: 'phone1',
                                message: 'The alternate number must be different from Home number'
                            },
                            regexp: {
                                regexp: /^(\+?1-?)?(\([2-9]\d{2}\)|[2-9]\d{2})-?[2-9]\d{2}-?\d{4}$/,
                                message: 'Enter valid phone number'
                            }
                        }
                    },
                    acceptTerms: {
                        validators: {
                            notEmpty: {
                                message: 'The checkbox must be checked'
                            }
                        }
                    }
                }
            });
            $('#acceptTerms').on('ifChanged', function(event) {
                $('#commentForm').bootstrapValidator('revalidateField', $('#acceptTerms'));
            });
            $('#rootwizard').bootstrapWizard({
                'tabClass': 'nav nav-pills',
                'onNext': function(tab, navigation, index) {
                    var $validator = $('#commentForm').data('bootstrapValidator').validate();
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
                    var root_wizard = $('#rootwizard');
                    if ($current >= $total) {
                        root_wizard.find('.pager .next').hide();
                        root_wizard.find('.pager .finish').show();
                        root_wizard.find('.pager .finish').removeClass('disabled');
                    } else {
                        root_wizard.find('.pager .next').show();
                        root_wizard.find('.pager .finish').hide();
                    }
                    root_wizard.find('.finish').click(function() {
                        var $validator = $('#commentForm').data('bootstrapValidator').validate();
                        if ($validator.isValid()) {
                            $('#myModal').modal('show');
                            return $validator.isValid();
                            root_wizard.find("a[href='#tab1']").tab('show');
                        }
                    });

                }
            });
            $('#myModal').on('hide.bs.modal', function(e) {
                location.reload();
            });

            $('input[type="checkbox"].custom-checkbox, input[type="radio"].custom-radio').iCheck({
                checkboxClass: 'icheckbox_square-blue',
                radioClass: 'iradio_minimal-blue',
                increaseArea: '20%'
            });
            // bootstrap wizard 2


            var navListItems = $('div.setup-panel div a'),
                allWells = $('.setup-content'),
                allNextBtn = $('.nextBtn'),
                allPrevBtn = $('.prevBtn');

            allWells.hide();

            navListItems.click(function(e) {
                e.preventDefault();
                var $target = $($(this).attr('href')),
                    $item = $(this);

                if (!$item.hasClass('disabled')) {
                    navListItems.removeClass('btn-primary').addClass('btn-default');
                    $item.addClass('btn-primary');
                    allWells.hide();
                    $target.show();
                    $target.find('input:eq(0)').focus();
                }
            });

            allNextBtn.click(function() {
                var curStep = $(this).closest(".setup-content"),
                    curStepBtn = curStep.attr("id"),
                    nextStepWizard = $('div.setup-panel div a[href="#' + curStepBtn + '"]').parent().next().children("a"),
                    curInputs = curStep.find("input[type='text'],input[type='url']"),
                    isValid = true;

                $(".form-group").removeClass("has-error");
                for (var i = 0; i < curInputs.length; i++) {
                    if (!curInputs[i].validity.valid) {
                        isValid = false;
                        $(curInputs[i]).closest(".form-group").addClass("has-error");
                    }
                }

                if (isValid)
                    nextStepWizard.removeAttr('disabled').trigger('click');
            });

            allPrevBtn.click(function() {
                var curStep = $(this).closest(".setup-content"),
                    curStepBtn = curStep.attr("id"),
                    prevStepWizard = $('div.setup-panel div a[href="#' + curStepBtn + '"]').parent().prev().children("a");

                $(".form-group").removeClass("has-error");
                prevStepWizard.removeAttr('disabled').trigger('click');
            });

            $('div.setup-panel div a.btn-primary').trigger('click');


            $("a[disabled='disabled']").removeAttr("disabled");
        });
    },
    destroyed: function() {

    }
}
</script>
<style src="../vendors/select2/dist/css/select2.min.css"></style>
<style src="../vendors/select2-bootstrap-theme/dist/select2-bootstrap.min.css"></style>
<style src="../vendors/bootstrapvalidator/dist/css/bootstrapValidator.min.css"></style>
<style src="../assets/css/custom_css/wizard.css"></style>
