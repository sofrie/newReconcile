//var left_side_width = 220; //Sidebar width in pixels
"use strict";
$(function() {

    //Add hover support for touch devices
    $('.btn').on('touchstart', function() {
        $(this).addClass('hover');
    }).on('touchend', function() {
        $(this).removeClass('hover');
    });

    //Activate tooltips
    $("[data-toggle='tooltip']").tooltip();

    /*
     * ADD SLIMSCROLL TO THE TOP NAV DROPDOWNS
     * ---------------------------------------
     */
    $(".navbar .menu").slimscroll({
        height: "200px",
        alwaysVisible: true,
        size: "3px"
    }).css("width", "100%");


    /*
     * INITIALIZE BUTTON TOGGLE
     * ------------------------
     */

    $('.btn-group[data-toggle="btn-toggle"]').on('each', function() {
        var group = $(this);
        $(this).find(".btn").on('click', function(e) {
            group.find(".btn.active").removeClass("active");
            e.preventDefault();
        });
    });
});
/*END DEMO*/



//  jQuery resize event - v1.1 - 3/14/2010
(function($, h, c) {
    var a = $([]),
        e = $.resize = $.extend($.resize, {}),
        i, k = "setTimeout",
        j = "resize",
        d = j + "-special-event",
        b = "delay",
        f = "throttleWindow";
    e[b] = 250;
    e[f] = true;
    $.event.special[j] = {
        setup: function() {
            if (!e[f] && this[k]) {
                return false;
            }
            var l = $(this);
            a = a.add(l);
            $.data(this, d, { w: l.width(), h: l.height() });
            if (a.length === 1) {
                g();
            }
        },
        teardown: function() {
            if (!e[f] && this[k]) {
                return false
            }
            var l = $(this);
            a = a.not(l);
            l.removeData(d);
            if (!a.length) {
                clearTimeout(i);
            }
        },
        add: function(l) {
            if (!e[f] && this[k]) {
                return false
            }
            var n;

            function m(s, o, p) {
                var q = $(this),
                    r = $.data(this, d);
                r.w = o !== c ? o : q.width();
                r.h = p !== c ? p : q.height();
                n.apply(this, arguments)
            }

            if ($.isFunction(l)) {
                n = l;
                return m
            } else {
                n = l.handler;
                l.handler = m
            }
        }
    };

    function g() {
        i = setTimeout(function() {
            a.each(function() {
                var n = $(this),
                    m = n.width(),
                    l = n.height(),
                    o = $.data(this, d);
                if (m !== o.w || l !== o.h) {
                    n.trigger(j, [o.w = m, o.h = l])
                }
            });
            g()
        }, e[b])
    }
})(jQuery, this);

//Code for collpasing panels

$(document).on('click', '.panel-heading .removepanel', function() {
    var $this = $(this);
    $this.parents('.panel').hide("slow");
});
//panel hide
$('.showhide').attr('title', 'Hide Panel content');
$(document).on('click', '.panel-heading .clickable', function(e) {
    var $this = $(this);
    if (!$this.hasClass('panel-collapsed')) {
        $this.parents('.panel').find('.panel-body').slideUp();
        $this.addClass('panel-collapsed').removeClass('ti-angle-up').addClass('ti-angle-down');
        $('.showhide').attr('title', 'Show Panel content');
    } else {
        $this.parents('.panel').find('.panel-body').slideDown();
        $this.removeClass('panel-collapsed').removeClass('ti-angle-down').addClass('ti-angle-up');
        $('.showhide').attr('title', 'Hide Panel content');
    }
});
//leftmenu init
$(function() {
    $('#menu').metisMenu();
});
//boxed code
$('.boxed .boxedli a').on('click', function() {
    $('body').addClass('container');
});
//fixed top
$('.sub-menu .fixedtop a').on('click', function() {
    $('.navbar').addClass('navbar-fixed-top');
});
//fixedtop and menu
$('.sub-menu .fixedtop-menu a').on('click', function() {
    $('.sidebar').addClass('affix');
    $('.navbar').addClass('navbar-fixed-top');
    $('.content-header').addClass('padding-top');
});
//top color


$('.collapse').on('shown.bs.collapse', function() {
    $(this).parent().find(".glyphicon-plus").removeClass("glyphicon-plus").addClass("glyphicon-minus");
}).on('hidden.bs.collapse', function() {
    $(this).parent().find(".glyphicon-minus").removeClass("glyphicon-minus").addClass("glyphicon-plus");
});
