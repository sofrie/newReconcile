<template>
    <div>
        <div class="row">
            <div class="col-md-12">
                <div>
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="form-horizontal">
                                <div class="form-group">
                                    <div class="col-sm-1">
                                        <button type="submit" class="btn btn-effect-ripple btn-primary" data-toggle="modal" data-target="#form_modal">
                                            Add Logistic
                                        </button>
                                        <div id="form_modal" class="modal fade animated" role="dialog">
                                            <div class="modal-dialog">
                                                <div class="modal-content">
                                                    <div class="modal-header">
                                                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                        <h4 class="modal-title">Upload Invoice</h4>
                                                    </div>
                                                    <form role="form">
                                                        <div class="modal-body">
                                                            <div class="row m-t-10 form-group">
                                                                <label for="input-text" class="col-sm-3 control-label">Logistic Name : </label>
                                                                <div class="col-sm-9">
                                                                    <input type="text" placeholder="Logistic Name" class="form-control" v-model="AwbNumber" >
                                                                </div>
                                                            </div>
                                                            <div class="row m-t-10 form-group">
                                                                <label for="input-text" class="col-sm-3 control-label">Status : </label>
                                                                <div class="col-sm-9">
                                                                    <select id="select-gear" v-model="selectedStatus" class="form-control">
                                                                        <option value="Select Status" disabled="" selected="">
                                                                            Select status
                                                                        </option>
                                                                        <option value="Active">Active</option>
                                                                        <option value="Inactive">Inactive</option>
                                                                    </select>
                                                                </div>
                                                            </div>
                                                            <div class="row m-t-10 form-group">
                                                                <label for="input-text" class="col-sm-3 control-label">Discount : </label>
                                                                <div class="col-sm-9">
                                                                    <input type="text" placeholder="Discount" class="form-control" v-model="Discount" >
                                                                </div>
                                                            </div>
                                                            <div class="row m-t-10 form-group">
                                                                <label for="input-text" class="col-sm-3 control-label">VAT : </label>
                                                                <div class="col-sm-9">
                                                                    <input type="text" placeholder="VAT" class="form-control" v-model="VAT" >
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="modal-footer">
                                                            <button type="submit" class="btn btn-succes" v-on:click="createLogistic()" data-dismiss="modal">Submit</button>
                                                            <button type="reset" class="btn btn-default">Reset</button>
                                                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                                        </div>
                                                    </form>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
									 <div class="col-sm-2  pull-right">
                                        <select v-model="filteredStatus" class="form-control pull-right" v-on:change="changeStatus()">
											<option value="Select Status" disabled="" selected="">
                                                Select Status
                                            </option>
                                            <option value="All">All</option>
                                            <option value="Active">Active</option>
                                            <option value="Inactive">Inactive</option>
											
                                        </select>
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
                            <i class="fa fa-fw ti-menu-alt"></i> List Logistic
                        </h3>
                        <span class="pull-right">
                            <i class="fa fa-fw ti-angle-up clickable"></i>
                            <!--<i class="fa fa-fw ti-close removepanel clickable"></i>-->
                        </span>
                    </div>
                    <div class="panel-body">
                        <div class="panel-body table-responsive">
                            <table class="table table-striped table-bordered table_width" id="example">
                                <thead>
                                    <tr>
                                        <th>Logistic Name</th>
                                        <th>Status</th>
                                        <th>Discount</th>
                                        <th>VAT</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr v-for="post of posts" data-toggle="modal" data-target="#basic_modal" v-on:click="openModal(post)">
                                        <td v-on:click="sayConsole(post.id)">{{post.logisticName}}</td>
                                        <td>{{post.status}}</td>
                                        <td>{{post.discount}}%</td>
                                        <td>{{post.vat}}%</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
		<div id="basic_modal" class="modal fade animated" role="dialog">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">{{logistic.logisticName}}</h4>
					</div>
					<div class="modal-body">
						<div class="row m-t-10 col-md-12">
                            <label class="col-md-4 text-right">
								Logistic Name
							</label>
							<div class="col-md-8">
								: {{logistic.logisticName}}
							</div>
                        </div>
						<div class="row m-t-10 col-md-12">
                            <label class="col-md-4 text-right">
								Status
							</label>
							<div class="col-md-8">
								: {{logistic.status}}
							</div>
                        </div>
						<div class="row m-t-10 col-md-12">
                            <label class="col-md-4 text-right">
								Discount
							</label>
							<div class="col-md-8">
								: {{logistic.discount}}
							</div>
                        </div>
						<div class="row m-t-10 col-md-12">
                            <label class="col-md-4 text-right">
								VAT
							</label>
							<div class="col-md-8">
								: {{logistic.vat}}
							</div>
                        </div>
						<div class="row m-t-10"></div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<button type="button" v-if="logistic.status==='Active'" v-on:click="Inactivate(logistic)" class="btn btn-danger">Inactive</button>
						<button type="button" v-if="logistic.status==='Inactive'" v-on:click="Activate(logistic)" class="btn btn-success">Activate</button>
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
    import { upload } from './file-upload.service.js'
    import axios from 'axios'
    import dt from "datatables.net";
    import datatables_bootstrap from "datatables.net-bs/js/dataTables.bootstrap.js";
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
            uploadedFiles: [],
            uploadError: null,
            currentStatus: null,
            uploadFieldName: 'invoiceFile',
            selectedStatus: 'Select Status',
            AwbNumber: '',
            Discount: '',
            VAT: '',
			logistic: [],
			filteredStatus: 'Select Status'
        }
        ),
        mounted: function() {
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
            $(".btn-modify").on("click", function() {
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
        destroyed: function() {
        },
        methods: {
            createLogistic () {
                axios.post(`http://127.0.0.1:8091/api/logistics`, {
                  logisticCode: 'haha',
                  logisticName: this.AwbNumber,
                  status: this.selectedStatus,
                  discount: this.Discount,
                  vat: this.VAT
              })
                setTimeout(this.fetchLogistics, 7000);
            },
            fetchLogistics() {
                axios.get(`http://127.0.0.1:8091/api/logistics`)
                .then(response => {
                  // JSON responses are automatically parsed.
                  this.posts = response.data
              })
                .catch(e => {
                  this.errors.push(e)
              })
            },
            reset () {
                // reset form to initial state
                this.currentStatus = STATUS_INITIAL
                this.uploadedFiles = []
                this.uploadError = null
            },
			openModal(obj){
				this.logistic=obj
			},
            Inactivate(log) {
                axios.get(`http://127.0.0.1:8091/api/logistics/inactive/`+log.id)
                .then(response => {
                  // JSON responses are automatically parsed.
              })
                .catch(e => {
                  this.errors.push(e)
              })
			  setTimeout(this.fetchLogistics, 400);
			  $('#basic_modal').modal('hide');
            },
            Activate(log) {
                axios.get(`http://127.0.0.1:8091/api/logistics/active/`+log.id)
                .then(response => {
                  // JSON responses are automatically parsed.
              })
                .catch(e => {
                  this.errors.push(e)
              })
			  setTimeout(this.fetchLogistics, 400);
			  $('#basic_modal').modal('hide');
            },
            changeStatus () {
                axios.get('http://127.0.0.1:8091/api/logistics/' + this.filteredStatus)
                    .then(response => {
                        // JSON responses are automatically parsed.
                        this.posts = response.data
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            }
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
            $(document).ready(function() {
                setTimeout(function(){
                    $('#sample_1').dataTable({
                        "responsive": true
                    });
                    var table = $('#example').DataTable({
                        "responsive": true
                    });
                    $('button.toggle-vis').on('click', function(e) {
                        e.preventDefault();
                        // Get the column API object
                        var column = table.column($(this).attr('data-column'));
                        // Toggle the visibility
                        column.visible(!column.visible());
                    });
                },500);
            });
            this.fetchLogistics()
			selectedStatus: 'Select Status'
			filteredStatus: 'Select Status'
        }
    }
</script>
<style src="../vendors/bootstrap-fileinput/css/fileinput.min.css"></style>
<style src="../assets/css/formelements.css"></style>
<style>
    .tablemodal {
        margin-left: 15%;
    }
    .toleft {
        margin-left: 40%;
    }
    .one {
        margin-left: 5px;
    }
</style>