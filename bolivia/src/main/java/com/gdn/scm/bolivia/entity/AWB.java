/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.entity;

import static com.gdn.scm.bolivia.entity.UploadHistory.COLUMN_ID;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author sofrie.zumaytis
 */
@Entity
@Table(name = AWB.TABLE_NAME)
public class AWB {

    public static final String TABLE_NAME = "BLV_AWB";

    public static final String COLUMN_ID = "ID";

    public static final String COLUMN_AWB_NUMBER = "AWB_NUMBER";
    public static final String COLUMN_RECON_STATUS = "RECON_STATUS";
    public static final String COLUMN_GDN_REF = "GDN_REF";
    public static final String COLUMN_INSURED_AMOUNT = "INSURED_AMOUNT";

    public static final String COLUMN_WEIGHT_SYSTEM = "WEIGHT_SYSTEM";
    public static final String COLUMN_WEIGHT_LOGISTIC = "WEIGHT_LOGISTIC";
    public static final String COLUMN_WEIGHT_APPLIED = "WEIGHT_APPLIED";
    public static final String COLUMN_WEIGHT_COMMENT = "WEIGHT_COMMENT";

    public static final String COLUMN_PRICE_SYSTEM = "PRICE_SYSTEM";
    public static final String COLUMN_PRICE_LOGISTIC = "PRICE_LOGISTIC";
    public static final String COLUMN_PRICE_APPLIED = "PRICE_APPLIED";
    public static final String COLUMN_PRICE_COMMENT = "PRICE_COMMENT";

    public static final String COLUMN_OTHER_CHARGE_SYSTEM = "OTHER_CHARGE_SYSTEM";
    public static final String COLUMN_OTHER_CHARGE_LOGISTIC = "OTHER_CHARGE_LOGISTIC";
    public static final String COLUMN_OTHER_CHARGE_APPLIED = "OTHER_CHARGE_APPLIED";
    public static final String COLUMN_OTHER_CHARGE_COMMENT = "OTHER_CHARGE_COMMENT";

    public static final String COLUMN_GIFT_WRAP_CHARGE_SYSTEM = "GIFT_WRAP_CHARGE_SYSTEM";
    public static final String COLUMN_GIFT_WRAP_CHARGE_LOGISTIC = "GIFT_WRAP_CHARGE_LOGISTIC";
    public static final String COLUMN_GIFT_WRAP_CHARGE_APPLIED = "GIFT_WRAP_CHARGE_APPLIED";
    public static final String COLUMN_GIFT_WRAP_CHARGE_COMMENT = "GIFT_WRAP_CHARGE_COMMENT";

    public static final String COLUMN_INSURANCE_CHARGE_SYSTEM = "INSURANCE_CHARGE_SYSTEM";
    public static final String COLUMN_INSURANCE_CHARGE_LOGISTIC = "INSURANCE_CHARGE_LOGISTIC";
    public static final String COLUMN_INSURANCE_CHARGE_APPLIED = "INSURANCE_CHARGE_APPLIED";
    public static final String COLUMN_INSURANCE_CHARGE_COMMENT = "INSURANCE_CHARGE_COMMENT";

    public static final String COLUMN_TOTAL_CHARGE_SYSTEM = "TOTAL_CHARGE_SYSTEM";
    public static final String COLUMN_TOTAL_CHARGE_LOGISTIC = "TOTAL_CHARGE_LOGISTIC";
    public static final String COLUMN_TOTAL_CHARGE_APPLIED = "TOTAL_CHARGE_APPLIED";
    public static final String COLUMN_TOTAL_CHARGE_COMMENT = "TOTAL_CHARGE_COMMENT";

    public static final String COLUMN_FAILURE = "FAILURE";
    public static final String COLUMN_NOTES = "NOTES";
    public static final String COLUMN_NAMA_PENGIRIM = "NAMA_PENGIRIM";
    public static final String COLUMN_MERCHANT_CODE = "MERCHANT_CODE";
    public static final String COLUMN_MERCHANT_NAME = "MERCHANT_NAME";

