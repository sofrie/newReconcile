"use strict";
(function(window) {
    // Is Modernizr defined on the global scope
    var Modernizr = typeof Modernizr !== "undefined" ? Modernizr : false,
        // whether or not is a touch device
        isTouchDevice = Modernizr ? Modernizr.touch : !!('ontouchstart' in window || 'onmsgesturechange' in window),
        // Are we expecting a touch or a click?
        buttonPressedEvent = (isTouchDevice) ? 'touch' : 'click',
        clearui = function() {
            this.init();
        };
    // Initialization method
    clearui.prototype.init = function() {
        this.isTouchDevice = isTouchDevice;
        this.buttonPressedEvent = buttonPressedEvent;
    };
    clearui.prototype.getViewportHeight = function() {
        var docElement = document.documentElement,
            client = docElement.clientHeight,
            inner = window.innerHeight;
        if (client < inner)
            return inner;
        else
            return client;
    };
    clearui.prototype.getViewportWidth = function() {
        var docElement = document.documentElement,
            client = docElement.clientWidth,
            inner = window.innerWidth;
        if (client < inner)
            return inner;
        else
            return client;
    };
    // Creates a clear object.
    window.clearui = new clearui();
})(window);
(function($) {
    var $navBar = $('nav.navbar'),
        $body = $('body'),
        $menu = $('#menu');

    function getHeight(el) {
        return el.outerHeight();
    }

    function init() {
        var isFixedNav = $navBar.hasClass('navbar-fixed-top');
        var bodyPadTop = isFixedNav ? $navBar.outerHeight(true) : 0;
        $body.css('padding-top', bodyPadTop);
    }

    clearui.navBar = function() {
        var resizeTimer;
        init();
        $(window).on('resize', function() {
            clearTimeout(resizeTimer);
            resizeTimer = setTimeout(init(), 250);
        });
    };
    return clearui;
})(jQuery);
(function($, clearui) {
    clearui.clearAnimatePanel = function() {

    };
    return clearui;
})(jQuery, clearui || {});


(function($) {
    $(document).ready(function() {
        $('[data-toggle="tooltip"]').tooltip();
        clearui.navBar();
        clearui.clearAnimatePanel();
    });
})(jQuery);

$('.navbar-nav>.dropdown').on('click', function() {
    $('body').removeClass("sidebar-right-opened");
    if ($("body").hasClass("boxed")) {
        $('#right').css('right', '-270px');
    }
});

$(document).ready(function() {


    //=================Preloader===========//
    $(window).on('load', function() {
        $('.preloader img').fadeOut();
        $('.preloader').fadeOut();
    });
    //=================end of Preloader===========//
});
