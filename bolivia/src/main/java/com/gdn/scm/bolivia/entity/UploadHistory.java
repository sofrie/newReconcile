/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.entity;

import java.math.BigDecimal;
import java.util.Date;
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

/**
 *
 * @author sofrie.zumaytis
 */
@Entity
@Table(name = UploadHistory.TABLE_NAME)
public class UploadHistory {

    public static final String TABLE_NAME = "BLV_UPLOAD_HISTORY";

    public static final String COLUMN_ID = "ID";

    public static final String COLUMN_MONTH = "MONTH";
    public static final String COLUMN_YEAR = "YEAR";
    public static final String COLUMN_OK = "OK";
    public static final String COLUMN_PROBLEM_EXIST = "PROBLEM_EXIST";
    public static final String COLUMN_JUMLAH_TAGIHAN = "JUMLAH_TAGIHAN";
    public static final String COLUMN_LOGISTIC = "MERCHANT_LOGISTIC";
    public static final String COLUMN_STATUS = "STATUS";
    public static final String COLUMN_LAST_MODIFIED = "LAST_MODIFIED";
    public static final String COLUMN_NAMA_FILE = "NAMA_FILE";

    
    @Column(name = COLUMN_ID)
    private Integer id;

    @Column(name = COLUMN_MONTH, nullable = false)
    private Integer month;

    @Column(name = COLUMN_YEAR, nullable = false)
    private Integer year;

    @Column(name = COLUMN_OK, nullable = false)
    private String ok;

    @Column(name = COLUMN_PROBLEM_EXIST, nullable = false)
    private String problemExist;

    @Column(name = COLUMN_JUMLAH_TAGIHAN, nullable = false)
    private BigDecimal jumlahTagihan;

    @Column(name = COLUMN_LOGISTIC, nullable = false)
    private String logistic;
    
    @Column(name = COLUMN_STATUS, nullable = false)
    private String status;

    @Column(name = COLUMN_LAST_MODIFIED, nullable = true)
    private String last_modified;
    
    @Column(name = COLUMN_NAMA_FILE, nullable = true)
    private String namaFile;
    
    
    private Invoice invoice;

    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getOk() {
        return ok;
    }

    public void setOk(String ok) {
        this.ok = ok;
    }

    public String getProblemExist() {
        return problemExist;
    }

    public void setProblemExist(String problemExist) {
        this.problemExist = problemExist;
    }

    public BigDecimal getJumlahTagihan() {
        return jumlahTagihan;
    }

    public void setJumlahTagihan(BigDecimal jumlahTagihan) {
        this.jumlahTagihan = jumlahTagihan;
    }

    public String getLogistic() {
        return logistic;
    }

    public void setLogistic(String logistic) {
        this.logistic = logistic;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(String last_modified) {
        this.last_modified = last_modified;
    }

    public String getNamaFile() {
        return namaFile;
    }

    public void setNamaFile(String namaFile) {
        this.namaFile = namaFile;
    }
    
    

    
    @ManyToOne
    @JoinColumn(name = "blv_invoice_id")
    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    
    

    public UploadHistory(Integer id, Integer month, Integer year, String ok, String problemExist, BigDecimal jumlahTagihan, String logistic, String status, String last_modified) {
        this.id = id;
        this.month = month;
        this.year = year;
        this.ok = ok;
        this.problemExist = problemExist;
        this.jumlahTagihan = jumlahTagihan;
        this.logistic = logistic;
        this.status = status;
        this.last_modified = "-";
    }

    public UploadHistory() {
    }

    
}
