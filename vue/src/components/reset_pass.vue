<template>
    <div class="container reset">
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-md-offset-4 col-sm-8 col-sm-offset-2 col-xs-10 col-xs-offset-1 login-form">
                    <h2 class="text-center">
                    <img src="../assets/img/pages/clear_black.png" alt="Logo">
                </h2>
                    <div class="row">
                        <div class="col-xs-12">
                            <h4 class="text-center">Reset Password</h4>
                        </div>
                        <div class="col-xs-12">
                            <form action="#/login" id="authentication" class="reset_validator">
                                <div class="form-group">
                                    <label for="password" class="sr-only">Password</label>
                                    <input type="password" class="form-control form-control-lg" id="password" name="password" placeholder="Password">
                                </div>
                                <div class="form-group">
                                    <label for="confirm-password" class="sr-only">Password</label>
                                    <input type="password" class="form-control form-control-lg" id="confirm-password" name="password_confirm" placeholder="Confirm Password">
                                </div>
                                <div class="form-group">
                                    <input type="submit" value="Reset Password" class="btn btn-primary center-block" />
                                </div>
                            </form>
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
    name: "reset_password",
    mounted: function() {
        $('.reset_validator').bootstrapValidator({
            fields: {
                password: {
                    validators: {

                        notEmpty: {
                            message: 'Enter new password'
                        }
                    }
                },
                password_confirm: {
                    validators: {
                        notEmpty: {
                            message: 'Confirm your new password'
                        },
                        identical: {
                            field: 'password',
                            message: 'Password is not matching the above one'
                        }
                    }
                }
            }
        });
    },
    destroyed: function() {

    }
}
</script>
<style src="../vendors/bootstrapvalidator/dist/css/bootstrapValidator.min.css"></style>
<style src="../assets/css/login.css" scoped></style>
<style type="text/css" scoped>
div.container.reset {
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
