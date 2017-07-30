<template>
    <div>
        <div class="row">
            <div class="col-md-12">
                <div>
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="form-horizontal">
                                <div class="form-group">
                                    <label class="col-sm-1 control-label" for="skill">
                                        Status :
                                    </label>
                                    <div class="col-sm-2">
                                        <select id="skill" name="skill" class="form-control"
                                                v-on:change="changeStatus()" v-model="selectedStatus">
                                            <option value="Select Status" disabled="" selected="">
                                                Select Status
                                            </option>
                                            <option value="All">All</option>
                                            <option value="Open">Open</option>
                                            <option value="On Process">On Process</option>
                                            <option value="Problem Exist">Problem Exist</option>
                                            <option value="OK">OK</option>
                                            <option value="Submitted">Submitted</option>
                                            <option value="Confirmed">Confirmed</option>
                                            <option value="Approved">Approved</option>
                                        </select>
                                    </div>

                                    <label class="col-sm-1 control-label" for="skill">
                                        Logistic :
                                    </label>
                                    <div class="col-sm-2">
                                        <select id="skill" name="skill" class="form-control"
                                                v-on:change="changeLogistic()" v-model="selectedLogistic">
                                            <option value="Select Logistic" disabled="" selected="">
                                                Select logistic
                                            </option>
                                            <option v-for="item of listLogistic" v-bind:value="item">{{item}}</option>
                                        </select>
                                    </div>
                                    <div class="col-sm-1">
                                        <button type="submit" class="btn btn-effect-ripple btn-primary" v-on:click="search()">Search</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <div class="panel ">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                            <i class="fa fa-fw ti-harddrives"></i> Pending Data
                        </h3>
                        <span class="pull-right">
                            <i class="fa fa-fw ti-angle-up clickable"></i>
                            <!--<i class="fa fa-fw ti-close removepanel clickable"></i>-->
                        </span>
                    </div>
                    <div class="panel-body">
                        <div class="panel-body table-responsive">
                            <table class="table table-striped table-bordered table_width" >
                                <thead>
                                <tr>
                                    <th>Month</th>
                                    <th>Year</th>
                                    <th>Jumlah Tagihan</th>
                                    <th>Logistic</th>
                                    <th>Status</th>
                                    <th>Last Modified</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr v-for="post of posts" v-on:click="goToInvoice(post.id)">
                                    <td>{{post.month | filtermonth}}</td>
                                    <td>{{post.year}}</td>
                                    <td>{{post.tagihan | currency}}</td>
                                    <td>{{post.logisticName}}</td>
                                    <td>{{post.statusInvoice}}</td>
                                    <td>{{post.lastModified }}</td>
                                </tr>
                                </tbody>
                            </table>
                            <div class="pull-right" v-if="totalPage>0">
                                <ul class="pagination">
                                    <li v-on:click="toPageOne()" v-if="prevpage>1"><a class="noselect">1</a></li>
                                    <li class="disabled" v-if="checkedPrevPageEllipsis()"><a>...</a></li>
                                    <li><a v-on:click="toPrevPage()" v-if="prevpage<page">{{prevpage+1}}</a></li>
                                    <li class="active"><a>{{page+1}}</a></li>
                                    <li><a v-on:click="toNextPage()" v-if="checkedNextPage()">{{nextpage+1}}</a></li>
                                    <li class="disabled" v-if="checkedNextPageEllipsis()"><a>...</a></li>
                                    <li><a v-on:click="toLastPage()" v-if="page<nextpage">{{totalPage}}</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!--main content ends-->
    </div>