    public static final String COLUMN_NAMA_PENGIRIM_API = "NAMA_PENGIRIM_API";
    public static final String COLUMN_NAMA_PENGIRIM_SYSTEM = "NAMA_PENGIRIM_SYSTEM";

    public static final String COLUMN_ALAMAT_PENGIRIM_API = "ALAMAT_PENGIRIM_API";
    public static final String COLUMN_ALAMAT_PENGIRIM_SYSTEM = "ALAMAT_PENGIRIM_SYSTEM";

    public static final String COLUMN_KODE_ORIGIN_API = "KODE_ORIGIN_API";
    public static final String COLUMN_KODE_ORIGIN_SYSTEM = "KODE_ORIGIN_SYSTEM";

    public static final String COLUMN_NAMA_PENERIMA_API = "NAMA_PENERIMA_API";
    public static final String COLUMN_NAMA_PENERIMA_SYSTEM = "_NAMA_PENERIMA_SYSTEM";

    public static final String COLUMN_ALAMAT_PENERIMA_API = "ALAMAT_PENERIMA_API";
    public static final String COLUMN_ALAMAT_PENERIMA_SYSTEM = "ALAMAT_PENERIMA_SYSTEM";

    public static final String COLUMN_KODE_DESTINASI_API = "KODE_DESTINASI_API";
    public static final String COLUMN_KODE_DESTINASI_SYSTEM = "KODE_DESTINASI_SYSTEM ";

    //Finance Original Ship Cost 
    public static final String COLUMN_FOCS_AMOUNT = "FOCS_AMOUNT";
    //Finance Original Ship Cost Adjustment 
    public static final String COLUMN_FOCSA_AMOUNT = "FOCSA_AMOUNT";

    public static final String COLUMN_SHIPPING_COST = "SHIPPING_COST";
    public static final String COLUMN_SHIP_COST = "SHIP_COST";

    public static final String COLUMN_MONTH = "MONTH";
    public static final String COLUMN_YEAR = "YEAR";
    public static final String COLUMN_LOGISTIC_NAME = "LOGISTIC_NAME";

    public Integer counter=0;
    public String uploadHistoryNumber;
    
    
    @Column(name = COLUMN_ID)
    private String id;  
  
    
    @Column(name = COLUMN_AWB_NUMBER, nullable = false)
    private String awbNumber;

    @Column(name = COLUMN_RECON_STATUS, nullable = false)
    private String reconStatus;

    @Column(name = COLUMN_GDN_REF, nullable = false)
    private String gdnRef;

    @Column(name = COLUMN_INSURED_AMOUNT, nullable = true)
    private String insuredAmount;

    @Column(name = COLUMN_WEIGHT_SYSTEM, nullable = true)
    private BigDecimal weightSystem;
    @Column(name = COLUMN_WEIGHT_LOGISTIC, nullable = true)
    private BigDecimal weightLogistic;
    @Column(name = COLUMN_WEIGHT_APPLIED, nullable = true)
    private BigDecimal weightApplied;
    @Column(name = COLUMN_WEIGHT_COMMENT, nullable = true)
    private String weightComment;

    @Column(name = COLUMN_PRICE_SYSTEM, nullable = true)
    private BigDecimal priceSystem;
    @Column(name = COLUMN_PRICE_LOGISTIC, nullable = true)
    private BigDecimal priceLogistic;
    @Column(name = COLUMN_PRICE_APPLIED, nullable = true)
    private BigDecimal priceApplied;
    @Column(name = COLUMN_PRICE_COMMENT, nullable = true)
    private String priceComment;

    @Column(name = COLUMN_OTHER_CHARGE_SYSTEM, nullable = true)
    private BigDecimal otherChargeSystem;
    @Column(name = COLUMN_OTHER_CHARGE_LOGISTIC, nullable = true)
    private BigDecimal otherChargeLogistic;
    @Column(name = COLUMN_OTHER_CHARGE_APPLIED, nullable = true)
    private BigDecimal otherChargeApplied;
    @Column(name = COLUMN_OTHER_CHARGE_COMMENT, nullable = true)
    private String otherChargeComment;

