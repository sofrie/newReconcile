<template>
    <div>
        <!--main content-->
        <div class="row">
            <div class="col-md-12">
                <div class="panel">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                                <i class="ti-pie-chart"></i> Circle Dials
                            </h3>
                        <span class="pull-right">
                                    <i class="fa fa-fw ti-angle-up clickable"></i>
                                    <i class="fa fa-fw ti-close removepanel clickable"></i>
                                </span>
                    </div>
                    <div class="panel-body">
                        <!--knob-->
                        <div class="visible-ie8">
                            <div class="col-md-12">
                                <div class="alert alert-warning alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                    The Circle Dial plugin is not compatible with Internet Explorer 8 and older.
                                </div>
                            </div>
                        </div>
                        <div class="portlet-body">
                            <div class="row">
                                <div class="col-xs-12 col-md-12">
                                    <div class="col-md-3 col-sm-3 col-xs-12 text-center m-t-10">
                                        <div class="text-left m-t-10 m-b-10">Disabled Display Input</div>
                                        <input class="knob" data-width="120" data-height="120" data-fgColor="#6699cc" data-displayinput=false value="35">
                                    </div>
                                    <div class="col-md-3 col-sm-3 col-xs-12 text-center m-t-10">
                                        <div class="text-left m-t-10 m-b-10">Cursor</div>
                                        <input class="knob" data-width="120" data-height="120" data-cursor=true data-fgColor="#66cc99" data-thickness=.3 value="29">
                                    </div>
                                    <div class="col-md-3 col-sm-3 col-xs-12 text-center m-t-10">
                                        <div class="text-left m-t-10 m-b-10">
                                            Display previous
                                        </div>
                                        <input class="knob" data-width="120" data-height="120" data-fgColor="#f0ad4e" data-min="-100" data-displayprevious=true value="44">
                                    </div>
                                    <div class="col-md-3 col-sm-3 col-xs-12 text-center m-t-10">
                                        <div class="text-left m-t-10 m-b-10">
                                            Angle offset
                                        </div>
                                        <input class="knob" data-angleoffset="90" data-fgcolor="#ff6666" data-width="120" data-height="120" value="35">
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-12 col-md-12">
                                    <div class="col-md-3 col-sm-3 col-xs-12 text-center m-t-10">
                                        <div class="text-left m-t-10 m-b-10">
                                            Angle offset arc
                                        </div>
                                        <input class="knob" data-angleoffset="-125" data-anglearc="251" data-fgcolor="#f0ad4e" data-width="120" data-height="120" value="35">
                                    </div>
                                    <div class="col-md-3 col-sm-3 col-xs-12 text-center m-t-10">
                                        <div class="text-left m-t-10 m-b-10">
                                            5-digit values
                                        </div>
                                        <input class="knob" data-min="-15000" data-fgColor="#ff6666" data-max="15000" data-width="120" data-height="120" value="-11000">
                                    </div>
                                    <div class="col-md-3 col-sm-3 col-xs-12 text-center m-t-10">
                                        <div class="text-left m-t-10 m-b-10">Responsive</div>
                                        <input class="knob" data-width="120" data-height="120" data-fgColor="#66cc99" value="35">
                                    </div>
                                    <div class="col-md-3 col-sm-3 col-xs-12 text-center m-t-10">
                                        <div class="text-left m-t-10 m-b-10">Readonly</div>
                                        <input class="knob" data-fgColor="#66ccff" data-thickness=".4" data-width="120" data-height="120" readonly value="22">
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="demo">
                                        <div class="text-left">Superpose (clock)</div>
                                        <div>
                                            <div class="demo_hours">
                                                <input class="knob hour" data-min="0" data-max="24" data-bgColor="#dcdcdc" data-fgColor="#f0ad4e" data-displayInput=false data-width="240" data-height="240" data-thickness=".3" value="15">
                                            </div>
                                            <div class="demo_minutes">
                                                <input class="knob minute" data-min="0" data-max="60" data-bgColor="#dcdcdc" data-fgColor="#66ccff" data-displayInput=false data-width="160" data-height="160" data-thickness=".45" value="30">
                                            </div>
                                            <div class="demo_seconds">
                                                <input class="knob second" data-min="0" data-max="60" data-bgColor="#dcdcdc" data-fgColor="#66cc99" data-displayInput=false data-width="80" data-height="80" data-thickness=".3" value="20">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--knob ends-->
                </div>
            </div>
        </div>
        <!-- sparkline -->
        <div class="row">
            <div class="col-md-12">
                <div class="panel panel-success">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                                <i class="ti-bar-chart-alt"></i> Tiny Charts
                            </h3>
                        <span class="pull-right">
                                    <i class="fa fa-fw ti-angle-up clickable"></i>
                                    <i class="fa fa-fw ti-close removepanel clickable"></i>
                                </span>
                    </div>
                    <div class="panel-body">
                        <div class="row sparkline_charts">
                            <div class="col-md-4 m-t-25 text-center">
                                <div>
                                    <div>Tiny line chart</div>
                                    <div class="chart linechart">Loading...</div>
                                </div>
                            </div>
                            <div class="col-md-4 m-t-25 text-center">
                                <div>
                                    <div>Tiny bar chart</div>
                                    <div class="chart barchart">Loading...</div>
                                </div>
                            </div>
                            <div class="col-md-4 m-t-25 text-center">
                                <div>
                                    <div>Tiny stacked bar chart</div>
                                    <div class="m-t-10 chart stackedbarchart">Loading...</div>
                                </div>
                            </div>
                            <div class="col-md-4 m-t-25 text-center">
                                <div>
                                    <div>Tiny tristate chart</div>
                                    <div class="m-t-10 chart tristatechart">Loading...</div>
                                </div>
                            </div>
                            <div class="col-md-4 m-t-25 text-center">
                                <div>
                                    <div>Tiny bullet chart</div>
                                    <div class="m-t-10 chart bulletchart">Loading...</div>
                                </div>
                            </div>
                            <div class="col-md-4 m-t-25 text-center">
                                <div>
                                    <div>Tiny pie chart</div>
                                    <div class="m-t-10 chart piechart">Loading...</div>
                                </div>
                            </div>
                            <div class="col-md-4 m-t-25 text-center">
                                <div>
                                    <div>Tiny discrete chart</div>
                                    <div class="m-t-10 chart discretechart">Loading...</div>
                                </div>
                            </div>
                            <div class="col-md-4 m-t-25 text-center">
                                <div>
                                    <div>Tiny boxplot chart</div>
                                    <div class="m-t-10 chart boxchart">Loading...</div>
                                </div>
                            </div>
                            <div class="col-md-4 m-t-25 text-center">
                                <div>
                                    <div>Tiny composite line chart</div>
                                    <div id="compositeline" class="m-t-10">
                                        8,4,0,0,0,0,1,4,4,10,10,10,10,0,0,0,4,6,5,9,10
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-4 m-t-25 text-center">
                                <div>
                                    <div>Tiny composite bar chart</div>
                                    <div id="compositebar" class="m-t-10">4,6,7,7,4,3,2,1,4</div>
                                </div>
                            </div>
                            <div class="col-md-4 m-t-25 text-center">
                                <div>
                                    <div>Tiny line chart with normal range</div>
                                    <div id="normalline" class="m-t-10">
                                        8,4,0,0,0,0,1,4,4,10,10,10,10,0,0,0,4,6,5,9,10
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-4 m-t-25 text-center">
                                <div>
                                    <div>Tiny discrete chart with treshold</div>
                                    <div id="discrete2" class="m-t-10">4,6,7,7,4,3,2,1,4</div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- sparkline -->
    </div>
