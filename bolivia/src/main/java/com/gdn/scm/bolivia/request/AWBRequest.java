/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.request;

import lombok.Getter;
import lombok.Setter;


/**
 *
 * @author sofrie.zumaytis
 */
@Getter
@Setter
public class AWBRequest {
    
    private String id;
    
    private String awbNumber;
    private String reconStatus;
    private String gdnRef;
    private String insuredAmount;
    private String weightSystem;
    private String weightLogistic;
    private String weightApplied;
    private String weightComment;

    private String priceSystem;
    private String priceLogistic;
    private String priceApplied;
    private String priceComment;

    private String otherChargeSystem;
    private String otherChargeLogistic;
    private String otherChargeApplied;
    private String otherChargeComment;

    private String giftWrapChargeSystem;
    private String giftWrapChargeLogistic;
    private String giftWrapChargeApplied;
    private String giftWrapChargeComment;

    private String insuranceChargeSystem;
    private String insuranceChargeLogistic;
    private String insuranceChargeApplied;
    private String insuranceChargeComment;

    private Double totalChargeSystem;
    private Double totalChargeLogistic;
    private String totalChargeApplied;
    private Double totalChargeComment;

    private String failure;
    private String notes;
    private String namaPengirim;
    private String merchantCode;
    private String merchantName;
    
    
    private String namaPengirimAPI;
    private String namaPengirimSystem;
    
    private String alamatPengirimAPI;
    private String alamatPengirimSystem;
    
    private String kodeOriginAPI;
    private String kodeOriginSystem;
    
    private String namaPenerimaAPI;
    private String namaPenerimaSystem;
    
    private String alamatPenerimaAPI;
    private String alamatPenerimaSystem;
    
    private String kodeDestinasiAPI;
    private String kodeDestinasiSystem;
    
    private String focsAmount;
    private String focsaAcmount;
    private String shippingCost;
    private String shipCost;
    
    

    private Integer month;
    private Integer year;
    private String logisticName;
    
    
    private String uploadHistoryNumber;
}
