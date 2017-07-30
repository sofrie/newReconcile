/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.request;

import static com.gdn.scm.bolivia.entity.Tolerance.COLUMN_GIFT_WRAP_CHARGE_AMOUNT;
import static com.gdn.scm.bolivia.entity.Tolerance.COLUMN_GIFT_WRAP_CHARGE_PERCENTAGE;
import static com.gdn.scm.bolivia.entity.Tolerance.COLUMN_INSURANCE_CHARGE_PERCENTAGE;
import static com.gdn.scm.bolivia.entity.Tolerance.COLUMN_OTHER_CHARGE_PERCENTAGE;
import static com.gdn.scm.bolivia.entity.Tolerance.COLUMN_PRICE_AMOUNT;
import static com.gdn.scm.bolivia.entity.Tolerance.COLUMN_PRICE_PERCENTAGE;
import static com.gdn.scm.bolivia.entity.Tolerance.COLUMN_TOTAL_SHIPPING_AMOUNT;
import static com.gdn.scm.bolivia.entity.Tolerance.COLUMN_TOTAL_SHIPPING_PERCENTAGE;
import static com.gdn.scm.bolivia.entity.Tolerance.COLUMN_WEIGHT_AMOUNT;
import static com.gdn.scm.bolivia.entity.Tolerance.COLUMN_WEIGHT_PERCENTAGE;
import java.math.BigDecimal;
import javax.persistence.Column;

/**
 *
 * @author sofrie.zumaytis
 */
public class ToleranceRequest {
    private String id;
    
    private BigDecimal totalShippingPercentage;
    private BigDecimal totalShippingAmount;

    private BigDecimal weightPercentage;
    private BigDecimal weightAmount;

    private BigDecimal insuranceChargePercentage;
    private BigDecimal insuranceChargeAmount;

    private BigDecimal pricePercentage;
    private BigDecimal priceAmount;

    private BigDecimal giftWrapChargePercentage;
    private BigDecimal giftWrapChargeAmount;

    private BigDecimal otherChargePercentage;
    private BigDecimal otherChargeAmount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getTotalShippingPercentage() {
        return totalShippingPercentage;
    }

    public void setTotalShippingPercentage(BigDecimal totalShippingPercentage) {
        this.totalShippingPercentage = totalShippingPercentage;
    }

    public BigDecimal getTotalShippingAmount() {
        return totalShippingAmount;
    }

    public void setTotalShippingAmount(BigDecimal totalShippingAmount) {
        this.totalShippingAmount = totalShippingAmount;
    }

    public BigDecimal getWeightPercentage() {
        return weightPercentage;
    }

    public void setWeightPercentage(BigDecimal weightPercentage) {
        this.weightPercentage = weightPercentage;
    }

    public BigDecimal getWeightAmount() {
        return weightAmount;
    }

    public void setWeightAmount(BigDecimal weightAmount) {
        this.weightAmount = weightAmount;
    }

    public BigDecimal getInsuranceChargePercentage() {
        return insuranceChargePercentage;
    }

    public void setInsuranceChargePercentage(BigDecimal insuranceChargePercentage) {
        this.insuranceChargePercentage = insuranceChargePercentage;
    }

    public BigDecimal getInsuranceChargeAmount() {
        return insuranceChargeAmount;
    }

    public void setInsuranceChargeAmount(BigDecimal insuranceChargeAmount) {
        this.insuranceChargeAmount = insuranceChargeAmount;
    }

    public BigDecimal getPricePercentage() {
        return pricePercentage;
    }

    public void setPricePercentage(BigDecimal pricePercentage) {
        this.pricePercentage = pricePercentage;
    }

    public BigDecimal getPriceAmount() {
        return priceAmount;
    }

    public void setPriceAmount(BigDecimal priceAmount) {
        this.priceAmount = priceAmount;
    }

    public BigDecimal getGiftWrapChargePercentage() {
        return giftWrapChargePercentage;
    }

    public void setGiftWrapChargePercentage(BigDecimal giftWrapChargePercentage) {
        this.giftWrapChargePercentage = giftWrapChargePercentage;
    }

    public BigDecimal getGiftWrapChargeAmount() {
        return giftWrapChargeAmount;
    }

    public void setGiftWrapChargeAmount(BigDecimal giftWrapChargeAmount) {
        this.giftWrapChargeAmount = giftWrapChargeAmount;
    }

    public BigDecimal getOtherChargePercentage() {
        return otherChargePercentage;
    }

    public void setOtherChargePercentage(BigDecimal otherChargePercentage) {
        this.otherChargePercentage = otherChargePercentage;
    }

    public BigDecimal getOtherChargeAmount() {
        return otherChargeAmount;
    }

    public void setOtherChargeAmount(BigDecimal otherChargeAmount) {
        this.otherChargeAmount = otherChargeAmount;
    }

   
}
