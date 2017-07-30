<template>
    <div>
        <div class="row">
            <div class="col-lg-6">
                <!-- Basic charts strats here-->
                <div class="panel ">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                                <i class="ti-bar-chart"></i> Bar Chart
                            </h4>
                        <span class="pull-right">
                                    <i class="fa fa-fw ti-angle-up clickable"></i>
                                    <i class="fa fa-fw ti-close removepanel clickable"></i>
                                </span>
                    </div>
                    <div class="panel-body">
                        <div ref="bar-chart">
                            <canvas id="bar-chart" width="800" height="300"></canvas>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-6">
                <!-- Basic charts strats here-->
                <div class="panel ">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                                <i class="ti-bar-chart"></i> Polar Area Chart
                            </h4>
                        <span class="pull-right">
                                    <i class="fa fa-fw ti-angle-up clickable"></i>
                                    <i class="fa fa-fw ti-close removepanel clickable"></i>
                                </span>
                    </div>
                    <div class="panel-body">
                        <div>
                            <canvas id="polar-area-chart" width="800" height="300"></canvas>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- row -->
        <div class="row">
            <div class="col-lg-6">
                <!-- Basic charts strats here-->
                <div class="panel ">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                                <i class="ti-bar-chart-alt"></i> Line Chart
                            </h4>
                        <span class="pull-right">
                                    <i class="fa fa-fw ti-angle-up clickable"></i>
                                    <i class="fa fa-fw ti-close removepanel clickable"></i>
                                </span>
                    </div>
                    <div class="panel-body">
                        <div>
                            <canvas id="line-chart" width="800" height="300"></canvas>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-6">
                <!-- Basic charts strats here-->
                <div class="panel ">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                                <i class="ti-pie-chart"></i> Radar Chart
                            </h4>
                        <span class="pull-right">
                                    <i class="fa fa-fw ti-angle-up clickable"></i>
                                    <i class="fa fa-fw ti-close removepanel clickable"></i>
                                </span>
                    </div>
                    <div class="panel-body">
                        <div>
                            <canvas id="radar-chart" width="800" height="300"></canvas>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- row -->
        <div class="row">
            <div class="col-lg-6">
                <!-- Basic charts strats here-->
                <div class="panel ">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                                <i class="ti-pie-chart"></i> Donut Chart
                            </h4>
                        <span class="pull-right">
                                    <i class="fa fa-fw ti-angle-up clickable"></i>
                                    <i class="fa fa-fw ti-close removepanel clickable"></i>
                                </span>
                    </div>
                    <div class="panel-body">
                        <div>
                            <canvas id="doughnut-chart" width="800" height="300"></canvas>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-6">
                <!-- Basic charts strats here-->
                <div class="panel ">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                                <i class="ti-pie-chart"></i> Pie Charts
                            </h4>
                        <span class="pull-right">
                                    <i class="fa fa-fw ti-angle-up clickable"></i>
                                    <i class="fa fa-fw ti-close removepanel clickable"></i>
                                </span>
                    </div>
                    <div class="panel-body">
                        <div>
                            <canvas id="pie-chart" width="800" height="300"></canvas>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
