<template>
    <!-- Left side column. contains the logo and sidebar -->
    <aside class="left-side sidebar-offcanvas">
        <!-- sidebar: style can be found in sidebar-->
        <section class="sidebar">
            <div id="menu" role="navigation">
                <!--<div class="nav_profile">
                    <div class="media profile-left">
                        <a class="pull-left profile-thumb" href="javascript:void(0)">
                            <img :src="this.$store.state.user.picture" class="img-circle" alt="User Image">
                        </a>
                        <div class="content-profile">
                            <h4 class="media-heading user_name_max" v-text="this.$store.state.user.name"></h4>
                            <ul class="icon-list">
                                <li>
                                    <router-link to="/users_list" exact>
                                        <i class="ti-user"></i>
                                    </router-link>
                                </li>
                                <li>
                                    <router-link to="/lockscreen" exact>
                                        <i class="ti-lock"></i>
                                    </router-link>
                                </li>
                                <li>
                                    <router-link to="/edit_user" exact>
                                        <i class="ti-settings"></i>
                                    </router-link>
                                </li>
                                <li>
                                    <router-link to="/login" exact>
                                        <i class="ti-shift-right"></i>
                                    </router-link>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>-->
                <ul class="navigation">
                    <router-link to="/" tag="li" exact>
                        <a class="logo">
							<i class="menu-icon ti-desktop"></i><br/>
							<span class="mm-text">Dashboard</span>
						</a>
                    </router-link>
                    <router-link tag="li" to="/invoicepage" exact>
                        <a class="logo"><i class="menu-icon ti-files"></i><br/><span class="mm-text">Invoice</span></a>
                    </router-link>
                    <router-link tag="li" to="/awb" id="awb" exact>
                        <a class="logo"><i class="menu-icon ti-file"></i><br/><span class="mm-text">AWB</span></a>
                    </router-link>
					<router-link tag="li" to="/logistic" exact>
                        <a class="logo"><i class="menu-icon ti-truck"></i><br/><span class="mm-text">Logistic</span></a>
                    </router-link>
					<router-link tag="li" to="/setting" exact>
                        <a class="logo"><i class="menu-icon ti-settings"></i><br/><span class="mm-text">Setting</span></a>
                    </router-link>
                    <!--<router-link tag="li" to="/index2" exact>
                        <a class="logo"><i class="menu-icon ti-layout-list-large-image"></i><br/><span class="mm-text">Dashboard 2</span></a>
                    </router-link>
                    <li class="menu-dropdown">
                        <a href="javascript:void(0)">
                            <i class="menu-icon ti-check-box"></i>
                            <span class="mm-text">Forms</span>
                            <span class="fa arrow"></span>
                        </a>
                        <ul class="sub-menu">
                            <li>
                                <a href="javascript:void(0)">
                                    <i class="fa fa-fw ti-receipt"></i> Features
                                    <span class="fa arrow"></span>
                                </a>
                                <ul class="sub-menu form-submenu">
                                    <router-link tag="li" to="/form-elements" exact>
                                        <a class="logo"><i class="menu-icon ti-cup"></i><span class="mm-text"> Form Elements</span></a>
                                    </router-link>
                                    <router-link tag="li" to="/realtime_form" exact>
                                        <a class="logo"><i class="menu-icon ti-write"></i><span class="mm-text"> Realtime Forms</span></a>
                                    </router-link>
                                    <router-link tag="li" to="/form-validations" exact>
                                        <a class="logo"><i class="menu-icon ti-alert"></i><span class="mm-text"> Form validations</span></a>
                                    </router-link>
                                    <router-link tag="li" to="/form_layouts" exact>
                                        <a class="logo"><i class="menu-icon ti-layout-width-default"></i><span class="mm-text"> Form Layouts</span></a>
                                    </router-link>
                                    <router-link tag="li" to="/complex_forms" exact>
                                        <a class="logo"><i class="menu-icon ti-layout-cta-left"></i><span class="mm-text"> Complex Forms</span></a>
                                    </router-link>
                                    <router-link tag="li" to="/radio_check" exact>
                                        <a class="logo"><i class="menu-icon ti-check-box"></i><span class="mm-text"> Radio and Checkbox</span></a>
                                    </router-link>
                                </ul>
                            </li>
                            <li>
                                <a href="javascript:void(0)">
                                    <i class="fa fa-fw ti-clipboard"></i> Components
                                    <span class="fa arrow"></span>
                                </a>
                                <ul class="sub-menu form-submenu">
                                    <router-link tag="li" to="/form_editors" exact>
                                        <a class="logo"><i class="menu-icon ti-pencil"></i><span class="mm-text"> Form Editors</span></a>
                                    </router-link>
                                    <router-link tag="li" to="/form_wizards" exact>
                                        <a class="logo"><i class="menu-icon ti-settings"></i><span class="mm-text"> Form Wizards</span></a>
                                    </router-link>
                                    <router-link tag="li" to="/dropdowns" exact>
                                        <a class="logo"><i class="menu-icon ti-widget-alt"></i><span class="mm-text"> Drop Downs</span></a>
                                    </router-link>
                                    <router-link tag="li" to="/vue_multiselect" exact>
                                        <a class="logo"><i class="menu-icon ti-widget-alt"></i><span class="mm-text"> Vue Multiselect</span></a>
                                    </router-link>
                                    <router-link tag="li" to="/vue_slider" exact>
                                        <a class="logo"><i class="menu-icon ti-bell"></i><span class="mm-text"> Vue Slider</span></a>
                                    </router-link>
                                    <router-link tag="li" to="/vscroll" exact>
                                        <a class="logo"><i class="menu-icon ti-list"></i><span class="mm-text"> Vscroll</span></a>
                                    </router-link>
                                    <router-link tag="li" to="/date_pickers" exact>
                                        <a class="logo"><i class="menu-icon ti-calendar"></i><span class="mm-text"> Date pickers</span></a>
                                    </router-link>
                                    <router-link tag="li" to="/advanced_date_pickers" exact>
                                        <a class="logo"><i class="menu-icon ti-notepad"></i><span class="mm-text"> Advanced Date pickers</span></a>
                                    </router-link>
                                </ul>
                            </li>
                        </ul>
                    </li>
                    <li class="menu-dropdown">
                        <a href="javascript:void(0)">
                            <i class="menu-icon ti-desktop"></i>
                            <span class="mm-text">UI Features</span>
                            <span class="fa arrow"></span>
                        </a>
                        <ul class="sub-menu">
                            <router-link tag="li" to="/general_components" exact>
                                <a class="logo"><i class="menu-icon ti-plug"></i><span class="mm-text"> General Components</span></a>
                            </router-link>
                            <router-link tag="li" to="/buttons" exact>
                                <a class="logo"><i class="menu-icon ti-layout-placeholder"></i><span class="mm-text"> Buttons</span></a>
                            </router-link>
                            <router-link tag="li" to="/tabs_accordions" exact>
                                <a class="logo"><i class="menu-icon ti-layers"></i><span class="mm-text"> Tabs &amp; Accordions</span></a>
                            </router-link>
                            <router-link tag="li" to="/font_icons" exact>
                                <a class="logo"><i class="menu-icon ti-ink-pen"></i><span class="mm-text"> Font Icons</span></a>
                            </router-link>
                            <router-link tag="li" to="/advanced_modals" exact>
                                <a class="logo"><i class="menu-icon ti-brush-alt"></i><span class="mm-text"> Advanced Modals</span></a>
                            </router-link>
                            <router-link tag="li" to="/timeline" exact>
                                <a class="logo"><i class="menu-icon ti-time"></i><span class="mm-text"> Timeline</span></a>
                            </router-link>
                        </ul>
                    </li>
                    <li class="menu-dropdown">
                        <a href="javascript:void(0)">
                            <i class="menu-icon ti-briefcase"></i>
                            <span class="mm-text">UI Components</span>
                            <span class="fa arrow"></span>
                        </a>
                        <ul class="sub-menu">
                            <router-link tag="li" to="/pickers" exact>
                                <a class="logo"><i class="menu-icon ti-brush"></i><span class="mm-text"> Pickers</span></a>
                            </router-link>
                            <router-link tag="li" to="/grid_layout" exact>
                                <a class="logo"><i class="menu-icon ti-layout-grid2"></i><span class="mm-text"> Grid Layout</span></a>
                            </router-link>
                            <router-link tag="li" to="/tags_input" exact>
                                <a class="logo"><i class="menu-icon ti-tag"></i><span class="mm-text"> Tags Input</span></a>
                            </router-link>
                            <router-link tag="li" to="/nestable_list" exact>
                                <a class="logo"><i class="menu-icon ti-view-list"></i><span class="mm-text"> Nestable List</span></a>
                            </router-link>
                            <router-link tag="li" to="/sweet_alert" exact>
                                <a class="logo"><i class="menu-icon ti-bell"></i><span class="mm-text"> Sweet Alert</span></a>
                            </router-link>
                            <router-link tag="li" to="/toastr_notifications" exact>
                                <a class="logo"><i class="menu-icon ti-tablet"></i><span class="mm-text"> Toastr Notifications</span></a>
                            </router-link>
                            <router-link tag="li" to="/draggable_portlets" exact>
                                <a class="logo"><i class="menu-icon ti-control-shuffle"></i><span class="mm-text"> Draggable Portlets</span></a>
                            </router-link>
                            <router-link tag="li" to="/transitions" exact>
                                <a class="logo"><i class="menu-icon ti-star"></i><span class="mm-text"> Transitions</span></a>
                            </router-link>
                        </ul>
                    </li>
                    <router-link to="/widgets" tag="li" exact>
                        <a class="logo"><i class="menu-icon ti-widgetized"></i><span class="mm-text">Widgets </span></a>
                    </router-link>
                    <li class="menu-dropdown">
                        <a href="javascript:void(0)">
                            <i class="menu-icon ti-layout-grid4"></i>
                            <span class="mm-text">DataTables</span>
                            <span class="fa arrow">
                                </span>
                        </a>
                        <ul class="sub-menu">
                            <router-link tag="li" to="/simple_tables" exact>
                                <a class="logo"><i class="menu-icon ti-layout"></i><span class="mm-text"> Simple tables</span></a>
                            </router-link>
                            <router-link tag="li" to="/datatables" exact>
                                <a class="logo"><i class="menu-icon ti-server"></i><span class="mm-text"> Data Tables</span></a>
                            </router-link>
                            <router-link tag="li" to="/advanced_datatables" exact>
                                <a class="logo"><i class="menu-icon ti-layout-grid3"></i><span class="mm-text"> Advanced Tables</span></a>
                            </router-link>
                            <router-link tag="li" to="/responsive_datatables" exact>
                                <a class="logo"><i class="menu-icon ti-layout-accordion-merged"></i><span class="mm-text"> Responsive DataTables</span></a>
                            </router-link>
                            <router-link tag="li" to="/bootstrap_tables" exact>
                                <a class="logo"><i class="menu-icon ti-layout-grid2"></i><span class="mm-text"> Bootstrap Tables</span></a>
                            </router-link>
                        </ul>
                    </li>
                    <li class="menu-dropdown">
                        <a href="javascript:void(0)">
                            <i class="menu-icon ti-bar-chart"></i>
                            <span class="mm-text">Charts</span> <span class="fa arrow"></span>
                        </a>
                        <ul class="sub-menu">
                            <router-link tag="li" to="/flot_charts" exact>
                                <a class="logo"><i class="menu-icon ti-bar-chart-alt"></i><span class="mm-text"> Flot Charts</span></a>
                            </router-link>
                            <router-link tag="li" to="/nvd3_charts" exact>
                                <a class="logo"><i class="menu-icon ti-stats-up"></i><span class="mm-text"> NVD3 Charts</span></a>
                            </router-link>
                            <router-link tag="li" to="/circle_sliders" exact>
                                <a class="logo"><i class="menu-icon ti-basketball"></i><span class="mm-text"> Circle Sliders</span></a>
                            </router-link>
                            <router-link tag="li" to="/chartjs" exact>
                                <a class="logo"><i class="menu-icon ti-pie-chart"></i><span class="mm-text"> Chartjs Charts</span></a>
                            </router-link>
                            <router-link tag="li" to="/chartist" exact>
                                <a class="logo"><i class="menu-icon ti-bar-chart"></i><span class="mm-text"> Chartist Charts</span></a>
                            </router-link>
                        </ul>
                    </li>
                    <li class="menu-dropdown">
                        <a href="javascript:void(0)">
                            <i class="menu-icon ti-calendar"></i>
                            <span class="mm-text">Calendar</span>
                            <span class="fa arrow"></span>
                        </a>
                        <ul class="sub-menu">
                            <router-link tag="li" to="/calendar" exact>
                                <a class="logo"><i class="menu-icon ti-video-clapper"></i><span class="mm-text"> Calendar</span><small class="badge badge1">7</small></a>
                            </router-link>
                            <router-link tag="li" to="/calendar2" exact>
                                <a class="logo"><i class="menu-icon ti-calendar"></i><span class="mm-text"> Calendar2</span><small class="badge badge2">7</small></a>
                            </router-link>
                        </ul>
                    </li>
                    <li class="menu-dropdown">
                        <a href="javascript:void(0)">
                            <i class="menu-icon ti-gallery"></i>
                            <span class="mm-text">Gallery</span>
                            <span class="fa arrow"></span>
                        </a>
                        <ul class="sub-menu">
                            <router-link tag="li" to="/masonry_gallery" exact>
                                <a class="logo"><i class="menu-icon ti-gallery"></i><span class="mm-text"> Masonry Gallery</span></a>
                            </router-link>
                            <router-link tag="li" to="/dropify" exact>
                                <a class="logo"><i class="menu-icon ti-dropbox"></i><span class="mm-text"> Dropify</span></a>
                            </router-link>
                            <router-link tag="li" to="/image_hover" exact>
                                <a class="logo"><i class="menu-icon ti-image"></i><span class="mm-text"> Image Hover</span></a>
                            </router-link>
                            <router-link tag="li" to="/image_filter" exact>
                                <a class="logo"><i class="menu-icon ti-filter"></i><span class="mm-text"> Image Filter</span></a>
                            </router-link>
                            <router-link tag="li" to="/image_magnifier" exact>
                                <a class="logo"><i class="menu-icon ti-zoom-in"></i><span class="mm-text"> Image Magnifier</span></a>
                            </router-link>
                        </ul>
                    </li>
                    <li class="menu-dropdown">
                        <a href="javascript:void(0)">
                            <i class="menu-icon ti-user"></i>
                            <span class="mm-text">Users</span> <span class="fa arrow"></span>
                        </a>
                        <ul class="sub-menu">
                            <router-link tag="li" to="/users_list" exact>
                                <a class="logo"><i class="menu-icon ti-menu-alt"></i><span class="mm-text"> Users List</span></a>
                            </router-link>
                            <router-link tag="li" to="/addnew_user" exact>
                                <a class="logo"><i class="menu-icon ti-user"></i><span class="mm-text"> Add New User</span></a>
                            </router-link>
                            <router-link tag="li" to="/user_profile" exact>
                                <a class="logo"><i class="menu-icon ti-id-badge"></i><span class="mm-text"> View Profile</span></a>
                            </router-link>
                            <router-link tag="li" to="/deleted_users" exact>
                                <a class="logo"><i class="menu-icon ti-trash"></i><span class="mm-text"> Deleted Users</span></a>
                            </router-link>
                        </ul>
                    </li>
                    <li class="menu-dropdown">
                        <a href="javascript:void(0)">
                            <i class="menu-icon ti-location-pin"></i>
                            <span class="mm-text">Maps</span>
                            <span class="fa arrow"></span>
                        </a>
                        <ul class="sub-menu">
                            <router-link tag="li" to="/gmaps" exact>
                                <a class="logo"><i class="menu-icon ti-world"></i><span class="mm-text"> Google Maps</span></a>
                            </router-link>
                            <router-link tag="li" to="/vector_maps" exact>
                                <a class="logo"><i class="menu-icon ti-map"></i><span class="mm-text"> Vector Maps</span></a>
                            </router-link>
                        </ul>
                    </li>
                    <li class="menu-dropdown">
                        <a href="javascript:void(0)">
                            <i class="menu-icon ti-files"></i>
                            <span class="mm-text">Pages</span>
                            <span class="fa arrow"></span>
                        </a>
                        <ul class="sub-menu">
                            <router-link tag="li" to="/login" exact>
                                <a class="logo"><i class="menu-icon ti-shift-right"></i><span class="mm-text"> Login</span></a>
                            </router-link>
                            <router-link tag="li" to="/register" exact>
                                <a class="logo"><i class="menu-icon ti-check-box"></i><span class="mm-text"> Register</span></a>
                            </router-link>
                            <router-link tag="li" to="/reset_password" exact>
                                <a class="logo"><i class="menu-icon ti-help"></i><span class="mm-text"> Forgot Password</span></a>
                            </router-link>
                            <router-link tag="li" to="/lockscreen" exact>
                                <a class="logo"><i class="menu-icon ti-lock"></i><span class="mm-text"> Lockscreen</span></a>
                            </router-link>
                        </ul>
                    </li>
                    <li class="menu-dropdown">
                        <a href="javascript:void(0)">
                            <i class="menu-icon ti-face-smile"></i>
                            <span class="mm-text">Extra Pages</span>
                            <span class="fa arrow"></span>
                        </a>
                        <ul class="sub-menu">
                            <router-link tag="li" to="/blank" exact>
                                <a class="logo"><i class="menu-icon ti-file"></i><span class="mm-text"> Blank page</span></a>
                            </router-link>
                            <router-link tag="li" to="/invoice" exact>
                                <a class="logo"><i class="menu-icon ti-layout-cta-left"></i><span class="mm-text"> Invoice</span></a>
                            </router-link>
                            <router-link tag="li" to="/pricing" exact>
                                <a class="logo"><i class="menu-icon ti-time"></i><span class="mm-text"> Pricing Table</span></a>
                            </router-link>
                            <router-link tag="li" to="/404" exact>
                                <a class="logo"><i class="menu-icon ti-unlink"></i><span class="mm-text"> 404 Error</span></a>
                            </router-link>
                            <router-link tag="li" to="/500" exact>
                                <a class="logo"><i class="menu-icon ti-face-sad"></i><span class="mm-text"> 500 Error</span></a>
                            </router-link>
                        </ul>
                    </li>
                    <li class="menu-dropdown">
                        <a href="javascript:void(0)">
                            <i class="menu-icon ti-layout-grid3"></i>
                            <span class="mm-text">Layouts</span>
                            <span class="fa arrow"></span>
                        </a>
                        <ul class="sub-menu">
                            <router-link tag="li" to="/menubar_fold" exact>
                                <a class="logo"><i class="menu-icon ti-layout-menu-v"></i><span class="mm-text"> Menubar Fold</span></a>
                            </router-link>
                            <router-link tag="li" to="/boxed" exact>
                                <a class="logo"><i class="fa fa-fw ti-view-list"></i><span class="mm-text"> Boxed Layout</span></a>
                            </router-link>
                            <router-link tag="li" to="/fixed_menu" exact>
                                <a class="logo"><i class="menu-icon ti-layout-column2"></i><span class="mm-text"> Fixed Menu</span></a>
                            </router-link>
                            <router-link tag="li" to="/movable_header" exact>
                                <a class="logo"><i class="menu-icon ti-view-list-alt"></i><span class="mm-text"> Movable Header</span></a>
                            </router-link>
                            <router-link tag="li" to="/boxed_movableheader" exact>
                                <a class="logo"><i class="menu-icon ti-view-list-alt"></i><span class="mm-text"> Boxed &amp; Movable Header</span></a>
                            </router-link>
                            <router-link tag="li" to="/mini_sidebar" exact>
                                <a class="logo"><i class="menu-icon ti-layout-menu-v"></i><span class="mm-text"> Mini Sidebar</span></a>
                            </router-link>
                        </ul>
                    </li>
                    <li class="menu-dropdown">
                        <a href="javascript:void(0)">
                            <i class="menu-icon ti-menu"></i>
                            <span class="mm-text">Menu levels</span>
                            <span class="fa arrow"></span>
                        </a>
                        <ul class="sub-menu">
                            <li>
                                <a href="javascript:void(0)">
                                    <i class="fa fa-fw ti-vector"></i> Level 1
                                    <span class="fa arrow"></span>
                                </a>
                                <ul class="sub-menu sub-submenu">
                                    <li>
                                        <a href="javascript:void(0)">
                                            <i class="fa fa-fw ti-vector"></i> Level 2
                                        </a>
                                    </li>
                                    <li>
                                        <a href="javascript:void(0)">
                                            <i class="fa fa-fw ti-vector"></i> Level 2
                                        </a>
                                    </li>
                                    <li>
                                        <a href="javascript:void(0)">
                                            <i class="fa fa-fw ti-vector"></i> Level 2
                                            <span class="fa arrow"></span>
                                        </a>
                                        <ul class="sub-menu sub-submenu">
                                            <li>
                                                <a href="javascript:void(0)">
                                                    <i class="fa fa-fw ti-vector"></i> Level 3
                                                </a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0)">
                                                    <i class="fa fa-fw ti-vector"></i> Level 3
                                                </a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0)">
                                                    <i class="fa fa-fw ti-vector"></i> Level 3
                                                    <span class="fa arrow"></span>
                                                </a>
                                                <ul class="sub-menu sub-submenu">
                                                    <li>
                                                        <a href="javascript:void(0)">
                                                            <i class="fa fa-fw ti-vector"></i> Level 4
                                                        </a>
                                                    </li>
                                                    <li>
                                                        <a href="javascript:void(0)">
                                                            <i class="fa fa-fw ti-vector"></i> Level 4
                                                        </a>
                                                    </li>
                                                    <li>
                                                        <a href="javascript:void(0)">
                                                            <i class="fa fa-fw ti-vector"></i> Level 4
                                                            <span class="fa arrow"></span>
                                                        </a>
                                                        <ul class="sub-menu sub-submenu">
                                                            <li>
                                                                <a href="javascript:void(0)">
                                                                    <i class="fa fa-fw ti-vector"></i> Level 5
                                                                </a>
                                                            </li>
                                                            <li>
                                                                <a href="javascript:void(0)">
                                                                    <i class="fa fa-fw ti-vector"></i> Level 5
                                                                </a>
                                                            </li>
                                                            <li>
                                                                <a href="javascript:void(0)">
                                                                    <i class="fa fa-fw ti-vector"></i> Level 5
                                                                </a>
                                                            </li>
                                                        </ul>
                                                    </li>
                                                </ul>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0)">
                                                    <i class="fa fa-fw ti-vector"></i> Level 4
                                                </a>
                                            </li>
                                        </ul>
                                    </li>
                                    <li>
                                        <a href="javascript:void(0)">
                                            <i class="fa fa-fw ti-vector"></i> Level 2
                                        </a>
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <a href="javascript:void(0)">
                                    <i class="fa fa-fw ti-vector"></i> Level 1
                                </a>
                            </li>
                            <li>
                                <a href="javascript:void(0)">
                                    <i class="fa fa-fw ti-vector"></i> Level 1
                                    <span class="fa arrow"></span>
                                </a>
                                <ul class="sub-menu sub-submenu">
                                    <li>
                                        <a href="javascript:void(0)">
                                            <i class="fa fa-fw ti-vector"></i> Level 2
                                        </a>
                                    </li>
                                    <li>
                                        <a href="javascript:void(0)">
                                            <i class="fa fa-fw ti-vector"></i> Level 2
                                        </a>
                                    </li>
                                    <li>
                                        <a href="javascript:void(0)">
                                            <i class="fa fa-fw ti-vector"></i> Level 2
                                        </a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </li>-->
                </ul>
                <!-- / .navigation -->
            </div>
            <!-- menu -->
        </section>
        <!-- /.sidebar -->
    </aside>
</template>
<script>
export default {
    name: "left-side"
}
</script>
