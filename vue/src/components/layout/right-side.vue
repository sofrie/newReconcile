<template>
    <aside class="right-side">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1 v-html="this.$route.meta.title">Title</h1>
            <ol class="breadcrumb" v-html="this.$route.meta.breadcrumb"></ol>
        </section>
        <!-- Main content -->
        <section class="content">
            <slot></slot>
            <!--rightside bar -->
            <div id="right">
                <div id="right-slim">
                    <div class="rightsidebar-right">
                        <div class="rightsidebar-right-content">
                            <!--<div class="panel-tabs">
                                <!--<ul class="nav nav-tabs nav-float" role="tablist">
                                    <li class="active text-center">
                                        <a href="#r_tab1" role="tab" data-toggle="tab"><i
                                                class="fa fa-fw ti-comments"></i></a>
                                    </li>
                                    <li class="active text-center">
                                        <a href="#r_tab2" role="tab" data-toggle="tab"><i class="fa fa-fw ti-bell"></i></a>
                                    </li>
                                    <li class="text-center">
                                        <a href="#r_tab3" role="tab" data-toggle="tab"><i
                                                class="fa fa-fw ti-settings"></i></a>
                                    </li>
                                </ul>
                            </div>-->
                            <div class="tab-content">
                                <!--<div class="tab-pane fade in active" id="r_tab1">
                                    <div id="slim_t1">
                                        <h5 class="rightsidebar-right-heading text-uppercase text-xs">
                                            <i class="menu-icon  fa fa-fw ti-user"></i>
                                            Contacts
                                        </h5>
                                        <ul class="list-unstyled margin-none">
                                            <li class="rightsidebar-contact-wrapper">
                                                <a class="rightsidebar-contact" href="javascript:void(0)">
                                                    <img src="../../assets/img/authors/avatar6.jpg" class="img-circle pull-right" alt="avatar-image">
                                                    <i class="fa fa-circle text-xs text-primary"></i> Annette
                                                </a>
                                            </li>
                                            <li class="rightsidebar-contact-wrapper">
                                                <a class="rightsidebar-contact" href="javascript:void(0)">
                                                    <img src="../../assets/img/authors/avatar.jpg" class="img-circle pull-right" alt="avatar-image">
                                                    <i class="fa fa-circle text-xs text-primary"></i> Jordan
                                                </a>
                                            </li>
                                            <li class="rightsidebar-contact-wrapper">
                                                <a class="rightsidebar-contact" href="javascript:void(0)">
                                                    <img src="../../assets/img/authors/avatar2.jpg" class="img-circle pull-right" alt="avatar-image">
                                                    <i class="fa fa-circle text-xs text-primary"></i> Stewart
                                                </a>
                                            </li>
                                            <li class="rightsidebar-contact-wrapper">
                                                <a class="rightsidebar-contact" href="javascript:void(0)">
                                                    <img src="../../assets/img/authors/avatar3.jpg" class="img-circle pull-right" alt="avatar-image">
                                                    <i class="fa fa-circle text-xs text-warning"></i> Alfred
                                                </a>
                                            </li>
                                            <li class="rightsidebar-contact-wrapper">
                                                <a class="rightsidebar-contact" href="javascript:void(0)">
                                                    <img src="../../assets/img/authors/avatar4.jpg" class="img-circle pull-right" alt="avatar-image">
                                                    <i class="fa fa-circle text-xs text-danger"></i> Eileen
                                                </a>
                                            </li>
                                            <li class="rightsidebar-contact-wrapper">
                                                <a class="rightsidebar-contact" href="javascript:void(0)">
                                                    <img src="../../assets/img/authors/avatar5.jpg" class="img-circle pull-right" alt="avatar-image">
                                                    <i class="fa fa-circle text-xs text-muted"></i> Robert
                                                </a>
                                            </li>
                                            <li class="rightsidebar-contact-wrapper">
                                                <a class="rightsidebar-contact" href="javascript:void(0)">
                                                    <img src="../../assets/img/authors/avatar7.jpg" class="img-circle pull-right" alt="avatar-image">
                                                    <i class="fa fa-circle text-xs text-muted"></i> Cassandra
                                                </a>
                                            </li>
                                        </ul>
                                        <h5 class="rightsidebar-right-heading text-uppercase text-xs">
                                            <i class="fa fa-fw ti-export"></i>
                                            Recent Updates
                                        </h5>
                                        <div>
                                            <ul class="list-unstyled">
                                                <li class="rightsidebar-notification">
                                                    <a href="javascript:void(0)">
                                                        <i class="fa ti-comments-smiley fa-fw text-primary"></i> New Comment
                                                    </a>
                                                </li>
                                                <li class="rightsidebar-notification">
                                                    <a href="javascript:void(0)">
                                                        <i class="fa ti-twitter-alt fa-fw text-success"></i> 3 New Followers
                                                    </a>
                                                </li>
                                                <li class="rightsidebar-notification">
                                                    <a href="javascript:void(0)">
                                                        <i class="fa ti-email fa-fw text-info"></i> Message Sent
                                                    </a>
                                                </li>
                                                <li class="rightsidebar-notification">
                                                    <a href="javascript:void(0)">
                                                        <i class="fa ti-write fa-fw text-warning"></i> New Task
                                                    </a>
                                                </li>
                                                <li class="rightsidebar-notification">
                                                    <a href="javascript:void(0)">
                                                        <i class="fa ti-export fa-fw text-danger"></i> Server Rebooted
                                                    </a>
                                                </li>
                                                <li class="rightsidebar-notification">
                                                    <a href="javascript:void(0)">
                                                        <i class="fa ti-info-alt fa-fw text-primary"></i> Server Not Responding
                                                    </a>
                                                </li>
                                                <li class="rightsidebar-notification">
                                                    <a href="javascript:void(0)">
                                                        <i class="fa ti-shopping-cart fa-fw text-success"></i> New Order Placed
                                                    </a>
                                                </li>
                                                <li class="rightsidebar-notification">
                                                    <a href="javascript:void(0)">
                                                        <i class="fa ti-money fa-fw text-info"></i> Payment Received
                                                    </a>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>-->
                                <!--<div class="tab-pane fade in active" id="r_tab2">
                                    <div id="slim_t2">
                                        <h5 class="rightsidebar-right-heading text-uppercase text-xs">
                                            <i class="fa fa-fw ti-bell"></i>
                                            Pending Confirmation
                                        </h5>
                                        <ul class="list-unstyled m-t-15 notifications">
                                            <li>
                                                <a href="" class="message icon-not striped-col">
                                                    <!--<img class="message-image img-circle" src="../../assets/img/authors/avatar3.jpg" alt="avatar-image">-->
                                                    <div class="message-body">
                                                        <strong>Invoice Name</strong>
                                                        <br>
                                                        <br>
                                                        <small class="noti-date">Date</small>
                                                    </div>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="" class="message icon-not">
                                                    <div class="message-body">
                                                        <strong>Invoice Name</strong>
                                                        <br>
                                                        <br>
                                                        <small class="noti-date">Date</small>
                                                    </div>
                                                </a>
                                            </li>
                                            <li class="text-right noti-footer"><a href="javascript:void(0)">View All Invoice <i
                                                    class="ti-arrow-right"></i></a></li>
                                        </ul>
                                    </div>
                                </div>-->
                                <!--<div class="tab-pane fade" id="r_tab3">
                                    <div id="slim_t3">
                                        <h5 class="rightsidebar-right-heading text-uppercase text-xs">
                                            <i class="fa fa-fw ti-layers"></i>
                                            Skins
                                        </h5>
                                        <ul>
                                            <li class="setting-color">
                                                <label class="active-color">
                                                    <input name='skins' type='radio' value="skin-default" checked='checked' @change="change_skin" />
                                                    <span class='split'>
                                            <span class='color bg-default-clear'></span>
                                                    <span class='color bg-default-light'></span>
                                                    </span>
                                                    <span class='color l-m-bg'></span>
                                                </label>
                                                <label>
                                                    <input name='skins' type='radio' value="skin-mint" @change="change_skin" />
                                                    <span class='split'>
                                                <span class='color bg-mint'></span>
                                                    <span class='color bg-mint-light'></span>
                                                    </span>
                                                    <span class='color l-m-bg'></span>
                                                </label>
                                                <label>
                                                    <input name='skins' type='radio' value="skin-grape" @change="change_skin" />
                                                    <span class='split'>
                                                <span class='color bg-grape'></span>
                                                    <span class='color bg-grape-light'></span>
                                                    </span>
                                                    <span class='color l-m-bg'></span>
                                                </label>
                                            </li>
                                            <li class="setting-color">
                                                <label>
                                                    <input name='skins' type='radio' value="skin-lavender" @change="change_skin" />
                                                    <span class='split'>
                                                <span class='color bg-lavender'></span>
                                                    <span class='color bg-lavender-light'></span>
                                                    </span>
                                                    <span class='color l-m-bg'></span>
                                                </label>
                                                <label>
                                                    <input name='skins' type='radio' value="skin-pink" @change="change_skin" />
                                                    <span class='split'>
                                                <span class='color bg-pink'></span>
                                                    <span class='color bg-pink-light'></span>
                                                    </span>
                                                    <span class='color l-m-bg'></span>
                                                </label>
                                                <label>
                                                    <input name='skins' type='radio' value="skin-sunflower" @change="change_skin" />
                                                    <span class='split'>
                                                <span class='color bg-sunflower'></span>
                                                    <span class='color bg-sunflower-light'></span>
                                                    </span>
                                                    <span class='color l-m-bg'></span>
                                                </label>
                                            </li>
                                        </ul>
                                        <h5 class="rightsidebar-right-heading text-uppercase gen-sett-m-t text-xs">
                                            <i class="fa fa-fw ti-settings"></i>
                                            General
                                        </h5>
                                        <ul class="list-unstyled settings-list m-t-10">
                                            <li>
                                                <label for="status">Available</label>
                                                <span class="pull-right">
                                            <input type="checkbox" id="status" name="my-checkbox" checked>
                                        </span>
                                            </li>
                                            <li>
                                                <label for="email-auth">Login with Email</label>
                                                <span class="pull-right">
                                            <input type="checkbox" id="email-auth" name="my-checkbox">
                                        </span>
                                            </li>
                                            <li>
                                                <label for="update">Auto Update</label>
                                                <span class="pull-right">
                                            <input type="checkbox" id="update" name="my-checkbox">
                                        </span>
                                            </li>
                                        </ul>
                                        <h5 class="rightsidebar-right-heading text-uppercase text-xs">
                                            <i class="fa fa-fw ti-volume"></i>
                                            Sound & Notification
                                        </h5>
                                        <ul class="list-unstyled settings-list m-t-10">
                                            <li>
                                                <label for="chat-sound">Chat Sound</label>
                                                <span class="pull-right">
                                            <input type="checkbox" id="chat-sound" name="my-checkbox" checked>
                                        </span>
                                            </li>
                                            <li>
                                                <label for="noti-sound">Notification Sound</label>
                                                <span class="pull-right">
                                            <input type="checkbox" id="noti-sound" name="my-checkbox">
                                        </span>
                                            </li>
                                            <li>
                                                <label for="remain">Remainder </label>
                                                <span class="pull-right">
                                            <input type="checkbox" id="remain" name="my-checkbox" checked>
                                        </span>
                                            </li>
                                            <li>
                                                <label for="vol">Volume</label>
                                                <input type="range" id="vol" min="0" max="100" value="15">
                                            </li>
                                        </ul>
                                    </div>-->
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- /.content -->
    </aside>
</template>
<script>
export default {
    name: "right-side",
    methods: {
        change_skin() {
            var cls = $("input[name='skins']:checked");
            $("body").removeClass("skin-default skin-mint skin-grape skin-lavender skin-pink skin-sunflower").addClass(cls.val());
            $('#skin').appendTo("head").attr('href', '/static/skins/' + cls.val() + '.css');
            $('#slim_t3').find('.setting-color label').removeClass('active-color');
            $(cls).parent("label").addClass('active-color');
        }
    }
}
</script>
