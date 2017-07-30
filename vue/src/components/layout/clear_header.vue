<template>
    <header class="header">
        <nav class="navbar navbar-fixed-top" role="navigation">
            <router-link to="/" class="logo"><img src="../../assets/img/logo.png" alt="logo" /></router-link>
            <!-- Header Navbar: style can be found in header-->
            <!-- Sidebar toggle button-->
            <div>
                <a href="javascript:void(0)" class="navbar-btn sidebar-toggle" data-toggle="offcanvas" role="button" @click="toggle_left"> <i class="fa fa-fw ti-menu"></i>
                </a>
            </div>
            <div class="navbar-right">
                <ul class="nav navbar-nav">
                    <!--<li class="dropdown messages-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"> <i class="fa fa-fw ti-email black"></i>
                            <span class="label label-success">2</span>
                        </a>
                        <ul class="dropdown-menu dropdown-messages table-striped">
                            <li class="dropdown-title">New Messages</li>
                            <li>
                                <a href="" class="message striped-col">
                                    <img class="message-image img-circle" src="../../assets/img/authors/avatar7.jpg" alt="avatar-image">
                                    <div class="message-body"><strong>Ernest Kerry</strong>
                                        <br> Can we Meet?
                                        <br>
                                        <small>Just Now</small>
                                        <span class="label label-success label-mini msg-lable">New</span>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="" class="message">
                                    <img class="message-image img-circle" src="../../assets/img/authors/avatar6.jpg" alt="avatar-image">
                                    <div class="message-body"><strong>John</strong>
                                        <br> Dont forgot to call...
                                        <br>
                                        <small>5 minutes ago</small>
                                        <span class="label label-success label-mini msg-lable">New</span>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="" class="message striped-col">
                                    <img class="message-image img-circle" src="../../assets/img/authors/avatar5.jpg" alt="avatar-image">
                                    <div class="message-body">
                                        <strong>Wilton Zeph</strong>
                                        <br> If there is anything else &hellip;
                                        <br>
                                        <small>14/10/2014 1:31 pm</small>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="" class="message">
                                    <img class="message-image img-circle" src="../../assets/img/authors/avatar1.jpg" alt="avatar-image">
                                    <div class="message-body">
                                        <strong>Jenny Kerry</strong>
                                        <br> Let me know when you free
                                        <br>
                                        <small>5 days ago</small>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="" class="message striped-col">
                                    <img class="message-image img-circle" src="../../assets/img/authors/avatar.jpg" alt="avatar-image">
                                    <div class="message-body">
                                        <strong>Tony</strong>
                                        <br> Let me know when you free
                                        <br>
                                        <small>5 days ago</small>
                                    </div>
                                </a>
                            </li>
                            <li class="dropdown-footer"><a href="#">View All messages</a></li>
                        </ul>
                    </li>-->
                    <!--rightside toggle-->
                    <!--<li>
                        <a href="javascript:void(0)" class="toggle-right" @click="toggle_right">
                            <i class="fa fa-fw ti-view-list black"></i>
                            <span class="label label-danger">9</span>
                        </a>
                    </li>-->
                    <!-- User Account: style can be found in dropdown-->
                    <li class="dropdown user user-menu">
                        <a href="#" class="dropdown-toggle padding-user" data-toggle="dropdown">
                            <img :src="this.$store.state.user.picture" width="35" class="img-circle img-responsive pull-left" height="35" alt="User Image">
                            <div class="riot">
                                <div>
                                    <span class="user_name_max">{{ this.$store.state.user.name }}</span>
                                    <span>
                                        <i class="caret"></i>
                                    </span>
                                </div>
                            </div>
                        </a>
                        <ul class="dropdown-menu">
                            <!-- User image -->
                            <!--<li class="user-header">
                                <img :src="this.$store.state.user.picture" class="img-circle" alt="User Image">
                                <p class="user_name_max" v-text="this.$store.state.user.name"></p>
                            </li>-->
                            <!-- Menu Body -->
                            <li class="p-t-3">
                                <router-link to="/user_profile" exact>
                                    <i class="fa fa-fw ti-user"></i> My Profile
                                </router-link>
                            </li>
                            <!--<li role="presentation"></li>
                            <li>
                                <router-link to="/edit_user" exact>
                                    <i class="fa fa-fw ti-settings"></i> Account Settings
                                </router-link>
                            </li>-->
							<li>
                                <router-link to="/login" exact>
                                    <i class="fa fa-fw ti-shift-right"></i> Logout
                                </router-link>
                            </li>
                            <!--<li role="presentation" class="divider"></li>-->
                            <!-- Menu Footer-->
                            <!--<li class="user-footer">
                                <div class="pull-left">
                                    <router-link to="/lockscreen" exact>
                                        <i class="fa fa-fw ti-lock"></i> Lock
                                    </router-link>
                                </div>
                                <div class="pull-right">
                                    <router-link to="/login" exact>
                                        <i class="fa fa-fw ti-shift-right"></i> Logout
                                    </router-link>
                                </div>
                            </li>-->
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
    </header>
</template>
<script>
export default {
    name: "header",
    methods: {
        //Enable sidebar toggle
        toggle_left() {
            //If window is small enough, enable sidebar push menu
            if ($(window).width() <= 992) {
                $('.row-offcanvas').toggleClass('active').toggleClass("relative");
                $('.left-side').removeClass("collapse-left");
                $(".right-side").removeClass("strech");
            } else {
                if (!$("body").hasClass("mini_sidebar")) {
                    //Else, enable content streching
                    $('.left-side').toggleClass("collapse-left");
                    $(".right-side").toggleClass("strech");
                }

            }
        },
        toggle_right() {
            switch (true) {
                // Close right panel
                case $("body").hasClass("sidebar-right-opened"):
                    {
                        $("body").removeClass("sidebar-right-opened");
                        if ($("body").hasClass("boxed")) {
                            $('#right').css('right', '-270px');
                        }
                        break;
                    }
                default:
                    // Open right panel
                    {
                        $("body").addClass("sidebar-right-opened");
                        this.adjust_boxright();
                        $('.navbar-nav>.dropdown').removeClass("open");
                    }
            }
        },
        adjust_boxright() {
            if ($('body').hasClass('boxed') && $("body").hasClass("sidebar-right-opened")) {
                var window_w = $(window).width();
                var body_w = $('body').width();
                var margin_right = (window_w - body_w) / 2;
                $('#right').css('right', margin_right);
            }
        }

    }
}
</script>
