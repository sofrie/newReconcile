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
										Month :
									</label>
									<div class="col-sm-2">
										<select class="form-control" v-on:change="setInit('month')" v-model="selectedMonth">
											<option value="Select Month" disabled="" selected="">
												Select Month
											</option>
											<!--<option v-for="item of listMonth" v-bind:value="item">{{item}}</option>-->
											<option value=1>January</option>
											<option value=2>February</option>
											<option value=3>Maret</option>
											<option value=4>April</option>
											<option value=5>Mei</option>
											<option value=6>Juni</option>
											<option value=7>Juli</option>
											<option value=8>Agustus</option>
											<option value=9>September</option>
											<option value=10>Oktober</option>
											<option value=11>November</option>
											<option value=12>Desember</option>
										</select>
									</div>
									<label class="col-sm-1 control-label">
										Logistic :
									</label>
									<div class="col-sm-2">
										<select class="form-control" v-on:change="setInit('logistic')" v-model="selectedLogistic">
											<option disabled selected value="Select Logistic">Select Logistic</option>
											<option v-for="item of listLogistic" v-bind:value="item">{{item}}</option>
										</select>
									</div>
									<label class="col-sm-2 control-label" for="skill">
										AWB :
									</label>
									<div class="col-sm-2">
										<input type="text" placeholder="AWB Number" class="form-control" v-model="AwbNumber" v-on:change="setInit('awb')">
									</div>
									<label class="col-sm-1 control-label" for="skill">
										GDN Ref :</label>
									<div class="col-sm-1">
										<input type="text" placeholder="GDN Ref" class="form-control" v-model="gdnRef" v-on:change="setInit('gdnref')">
									</div>
								</div>
							</div>
							<div class="form-horizontal">
								<div class="form-group">
									<label class="col-sm-1 control-label" for="skill">
										Year :
									</label>
									<div class="col-sm-2">
										<select id="skill" name="skill" class="form-control" v-on:change="setInit('year')" v-model="selectedYear">
											<option value="Select Year" disabled="" selected="">
												Select year
											</option>
											<option v-for="item of listYear" v-bind:value="item">{{item}}</option>
										</select>
									</div>
									<label class="col-sm-1 control-label" for="skill">
										Status :
									</label>
									<div class="col-sm-2">
										<select class="form-control" v-on:change="setInit('status')" v-model="selectedStatus">
											<option disabled selected value="Select Status">
												Select status
											</option>
											<option value="All">All</option>
											<option value="Uploaded">Uploaded</option>
											<option value="Done">Done</option>
										</select>
									</div>
									<label class="col-sm-2 control-label" for="skill">
										Merchant Code :
									</label>
									<div class="col-sm-2">
										<input type="text" placeholder="Merchant Code" class="form-control" v-model="MerchantCode" v-on:change="setInit('merchantcode')">
									</div>
									<div class="col-sm-2">
										<a class="btn btn-effect-ripple btn-primary" v-on:click="setInit('full')">Search</a>
										<a class="btn btn-effect-ripple btn-primary" v-on:click="clearFilter()">Clear</a>
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
							<i class="fa fa-fw ti-menu-alt"></i> List AWB  {{order}} {{sortby}} {{filter}}
						</h3>
						<span class="pull-right">
                            <i class="fa fa-fw ti-angle-up clickable"></i>
							<!--<i class="fa fa-fw ti-close removepanel clickable"></i>-->
                        </span>
					</div>
					<div class="panel-body">
						<div class="panel-body table-responsive">
							<table class="table table-striped table-bordered table_width">
								<thead>
								<tr>
									<th>Month</th>
									<th>Year</th>
									<th>Logistic</th>
									<th v-on:click="sortInit('awb')">AWB <i class="ti ti-exchange-vertical pull-right"></i></th>
									<th v-on:click="sortInit('status')">Recon Status <i class="ti ti-exchange-vertical pull-right"></i></th>
									<th>Merchant Code</th>
									<th v-on:click="sortInit('gdnref')">GDN Ref <i class="ti ti-exchange-vertical pull-right"></i></th>
								</tr>
								</thead>
								<tbody>
								<tr v-for="post of posts" data-toggle="modal" data-target="#form_modal" v-on:click="openModal(post)">
									<td>{{post.month | filtermonth}}</td>
									<td>{{post.year}}</td>
									<td>{{post.logisticName}}</td>
									<td>{{post.awbNumber}}</td>
									<td>{{post.reconStatus}}</td>
									<td>{{post.merchantCode}}</td>
									<td>{{post.gdnRef}}</td>
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
							<div id="form_modal" class="modal fade animated" role="dialog">
								<div class="modal-dialog modal-lg">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal">&times;</button>
											<h4 class="modal-title">{{title}}</h4>
										</div>
										<form role="form">
											<div class="modal-body">
												<div class="row m-t-10 col-md-12">
													<div class="col-md-4">
														<b>Reconciliation Data</b>
													</div>
													<div class="col-md-4">
														<span class="col-md-12"><b>Blibli Data</b></span>
													</div>
													<div class="col-md-4">
														<span class="col-md-12"><b>3PL Data</b></span>
													</div>
													<hr/>
												</div>
												<div class="row m-t-10 col-md-12">
													<div class="col-md-4">
														<div class="col-md-7">Failure Reason</div>
														<div class="col-md-5">: {{awb.failure}}</div>
														<div class="col-md-7">Merchant Code</div>
														<div class="col-md-5">: {{awb.merchantCode}}</div>
														<div class="col-md-7">Merchant Name</div>
														<div class="col-md-5">: {{awb.merchantName}}</div>
														<div class="col-md-7">Original Shipping Cost</div>
														<div class="col-md-5">: {{awb.focsAmount}}</div>
														<div class="col-md-7">Adjusment Shipping Cost</div>
														<div class="col-md-5">: {{awb.focsaAmount}}</div>
														<div class="col-md-7">Notes</div>
														<div class="col-md-5">: {{awb.notes}}</div>
													</div>
													<div class="col-md-4">
														<div class="col-md-5">Sender Name</div>
														<div class="col-md-7">: {{awb.namaPengirimAPI}}</div>
														<div class="col-md-5">Sender Address</div>
														<div class="col-md-7">: {{awb.alamatPengirimAPI}}</div>
														<div class="col-md-5">Origin Code</div>
														<div class="col-md-7">: {{awb.kodeOriginAPI}}</div>
														<div class="col-md-5">Receiver Name</div>
														<div class="col-md-7">: {{awb.namaPenerimaAPI}}</div>
														<div class="col-md-5">Receiver Address</div>
														<div class="col-md-7">: {{awb.alamatPenerimaAPI}}</div>
														<div class="col-md-5">Destination Code</div>
														<div class="col-md-7">: {{awb.kodeDestinasiAPI}}</div>
													</div>
													<div class="col-md-4">
														<div class="col-md-5">Sender Name</div>
														<div class="col-md-7">: {{awb.namaPengirimSystem}}</div>
														<div class="col-md-5">Sender Address</div>
														<div class="col-md-7">: {{awb.alamatPengirimSystem}}</div>
														<div class="col-md-5">Origin Code</div>
														<div class="col-md-7">: {{awb.kodeOriginSystem}}</div>
														<div class="col-md-5">Receiver Name</div>
														<div class="col-md-7">: {{awb.namaPenerimaSystem}}</div>
														<div class="col-md-5">Receiver Address</div>
														<div class="col-md-7">: {{awb.alamatPenerimaSystem}}</div>
														<div class="col-md-5">Destination Code</div>
														<div class="col-md-7">: {{awb.kodeDestinasiSystem}}</div>
													</div>
												</div>
												<div class="row m-t-10 col-md-12">
													<span class="col-md-12"><hr/></span>
													<span class="col-md-12"><h3>Charge Summary</b></h3></span>
													<span class="col-md-12"><hr/></span>
													<div class="table-responsive col-md-12">
														<table class="table" id="table1">
															<thead>
															<tr>
																<th></th>
																<th>Weight</th>
																<th>Price/Kg</th>
																<th>Other Charge</th>
																<th>Gift Wrap Charge</th>
																<th>Insurance Charge</th>
																<th>Total Charge</th>
															</tr>
															</thead>
															<tbody>
															<tr>
																<th>System</th>
																<td>{{awb.weightSystem}}</td>
																<td>{{awb.priceSystem}}</td>
																<td>{{awb.otherChargeSystem}}</td>
																<td>{{awb.giftWrapChargeSystem}}</td>
																<td>{{awb.insuranceChargeSystem}}</td>
																<td>{{awb.totalChargeSystem}}</td>
															</tr>
															<tr>
																<th>Logistic</th>
																<td>{{awb.weightLogistic}}</td>
																<td>{{awb.priceLogistic}}</td>
																<td>{{awb.otherChargeLogistic}}</td>
																<td>{{awb.giftWrapChargeLogistic}}</td>
																<td>{{awb.insuranceChargeLogistic}}</td>
																<td>{{awb.totalChargeLogistic}}</td>
															</tr>
															<tr>
																<th>Applied</th>
																<td>{{awb.weightApplied}}</td>
																<td>{{awb.priceApplied}}</td>
																<td>{{awb.otherChargeApplied}}</td>
																<td>{{awb.giftWrapChargeApplied}}</td>
																<td>{{awb.insuranceChargeApplied}}</td>
																<td>{{awb.totalChargeApplied}}</td>
															</tr>
															<tr>
																<th>Comment</th>
																<td>{{awb.weightComment}}</td>
																<td>{{awb.priceComment}}</td>
																<td>{{awb.otherChargeComment}}</td>
																<td>{{awb.giftWrapChargeComment}}</td>
																<td>{{awb.insuranceChargeComment}}</td>
																<td>{{awb.totalChargeComment}}</td>
															</tr>
															</tbody>
														</table>
													</div>
												</div>
												<div class="row m-t-10">

												</div>
											</div>
											<div class="modal-footer">
												<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
											</div>
										</form>
									</div>
								</div>
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
        props: {
            month: {
                type: String,
                default: 'Vue!'
            },
            year: {
                type: String,
                default: 'Vue!'
            },
            logistic: {
                type: String,
                default: 'Vue!'
            }
        },
        data: () => ({
            posts: [],
            uploadedFiles: [],
            uploadError: null,
            currentStatus: null,
            uploadFieldName: 'invoiceFile',
            selectedMonth: 'Select Month',
            selectedLogistic: 'Select Logistic',
            selectedYear: 'Select Year',
            selectedStatus: 'Select Status',
            MerchantCode: '',
            AwbNumber: '',
            gdnRef: '',
            test: '',
            title: '',
            awb: [],
            cek: '',
            listLogistic: [],
            listYear: [],
            listMonth: [],
            page: 0,
            size: 10,
            nextpage: 1,
            prevpage: 0,
            totalPage: 0,
            Pages: [],
            filter: 'none',
            setPage:0,
            order:'asc',
            sortby:'none',
			parts: ''
        }),
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
            this.fetchAll()
        },
        destroyed: function() {
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
            findAllSortAWB(){
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/awb/sort/'+this.sortby+'/' + this.order+'?page='+ this.setPage+'&size='+this.size+'&access_token='+this.parts)
                    .then(response => {
                        // JSON responses are automatically parsed.
                        this.posts = response.data.content
                        this.fetchPages()
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            },
            findMonthSortAWB(){
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/awb/filtermonth/'+this.selectedMonth+'/sort/' +this.sortby+'/' + this.order+'?page='+ this.setPage+'&size='+this.size+'&access_token='+this.parts)
                    .then(response => {
                        // JSON responses are automatically parsed.
                        this.posts = response.data.content
                        this.fetchPages()
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            },
            findYearSortAWB(){
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/awb/filteryear/'+this.selectedYear+'/sort/' +this.sortby+'/' + this.order+'?page='+ this.setPage+'&size='+this.size+'&access_token='+this.parts)
                    .then(response => {
                        // JSON responses are automatically parsed.
                        this.posts = response.data.content
                        this.fetchPages()
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            },
            findLogisticSortAWB(){
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/awb/filterlogistic/'+this.selectedLogistic+'/sort/' +this.sortby+'/' + this.order+'?page='+ this.setPage+'&size='+this.size+'&access_token='+this.parts)
                    .then(response => {
                        // JSON responses are automatically parsed.
                        this.posts = response.data.content
                        this.fetchPages()
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            },
            findStatusSortAWB(){
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/awb/filterstatus/'+this.selectedStatus+'/sort/' +this.sortby+'/' + this.order+'?page='+ this.setPage+'&size='+this.size+'&access_token='+this.parts)
                    .then(response => {
                        // JSON responses are automatically parsed.
                        this.posts = response.data.content
                        this.fetchPages()
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            },
            findAwbNumberSortAWB(){
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/awb/filterawb/'+this.AwbNumber+'/sort/' +this.sortby+'/' + this.order+'?access_token='+this.parts)
                    .then(response => {
                        // JSON responses are automatically parsed.
                        this.posts = response.data
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            },
            findMerchantCodeSortAWB(){
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/awb/filtermerchant/'+this.MerchantCode+'/sort/' +this.sortby+'/' + this.order+'?page='+ this.setPage+'&size='+this.size+'&access_token='+this.parts)
                    .then(response => {
                        // JSON responses are automatically parsed.
                        this.posts = response.data.content
                        this.fetchPages()
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            },
            findGdnRefSortAWB(){
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/awb/filterGdnRef/'+this.gdnRef+'/sort/' +this.sortby+'/' + this.order+'?page='+ this.setPage+'&size='+this.size+'&access_token='+this.parts)
                    .then(response => {
                        // JSON responses are automatically parsed.
                        this.posts = response.data.content
                        this.fetchPages()
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            },
            filterAllSortAWB(){
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/awb/filter/' + this.selectedMonth + '/' + this.selectedYear + '/' + this.selectedLogistic + '/' + this.AwbNumber + '/' + this.selectedStatus + '/' + this.MerchantCode + '/' + this.gdnRef+'/sort/' +this.sortby+'/' + this.order+'?page='+ this.setPage+'&size='+this.size+'&access_token='+this.parts)
                    .then(response => {
                        // JSON responses are automatically parsed.
                        this.posts = response.data.content
                        this.fetchPages()
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            },
            filterInvoiceSortAWB(){
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/awb/filterinvoice/' + this.selectedMonth + '/' + this.selectedYear + '/' + this.logistic+'/sort/' +this.sortby+'/' + this.order+'?page='+ this.setPage+'&size='+this.size+'&access_token='+this.parts)
                    .then(response => {
                        // JSON responses are automatically parsed.

                        this.posts = response.data.content
                        this.fetchPages()
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            },
            changeOrder(){
                if(this.order==='asc'){
                    this.order='desc'
                }
                else{
                    this.order='asc'
                }
            },
            sortFilter(){
                if(this.filter==='none'){
                    this.findAllSortAWB()
                }
                else if(this.filter==='month'){
                    this.findMonthSortAWB()
                }
                else if(this.filter==='year'){
                    this.findYearSortAWB()
                }
                else if(this.filter==='logistic'){
                    this.findLogisticSortAWB()
                }
                else if(this.filter==='status'){
                    this.findStatusSortAWB()
                }
                else if(this.filter==='awb'){
                    this.findAwbNumberSortAWB()
                }
                else if(this.filter==='merchantcode'){
                    this.findMerchantCodeSortAWB()
                }
                else if(this.filter==='gdnref'){
                    this.findGdnRefSortAWB()
                }
                else if(this.filter==='full'){
                    this.filterAllSortAWB()
                }
                else if(this.filter==='invoice'){
                    this.filterInvoiceSortAWB()
                }
            },
            paginationFilter(){
                if(this.sortby==='none'){
                    if(this.filter==='none'){
                        this.fetchAll()
                    }
                    else if(this.filter==='month'){
                        this.changeMonth()
                    }
                    else if(this.filter==='year'){
                        this.changeYear()
                    }
                    else if(this.filter==='logistic'){
                        this.changeLogistic()
                    }
                    else if(this.filter==='status'){
                        this.changeStatus()
                    }
                    else if(this.filter==='awb'){
                        this.changeAwbNumber()
                    }
                    else if(this.filter==='merchantcode'){
                        this.changeMerchantCode()
                    }
                    else if(this.filter==='gdnref'){
                        this.changeGdnRef()
                    }
                    else if(this.filter==='full'){
                        this.filterAll()
                    }
                    else if(this.filter==='invoice'){
                        this.filterByInvoice()
                    }
                }
                else{
                    this.sortFilter()
                }
            },
            toPageOne(){
                this.setPage=0
                this.paginationFilter()
            },
            toLastPage(){
                this.setPage=this.totalPage-1
                this.paginationFilter()
            },
            toPrevPage(){
                this.setPage=this.prevpage;
                this.paginationFilter()
            },
            toNextPage(){
                this.setPage=this.nextpage;
                this.paginationFilter()
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
            setInit(filterNow){
                this.filter=filterNow
                this.setPage=0
                this.paginationFilter()
            },
            sortInit(sortByNow){
                if(this.sortby===sortByNow){
                    this.changeOrder()
                }
                else{
                    this.order='asc'
                }
                this.sortby=sortByNow
                this.setPage=0
                this.paginationFilter()
            },
            changeStatus () {
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/awb/filterstatus/' + this.selectedStatus+'?page='+ this.setPage+'&size='+this.size+'&access_token='+this.parts)
                    .then(response => {
                        // JSON responses are automatically parsed.
                        this.posts = response.data.content
                        this.fetchPages()
                        this.filter='status'
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            },
            changeMonth () {
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/awb/filtermonth/' + this.selectedMonth+'?page='+ this.setPage+'&size='+this.size+'&access_token='+this.parts)
                    .then(response => {
                        // JSON responses are automatically parsed.
                        this.posts = response.data.content
                        this.fetchPages()
//this.filter='month'
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            },
            changeYear () {
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/awb/filteryear/' + this.selectedYear+'?page='+ this.setPage+'&size='+this.size+'&access_token='+this.parts)
                    .then(response => {
                        // JSON responses are automatically parsed.
                        this.posts = response.data.content
                        this.fetchPages()
//this.filter='year'
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            },
            changeLogistic () {
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/awb/filterlogisticName/' + this.selectedLogistic+'?page='+ this.setPage+'&size='+this.size+'&access_token='+this.parts)
                    .then(response => {
                        // JSON responses are automatically parsed.
                        this.posts = response.data.content
                        this.fetchPages()
//this.filter='logistic'
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            },
            changeAwbNumber () {
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/awb/filterAwbNumber/' + this.AwbNumber+'?access_token='+this.parts)
                    .then(response => {
                        // JSON responses are automatically parsed.
                        this.posts = response.data
                        this.nextpage=0
                        this.prevpage=0
                        this.page=0
                        this.totalPage=1
                        this.filter='awb'
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            },
            changeMerchantCode () {
                if(this.MerchantCode===''){
                    this.fetchAll()
                }
                else{
				this.getCookie('access_token')
                    axios.get('http://127.0.0.1:8091/api/awb/filterMerchantCode/' + this.MerchantCode+'?page='+ this.setPage+'&size='+this.size+'&access_token='+this.parts)
                        .then(response => {
// JSON responses are automatically parsed.
                            this.posts = response.data.content
                            this.fetchPages()
//this.filter='merchantcode'
                        })
                        .catch(e => {
                            this.errors.push(e)
                        })
                }

            },
            changeGdnRef () {
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/awb/filterGdnRef/' + this.gdnRef+'?page='+ this.setPage+'&size='+this.size+'&access_token='+this.parts)
                    .then(response => {
                        // JSON responses are automatically parsed.
                        this.posts = response.data.content
                        this.fetchPages()
//this.filter='gdnref'
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            },
            filterAll () {
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/awb/filter/' + this.selectedMonth + '/' + this.selectedYear + '/' + this.selectedLogistic + '/' + this.AwbNumber + '/' + this.selectedStatus + '/' + this.MerchantCode + '/' + this.gdnRef+'?page='+ this.setPage+'&size='+this.size+'&access_token='+this.parts)
                    .then(response => {
                        // JSON responses are automatically parsed.
                        this.posts = response.data.content
                        this.fetchPages()
//this.filter='full'
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            },
            clearFilter(){
                this.setPage=0
                this.selectedLogistic='Select Logistic'
                this.selectedMonth='Select Month'
                this.selectedStatus='Select Status'
                this.selectedYear='Select Year'
                this.AwbNumber=''
                this.MerchantCode=''
                this.gdnRef=''
                this.fetchAll()
            },
            filterByInvoice () {
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/awb/filterinvoice/' + this.selectedMonth + '/' + this.selectedYear + '/' + this.logistic+'?page='+ this.setPage+'&size='+this.size+'&access_token='+this.parts)
                    .then(response => {
                        // JSON responses are automatically parsed.

                        this.posts = response.data.content
                        this.fetchPages()
//this.filter='invoice'
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            },
            fetchAll () {
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/awb/awbs?page='+ this.setPage+'&size='+this.size+'&access_token='+this.parts)
                    .then(response => {
                        // JSON responses are automatically parsed.
                        this.posts = response.data.content
                        this.fetchPages()
                        this.filter='none'
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })

            },
            fetchPages () {
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/awb/awbnumbers?access_token='+this.parts)
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
            openModal(obj){
                this.awb=obj
                this.title=this.awb.awbNumber + ' / ' + this.awb.gdnRef + ' (' + this.awb.reconStatus + ') '
            },
            getLogisticSelectList(){
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/logistic/list?access_token='+this.parts)
                    .then(response => {
                        // JSON responses are automatically parsed.
                        this.listLogistic = response.data
                        if(this.logistic==='Vue!'){
                        }
                        else{
                            this.selectedLogistic=this.logistic
                        }
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            },
            getYearSelectList(){
                var year=new Date().getFullYear();
                var yearinit=year-4;
                var x=0;
                var i=yearinit;
                var years=[];
                for(i=yearinit; i<=year; i+=1){
                    years[x]=i;
                    x++;
                }
                this.listYear=years;
            },
            getMonthSelectList(){
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/uploadHistory/list/month?access_token='+this.parts)
                    .then(response => {
                        // JSON responses are automatically parsed.
                        this.listMonth = response.data
                    })
                    .catch(e => {
                        this.errors.push(e)
                    })
            }
        },
        ready() {
            this.uploadHistory();
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
					/*var table = $('#example').DataTable({
					 "responsive": true
					 });*/
                    $('button.toggle-vis').on('click', function(e) {
                        e.preventDefault();
                        // Get the column API object
                        var column = table.column($(this).attr('data-column'));
                        // Toggle the visibility
                        column.visible(!column.visible());
                    });
                },500);
            });
            if(this.month==='Vue!' || this.year==='Vue!' || this.logistic==='Vue!'){
                this.fetchAll()
            }
            else{
                this.selectedMonth=this.month
                this.selectedYear=this.year
                this.setInit('invoice')
            }
            this.getLogisticSelectList()
            this.getYearSelectList()
            document.getElementById('awb').classList.add('active');
        }
    }
</script>
<style src="../vendors/bootstrap-fileinput/css/fileinput.min.css"></style>
<style src="../assets/css/formelements.css"></style>
<style>
	.tablemodal {
		margin-left: 27%;
	}
	.toleft {
		margin-left: 15%;
	}
	.one {
		margin-left: 5px;
	}
	.modal-title-margin{
		margin-top:30px !important;
	}
	.noselect {
		-webkit-touch-callout: none!important;  /* iOS Safari */
		-webkit-user-select: none!important; /* Safari */
		-khtml-user-select: none!important; /* Konqueror HTML */
		-moz-user-select: none!important; /* Firefox */
		-ms-user-select: none!important; /* Internet Explorer/Edge */
		user-select: none!important; /* Non-prefixed version, currently
                                  supported by Chrome and Opera */
		cursor:pointer;
	}
</style>