import chartjs from "../vendors/Chart.js/dist/Chart.min.js";
export default {
    name: "chartjs",
    data() {
        return {
            doughnutData: {

                labels: [
                    "Info",
                    "Default",
                    "Primary"
                ],
                datasets: [{
                    data: [300, 50, 100],
                    backgroundColor: [
                        "#4FC1E9",
                        "#DCDCDC",
                        "#428BCA"
                    ],
                    hoverBackgroundColor: [
                        "#4FC1E9",
                        "#DCDCDC",
                        "#428BCA"
                    ]
                }]

            },
            pieData: {
                labels: [
                    "Primary",
                    "Success",
                    "Info"
                ],
                datasets: [{
                    data: [300, 50, 100],
                    backgroundColor: [
                        "#428BCA",
                        "#22d69d",
                        "#4FC1E9"
                    ],
                    hoverBackgroundColor: [
                        "#428BCA",
                        "#22d69d",
                        "#4FC1E9"
                    ]
                }]
            },
            chartData: {
                datasets: [{
                    data: [
                        15,
                        18,
                        10,
                        8,
                        16
                    ],
                    backgroundColor: [
                        "#428BCA",
                        "#FFb65f",
                        "#4FC1E9",
                        "#22d69d",
                        "#Fb8678"
                    ],
                    label: 'My dataset' // for legend
                }],
                labels: [
                    "data1",
                    "data2",
                    "data3",
                    "data4",
                    "data5"
                ]
            },
            radarChartData: {
                labels: ["Eating", "Drinking", "Sleeping", "Designing", "Coding", "Partying", "Running"],
                datasets: [{
                    backgroundColor: "rgba(160,212,104,0.5)",
                    hoverBackgroundColor: "rgba(160,212,104,0.5)",
                    pointBackgroundColor: "rgba(160,212,104,0.5)",
                    pointHoverBackgroundColor: "#fff",
                    data: [65, 59, 90, 81, 56, 55, 40],
                    label: 'data1'
                }, {
                    backgroundColor: "rgba(255,206,84,0.5)",
                    hoverBackgroundColor: "rgba(255,206,84,0.5)",
                    pointBackgroundColor: "rgba(255,206,84,0.5)",
                    pointHoverBackgroundColor: "#fff",
                    data: [28, 48, 40, 19, 96, 27, 100],
                    label: 'data2'
                }]

            },
            barChartData: {
                labels: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"],
                datasets: [{
                    label: "data1",
                    backgroundColor: "#4FC1E9",
                    hoverBackgroundColor: "#4FC1E9",
                    data: [65, 59, 90, 81, 56, 55, 40, 30, 50, 20, 80, 99]
                }, {
                    label: "data2",
                    backgroundColor: "#ffb65f",
                    hoverBackgroundColor: "#FFb65f",
                    data: [28, 48, 40, 19, 96, 27, 40, 60, 30, 90, 50, 87]
                }, {
                    label: "data3",
                    backgroundColor: "#428BCA",
                    hoverBackgroundColor: "#428BCA",
                    data: [30, 20, 100, 10, 80, 27, 50, 30, 60, 40, 80, 66, 90]
                }]

            },
            lineChartData: {
                labels: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"],
                datasets: [{
                    fill: true,
                    pointBackgroundColor: "rgba(79, 193, 233, 1)",
                    pointBorderColor: "#FFF",
                    borderJoinStyle: 'miter',
                    pointBorderWidth: "1",
                    label: "data1",
                    data: [30, 48, 35, 24, 35, 27, 50, 40, 60, 35, 46, 30],
                    backgroundColor: "rgba(79, 193, 233, 1)"
                }, {
                    fill: true,
                    pointBackgroundColor: "rgba(220, 220, 220, 1)",
                    pointBorderColor: "#FFF",
                    borderJoinStyle: 'miter',
                    pointBorderWidth: "1",
                    pointStrokeColor: "#FFF",
                    label: "data2",
                    data: [130, 63, 103, 51, 93, 55, 80, 140, 100, 92, 108, 110],
                    backgroundColor: "rgba(220, 220, 220, 1)"
                }]

            }
        }
    },
    mounted: function() {
        this.draw();
        this.draw1();
        this.draw2();
        this.draw3();
        this.draw4();
        this.draw5();

    },
    methods: {
        draw() {


            var myLine = new Chart(document.getElementById("line-chart"), {
                type: 'line',
                data: this.lineChartData,
                options: {
                    title: {
                        display: false,
                        text: 'Line Chart'
                    }
                }
            });
        },
        draw1() {


            var myBar = new Chart(document.getElementById("bar-chart"), {
                type: 'bar',
                data: this.barChartData
            });
        },
        draw2() {


            var myRadar = new Chart(document.getElementById("radar-chart"), {
                type: 'radar',
                data: this.radarChartData,
                responsive: true
            });
        },
        draw3() {


            var myPolarArea = new Chart(document.getElementById("polar-area-chart"), {
                data: this.chartData,
                type: 'polarArea'
            });
        },
        draw4() {


            var myPie = new Chart(document.getElementById("pie-chart"), {
                type: 'pie',
                data: this.pieData
            });
        },
        draw5() {


            var myDoughnut = new Chart(document.getElementById("doughnut-chart"), {
                type: 'doughnut',
                data: this.doughnutData
            });
        }
    },
    destroyed: function() {

    }
}
</script>
<style type="text/css" scoped>
canvas {
    width: 100% !important;
}
</style>