</template>
<script>
import jqueryknob from "../vendors/jquery-knob/dist/jquery.knob.min.js"
import sparkline from "../assets/js/custom_js/sparkline/jquery.flot.spline.js"
export default {
    name: "circle_sliders",
    mounted: function() {
        "use strict";
        $(document).ready(function() {

            $(".knob").knob({
                change: function(value) {
                    //console.log("change : " + value);
                },
                cancel: function() {
                    console.log("cancel : ", this);
                },
                /*format : function (value) {
                 return value + '%';
                 },*/
                draw: function() {
                    // "tron" case
                    if (this.$.data('skin') == 'tron') {

                        this.cursorExt = 0.3;

                        var a = this.arc(this.cv) // Arc
                            ,
                            pa // Previous arc
                            , r = 1;

                        this.g.lineWidth = this.lineWidth;

                        if (this.o.displayPrevious) {
                            pa = this.arc(this.v);
                            this.g.beginPath();
                            this.g.strokeStyle = this.pColor;
                            this.g.arc(this.xy, this.xy, this.radius - this.lineWidth, pa.s, pa.e, pa.d);
                            this.g.stroke();
                        }
                        this.g.beginPath();
                        this.g.strokeStyle = r ? this.o.fgColor : this.fgColor;
                        this.g.arc(this.xy, this.xy, this.radius - this.lineWidth, a.s, a.e, a.d);
                        this.g.stroke();

                        this.g.lineWidth = 2;
                        this.g.beginPath();
                        this.g.strokeStyle = this.o.fgColor;
                        this.g.arc(this.xy, this.xy, this.radius - this.lineWidth + 1 + this.lineWidth * 2 / 3, 0, 2 * Math.PI, false);
                        this.g.stroke();

                        return false;
                    }
                }
            });
            // Example of infinite knob, iPod click wheel
            var v, up = 0,
                down = 0,
                i = 0,
                $idir = $("div.idir"),
                $ival = $("div.ival"),
                incr = function() {
                    i++;
                    $idir.show().html("+").fadeOut();
                    $ival.html(i);
                },
                decr = function() {
                    i--;
                    $idir.show().html("-").fadeOut();
                    $ival.html(i);
                };
            $("input.infinite").knob({
                min: 0,
                max: 20,
                stopper: false,
                change: function() {
                    if (v > this.cv) {
                        if (up) {
                            decr();
                            up = 0;
                        } else {
                            up = 1;
                            down = 0;
                        }
                    } else {
                        if (v < this.cv) {
                            if (down) {
                                incr();
                                down = 0;
                            } else {
                                down = 1;
                                up = 0;
                            }
                        }
                    }
                    v = this.cv;
                }
            });


            function clock() {
                var $s = $(".second"),
                    $m = $(".minute"),
                    $h = $(".hour");
                var d = new Date(),
                    s = d.getSeconds(),
                    m = d.getMinutes(),
                    h = d.getHours();
                $s.val(s).trigger("change");
                $m.val(m).trigger("change");
                $h.val(h).trigger("change");
                setTimeout(clock, 1000);
            }

            clock();
            //jquery knob js end


            // spark line charts js start
            $(".linechart").sparkline([5, 1, 7, 8, 2, 6, 4, 7, 4, 2, 4], {
                type: 'line',
                height: "50px",
                width: "80px;",
                lineColor: '#428bca',
                fillColor: 'rgba(66,139,202,0.5)'
            });
            $(".barchart").sparkline([5, 6, 7, 2, 0, -4, -2, 4], {
                type: 'bar',
                height: "50px",
                barWidth: "8px;",
                barSpace: "3px",
                barColor: "#428bca",
                negBarColor: '#fb8678'
            });
            $(".stackedbarchart").sparkline([
                [5, 4],
                [4, 7],
                [7, 3],
                [3, 5],
                [6, 3],
                [2, 5]
            ], {
                type: 'bar',
                zeroColor: '#dcdcdc',
                nullColor: '#dcdcdc ',
                height: "50px",
                barWidth: "8px;",
                barSpace: "3px",
                stackedBarColor: ['#fb8678', '#428bca']
            });
            $(".tristatechart").sparkline([1, 1, 0, 1, -1, -1, 1, -1, 0, 0, 1, 1], {
                type: 'tristate',
                height: "50px",
                barWidth: "8px;",
                barSpace: "3px",
                posBarColor: '#22d69d',
                negBarColor: '#fb8678',
                zeroBarColor: '#dcdcdc'
            });
            $(".bulletchart").sparkline([10, 12, 12, 9, 7], {
                type: 'bullet',
                height: "30px",
                width: "80px",
                targetColor: '#fb8678',
                performanceColor: '#4fc1e9',
                rangeColors: ['#ffb65f', '#fb8678', '#428bca']
            });
            $(".piechart").sparkline([3, 4, 1, 6, 3, 5], {
                type: 'pie',
                width: '50px',
                height: '50px',
                sliceColors: ['#428bca', '#22d69d', '#4fc1e9', '#fb8678', '#ffb65f']
            });
            $(".discretechart").sparkline([4, 6, 7, 7, 4, 3, 2, 1, 4, 4, 5, 2, 3, 5, 1, 6], {
                type: 'discrete',
                height: "50px",
                Width: "80px",
                lineColor: '#428bca'
            });
            $(".boxchart").sparkline([4, 27, 34, 52, 54, 59, 61, 68, 78, 82, 85, 87, 91, 93, 100], {
                type: 'box',
                width: '80px',
                height: '50px',
                boxFillColor: '#4fc1e9',
                whiskerColor: '#ffb65f',
                medianColor: '#fb8678',
                targetColor: '#22d69d'
            });
            $('#compositeline').sparkline('html', {
                fillColor: false,
                changeRangeMin: 0,
                chartRangeMax: 10,
                width: '100px',
                height: '50px',
                lineColor: '#428bca'
            }).sparkline([4, 1, 5, 7, 9, 9, 8, 7, 6, 6, 4, 7, 8, 4, 3, 2, 2, 5, 6, 7], {
                composite: true,
                fillColor: false,
                changeRangeMin: 0,
                chartRangeMax: 10,
                width: '100px',
                height: '50px',
                lineColor: '#fb8678'
            });
            $('#compositebar').sparkline('html', {
                type: 'bar',
                barWidth: "10px;",
                barSpace: "5px",
                height: '50px',
                barColor: "#428bca"
            }).sparkline([4, 1, 5, 7, 9, 9, 8, 7, 6, 6, 4, 7, 8, 4, 3, 2, 2, 5, 6, 7], {
                composite: true,
                fillColor: false,
                barWidth: "10px;",
                barSpace: "5px",
                height: '50px',
                lineColor: '#ffb65f'
            });
            $('#normalline').sparkline('html', {
                fillColor: false,
                normalRangeMin: -1,
                normalRangeMax: 8,
                width: '120px',
                height: '50px',
                lineColor: '#428bca'
            });
            $('#normalExample').sparkline('html', {
                fillColor: false,
                normalRangeMin: 80,
                normalRangeMax: 95,
                normalRangeColor: '#dcdcdc'
            });
            $('#discrete2').sparkline('html', {
                type: 'discrete',
                thresholdColor: '#fb8678',
                thresholdValue: 4,
                height: "50px",
                Width: "80px",
                lineColor: '#428bca'
            });

        });
    },
    destroyed: function() {

    }
}
</script>
<style src="../assets/css/custom_css/circle_sliders.css"></style>
