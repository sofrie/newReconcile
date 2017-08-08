/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.request;

import java.math.BigDecimal;

/**
 *
 * @author sofrie.zumaytis
 */
public class LogisticProviderRequest {
    private Integer id;
    private String logisticCode;
    private String logisticName;
    private String status;
    private BigDecimal discount;
    private BigDecimal vat;

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

    public LogisticProviderRequest(Integer id, String logisticCode, String logisticName, String status, BigDecimal discount, BigDecimal vat) {
        this.id = id;
        this.logisticCode = logisticCode;
        this.logisticName = logisticName;
        this.status = status;
        this.discount = discount;
        this.vat = vat;
    }
    
     public LogisticProviderRequest(String logisticCode, String logisticName, String status, BigDecimal discount, BigDecimal vat) {
        this.logisticCode = logisticCode;
        this.logisticName = logisticName;
        this.status = status;
        this.discount = discount;
        this.vat = vat;
    }

    public LogisticProviderRequest() {
    }
    
    
}
