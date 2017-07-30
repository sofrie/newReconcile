<template>
    <div>
        <div class="page-header">
            <div class="pull-right form-inline">
                <div class="btn-group m-t-10">
                    <button class="btn btn-primary" data-calendar-nav="prev">
                        <i class="fa fa-fw ti-angle-double-left" aria-hidden="true"></i> Prev
                    </button>
                    <button class="btn btn-default" data-calendar-nav="today">Today</button>
                    <button class="btn btn-primary" data-calendar-nav="next">Next <i class="fa fa-fw ti-angle-double-right" aria-hidden="true"></i>
                    </button>
                </div>
                <div class="btn-group m-t-10">
                    <button class="btn btn-warning" data-calendar-view="year">Year</button>
                    <button class="btn btn-warning active" data-calendar-view="month">Month</button>
                    <button class="btn btn-warning" data-calendar-view="week">Week</button>
                    <button class="btn btn-warning" data-calendar-view="day">Day</button>
                </div>
            </div>
            <h3></h3>
        </div>
        <div class="row">
            <div class="col-md-9">
                <div id="calendar" class="m-b-25"></div>
            </div>
            <div class="col-md-3 calendar-settings">
                <div class="row">
                    <div class="col-md-12">
                        <h4>Calendar Settings</h4>
                        <div class="input-group">
                            <label for="first_day">First day of week </label>
                            <select id="first_day" class="form-control">
                                <option value="" selected="selected">language-dependant</option>
                                <option value="2">Sunday</option>
                                <option value="1">Monday</option>
                            </select>
                        </div>
                        <div class="input-group">
                            <label for="language">Select Language</label>
                            <select id="language" class="form-control">
                                <option value="">default: English-US</option>
                                <option value="bg-BG">Bulgarian</option>
                                <option value="nl-NL">Dutch</option>
                                <option value="fr-FR">French</option>
                                <option value="de-DE">German</option>
                                <option value="el-GR">Greek</option>
                                <option value="hu-HU">Hungarian</option>
                                <option value="id-ID">Bahasa Indonesia</option>
                                <option value="it-IT">Italian</option>
                                <option value="pl-PL">Polish</option>
                                <option value="pt-BR">Portuguese (Brazil)</option>
                                <option value="ro-RO">Romania</option>
                                <option value="es-CO">Spanish (Colombia)</option>
                                <option value="es-MX">Spanish (Mexico)</option>
                                <option value="es-ES">Spanish (Spain)</option>
                                <option value="ru-RU">Russian</option>
                                <option value="sk-SR">Slovak</option>
                                <option value="sv-SE">Swedish</option>
                                <option value="zh-CN">简体中文</option>
                                <option value="zh-TW">繁體中文</option>
                                <option value="ko-KR">한국어</option>
                                <option value="th-TH">Thai (Thailand)</option>
                            </select>
                        </div>
                    </div>
                    <div class="col-md-12 m-t-10">
                        <label class="checkbox">
                            <input type="checkbox" value="#events-modal" id="events-in-modal"> Open events in modal window
                        </label>
                    </div>
                    <div class="col-md-12 m-t-10">
                        <label class="checkbox">
                            <input type="checkbox" id="format-12-hours"> 12 Hour format
                        </label>
                    </div>
                    <div class="col-md-12 m-t-10">
                        <label class="checkbox">
                            <input type="checkbox" id="show_wb" checked> Show week box
                        </label>
                    </div>
                    <div class="col-md-12 m-t-10">
                        <label class="checkbox">
                            <input type="checkbox" id="show_wbn" checked> Show week box number
                        </label>
                    </div>
                    <div class="col-md-12">
                        <hr>
                    </div>
                    <div class="col-md-12">
                        <div>
                            <h4>Events List</h4>
                        </div>
                        <ul id="eventlist" class="nav nav-list"></ul>
                        <div class="m-t-10">
                            <a href="#" class="btn btn-success btn-block" data-toggle="modal" data-target="#myModal">Create
                                    event</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title" id="myModalLabel">
                                <i class="fa ti-plus icon-align"></i> Create Event
                            </h4>
                    </div>
                    <form role="form" name="eventform" id="eventform">
                        <div class="modal-body">
                            <div class="input-group">
                                <label for="new-event">Event Name</label>
                                <input type="text" id="new-event" class="form-control" placeholder="Event">
                            </div>
                            <div class="input-group">
                                <label for="eventclass">Event Class</label>
                                <select name="eventclass" id="eventclass" class="form-control">
                                    <option value="event-important" selected>Important</option>
                                    <option value="event-success">Success</option>
                                    <option value="event-primary">primary</option>
                                    <option value="event-default">Default</option>
                                    <option value="event-info">Info</option>
                                    <option value="event-warning">Warning</option>
                                </select>
                            </div>
                            <label for="event_url">Event URL</label>
                            <div class="input-group">
                                <span class="input-group-addon">HTTP://</span>
                                <input type="text" class="form-control pull-right" id="event_url" placeholder="Enter The URL related to event" />
                            </div>
                            <div class="input-group">
                                <label for="date-range0">Date Range</label>
                                <input type="text" class="form-control pull-right" id="date-range0" placeholder="Select Date Range For Event" />
                            </div>
                            <!-- /input-group -->
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-danger pull-right" id="close_calendar_event" data-dismiss="modal">
                                Close
                                <i class="fa ti-close icon-align"></i>
                            </button>
                            <button type="button" class="btn btn-success pull-left" id="add-new-event">
                                <i class="fa ti-plus icon-align"></i> Add
                            </button>
                            <button type="reset" class="hidden">Reset</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="modal fade" id="events-modal">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h3>Event</h3>
                    </div>
                    <div class="modal-body" style="height: 400px">
                    </div>
                    <div class="modal-footer">
                        <a href="#" data-dismiss="modal" class="btn btn-danger">Close</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
