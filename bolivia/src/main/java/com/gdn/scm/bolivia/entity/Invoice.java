/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.entity;

import static com.gdn.scm.bolivia.entity.LogisticProvider.COLUMN_DISCOUNT;
import static com.gdn.scm.bolivia.entity.LogisticProvider.COLUMN_ID;
import static com.gdn.scm.bolivia.entity.LogisticProvider.COLUMN_LOGISTIC_CODE;
import static com.gdn.scm.bolivia.entity.LogisticProvider.COLUMN_LOGISTIC_NAME;
import static com.gdn.scm.bolivia.entity.LogisticProvider.COLUMN_STATUS;
import static com.gdn.scm.bolivia.entity.LogisticProvider.COLUMN_VAT;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author sofrie.zumaytis
 */
@Entity
@Table(name = Invoice.TABLE_NAME)
public class Invoice {

    public static final String TABLE_NAME = "BLV_INVOICE";

    public static final String COLUMN_ID = "ID";

    public static final String COLUMN_MONTH = "MONTH";
    public static final String COLUMN_YEAR = "YEAR";
    public static final String COLUMN_TAGIHAN = "TAGIHAN";
    public static final String COLUMN_CREATED_BY = "CREATED_BY";
    public static final String COLUMN_LOGISTIC_PROVIDER = "LOGISTIC_PROVIDER";
    public static final String COLUMN_LOGISTIC_NAME = "LOGISTIC_NAME";
    public static final String COLUMN_STATUS_INVOICE = "STATUS_INVOICE";
    public static final String COLUMN_LAST_MODIFIED = "LAST_MODIFIED ";

    public static final String COLUMN_FIRST_UPLOAD_DATE = "FIRST_UPLOAD_DATE ";
    public static final String COLUMN_SUBMITED_DATE = "SUBMITED_DATE ";
    public static final String COLUMN_CONFIRMED_DATE = "CONFIRMED_DATE ";
    public static final String COLUMN_APPROVED_DATE = "APPROVED_DATE ";

    @Column(name = COLUMN_ID, nullable = false)    
    private String id;

    @Column(name = COLUMN_MONTH, nullable = false)
    private Integer month;

    @Column(name = COLUMN_YEAR, nullable = false)
    private Integer year;

    @Column(name = COLUMN_TAGIHAN, nullable = false)
    private BigDecimal tagihan;

    @Column(name = COLUMN_CREATED_BY, nullable = true)
    private String createdBy;
    
    @Column(name = COLUMN_STATUS_INVOICE, nullable = true)
    private String statusInvoice;

    @Column(name = COLUMN_FIRST_UPLOAD_DATE, nullable = true)
    private String firstUploadDate;

    @Column(name = COLUMN_SUBMITED_DATE, nullable = true)
    private String submitedDate;

    @Column(name = COLUMN_CONFIRMED_DATE, nullable = true)
    private String confirmedDate;

    @Column(name = COLUMN_APPROVED_DATE, nullable = true)
    private String approvedDate;

    @Column(name = COLUMN_LAST_MODIFIED, nullable = true)
    private String lastModified;
    
    @Column(name = COLUMN_LOGISTIC_NAME, nullable = true)
    private String logisticName;
    
    private LogisticProvider logisticProvider;
    
    private Set<UploadHistory> uploadHistory;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public BigDecimal getTagihan() {
        return tagihan;
    }

    public void setTagihan(BigDecimal tagihan) {
        this.tagihan = tagihan;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getStatusInvoice() {
        return statusInvoice;
    }

    public void setStatusInvoice(String statusInvoice) {
        this.statusInvoice = statusInvoice;
    }

    public String getFirstUploadDate() {
        return firstUploadDate;
    }

    public void setFirstUploadDate(String firstUploadDate) {
        this.firstUploadDate = firstUploadDate;
    }

    public String getSubmitedDate() {
        return submitedDate;
    }

    public void setSubmitedDate(String submitedDate) {
        this.submitedDate = submitedDate;
    }

    public String getConfirmedDate() {
        return confirmedDate;
    }

    public void setConfirmedDate(String confirmedDate) {
        this.confirmedDate = confirmedDate;
    }

    public String getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(String approvedDate) {
        this.approvedDate = approvedDate;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public String getLogisticName() {
        return logisticName;
    }

    public void setLogisticName(String logisticName) {
        this.logisticName = logisticName;
    }
    
    

    @ManyToOne
    @JoinColumn(name = "blv_logistic_provider_id")
    public LogisticProvider getLogisticProvider() {
        return logisticProvider;
    }

    public void setLogisticProvider(LogisticProvider logisticProvider) {
        this.logisticProvider = logisticProvider;
    }

//    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL)
//    public Set<UploadHistory> getUploadHistory() {
//        return uploadHistory;
//    }
//
//    public void setUploadHistory(Set<UploadHistory> uploadHistory) {
//        this.uploadHistory = uploadHistory;
//    }
    
    
    
}