    @Column(name = COLUMN_GIFT_WRAP_CHARGE_SYSTEM, nullable = true)
    private BigDecimal giftWrapChargeSystem;
    @Column(name = COLUMN_GIFT_WRAP_CHARGE_LOGISTIC, nullable = true)
    private BigDecimal giftWrapChargeLogistic;
    @Column(name = COLUMN_GIFT_WRAP_CHARGE_APPLIED, nullable = true)
    private BigDecimal giftWrapChargeApplied;
    @Column(name = COLUMN_GIFT_WRAP_CHARGE_COMMENT, nullable = true)
    private String giftWrapChargeComment;

    @Column(name = COLUMN_INSURANCE_CHARGE_SYSTEM, nullable = true)
    private BigDecimal insuranceChargeSystem;
    @Column(name = COLUMN_INSURANCE_CHARGE_LOGISTIC, nullable = true)
    private BigDecimal insuranceChargeLogistic;
    @Column(name = COLUMN_INSURANCE_CHARGE_APPLIED, nullable = true)
    private BigDecimal insuranceChargeApplied;
    @Column(name = COLUMN_INSURANCE_CHARGE_COMMENT, nullable = true)
    private String insuranceChargeComment;

    @Column(name = COLUMN_TOTAL_CHARGE_SYSTEM, nullable = true)
    private BigDecimal totalChargeSystem;
    @Column(name = COLUMN_TOTAL_CHARGE_LOGISTIC, nullable = true)
    private BigDecimal totalChargeLogistic;
    @Column(name = COLUMN_TOTAL_CHARGE_APPLIED, nullable = true)
    private BigDecimal totalChargeApplied;
    @Column(name = COLUMN_TOTAL_CHARGE_COMMENT, nullable = true)
    private String totalChargeComment;

    @Column(name = COLUMN_FAILURE, nullable = true)
    private String failure;
    @Column(name = COLUMN_NOTES, nullable = true)
    private String notes;
    @Column(name = COLUMN_NAMA_PENGIRIM, nullable = true)
    private String namaPengirim;
    @Column(name = COLUMN_MERCHANT_CODE, nullable = false)
    private String merchantCode;
    @Column(name = COLUMN_MERCHANT_NAME, nullable = true)
    private String merchantName;
    
    
    @Column(name = COLUMN_NAMA_PENGIRIM_API, nullable = true)
    private String namaPengirimAPI;
    @Column(name = COLUMN_NAMA_PENGIRIM_SYSTEM, nullable = true)
    private String namaPengirimSystem;
    
    @Column(name = COLUMN_ALAMAT_PENGIRIM_API, nullable = true)
    private String alamatPengirimAPI;
    @Column(name = COLUMN_ALAMAT_PENGIRIM_SYSTEM, nullable = true)
    private String alamatPengirimSystem;
    
    @Column(name = COLUMN_KODE_ORIGIN_API, nullable = true)
    private String kodeOriginAPI;
    @Column(name = COLUMN_KODE_ORIGIN_SYSTEM, nullable = true)
    private String kodeOriginSystem;
    
    @Column(name = COLUMN_NAMA_PENERIMA_API, nullable = true)
    private String namaPenerimaAPI;
    @Column(name = COLUMN_NAMA_PENERIMA_SYSTEM, nullable = true)
    private String namaPenerimaSystem;
    
    @Column(name = COLUMN_ALAMAT_PENERIMA_API, nullable = true)
    private String alamatPenerimaAPI;
    @Column(name = COLUMN_ALAMAT_PENERIMA_SYSTEM, nullable = true)
    private String alamatPenerimaSystem;
    
    @Column(name = COLUMN_KODE_DESTINASI_API, nullable = true)
    private String kodeDestinasiAPI;
    @Column(name = COLUMN_KODE_DESTINASI_SYSTEM, nullable = true)
    private String kodeDestinasiSystem;
    
