<template>
    <div>
        <div class="row">
            <div class="col-md-12">
                <div class="panel" id="main-chart" style="width: 100%">
                    <div class="chart-header">Recent Stats
                        <div class="btn-group pull-right">
                            <span id="fullscreen-toggle" role="button">
                                    <small><i class="ti-fullscreen"></i></small>
                                </span>
                            <!--sull-screen-->
                            <span class="toggle-dropdown" role="menu" data-toggle="dropdown" aria-expanded="false" aria-haspopup="true">
                                    <i class="ti-more-alt option-more"></i>
                                </span>
                            <ul class="dropdown-menu chartoption-menu">
                                <li><a href="#">View</a>
                                </li>
                                <li><a href="#">Update</a>
                                </li>
                                <li><a href="#">Settings</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="statchart-data">
                        <div class="row">
                            <div class="data text-center">
                                <span class="percent"> 19%</span>
                                <br class="hidden-sm hidden-md hidden-lg">
                                <span>Orders</span>
                            </div>
                            <div class="data text-center">
                                <span class="percent">23%</span>
                                <br class="hidden-sm hidden-md hidden-lg">
                                <span>Sales</span>
                            </div>
                            <div class="data text-center">
                                <span class="percent">12%</span>
                                <br class="hidden-sm hidden-md hidden-lg">
                                <span>Support</span>
                            </div>
                        </div>
                    </div>
                    <div id="sales-chart" class='with-3d-shadow with-transitions'>
                        <svg></svg>
                    </div>
                </div>
            </div>
        </div>
        <div class="row main-cards">
            <div class="col-md-3 col-sm-6">
                <div class="panel">
                    <h4><b>New Users</b></h4>
                    <p>14,205
                        <small>Last month</small>
                    </p>
                    <span id="user-chart"></span>
                </div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="panel">
                    <h4><b>Revenue</b></h4>
                    <p>$56,180
                        <small>Target</small>
                    </p>
                    <span id="mr-chart"></span>
                </div>
            </div>
            <div class="clearfix hidden-md hidden-lg"></div>
            <div class="col-md-3 col-sm-6">
                <div class="panel">
                    <h4><b>Hits</b></h4>
                    <p>24,525
                        <small>Reached</small>
                    </p>
                    <span class="pull-right progress-label"><b>6</b><small>%</small> <i
                                class="ti-stats-up"></i></span>
                    <div class="progress progress-xs progress-striped active hits-progress">
                        <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="panel">
                    <h4><b>Subscribers</b></h4>
                    <p>8,958
                        <small>Quarterly</small>
                    </p>
                    <span id="subscriber-chart"></span>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-6">
                <div class="panel profile-page">
                    <div class="cover-image">
                        <a class="btn change_pic prev_pic"><img src="../assets/img/prev.png" alt="previous"></a>
                        <a class="btn change_pic next_pic pull-right"><img src="../assets/img/next.png" alt="previous"></a>
                        <span class="profile-name"><b>Clinton Leo</b></span>
                        <span class="follow-link"><a href="javascript:void(0)" class="btn btn-sm">+ Follow</a></span>
                    </div>
                    <div class="profile-pic">
                    </div>
                    <div class="about">
                        <div class="row">
                            <div class="col-sm-4 designation text-center">
                                <h5>Designer,<br class="hidden-xs">
                                        Team Lead.</h5>
                                <span><a href="javascript:void(0)" class="btn btn-sm button-pill new-task">New Task +</a></span>
                            </div>
                            <div class="col-sm-8 brief">
                                <h4>About</h4>
                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.deserunt eveniet facilis possimus, omnis porro possimus rem repellat, voluptate!</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-sm-6">
                <div class="panel weather-widget">
                    <div class="row weather-data">
                        <div class="col-md-12 temperature">
                            <h2><i class="wi wi-day-cloudy icon"></i><span
                                        class="pull-right">19<sup><sup>o</sup></sup>c <br><span class="location"><i
                                        class="ti-location-pin text-default" aria-hidden="true"></i>
                                    London, UK</span></span></h2>
                        </div>
                    </div>
                    <div class="weather-footer">
                        <div class="text-center">
                            <div class="col-lg-2 col-xs-2 popup">
                                <h5>MON</h5>
                                <i class="wi wi-day-lightning"></i>
                                <p>21°c</p>
                            </div>
                            <div class="col-lg-2 col-xs-2 popup">
                                <h5>TUE</h5>
                                <i class="wi wi-cloudy"></i>
                                <p>28°c</p>
                            </div>
                            <div class="col-lg-2 col-xs-2 popup">
                                <h5>WED</h5>
                                <i class="wi wi-night-rain-mix"></i>
                                <p>26°c</p>
                            </div>
                            <div class="col-lg-2 col-xs-2 popup">
                                <h5>THU</h5>
                                <i class="wi wi-day-sunny"></i>
                                <p>31°c</p>
                            </div>
                            <div class="col-xs-2 popup">
                                <h5>FRI</h5>
                                <i class="wi wi-day-lightning"></i>
                                <p>24°c</p>
                            </div>
                            <div class="col-xs-2 popup">
                                <h5>SAT</h5>
                                <i class="wi wi-night-alt-snow"></i>
                                <p>25°c</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-4 col-sm-7">
                <div class="panel">
                    <div class="panel-heading">
                        Recent Activities
                    </div>
                    <div class="panel-body">
                        <ul class="schedule-cont">
                            <li class="item success">
                                <div class="data">
                                    <div class="time text-muted"> Just now</div>
                                    <p><span class="text-info">Jade</span> Project team has successfully completed their first phase.</p>
                                </div>
                            </li>
                            <li class="item danger">
                                <div class="data">
                                    <div class="time text-muted"> 7min ago</div>
                                    <p>Tinder Project's <span class="text-info">Second</span> review has completed.</p>
                                </div>
                            </li>
                            <li class="item">
                                <div class="data">
                                    <div class="time text-muted">5hours ago</div>
                                    <p>Richard McClintock, updated his project over view report.</p>
                                </div>
                            </li>
                            <li class="item success">
                                <div class="data">
                                    <div class="time text-muted"> Yesterday</div>
                                    <p>Variations Project <span class="text-info">Evaluation</span> is going on to highlight the project success .</p>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-sm-5 col-lg-3 col-lg-push-5">
                <div class="panel">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="tile_1">
                                <div class="live-tile" data-mode="carousel" data-direction="vertical" data-delay="2500">
                                    <span class="tile-title feed-title">Feeds</span>
                                    <div>
                                        <h4 class="full"> It is a long established fact that a reader will be distracted.</h4>
                                        <span class="tile-title tile-time">17 min ago</span>
                                    </div>
                                    <div>
                                        <h4 class="full"> Many desktop publishing packages and web page editors.</h4>
                                        <span class="tile-title tile-time">40 min ago</span>
                                    </div>
                                    <div>
                                        <h4 class="full"> Richard McClintock, a Latin Trainer at Hampden-Sydney.</h4>
                                        <span class="tile-title tile-time">yesterday at 4pm</span>
                                    </div>
                                    <div>
                                        <h4 class="full"> There are many variations of passages of Lorem Ipsum available.</h4>
                                        <span class="tile-title tile-time">Dec 4</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-12">
                            <div class="tile_2">
                                <div class="list-tile">
                                    <ul class="flip-list fourTiles" data-mode="flip-list" data-delay="2000">
                                        <li>
                                            <div><img class="full" src="../assets/img/profile-pic.jpg" alt="1" /></div>
                                            <div><img class="full" src="../assets/img/authors/avatar.jpg" alt="1" /></div>
                                        </li>
                                        <li data-direction="horizontal">
                                            <div><img class="full" src="../assets/img/authors/avatar2.jpg" alt="2" /></div>
                                            <div><img class="full" src="../assets/img/authors/avatar3.jpg" alt="2" /></div>
                                        </li>
                                        <li data-direction="horizontal">
                                            <div><img class="full" src="../assets/img/authors/avatar4.jpg" alt="3" /></div>
                                            <div><img class="full" src="../assets/img/authors/avatar5.jpg" alt="3" /></div>
                                        </li>
                                        <li>
                                            <div><img class="full" src="../assets/img/authors/avatar6.jpg" alt="4" /></div>
                                            <div><img class="full" src="../assets/img/authors/avatar7.jpg" alt="4" /></div>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-sm-12 col-lg-5 col-lg-pull-3">
                <div class="row">
                    <div class="col-sm-6">
                        <div class="panel">
                            <div class="panel-body">
                                <div class="server-load text-center">
                                    <input type="text" class="cpu-laod" data-width="80" data-height="80" data-linecap=round data-fgColor="#6699cc" data-skin="tron" data-angleOffset="180" data-thickness=".15" />
                                    <h4>CPU-LOAD</h4>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="panel">
                            <div class="panel-body">
                                <div class="server-load text-center">
                                    <input type="text" class="disc-space" data-width="80" data-height="80" data-linecap=round data-fgColor="#66CC99" data-skin="tron" data-angleOffset="180" data-thickness=".15" />
                                    <h4>DISC-SPACE</h4>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="panel">
                            <div class="social">
                                <div class="row">
                                    <div class="col-xs-12">
                                        <div class="twitter text-center">
                                            <i class="ti-twitter-alt"></i>
                                        </div>
                                    </div>
                                    <div class="col-xs-6">
                                        <div class="info-1 text-center">
                                            <h3>27k</h3>
                                            <p>Tweets</p>
                                        </div>
                                    </div>
                                    <div class="col-xs-6">
                                        <div class="info-2 text-center">
                                            <h3>9.2k</h3>
                                            <p>followers</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="panel">
                            <div class="social">
                                <div class="row">
                                    <div class="col-xs-12">
                                        <div class="facebook text-center">
                                            <i class="ti-facebook"></i>
                                        </div>
                                    </div>
                                    <div class="col-xs-6 text-center">
                                        <div class="info-1">
                                            <h3>31k</h3>
                                            <p>Likes</p>
                                        </div>
                                    </div>
                                    <div class="col-xs-6 text-center">
                                        <div class="info-2">
                                            <h3>12k</h3>
                                            <p>feeds</p>
                                        </div>
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
import nvd3 from "../vendors/nvd3/build/nv.d3.min.js"
import sparkline from "../assets/js/custom_js/sparkline/jquery.flot.spline.js"
import screenfull from "../vendors/screenfull.js/dist/screenfull.min.js"
require("imports-loader?screenfull=./src/vendors/screenfull.js/dist/screenfull.min.js!");
import jqueryknob from "../vendors/jquery-knob/dist/jquery.knob.min.js"
import metrojs from "../vendors/metrojs/release/MetroJs.Full/MetroJs.min.js"
export default {
    name: 'index2',
    mounted: function() {
        "use strict";
        $(document).ready(function() {

            $('#fullscreen-toggle').on('click', function() {
                if ($('#fullscreen-toggle').find('i').hasClass('ti-fullscreen')) {
                    screenfull.toggle($('#main-chart')[0]);
                    $('.ti-fullscreen').toggleClass('ti-fullscreen ti-move');
                } else {
                    screenfull.exit();
                    $('.ti-move').toggleClass('ti-fullscreen ti-move');
                }
            });

            // sales chart starts
            nv.addGraph(function() {
                var linechart = nv.models.lineChart()
                    // .useInteractiveGuideline(true)
                    .showYAxis(false)
                    .showXAxis(true);
                linechart.xAxis
                    .tickFormat(d3.format(',r'));

                linechart.yAxis
                    .tickFormat(d3.format('.1f'));

                var myData = sinAndCos();
                linechart.forceY([0, 10]);
                d3.select('#sales-chart svg')
                    .datum(myData)
                    .call(linechart);
                nv.utils.windowResize(function() {
                    linechart.update();
                });
                $(window).on("scroll", function() {
                    linechart.tooltip.hideDelay(100);
                });
                $(".sidebar-toggle").on('click', function() {
                    $("#sales-chart").find('svg').remove();
                    $("#sales-chart").html("<svg></svg>");
                    d3.select('#sales-chart svg')
                        .datum(myData)
                        .call(linechart);
                    linechart.update();
                });
                return linechart;

            });

            function sinAndCos() {
                var sin = [],
                    sin2 = [],
                    cos = [];
                for (var i = 0; i < 121; i++) {

                    sin.push({
                        x: eval(i / 10),
                        y: Math.cos(i / 9) + 7.5
                    });
                    sin2.push({
                        x: eval(i / 10),
                        y: Math.cos(i / 14) + 5
                    });
                    cos.push({
                        x: eval(i / 10),
                        y: Math.cos(i / 10) + 4
                    });
                }
                return [{
                    values: sin,
                    key: 'Orders',
                    color: '#4285F4',
                    area: true
                }, {
                    values: sin2,
                    key: 'Sales',
                    color: '#81ADF8',
                    area: true
                }, {
                    values: cos,
                    key: 'Support',
                    color: '#BCD3F9',
                    area: true
                }];
            }

            // sales chart end


            // sparkline charts of visits sales etc..

            function spark_user() {
                $("#user-chart").sparkline([209, 210, 209, 210, 210, 211, 212, 210, 210, 211, 213, 212, 211, 210, 212, 211, 210, 212], {
                    type: 'line',
                    width: '100%',
                    height: '33',
                    lineColor: '#6699CC',
                    fillColor: '#D2E9FF',
                    tooltipSuffix: ' Users',
                    highlightLineColor: 'rgba(0,0,0,0)'
                });
            }

            spark_user();

            function spark_revenue() {
                var barParentdiv = $('#mr-chart').closest('.panel');
                var barCount = [91, 121, 131, 121, 131, 101, 91, 141, 131, 111, 111, 121, 111, 111, 101, 121, 111, 111, 121, 131, 121, 131, 121];
                var barSpacing = 2;
                $("#mr-chart").sparkline(barCount, {
                    type: 'bar',
                    width: '100%',
                    barWidth: (barParentdiv.width() - (barCount.length * barSpacing)) / barCount.length,
                    height: '30',
                    barSpacing: barSpacing,
                    barColor: '#FFE5C0',
                    tooltipSuffix: ' Sales'
                });
            }

            spark_revenue();

            function spark_subscribe() {
                $("#subscriber-chart").sparkline([209, 210, 209, 210, 210, 211, 212, 211, 210, 211, 209, 211, 213, 210, 212, 214, 211, 210, 212], {
                    type: 'line',
                    width: '100%',
                    height: '33',
                    lineColor: '#ff6666',
                    fillColor: '#FEEFEF',
                    tooltipSuffix: ' Subscribers',
                    highlightLineColor: 'rgba(0,0,0,0)'
                });
            }

            spark_subscribe();

            $(window).on('resize', function() {
                spark_user();
                spark_revenue();
                spark_subscribe();
            });
            $("[data-toggle='offcanvas']").on('click', function(e) {
                spark_user();
                spark_revenue();
                spark_subscribe();
            });
            // profile changer
            var profile_index = 0;
            var profile_arr = [{
                cover_img: "/static/img/profile-cover.jpg",
                profile_name: "Clinton Leo",
                profile_pic: "/static/img/profile-pic.jpg",
                desig: "Designer,<br class='hidden-xs'>Team Lead."
            }, {
                cover_img: "/static/img/pages/slider1.jpg",
                profile_name: "Tony",
                profile_pic: "/static/img/authors/avatar.jpg",
                desig: "Developer,<br class='hidden-xs'>Team Lead."
            }, {
                cover_img: "/static/img/pages/slider2.jpg",
                profile_name: "Jenny Kerry",
                profile_pic: "/static/img/authors/avatar1.jpg",
                desig: "Editor,<br class='hidden-xs'>Manager."
            }, {
                cover_img: "/static/img/pages/slider3.jpg",
                profile_name: "Marlee",
                profile_pic: "/static/img/authors/avatar2.jpg",
                desig: "Tester,<br class='hidden-xs'>Trainee."
            }];
            $(".change_pic").on("click", function() {
                if ($(this).hasClass("next_pic")) {
                    profile_index++;
                } else {
                    profile_index--;
                }
                profile_index = profile_index % profile_arr.length;
                if (profile_index == -1) {
                    profile_index = profile_arr.length - 1;
                }
                $(".cover-image").css("background-image", "url(" + profile_arr[profile_index].cover_img + ")");
                $(".profile-name").text(profile_arr[profile_index].profile_name);
                $(".profile-pic").css("background-image", "url(" + profile_arr[profile_index].profile_pic + ")");
                $(".designation h5").html(profile_arr[profile_index].desig);
            });
            // profile changer end
            // Animated knob
            // cpu load
            $('.cpu-laod').val(0).trigger('change').delay(2000);
            var myKnob_1 = $(".cpu-laod").knob({
                'min': 0,
                'max': 100,
                'readOnly': true,
                'format': function(value) {
                    return value + ' %';
                }
            });
            var tmr_1 = self.setInterval(function() {
                myDelay_1()
            }, 450);
            var m_1 = 0;

            function myDelay_1() {
                m_1 += 10;
                switch (m_1) {
                    case 60:
                        window.clearInterval(tmr_1);
                        break;
                }
                $('.cpu-laod').val(m_1).trigger('change');
            }

            // disc space

            $('.disc-space').val(0).trigger('change').delay(1000);
            var myKnob_2 = $(".disc-space").knob({
                'min': 0,
                'max': 100,
                'readOnly': true,
                'format': function(value) {
                    return value + ' %';
                }
            });
            var tmr_2 = self.setInterval(function() {
                myDelay_2()
            }, 450);
            var m_2 = 0;

            function myDelay_2() {
                m_2 += 15;
                switch (m_2) {
                    case 75:
                        window.clearInterval(tmr_2);
                        break;
                }
                $('.disc-space').val(m_2).trigger('change');
            }

            // Animated knob ends

            $(".live-tile, .flip-list").not(".exclude").liveTile();

            // swiper ends

        });

    }
}
</script>
<style src="../vendors/nvd3/build/nv.d3.min.css"></style>
<style src="../vendors/weather-icons/css/weather-icons.min.css" scoped></style>
<style src="../vendors/metrojs/release/MetroJs.Full/MetroJs.min.css" scoped></style>
<style src="../assets/css/custom_css/dashboard2.css" scoped></style>
<style>
#sales-chart svg {
    height: 350px;
    margin-left: -21px;
    margin-bottom: -9px;
}

#sales-chart .nvd3 .nv-groups .nv-group {
    fill-opacity: 1 !important;
}
</style>
