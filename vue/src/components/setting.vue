    <template>
        <div>
            <div class="row">
                <div class="col-md-12">
                    <div>
                        <div class="row">
                            <div class="col-sm-12">
                                <table class= "col-md-12">
                                  <tr>
                                      <td colspan="2" ><label class="control-label"><b>Total Shipping</b></label></td>
                                      <td colspan="2" ><label class="control-label"><b>Price/Kg</b></label></td>
                                  </tr>
                                  <tr>
                                    <td class="tdright"><label>Tolerance Percentage : &nbsp;</label></td>
                                    <td><input class="form-control" type="text" ref="totalShippingPercentage"  v-model="ShippingP"></td>
                                    <td class="tdright"><label>Tolerance Percentage : &nbsp;</label></td>
                                    <td><input class="form-control" type="text" ref="pricePercentage" v-model="priceP"></td>
                                </tr>
                                <tr>
                                    <td> &nbsp;</td>
                                </tr>
                                <tr>
                                    <td class="tdright"><label>Tolerance Amount : &nbsp;</label></td>
                                    <td><input class="form-control" type="text" ref="totalShippingAmount" v-model="ShippingA"></td>
                                    <td class="tdright"><label>Tolerance Amount : &nbsp;</label></td>
                                    <td><input class="form-control" type="text" ref="priceAmount" v-model="priceA"></td>
                                </tr>
                                <tr>
                                    <td> &nbsp;</td>
                                </tr>
                                <tr>
                                    <td> &nbsp;</td>
                                </tr>
                                <tr>
                                  <td colspan="2" ><label class="control-label"><b>Weight</b></label></td>
                                  <td colspan="2" ><label class="control-label"><b>Gift Wrap Charge</b></label></td>
                              </tr>
                              <tr>
                                <td class="tdright"><label>Tolerance Percentage : &nbsp;</label></td>
                                <td><input class="form-control" type="text" ref="weightPercentage" v-model="weightP"></td>
                                <td class="tdright"><label>Tolerance Percentage : &nbsp;</label></td>
                                <td><input class="form-control" type="text" ref="giftWrapChargePercentage" v-model="giftWrapChargeP"></td>
                            </tr>
                            <tr>
                                    <td> &nbsp;</td>
                                </tr>
                            <tr>
                                <td class="tdright"><label>Tolerance Amount : &nbsp;</label></td>
                                <td><input class="form-control" type="text" ref="weightAmount" v-model="weightA"></td>
                                <td class="tdright"><label>Tolerance Amount : &nbsp;</label></td>
                                <td><input class="form-control" type="text" ref="giftWrapChargeAmount" v-model="giftWrapChargeA"></td>
                            </tr>
                            <tr>
                                    <td> &nbsp;</td>
                                </tr>
                            <tr>
                              <td colspan="2" ><label class="control-label"><b>Other Charge</b></label></td>
                              <td colspan="2" ><label class="control-label"><b>Insurance Charge</b></label></td>
                          </tr>
                          <tr>
                            <td class="tdright"><label>Tolerance Percentage : &nbsp;</label></td>
                            <td><input class="form-control" type="text" ref="otherChargePercentage" v-model="otherChargeP">
                             <td class="tdright"><label>Tolerance Percentage : &nbsp;</label></td>
                             <td><input class="form-control" type="text" ref="insuranceChargePercentage" v-model="insuranceChargeP"></td>
                         </tr>
                         <tr>
                                    <td> &nbsp;</td>
                                </tr>
                         <tr>
                            <td class="tdright"><label>Tolerance Amount : &nbsp;</label></td>
                            <td><input class="form-control" type="text" ref="otherChargeAmount" v-model="otherChargeA"></td>
                            <td class="tdright"><label>Tolerance Amount : &nbsp;</label></td>
                            <td><input class="form-control" type="text" ref="insuranceChargeAmount" v-model="insuranceChargeA"></td>
                        </tr>
                    </table>
                    <table class="col-md-12">
                      <tr>
                          <td> <button class="btn btn-effect-ripple btn-primary pull-right" v-on:click="cancel">Cancel</button>
                             <button class="btn btn-effect-ripple btn-primary pull-right marginright" type="submit" v-on:click="ok">Submit</button> </td>
                         </tr>
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
            ShippingP: '',
            ShippingA: '',
            weightP: '',
            weightA: '',
            insuranceChargeP: '',
            insuranceChargeA: '',
            priceP: '',
            priceA: '',
            giftWrapChargeP: '',
            giftWrapChargeA: '',
            otherChargeP: '',
            otherChargeA: '',
			parts: ''
        }
        ),
        mounted: function() {
            "use strict";
            
        },
        destroyed: function() {
        },
        methods: {
		getCookie(name){
				var value="; "+document.cookie;
				this.parts=value.split("; "+name+"=");
				if(this.parts.length==2)
				this.parts=this.parts.pop().split(";");
			},
            ok () {
			this.getCookie('access_token')
                axios.post('http://127.0.0.1:8091/api/tolerances?access_token='+this.parts, {
                  id: '1',
                  totalShippingPercentage: this.$refs.totalShippingPercentage.value,
                  totalShippingAmount: this.$refs.totalShippingAmount.value,
                  weightPercentage: this.$refs.weightPercentage.value,
                  weightAmount: this.$refs.weightAmount.value,
                  insuranceChargePercentage: this.$refs.insuranceChargePercentage.value,
                  insuranceChargeAmount: this.$refs.insuranceChargeAmount.value,
                  pricePercentage: this.$refs.pricePercentage.value,
                  priceAmount: this.$refs.priceAmount.value,
                  giftWrapChargePercentage: this.$refs.giftWrapChargePercentage.value,
                  giftWrapChargeAmount: this.$refs.giftWrapChargeAmount.value,
                  otherChargePercentage: this.$refs.otherChargePercentage.value,
                  otherChargeAmount: this.$refs.otherChargeAmount.value
              })
            },
            cancel () {
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/tolerances?access_token='+this.parts)
                .then(response => {
            // JSON responses are automatically parsed.
            this.ShippingP = response.data.totalShippingPercentage
            this.ShippingA = response.data.totalShippingAmount
            this.weightP = response.data.weightPercentage
            this.weightA = response.data.weightAmount
            this.insuranceChargeP = response.data.insuranceChargePercentage
            this.insuranceChargeA = response.data.insuranceChargeAmount
            this.priceP = response.data.pricePercentage
            this.priceA = response.data.priceAmount
            this.giftWrapChargeP = response.data.giftWrapChargePercentage
            this.giftWrapChargeA = response.data.giftWrapChargeAmount
            this.otherChargeP = response.data.otherChargePercentage
            this.otherChargeA = response.data.otherChargeAmount
        })
                .catch(e => {
                    this.errors.push(e)
                })
            },
            createLogistic () {
			this.getCookie('access_token')
                axios.post('http://127.0.0.1:8091/api/logistics?access_token='+this.parts, {
                  logisticCode: 'haha',
                  logisticName: this.AwbNumber,
                  status: this.selectedStatus,
                  discount: this.Discount,
                  vat: this.VAT
              })
                setTimeout(this.fetchLogistics, 5000);
            },
            fetchLogistics() {
			this.getCookie('access_token')
                axios.get('http://127.0.0.1:8091/api/logistics?access_token='+this.parts)
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
                this.cancel()
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
        .marginright {
            margin-right: 10px;
        }
        .form-control {
            width: 200px;
        }
    </style>