    @Column(name = COLUMN_FOCS_AMOUNT, nullable = true)
    private String focsAmount;
    @Column(name = COLUMN_FOCSA_AMOUNT, nullable = true)
    private String focsaAcmount;
    @Column(name = COLUMN_SHIPPING_COST, nullable = true)
    private String shippingCost;
    @Column(name = COLUMN_SHIP_COST, nullable = true)
    private String shipCost;
    
    

    @Column(name = COLUMN_MONTH, nullable = false)
    private Integer month;
    @Column(name = COLUMN_YEAR, nullable = false)
    private Integer year;
    @Column(name = COLUMN_LOGISTIC_NAME, nullable = false)
    private String logisticName;
       
    
    private Invoice invoice;
    
    

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    public String getUploadHistoryNumber() {
        return uploadHistoryNumber;
    }

    public void setUploadHistoryNumber(String uploadHistoryNumber) {
        this.uploadHistoryNumber = uploadHistoryNumber;
    }

    public String getAwbNumber() {
        return awbNumber;
    }

    public void setAwbNumber(String awbNumber) {
        this.awbNumber = awbNumber;
    }

    public String getReconStatus() {
        return reconStatus;
    }

    public void setReconStatus(String reconStatus) {
        this.reconStatus = reconStatus;
    }

    public String getGdnRef() {
        return gdnRef;
    }

    public void setGdnRef(String gdnRef) {
        this.gdnRef = gdnRef;
    }

    public String getInsuredAmount() {
        return insuredAmount;
    }

    public void setInsuredAmount(String insuredAmount) {
        this.insuredAmount = insuredAmount;
    }

    public BigDecimal getWeightSystem() {
        return weightSystem;
    }

    public void setWeightSystem(BigDecimal weightSystem) {
        this.weightSystem = weightSystem;
    }

    public BigDecimal getWeightLogistic() {
        return weightLogistic;
    }

    public void setWeightLogistic(BigDecimal weightLogistic) {
        this.weightLogistic = weightLogistic;
    }

    public BigDecimal getWeightApplied() {
        return weightApplied;
    }

    public void setWeightApplied(BigDecimal weightApplied) {
        this.weightApplied = weightApplied;
    }

    public String getWeightComment() {
        return weightComment;
    }

    public void setWeightComment(String weightComment) {
        this.weightComment = weightComment;
    }

    public BigDecimal getPriceSystem() {
        return priceSystem;
    }

    public void setPriceSystem(BigDecimal priceSystem) {
        this.priceSystem = priceSystem;
    }

    public BigDecimal getPriceLogistic() {
        return priceLogistic;
    }

    public void setPriceLogistic(BigDecimal priceLogistic) {
        this.priceLogistic = priceLogistic;
    }

    public BigDecimal getPriceApplied() {
        return priceApplied;
    }

    public void setPriceApplied(BigDecimal priceApplied) {
        this.priceApplied = priceApplied;
    }

    public String getPriceComment() {
        return priceComment;
    }

    public void setPriceComment(String priceComment) {
        this.priceComment = priceComment;
    }

    public BigDecimal getOtherChargeSystem() {
        return otherChargeSystem;
    }

    public void setOtherChargeSystem(BigDecimal otherChargeSystem) {
        this.otherChargeSystem = otherChargeSystem;
    }

    public BigDecimal getOtherChargeLogistic() {
        return otherChargeLogistic;
    }

    public void setOtherChargeLogistic(BigDecimal otherChargeLogistic) {
        this.otherChargeLogistic = otherChargeLogistic;
    }

    public BigDecimal getOtherChargeApplied() {
        return otherChargeApplied;
    }

    public void setOtherChargeApplied(BigDecimal otherChargeApplied) {
        this.otherChargeApplied = otherChargeApplied;
    }

    public String getOtherChargeComment() {
        return otherChargeComment;
    }

