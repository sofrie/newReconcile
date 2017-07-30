<template>
    <div class="container register">
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3 col-xs-10 col-xs-offset-1 login-form">
                    <div class="panel-header">
                        <h2 class="text-center">
                    <img src="../assets/img/pages/clear_black.png" alt="Logo">
                </h2>
                    </div>
                    <div class="panel-body">
                        <div class="row">
                            <form action="/" id="authentication" class="signup_validator">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label for="first" class="sr-only">First Name</label>
                                        <input type="text" class="form-control  form-control-lg" id="first" name="first_name" placeholder="First name">
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label for="last" class="sr-only">Last Name</label>
                                        <input type="text" class="form-control  form-control-lg" id="last" name="last_name" placeholder="Last name">
                                    </div>
                                </div>
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <label for="email" class="sr-only"> E-mail</label>
                                        <input type="text" class="form-control  form-control-lg" id="email" name="email" placeholder="E-mail">
                                    </div>
                                </div>
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <label for="password" class="sr-only">Password</label>
                                        <input type="password" class="form-control form-control-lg" id="password" name="password" placeholder="Password">
                                    </div>
                                </div>
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <label for="confirm-password" class="sr-only">Password</label>
                                        <input type="password" class="form-control form-control-lg" id="confirm-password" name="password_confirm" placeholder="Confirm Password">
                                    </div>
                                </div>
                                <div class="col-md-12">
                                    <div class="form-group checkbox">
                                        <label for="terms">
                                            <input type="checkbox" name="terms" id="terms">&nbsp; I accept the <a href="javascript:void(0)">terms &amp; Conditions</a>
                                        </label>
                                    </div>
                                </div>
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <input type="submit" value="Sign Up" class="btn btn-primary btn-block" />
                                    </div>
                                    <span class="sign-in">Already a member? <a href="#/login">Sign In</a></span>
                                </div>
                            </form>
                        </div>
                        <div class="row text-center social">
                            <div class="col-xs-12">
                                <p class="alter">Sign Up with</p>
                            </div>
                            <div class="row">
                                <div class="col-sm-8 col-sm-offset-2">
                                    <div class="col-xs-4">
                                        <a href="//facebook.com" class="btn btn-lg btn-facebook">
                                            <i class="ti-facebook"></i>
                                        </a>
                                    </div>
                                    <div class="col-xs-4">
                                        <a href="//twitter.com" class="btn btn-lg btn-twitter">
                                            <i class="ti-twitter-alt"></i>
                                        </a>
                                    </div>
                                    <div class="col-xs-4">
                                        <a href="//plus.google.com" class="btn btn-lg btn-google">
                                            <i class="ti-google"></i>
                                        </a>
                                    </div>
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
import validator from "../vendors/bootstrapvalidator/dist/js/bootstrapValidator.min.js"
export default {
    name: "register",
    mounted: function() {
        //Flat red color scheme for iCheck
        $('input[type="checkbox"], input[type="radio"]').iCheck({
            checkboxClass: 'icheckbox_square-blue',
            radioClass: 'iradio_minimal-blue',
            increaseArea: '20%'
        });
        $("#dee1").on('click', function() {
            $('input').iCheck('uncheck');
            $('select').trigger('change');
        });

        $('.signup_validator').bootstrapValidator({
            fields: {
                first_name: {
                    validators: {
                        notEmpty: {
                            message: 'The first name is required and cannot be empty'
                        }
                    }
                },
                last_name: {
                    validators: {
                        notEmpty: {
                            message: 'The last name is required'
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
                password_confirm: {
                    validators: {
                        notEmpty: {
                            message: 'The confirm password is required'
                        },
                        identical: {
                            field: 'password',
                            message: 'Please enter the same password'
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
                email_confirm: {
                    validators: {
                        notEmpty: {
                            message: 'The email address is required'
                        },
                        regexp: {
                            regexp: /^\S+@\S{1,}\.\S{1,}$/,
                            message: 'The input is not a valid email address'
                        },
                        identical: {
                            field: 'email',
                            message: 'Please enter the same email as above'
                        }
                    }
                },
                phone: {
                    validators: {
                        notEmpty: {
                            message: 'The phone number is required and cannot be empty'
                        },
                        regexp: {
                            regexp: /^\d{10}$/,
                            message: 'The phone number should contain only 10 numbers'
                        }
                    }
                },
                terms: {
                    validators: {
                        notEmpty: {
                            message: 'The terms and conditions should be accepted'
                        }
                    }
                }
            }
        });
        var opts = $("#source").html(),
            opts2 = "<option></option>" + opts;
        $("select.populate").each(function() {
            var e = $(this);
            e.html(e.hasClass("placeholder") ? opts2 : opts);
        });
        $(".examples article:odd").addClass("zebra");

        $("#terms").on("ifChanged", function() {
            $('.signup_validator').bootstrapValidator('revalidateField', $('#terms'));
        });
        $("[type='reset']").on("click", function() {
            $('.signup_validator').bootstrapValidator("resetForm");
        });

    },
    destroyed: function() {

    }
}
</script>
<style src="../vendors/bootstrapvalidator/dist/css/bootstrapValidator.min.css"></style>
<style src="../assets/css/login.css" scoped></style>
<style type="text/css" scoped>
div.container.register {
    padding-top: 6.5%;
    position: fixed;
    width: 100%;
    top: 0;
    bottom: 0;
    left: 0;
    right: 0;
    background: radial-gradient(ellipse at center, #5A93AF 0%, #004E74 100%);
    overflow-y: auto;
}
</style>