</template>
<script>
    import fileinput from "../vendors/bootstrap-fileinput/js/fileinput.min.js"
    import localforage from 'localforage'
    import {upload} from './file-upload.service.js'
    import axios from 'axios'
    import dt from "datatables.net"
    import datatables_bootstrap from "datatables.net-bs/js/dataTables.bootstrap.js"
    import moment from 'moment'

    require("datatables.net-bs/css/dataTables.bootstrap.css");

    const STATUS_INITIAL = 0
    const STATUS_SAVING = 1
    const STATUS_SUCCESS = 2
    const STATUS_FAILED = 3
    const formData = new window.FormData()
    export default {
        name: "datatables",
        data: () => ({
                posts: [],
                currentStatus: null,
                uploadFieldName: 'invoiceFile',
                selectedStatus: 'Select Status',
                selectedLogistic: 'Select Logistic',
                invoice: null,
                listStatus: [],
                listLogistic: [],
                page: 0,
                size: 10,
                nextpage: 1,
                prevpage: 0,
                totalPage: 0,
                setPage:0,
				parts: ''
            }
        ),
        mounted: function () {
            "use strict";
            $(".content .row").find('input').iCheck({
                checkboxClass: 'icheckbox_square-blue',
                radioClass: 'iradio_square-blue',
                increaseArea: '20%' // optional
            });
            $("#input-43").fileinput({
                browseClass: "btn btn-info",
                showPreview: false,
                allowedFileExtensions: ["zip", "rar", "gz", "tgz"],
                elErrorContainer: "#errorBlock43"
                // you can configure `msgErrorClass` and `msgInvalidFileExtension` as well
            });
            $("#input-42").fileinput({
                browseClass: "btn btn-warning",
                maxFilesNum: 10,
                allowedFileExtensions: ["jpg", "gif", "png", "txt"]
            });
            $("#input-41").fileinput({
                browseClass: "btn btn-danger",
                maxFileCount: 10,
                allowedFileTypes: ["image", "video"]
            });
            $("#input-40,#input-22").fileinput("enable");
            $(".btn-modify").on("click", function () {

                var $btn = $(this);
                if ($btn.text() == "Modify") {
                    $("#input-40").fileinput("disable");
                    $btn.html("Revert");
                    alert("Hurray! I have disabled the input and hidden the upload button.");
                } else {
                    $("#input-40").fileinput("enable");
                    $btn.html("Modify");
                    alert("Hurray! I have reverted back the input to enabled with the upload button.");
                }
            });
            $("#input-23").fileinput({
                browseClass: "btn btn-default",
                showUpload: false,
                mainTemplate: "{preview}\n" +
                "<div class='input-group {class}'>\n" +
                "   <div class='input-group-btn'>\n" +
                "       {browse}\n" +
                "       {upload}\n" +
                "       {remove}\n" +
                "   </div>\n" +
                "   {caption}\n" +
                "</div>"
            });
            $("#input-21").fileinput({
                previewFileType: "image",
                browseClass: "btn btn-success",
                browseLabel: " Pick Image",
                browseIcon: '<i class="glyphicon glyphicon-picture"></i>',
                removeClass: "btn btn-danger",
                removeLabel: "Delete",
                removeIcon: '<i class="glyphicon glyphicon-trash"></i>',
                uploadClass: "btn btn-info",
                uploadLabel: " Upload",
                uploadIcon: '<i class="glyphicon glyphicon-upload"></i>',
            });
            $("#input-20").fileinput({
                browseClass: "btn btn-info btn-block",
                showCaption: false,
                showRemove: false,
                showUpload: false
            });
            $("#input-4").fileinput({
                browseClass: "btn btn-success",
                showCaption: false
            });
            $("#input-5").fileinput({
                browseClass: "btn btn-warning",
                showUpload: false,
                maxFileCount: 10,
                mainClass: "input-group-lg"
            });
        },
        destroyed: function () {
        },
        filters: {
            currency: function (value) {
                return 'Rp. ' + value.toString().replace(/,/g, "").replace(/\B(?=(\d{3})+(?!\d))/g, ",")
            },
            filtermonth: function (value) {
                if(value==1)
                {
                    return 'Januari'
                }
                else if(value==2)
                {
                    return 'Februari'
                }
                else if(value==3)
                {
                    return 'Maret'
                }
                else if(value==4)
                {
                    return 'April'
                }
                else if(value==5)
                {
                    return 'Mei'
                }
                else if(value==6)
                {
                    return 'Juni'
                }
                else if(value==7)
                {
                    return 'Juli'
                }
                else if(value==8)
                {
                    return 'Agustus'
                }
                else if(value==9)
                {
                    return 'September'
                }
                else if(value==10)
                {
                    return 'Oktober'
                }
                else if(value==11)
                {
                    return 'November'
                }
                else if(value==12)
                {
                    return 'Desember'
                }
            }
        },
        methods: {
		getCookie(name){
				var value="; "+document.cookie;
				this.parts=value.split("; "+name+"=");
				if(this.parts.length==2)
				this.parts=this.parts.pop().split(";");
			},
            goToInvoice(id){
                window.location.href = '/#/invoicepage/'+id
            },
            toPageOne(){
                this.setPage=0
                this.fetchInvoices()
            },
            toLastPage(){
                this.setPage=this.totalPage-1
                this.fetchInvoices()
            },
            toPrevPage(){
                this.setPage=this.prevpage;
                this.fetchInvoices()
            },
            toNextPage(){
                this.setPage=this.nextpage;
                this.fetchInvoices()
            },
            checkedNextPageEllipsis(){
                return this.nextpage+2!=this.totalPage && this.nextpage+1!=this.totalPage
            },
            checkedNextPage(){
                return this.nextpage+1!=this.totalPage && this.nextpage>this.page
            },
            checkedPrevPageEllipsis(){
                return this.prevpage!=0 && this.prevpage-1!=0
            },
            fetchPageable() {
			this.getCookie('access_token')
                axios.get(`http://127.0.0.1:8091/api/invoice/page`)
                    .then(response => {
                        // JSON responses are automatically parsed.
                        this.page = response.data.page
                        this.totalPage = response.data.total_page
                        this.nextpage=this.page
                        this.prevpage=this.page
                        if(this.nextpage+1<this.totalPage) {
                            this.nextpage = this.nextpage + 1
                        }
                        if(this.prevpage-1>=0) {
                            this.prevpage = this.prevpage - 1
                        }
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            },
            fetchInvoices() {
			this.getCookie('access_token')
                axios.get(`http://127.0.0.1:8091/api/invoice/pageable`+'?page='+ this.setPage+'&size='+this.size+'&access_token='+this.parts)
                    .then(response => {
                        // JSON responses are automatically parsed.
                        this.posts = response.data.content
                        this.getLogisticSelectList()
                        this.fetchPageable()
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            },
            fetchUsers() {
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/uploadHistory?access_token='+this.parts)
                    .then(response => {
                        // JSON responses are automatically parsed.
                        this.posts = response.data
                        this.getLogisticSelectList()
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            },
            changeStatus () {
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/invoice/filterStatus/' + this.selectedStatus+'?access_token='+this.parts)
                    .then(response => {
                        // JSON responses are automatically parsed.
                        this.posts = response.data
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            },
            changeLogistic () {
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/invoice/filterLogistic/' + this.selectedLogistic+'?access_token='+this.parts)
                    .then(response => {
                        // JSON responses are automatically parsed.
                        this.posts = response.data
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            },
            search () {
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/invoice/filter/' + this.selectedStatus + '/' +this.selectedLogistic+'?access_token='+this.parts)
                    .then(response => {
                        // JSON responses are automatically parsed.
                        this.posts = response.data
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            },
            getLogisticSelectList(){
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/logistic/list?access_token='+this.parts)
                    .then(response => {
                        // JSON responses are automatically parsed.
                        this.listLogistic = response.data
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            }
        },
        ready() {
            this.fetchUsers();
        },
        computed: {
            isInitial () {
                return this.currentStatus === STATUS_INITIAL
            },
            isSaving () {
                return this.currentStatus === STATUS_SAVING
            },
            isSuccess () {
                return this.currentStatus === STATUS_SUCCESS
            },
            isFailed () {
                return this.currentStatus === STATUS_FAILED
            }
        },
        mounted () {
            $(document).ready(function () {
                setTimeout(function () {
                    $('#sample_1').dataTable({
                        "responsive": true
                    });
                    var table = $('#example').DataTable({
                        "responsive": true
                    });
                    $('button.toggle-vis').on('click', function (e) {
                        e.preventDefault();
                        // Get the column API object
                        var column = table.column($(this).attr('data-column'));
                        // Toggle the visibility
                        column.visible(!column.visible());
                    });
                }, 400);
            });
            this.fetchInvoices()
            selectedStatus: 'Select Status'
            selectedLogistic: 'Select Logistic'
        }
    }
</script>
<style src="../vendors/bootstrap-fileinput/css/fileinput.min.css"></style>
<style src="../assets/css/formelements.css"></style>