    public void setOtherChargeComment(String otherChargeComment) {
        this.otherChargeComment = otherChargeComment;
    }

    public BigDecimal getGiftWrapChargeSystem() {
        return giftWrapChargeSystem;
    }

    public void setGiftWrapChargeSystem(BigDecimal giftWrapChargeSystem) {
        this.giftWrapChargeSystem = giftWrapChargeSystem;
    }

    public BigDecimal getGiftWrapChargeLogistic() {
        return giftWrapChargeLogistic;
    }

    public void setGiftWrapChargeLogistic(BigDecimal giftWrapChargeLogistic) {
        this.giftWrapChargeLogistic = giftWrapChargeLogistic;
    }

    public BigDecimal getGiftWrapChargeApplied() {
        return giftWrapChargeApplied;
    }

    public void setGiftWrapChargeApplied(BigDecimal giftWrapChargeApplied) {
        this.giftWrapChargeApplied = giftWrapChargeApplied;
    }

    public String getGiftWrapChargeComment() {
        return giftWrapChargeComment;
    }

    public void setGiftWrapChargeComment(String giftWrapChargeComment) {
        this.giftWrapChargeComment = giftWrapChargeComment;
    }

    public BigDecimal getInsuranceChargeSystem() {
        return insuranceChargeSystem;
    }

    public void setInsuranceChargeSystem(BigDecimal insuranceChargeSystem) {
        this.insuranceChargeSystem = insuranceChargeSystem;
    }

    public BigDecimal getInsuranceChargeLogistic() {
        return insuranceChargeLogistic;
    }

    public void setInsuranceChargeLogistic(BigDecimal insuranceChargeLogistic) {
        this.insuranceChargeLogistic = insuranceChargeLogistic;
    }

    public BigDecimal getInsuranceChargeApplied() {
        return insuranceChargeApplied;
    }

    public void setInsuranceChargeApplied(BigDecimal insuranceChargeApplied) {
        this.insuranceChargeApplied = insuranceChargeApplied;
    }

    public String getInsuranceChargeComment() {
        return insuranceChargeComment;
    }

    public void setInsuranceChargeComment(String insuranceChargeComment) {
        this.insuranceChargeComment = insuranceChargeComment;
    }

    public BigDecimal getTotalChargeSystem() {
        return totalChargeSystem;
    }

    public void setTotalChargeSystem(BigDecimal totalChargeSystem) {
        this.totalChargeSystem = totalChargeSystem;
    }

    public BigDecimal getTotalChargeLogistic() {
        return totalChargeLogistic;
    }

    public void setTotalChargeLogistic(BigDecimal totalChargeLogistic) {
        this.totalChargeLogistic = totalChargeLogistic;
    }

    public BigDecimal getTotalChargeApplied() {
        return totalChargeApplied;
    }

    public void setTotalChargeApplied(BigDecimal totalChargeApplied) {
        this.totalChargeApplied = totalChargeApplied;
    }

    public String getTotalChargeComment() {
        return totalChargeComment;
    }

    public void setTotalChargeComment(String totalChargeComment) {
        this.totalChargeComment = totalChargeComment;
    }

    public String getFailure() {
        return failure;
    }

