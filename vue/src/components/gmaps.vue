<template>
    <div>
        <div class="row">
            <div class="col-md-6">
                <div class="panel">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                          <i class="ti-map"></i> Basic
                        </h4>
                    </div>
                    <div class="panel-body">
                        <gmap-map :center="center" :zoom="5" class="gmap" ref="gmap"></gmap-map>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="panel">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                          <i class="ti-map"></i> Map with Markers
                        </h4>
                    </div>
                    <div class="panel-body">
                        <gmap-map :center="center" :zoom="5" class="gmap" ref="gmap">
                            <gmap-marker v-for="m in markers" :key="m" :position="m.position" :clickable="true" :draggable="true" @click="center=m.position"></gmap-marker>
                        </gmap-map>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="panel">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                          <i class="ti-map"></i> Map with Clustering
                        </h4>
                    </div>
                    <div class="panel-body">
                        <gmap-map :center="center" :zoom="4" class="gmap" ref="gmap">
                            <gmap-cluster>
                                <gmap-marker v-for="m in markers" :key="m" :position="m.position" :clickable="true" :draggable="true" @click="center=m.position"></gmap-marker>
                            </gmap-cluster>
                        </gmap-map>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="panel">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                          <i class="ti-map"></i> Satellite
                        </h4>
                    </div>
                    <div class="panel-body">
                        <!-- to get different map types change mapTypeId -->
                        <gmap-map :center="center" :zoom="4" class="gmap" mapTypeId="hybrid" ref="gmap"></gmap-map>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
import * as VueGoogleMaps from 'vue2-google-maps';
import Vue from 'vue';

Vue.use(VueGoogleMaps, {
    load: {
        // key: 'tour gmaps api key'
        // v: 'OPTIONAL VERSION NUMBER',
        // libraries: 'places', // If you need to use place input
    }
});
export default {
    name: "gmaps",
    mounted: function() {

    },
    destroyed: function() {

    },
    data() {
        return {
            center: {
                lat: 17.387140,
                lng: 78.491684
            },
            markers: [{
                position: {
                    lat: 17.387140,
                    lng: 78.491684
                }
            }, {
                position: {
                    lat: 12.972442,
                    lng: 77.580643
                }
            }, {
                position: {
                    lat: 18.910000,
                    lng: 72.809998
                }
            }]
        }
    }
}
</script>
<style scoped>
.gmap {
    width: 100%;
    height: 300px;
    margin: 5px auto;
}
</style>
