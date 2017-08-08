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
                <router-link tag="li" to="/setting" exact >
                    <a class="logo"><i class="menu-icon ti-settings"></i><br/><span class="mm-text">Setting</span></a>
                </router-link>

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
        name: "left-side",
        data: () => ({
          role: '',
          parts: ''
      }
      ),
        methods: {
            getCookie(name){
                var value="; "+document.cookie;
                this.parts=value.split("; "+name+"=");
                if(this.parts.length==2)
                  this.parts=this.parts.pop().split(";");
          },
          getRole () {
             this.getCookie('access_token')
             axios.get('http://127.0.0.1:8091/api/tes?access_token='+this.parts)
             .then(response => {
            // JSON responses are automatically parsed.
            this.role = response.data
        })
             .catch(e => {
                this.errors.push(e)
            })
         },

     },
     ready() {
    this.getRole();
},
     mounted () {                
      this.getRole()
  }
}
</script>