    public void setFailure(String failure) {
        this.failure = failure;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNamaPengirim() {
        return namaPengirim;
    }

    public void setNamaPengirim(String namaPengirim) {
        this.namaPengirim = namaPengirim;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getNamaPengirimAPI() {
        return namaPengirimAPI;
    }

    public void setNamaPengirimAPI(String namaPengirimAPI) {
        this.namaPengirimAPI = namaPengirimAPI;
    }

    public String getNamaPengirimSystem() {
        return namaPengirimSystem;
    }

    public void setNamaPengirimSystem(String namaPengirimSystem) {
        this.namaPengirimSystem = namaPengirimSystem;
    }

    public String getAlamatPengirimAPI() {
        return alamatPengirimAPI;
    }

    public void setAlamatPengirimAPI(String alamatPengirimAPI) {
        this.alamatPengirimAPI = alamatPengirimAPI;
    }

    public String getAlamatPengirimSystem() {
        return alamatPengirimSystem;
    }

    public void setAlamatPengirimSystem(String alamatPengirimSystem) {
        this.alamatPengirimSystem = alamatPengirimSystem;
    }

    public String getKodeOriginAPI() {
        return kodeOriginAPI;
    }

    public void setKodeOriginAPI(String kodeOriginAPI) {
        this.kodeOriginAPI = kodeOriginAPI;
    }

    public String getKodeOriginSystem() {
        return kodeOriginSystem;
    }

    public void setKodeOriginSystem(String kodeOriginSystem) {
        this.kodeOriginSystem = kodeOriginSystem;
    }

    public String getNamaPenerimaAPI() {
        return namaPenerimaAPI;
    }

    public void setNamaPenerimaAPI(String namaPenerimaAPI) {
        this.namaPenerimaAPI = namaPenerimaAPI;
    }

    public String getNamaPenerimaSystem() {
        return namaPenerimaSystem;
    }

    public void setNamaPenerimaSystem(String namaPenerimaSystem) {
        this.namaPenerimaSystem = namaPenerimaSystem;
    }

    public String getAlamatPenerimaAPI() {
        return alamatPenerimaAPI;
    }

    public void setAlamatPenerimaAPI(String alamatPenerimaAPI) {
        this.alamatPenerimaAPI = alamatPenerimaAPI;
    }

    public String getAlamatPenerimaSystem() {
        return alamatPenerimaSystem;
    }

    public void setAlamatPenerimaSystem(String alamatPenerimaSystem) {
        this.alamatPenerimaSystem = alamatPenerimaSystem;
    }

    public String getKodeDestinasiAPI() {
        return kodeDestinasiAPI;
    }

    public void setKodeDestinasiAPI(String kodeDestinasiAPI) {
        this.kodeDestinasiAPI = kodeDestinasiAPI;
    }

    public String getKodeDestinasiSystem() {
        return kodeDestinasiSystem;
    }

    public void setKodeDestinasiSystem(String kodeDestinasiSystem) {
        this.kodeDestinasiSystem = kodeDestinasiSystem;
    }

    public String getFocsAmount() {
        return focsAmount;
    }

    public void setFocsAmount(String focsAmount) {
        this.focsAmount = focsAmount;
    }

    public String getFocsaAcmount() {
        return focsaAcmount;
    }

    public void setFocsaAcmount(String focsaAcmount) {
        this.focsaAcmount = focsaAcmount;
    }

    public String getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(String shippingCost) {
        this.shippingCost = shippingCost;
    }

    public String getShipCost() {
        return shipCost;
    }

    public void setShipCost(String shipCost) {
        this.shipCost = shipCost;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getLogisticName() {
        return logisticName;
    }

    public void setLogisticName(String logisticName) {
        this.logisticName = logisticName;
    }

    
     @ManyToOne
    @JoinColumn(name = "blv_invoice_id")
    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
    
    


    public AWB(Integer month, Integer year, String logisticName, String awbNumber, String reconStatus, String merchantCode, String gdnRef) {

        this.month = month;
        this.year = year;
        this.logisticName = logisticName;
        this.awbNumber = awbNumber;
        this.reconStatus = reconStatus;
        this.merchantCode = merchantCode;
        this.gdnRef = gdnRef;
    }

    public AWB() {
    }
    
    public void assignAWB(Row row)
    {
        awbNumber=row.getCell(2).toString();
        kodeOriginSystem=row.getCell(3).toString();
        gdnRef=row.getCell(4).toString();
        kodeDestinasiSystem=row.getCell(5).toString();
        namaPenerimaSystem=row.getCell(6).toString();
        totalChargeSystem=new BigDecimal(row.getCell(9).getNumericCellValue());
    }

//    @Override
//    public String toString() {
//        return "AWB{" + "counter=" + counter + ", awbNumber=" + awbNumber + '}';
//    }
    

}