const moment = require("moment");
import date_range from "../vendors/jquery-date-range-picker/dist/jquery.daterangepicker.min.js";

require("imports-loader?_=underscore!../vendors/bootstrap-calendar/js/calendar.min.js");
import bootstrap_calendar from "../vendors/bootstrap-calendar/js/calendar.min.js"
export default {
    name: "calendar2",
    mounted: function() {
        "use strict";
        $(document).ready(function() {

            $('#date-range0').dateRangePicker({
                autoClose: true
            });
            $(".content .row").find('input').iCheck({
                checkboxClass: 'icheckbox_square-blue',
                radioClass: 'iradio_square-blue',
                increaseArea: '20%' // optional
            });

            function adddays(noofdays) {
                return (noofdays * 24 * 60 * 60 * 1000);
            }

            var eventarr = [{
                "id": "293",
                "title": "Team Out",
                "url": "http://lorvent.com/",
                "class": "event-important",
                "start": Date.now(),
                "end": Date.now() + adddays(1)
            }, {
                "id": "276",
                "title": "Product Seminar",
                "url": "#/404",
                "class": "event-success",
                "start": Date.now() + adddays(3),
                "end": Date.now() + adddays(5)
            }, {
                "id": "277",
                "title": "Client Meeting",
                "url": "http://lorvent.com/",
                "class": "event-info",
                "start": Date.now() + adddays(2),
                "end": Date.now() + adddays(4)
            }, {
                "id": "278",
                "title": "Anniversary Celebrations",
                "url": "http://lorvent.com/",
                "class": "event-primary",
                "start": Date.now() + adddays(2),
                "end": Date.now() + adddays(4)
            }, {
                "id": "279",
                "title": "Product Delivery",
                "url": "http://lorvent.com/",
                "class": "event-info",
                "start": Date.now() + adddays(-5),
                "end": Date.now() + adddays(-3)
            }, {
                "id": "280",
                "title": "Some Event",
                "url": "#/404",
                "class": "event-warning",
                "start": Date.now() + adddays(-4),
                "end": Date.now() + adddays(-2)
            }];
            var today = moment().format("YYYY-MM-DD");
            (function($) {
                "use strict";
                var options = {
                    events_source: eventarr,
                    view: 'month',
                    tmpl_path: '/static/tmpls/',
                    tmpl_cache: true,
                    day: today,
                    onAfterEventsLoad: function(events) {
                        if (!events) {
                            return;
                        }
                        var list = $('#eventlist');
                        list.html('');

                        $.each(events, function(key, val) {
                            var eventclass = val.class.split("-")[1];
                            if (eventclass == "important") {
                                eventclass = "danger";
                            }
                            $(document.createElement('li'))
                                .html('<a href="' + val.url + '" class="text-' + eventclass + '">' + val.title + '<span class="pull-right delete_event" title="Remove"><i class="fa ti-close showbtns" aria-hidden="true"></i></span></a>')
                                .appendTo(list);
                        });
                    },
                    onAfterViewLoad: function(view) {
                        $('.page-header h3').text(this.getTitle());
                        $('.btn-group button').removeClass('active');
                        $('button[data-calendar-view="' + view + '"]').addClass('active');
                    },
                    classes: {
                        months: {
                            general: 'label'
                        }
                    }
                };

                var calendar = $('#calendar').calendar(options);
                $("#menu").find(".badge2").text(eventarr.length);
                $("#add-new-event").on("click", function() {
                    var values = $(this).closest(".modal-content");
                    if (values.find("#new-event").val() == "" || values.find("#date-range0").val() == "") {
                        alert("Event or Event Date Should not be empty");
                    } else {
                        var random_id = Math.floor(Math.random() * 1111);
                        var startday = moment(values.find("#date-range0").val().split(" ")[0]);
                        var endday = moment(values.find("#date-range0").val().split(" ")[2]);
                        var evturl = "http://" + values.find("#event_url").val();
                        if (evturl == 'http://') {
                            evturl = "#";
                        }
                        var newevent = {
                            id: random_id,
                            title: values.find("#new-event").val(),
                            url: evturl,
                            class: values.find('#eventclass').val(),
                            start: Date.now() + adddays(startday.diff(today, "days")),
                            end: Date.now() + adddays(endday.diff(today, "days"))
                        };
                        eventarr.push(newevent);
                        $("#myModal").modal("hide");
                    }
                    calendar.setOptions({
                        events_source: eventarr
                    });
                    $("#menu").find(".badge2").text(eventarr.length);
                    calendar.view();
                });
                $('#eventlist').on("click", ".delete_event", function(e) {
                    e.preventDefault();
                    for (var i = 0; i < eventarr.length; i++) {
                        if (eventarr[i].title == $(this).closest("a").text()) {
                            eventarr.splice(i, 1);
                        }
                    }
                    calendar.setOptions({
                        events_source: eventarr
                    });
                    $("#menu").find(".badge2").text(eventarr.length);
                    calendar.view();
                });

                $('.btn-group button[data-calendar-nav]').each(function() {
                    var $this = $(this);
                    $this.on('click', function() {
                        calendar.navigate($this.data('calendar-nav'));
                    });
                });

                $('.btn-group button[data-calendar-view]').each(function() {
                    var $this = $(this);
                    $this.on('click', function() {
                        calendar.view($this.data('calendar-view'));
                    });
                });

                $('#first_day').on('change', function() {
                    var value = $(this).val();
                    value = value.length ? parseInt(value) : null;
                    calendar.setOptions({
                        first_day: value
                    });
                    calendar.view();
                });

                $('#language').on('change', function() {
                    $(".cal-lang").remove();
                    if ($(this).val() != '') {
                        $("body").append("<script class='cal-lang' src='vendors/bootstrap-calendar/js/language/" + $(this).val() + ".js'></scirpt>");
                    }
                    calendar.setLanguage($(this).val());
                    calendar.view();
                });

                $('#events-in-modal').on("ifChanged", function() {
                    var val = $(this).is(':checked') ? $(this).val() : null;
                    calendar.setOptions({
                        modal: val
                    });
                });
                $('#format-12-hours').on("ifChanged", function() {
                    var val = $(this).is(':checked') ? true : false;
                    calendar.setOptions({
                        format12: val
                    });
                    calendar.view();
                });
                $('#show_wbn').on("ifChanged", function() {
                    var val = $(this).is(':checked') ? true : false;
                    calendar.setOptions({
                        display_week_numbers: val
                    });
                    calendar.view();
                });
                $('#show_wb').on("ifChanged", function() {
                    var val = $(this).is(':checked') ? true : false;
                    calendar.setOptions({
                        weekbox: val
                    });
                    calendar.view();
                });
                $("body").on("hide.bs.modal", function() {
                    $("#eventform").find("[type='reset']").click();
                });
            }(jQuery));

            $('#eventlist').slimScroll({
                color: '#A9B6BC',
                height: '219px',
                size: '5px'
            });
        });
    },
    destroyed: function() {
        $(".badge2").text("6");
    }
}
</script>
<style src="../vendors/jquery-date-range-picker/dist/daterangepicker.min.css"></style>
<style src="../vendors/bootstrap-calendar/css/calendar.min.css"></style>
<style src="../assets/css/calendar_custom2.css"></style>
