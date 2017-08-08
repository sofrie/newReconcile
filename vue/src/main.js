import Vue from 'vue';
import VueRouter from 'vue-router';
import store from './store.js';
import App from './App';
Vue.use(VueRouter)

var routes = [{
    path: '/',
    component: resolve => require(['./layout.vue'], resolve),
    children: [{
        path: '',
        component: resolve => require(['./components/dashboard.vue'], resolve),
        meta: {
            title: "Dashboard",
            breadcrumb: `<li><a href="/"><i class="ti-desktop"></i> Dashboard</a></li>`
        }
    }, {
        path: 'invoicepage',
        component: resolve => require(['./components/InvoicePage.vue'], resolve),
        meta: {
            title: "Invoice",
            breadcrumb: `<li><a href="#/index2"><i class="ti-files"></i> Invoice</a></li>`
        }
    }, {
        path: 'invoicepage/:id',
        component: resolve => require(['./components/InvoicePage.vue'], resolve),
        meta: {
            title: "Invoice",
            breadcrumb: `<li><a href="#/index2"><i class="ti-file"></i> Invoice</a></li>`
        },
		props: true
    },{
        path: 'awb',
        component: resolve => require(['./components/awb.vue'], resolve),
        meta: {
            title: "AWB",
            breadcrumb: `<li><a href="#/index2"><i class="ti-file"></i> AWB</a></li>`
        }
    }, {
        path: 'awb/:month/:year/:logistic',
        component: resolve => require(['./components/awb.vue'], resolve),
        meta: {
            title: "AWB",
            breadcrumb: `<li><a href="#/index2"><i class="ti-file"></i> AWB</a></li>`
        },
		props: true
    },{path: 'logistic',
        component: resolve => require(['./components/logistic.vue'], resolve),
        meta: {
            title: "Logistic",
            breadcrumb: `<li><a href="#/index2"><i class="ti-truck"></i> Logistic</a></li>`
        }
    },{path: 'setting',
        component: resolve => require(['./components/setting.vue'], resolve),
        meta: {
            title: "Setting",
            breadcrumb: `<li><a href="#/index2"><i class="ti-settings"></i> Setting</a></li>`
        }
    },{
        path: 'index2',
        component: resolve => require(['./components/index2.vue'], resolve),
        meta: {
            title: "Dashboard2",
            breadcrumb: `<li><a href="#/index2"><i class="ti-home"></i> Dashboard 2</a></li>`
        }
    }
    ]
}, {
    path: '/500',
    component: resolve => require(['./components/500.vue'], resolve),
    meta: {
        title: "500",
        breadcrumb: ``
    }
}, {
    path: '/login',
    component: resolve => require(['./components/login.vue'], resolve),
    meta: {
        title: "Login",
        breadcrumb: ``
    }
}, {
    path: '/register',
    component: resolve => require(['./components/register.vue'], resolve),
    meta: {
        title: "Register",
        breadcrumb: ``
    }
}, {
    path: '/lockscreen',
    component: resolve => require(['./components/lockscreen.vue'], resolve),
    meta: {
        title: "Lockscreen",
        breadcrumb: ``
    }
}, {
    path: '/reset_password',
    component: resolve => require(['./components/reset_pass.vue'], resolve),
    meta: {
        title: "Reset Password",
        breadcrumb: ``
    }
}, {
    path: '*',
    component: resolve => require(['./components/404.vue'], resolve),
    meta: {
        title: "404",
        breadcrumb: ``
    }
}];





const router = new VueRouter({
    routes,
    linkActiveClass: "active"
});
router.beforeEach((to, from, next) => {
    $('.preloader img').fadeIn("fast");
    $('.preloader').fadeIn("fast");
    $("#menu .sub-menu").addClass("hidden");
    $("#menu").find("ul,li").removeClass("active collapse in").css("height", "auto");
    $("#menu a").off("click");
    next()
})

router.afterEach((to, from) => {
    document.title = to.meta.title;
    //scroll to top when changing pages
    $('body,html').animate({
        scrollTop: 0
    }, 300);
    $('.row-offcanvas').removeClass('active').removeClass("relative");
    $('.left-side').removeClass("collapse-left");
    $(".right-side").removeClass("strech");
    setTimeout(function() {
        $("#menu").find("li.active").parents("li").addClass("active");
        $("#menu .sub-menu").removeClass("hidden");
        $("#menu").metisMenu();
        $('.preloader img').fadeOut("slow");
        $('.preloader').fadeOut("slow");
    }, 0);
});
new Vue({
    router,
    store,
    template: '<App/>',
    components: { App }
}).$mount('#app');
