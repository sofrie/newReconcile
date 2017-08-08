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
                                        <select id="skill" name="skill" class="form-control" v-on:change="changeMonth()"
                                        v-model="selectedSearchMonth">
                                        <option value="Select Month" disabled="" selected="">
                                            Select month
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
                                <label class="col-sm-1 control-label" for="skill">
                                    Year :
                                </label>
                                <div class="col-sm-2">
                                    <select id="skill" name="skill" class="form-control" v-on:change="changeYear()"
                                    v-model="selectedSearchYear">
                                    <option value="Select Year" disabled="" selected="">
                                        Select Year
                                    </option>
                                    <option v-for="item of listYear" v-bind:value="item">{{item}}</option>
                                </select>
                            </div>
                            <label class="col-sm-1 control-label" for="skill">
                                Logistic :
                            </label>
                            <div class="col-sm-2">
                                <select id="skill" name="skill" class="form-control"
                                v-on:change="changeLogistic()" v-model="selectedSearchLogistic">
                                <option value="Select Logistic" disabled="" selected="">
                                    Select logistic
                                </option>
                                <option v-for="item of listLogistic" v-bind:value="item">{{item}}</option>
                            </select>
                        </div>
                        <div class="col-sm-1">
                            <button type="submit" class="btn btn-effect-ripple btn-primary">Search</button>
                        </div>
                        <div class="col-sm-1">
                            <button type="submit" class="btn btn-effect-ripple btn-primary"
                            data-toggle="modal" data-target="#form_modal" v-if="this.role==='MAKER'" >
                            Upload
                        </button>
                        <div id="form_modal" class="modal fade animated" role="dialog">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal">
                                            &times;
                                        </button>
                                        <h4 class="modal-title">Upload Invoice</h4>
                                    </div>
                                    <form role="form">
                                        <div class="modal-body">
                                            <div class="row m-t-10 form-group">
                                                <label for="input-text" class="col-sm-2 control-label">Month</label>
                                                <div class="col-sm-10">
                                                    <select id="select-gear" v-model="selectedMonth"
                                                    class="form-control">
                                                    <option value="" disabled="" selected="">
                                                        Select month
                                                    </option>
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
                                        </div>
                                        <div class="row m-t-10 form-group">
                                            <label for="input-text" class="col-sm-2 control-label">Year</label>
                                            <div class="col-sm-10">
                                                <select id="select-gear" v-model="selectedYear"
                                                class="form-control">
                                                <option value="" disabled="" selected="">
                                                    Select year
                                                </option>

                                                <option v-for="item of listYear"
                                                v-bind:value="item">{{item}}
                                            </option>
                                        </select>
                                    </div>
                                </div>
                                <div class="row m-t-10 form-group">
                                    <label for="input-text" class="col-sm-2 control-label">Logistic</label>
                                    <div class="col-sm-10">
                                        <select id="select-gear" v-model="selectedLogistic"
                                        class="form-control">
                                        <option value="" disabled="" selected="">
                                            Select logistic
                                        </option>
                                        <option v-for="item of listLogistic"
                                        v-bind:value="item">{{item}}
                                    </option>
                                </select>
                            </div>
                        </div>
                        <div class="row m-t-10 form-group">
                            <label for="input-text" class="col-sm-2 control-label">File</label>
                            <div class="col-sm-10">
                                <input type="file" :name="uploadFieldName"
                                :disabled="isSaving"
                                @change="filesChange($event.target.name, $event.target.files); fileCount = $event.target.files.length"
                                class="input-file">
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="submit" class="btn btn-succes"
                        v-on:click="uploadInvoice()" data-dismiss="modal">
                        Submit
                    </button>
                    <button type="reset" class="btn btn-default">Reset</button>
                    <button type="button" class="btn btn-default"
                    data-dismiss="modal">Close
                </button>
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
</div>
<div class="panel" v-if="invoice">
    <div class="panel-heading">
        <h1 class="panel-title">
            <i class="fa fa-fw ti-move"></i>
            Summary - Invoice {{invoice.logistic}} / {{invoice.month | filtermonth}} / {{invoice.year}}
        </h1>
        <span class="pull-right">
            <i class="fa fa-fw ti-angle-up clickable"></i>
            <!--<i class="fa fa-fw ti-close removepanel clickable"></i>-->
        </span>
    </div>
    <div class="panel-body">
        <div class="col-sm-12 m-t-10">
            <div class="col-sm-3">
                <label>
                    OK : {{invoice.ok}} data
                </label>
            </div>
            <div class="col-sm-3">
                <label>
                    Problem Exist : {{invoice.problemExist}} data
                </label>
            </div>
            <div class="col-sm-3">
                <label>
                    Status: {{invoice.status}}
                </label>
            </div>
            <div class="col-sm-3">
                <label>
                    Jumlah Tagihan:{{invoice.jumlahTagihan | currency}}
                </label>
            </div>
        </div>
        <div class="col-sm-12 m-t-10">
            <router-link :to="{path:'/awb/'+invoice.month+'/'+invoice.year+'/'+invoice.logistic}">
                <button class="btn btn-primary button_normal">View Data</button>
            </router-link>
            <button class="btn btn-primary button_normal" v-on:click="downloadFile()">Download</button>
            <button class="btn btn-primary button_normal pull-right" v-on:click="approved()" v-if="isApproved()==true">Approve</button>
            <button class="btn btn-primary button_normal pull-right" v-on:click="rejected()" v-if="isApproved()==true">Rejected</button>
            <button class="btn btn-primary button_normal pull-right" v-on:click="checked()" v-if="isChecked()==true">Check</button>
            <button class="btn btn-primary button_normal pull-right" v-on:click="rejected()" v-if="isChecked()==true">Rejected</button>
            <button class="btn btn-primary button_normal pull-right" v-on:click="submited()" v-if="isSubmited()==true" >Submit</button>
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
                    <i class="fa fa-fw ti-download"></i> {{role}}
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
                                <th>Month</th>
                                <th>Year</th>
                                <th>OK</th>
                                <th>Problem Exists</th>
                                <th>Jumlah Tagihan</th>
                                <th>Logistic</th>
                                <th>Status</th>
                                <th>Last Modified</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr v-for="post of posts" v-on:click="setSummary(post)">
                                <td>{{post.month | filtermonth}}</td>
                                <td>{{post.year}}</td>
                                <td>{{post.ok}}</td>
                                <td>{{post.problemExist}}</td>
                                <td>{{post.jumlahTagihan | currency}}</td>
                                <td>{{post.logistic}}</td>
                                <td>{{post.status}}</td>
                                <td>{{post.last_modified}}</td>
                            </tr>
                        </tbody>
                    </table>
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
            id: {
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
            selectedSearchMonth: 'Select Month',
            selectedSearchLogistic: 'Select Logistic',
            selectedSearchYear: 'Select Year',
            invoice: null,
            listMonth: [],
            listLogistic: [],
            listYear: [],
            x: 0,
            i: 0,
            parts: '',
            role: ''
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
                if (value == 1) {
                    return 'Januari'
                }
                else if (value == 2) {
                    return 'Februari'
                }
                else if (value == 3) {
                    return 'Maret'
                }
                else if (value == 4) {
                    return 'April'
                }
                else if (value == 5) {
                    return 'Mei'
                }
                else if (value == 6) {
                    return 'Juni'
                }
                else if (value == 7) {
                    return 'Juli'
                }
                else if (value == 8) {
                    return 'Agustus'
                }
                else if (value == 9) {
                    return 'September'
                }
                else if (value == 10) {
                    return 'Oktober'
                }
                else if (value == 11) {
                    return 'November'
                }
                else if (value == 12) {
                    return 'Desember'
                }
            }
        },
        methods: {
            isSubmited(){
                if(this.role === 'MAKER' && this.invoice.status === 'OK')
                {
                    return true
                }
                else
                {
                    return false
                }
            },
            isChecked(){
                if(this.role === 'CHECKER' && this.invoice.status === 'Submited')
                {
                    return true
                }
                else
                {
                    return false
                }
            },
            isApproved(){
                if(this.role === 'APPROVER' && this.invoice.status === 'Checked')
                {
                    return true
                }
                else
                {
                    return false
                }
            },
          getCookie(name){
            var value="; "+document.cookie;
            this.parts=value.split("; "+name+"=");
            if(this.parts.length==2)
                this.parts=this.parts.pop().split(";");
        },
        downloadFile () {
         this.getCookie('access_token')
         axios.get(`http://127.0.0.1:8091/api/uploadHistory/download/` + this.invoice.id+'?access_token='+this.parts)
         .then(response => {
                        // JSON responses are automatically parsed.
                    })
         .catch(e => {
            this.errors.push(e)
        })
     },
     updateHistory () {
         this.getCookie('access_token')
         axios.post('http://127.0.0.1:8091/api/uploadHistory/update?access_token='+this.parts, {
            id: this.invoice.id,
            status: this.statusUpdate
        })
         this.sendMail()
     },
     sendMail () {
         this.getCookie('access_token')
         axios.get(`http://127.0.0.1:8091/users/sendmail/` + this.invoice.id+'?access_token='+this.parts)
         .then(response => {
                        // JSON responses are automatically parsed.
                    })
         .catch(e => {
            this.errors.push(e)
        })
     },
     submited () {
         this.getCookie('access_token')
         axios.post('http://127.0.0.1:8091/api/invoice/update?access_token='+this.parts, {
            month: this.invoice.month,
            year: this.invoice.year,
            logisticName: this.invoice.logistic,
            statusInvoice: 'Submited',
            id: this.invoice.id
        })
         this.statusUpdate = 'Submited'
         this.updateHistory()

     },
     checked () {
         this.getCookie('access_token')
         axios.post('http://127.0.0.1:8091/api/invoice/update?access_token='+this.parts, {
            month: this.invoice.month,
            year: this.invoice.year,
            logisticName: this.invoice.logistic,
            statusInvoice: 'Checked'
        })
         this.statusUpdate= 'Checked'
         this.updateHistory()
     },
     unchecked () {
         this.getCookie('access_token')
         axios.post('http://127.0.0.1:8091/api/invoice/update?access_token='+this.parts, {
            month: this.invoice.month,
            year: this.invoice.year,
            logisticName: this.invoice.logistic,
            statusInvoice: 'Unchecked'
        })
         this.statusUpdate= 'Unchecked'
         this.updateHistory()
     },
     approved () {
         this.getCookie('access_token')
         axios.post('http://127.0.0.1:8091/api/invoice/update?access_token='+this.parts, {
            month: this.invoice.month,
            year: this.invoice.year,
            logisticName: this.invoice.logistic,
            statusInvoice: 'Approved'
        })
         this.statusUpdate= 'Approved'
         this.updateHistory()
     },
      rejected () {
         this.getCookie('access_token')
         axios.post('http://127.0.0.1:8091/api/invoice/update?access_token='+this.parts, {
            month: this.invoice.month,
            year: this.invoice.year,
            logisticName: this.invoice.logistic,
            statusInvoice: 'Rejected'
        })
         this.statusUpdate= 'Rejected'
         this.updateHistory()
     },
     uploadInvoice () {
         this.getCookie('access_token')
         axios.post('http://127.0.0.1:8091/api/invoice?access_token='+this.parts, {
            month: this.selectedMonth,
            year: this.selectedYear,
            logisticName: this.selectedLogistic
        })
         setTimeout(this.uploadHistory(), 5000);
     },
     uploadHistory () {
         this.getCookie('access_token')
         axios.post('http://127.0.0.1:8091/api/uploadHistory?access_token='+this.parts, {
            month: this.selectedMonth,
            year: this.selectedYear,
            logistic: this.selectedLogistic
        })
         setTimeout(this.save(formData,1000))
         setTimeout(this.fetchUsers, 5000);
     },
     fetchUsers() {
         this.getCookie('access_token')
         axios.get('http://127.0.0.1:8091/api/uploadHistory?access_token='+this.parts)
         .then(response => {
                        // JSON responses are automatically parsed.
                        this.posts = response.data
                        this.invoice = this.posts[0]
                        this.getMonthSelectList()
                        this.getYearSelectList()
                        this.getLogisticSelectList()
                    })
         .catch(e => {
            this.errors.push(e)
        })
     },
     fetchInvoice(){
         this.getCookie('access_token')
         axios.get('http://127.0.0.1:8091/api/uploadHistory/'+this.id+'?access_token='+this.parts)
         .then(response => {
                        // JSON responses are automatically parsed.
                        this.posts = response.data
                        this.invoice = this.posts[0]
                        this.getMonthSelectList()
                        this.getYearSelectList()
                        this.getLogisticSelectList()
                        this.selectedSearchMonth=this.invoice.month
                        this.selectedSearchYear=this.invoice.year
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
            save (formData) {
                // upload data to the server
                this.currentStatus = STATUS_SAVING
                upload(this.parts,formData)
                .then(x => {
                    this.uploadedFiles = [].concat(x)
                    this.currentStatus = STATUS_SUCCESS
                })
                .catch(err => {
                    this.uploadError = err.response
                    this.currentStatus = STATUS_FAILED
                })
                this.fetchUsers()
            },
            filesChange (fieldName, fileList) {
                // handle file changes
                if (!fileList.length) return
                // append the files to FormData
            Array
            .from(Array(fileList.length).keys())
            .map(x => {
                formData.append(fieldName, fileList[x], fileList[x].name)
            })
        },
        changeMonth () {
         this.getCookie('access_token')
         axios.get('http://127.0.0.1:8091/api/uploadHistory/month/' + this.selectedSearchMonth+'?access_token='+this.parts)
         .then(response => {
                        // JSON responses are automatically parsed.
                        this.posts = response.data
                    })
         .catch(e => {
            this.errors.push(e)
        })
     },
     changeYear () {
         this.getCookie('access_token')
         axios.get('http://127.0.0.1:8091/api/uploadHistory/year/' + this.selectedSearchYear+'?access_token='+this.parts)
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
         axios.get('http://127.0.0.1:8091/api/uploadHistory/logistic/' + this.selectedSearchLogistic+'?access_token='+this.parts)
         .then(response => {
                        // JSON responses are automatically parsed.
                        this.posts = response.data
                    })
         .catch(e => {
            this.errors.push(e)
        })
     },
     setSummary(obj){
        this.invoice = obj
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
 getYearSelectList(){
    var year = new Date().getFullYear();
    var yearinit = year - 4;
    var x = 0;
    var i = yearinit;
    var years = [];
    for (i = yearinit; i <= year; i += 1) {
        years[x] = i;
        x++;
    }
    this.listYear = years;
},
getLogisticSelectList(){
 this.getCookie('access_token')
 axios.get('http://127.0.0.1:8091/api/logistics/status/Active?access_token='+this.parts)
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

    if(this.id==='Vue!'){
        this.fetchUsers()
    }
    else{
        this.fetchInvoice()
    }
    this.getYearSelectList()
    this.getRole()
}
}
</script>
<style src="../vendors/bootstrap-fileinput/css/fileinput.min.css"></style>
<style src="../assets/css/formelements.css"></style>
