/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.entity;

import java.math.BigDecimal;
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
@Table(name = LogisticProvider.TABLE_NAME)
public class LogisticProvider {

    public static final String TABLE_NAME = "BLV_LOGISTIC_PROVIDER";

    public static final String COLUMN_ID = "ID";
    
    public static final String COLUMN_LOGISTIC_CODE = "LOGISTIC_CODE";
    public static final String COLUMN_LOGISTIC_NAME = "LOGISTIC_NAME";
    public static final String COLUMN_STATUS = "STATUS";
    public static final String COLUMN_DISCOUNT = "DISCOUNT";
    public static final String COLUMN_VAT = "VAT";

    
    @Column(name = COLUMN_ID, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;
    
    @Column(name = COLUMN_LOGISTIC_CODE, nullable = false)
    private String logisticCode;

    @Column(name = COLUMN_LOGISTIC_NAME, nullable = false)
    private String logisticName;

    @Column(name = COLUMN_STATUS, nullable = false)
    private String status;

    @Column(name = COLUMN_DISCOUNT, nullable = true)
    private BigDecimal discount;

    @Column(name = COLUMN_VAT, nullable = true)
    private BigDecimal vat;
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogisticCode() {
        return logisticCode;
    }

    public void setLogisticCode(String logisticCode) {
        this.logisticCode = logisticCode;
    }

    public String getLogisticName() {
        return logisticName;
    }

    public void setLogisticName(String logisticName) {
        this.logisticName = logisticName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

      
    
    
    
//    public Set<Invoice> getInvoices() {
//        return invoice;
//    }
//    
//     public void setInvoices(Set<Invoice> invoice) {
//        this.invoice = invoice;
//    }
    
    

    public LogisticProvider(String logisticCode, String logisticName, String status, BigDecimal discount, BigDecimal vat) {
        this.logisticCode = logisticCode;
        this.logisticName = logisticName;
        this.status = status;
        this.discount = discount;
        this.vat = vat;
    }

    public LogisticProvider() {
    }
}
