/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.request;


import com.gdn.scm.bolivia.entity.LogisticProvider;
import com.gdn.scm.bolivia.entity.UploadHistory;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author sofrie.zumaytis
 */
@Getter
@Setter
public class InvoiceRequest {

    private String id;

    private Integer month;

    private Integer year;

    private BigDecimal tagihan;

    private String createdBy;
    
    private String statusInvoice;

    private String firstUploadDate;

    private String submitedDate;

    private String confirmedDate;

    private String approvedDate;

    private String lastModified;
    
    private String logisticName;
    
    private LogisticProvider logisticProvider;
    
    private Set<UploadHistory> uploadHistory;
}
