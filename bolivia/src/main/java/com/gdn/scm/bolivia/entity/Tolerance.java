/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.entity;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author sofrie.zumaytis
 */
@Entity
@Table(name = Tolerance.TABLE_NAME)
@Getter
@Setter
public class Tolerance {

    public static final String TABLE_NAME = "BLV_TOLERANCE";

    public static final String COLUMN_ID = "ID";

    public static final String COLUMN_TOTAL_SHIPPING_PERCENTAGE = "TOTAL_SHIPPING_PERCENTAGE";
    public static final String COLUMN_TOTAL_SHIPPING_AMOUNT = "TOTAL_SHIPPING_AMOUNT";
    public static final String COLUMN_WEIGHT_PERCENTAGE = "WEIGHT_PERCENTAGE";
    public static final String COLUMN_WEIGHT_AMOUNT = "WEIGHT_AMOUNT";
    public static final String COLUMN_INSURANCE_CHARGE_PERCENTAGE = "INSURANCE_CHARGE_PERCENTAGE";
    public static final String COLUMN_INSURANCE_CHARGE_AMOUNT = "INSURANCE_CHARGE_AMOUNT";
    public static final String COLUMN_PRICE_PERCENTAGE = "PRICE_PERCENTAGE";
    public static final String COLUMN_PRICE_AMOUNT = "PRICE_AMOUNT";
    public static final String COLUMN_GIFT_WRAP_CHARGE_PERCENTAGE = "GIFT_WRAP_CHARGE_PERCENTAGE";
    public static final String COLUMN_GIFT_WRAP_CHARGE_AMOUNT = "GIFT_WRAP_CHARGE_AMOUNT";
    public static final String COLUMN_OTHER_CHARGE_PERCENTAGE = "OTHER_CHARGE_PERCENTAGE";
    public static final String COLUMN_OTHER_CHARGE_AMOUNT = "OTHER_CHARGE_AMOUNT";

    @Column(name = COLUMN_ID, nullable = true)
    @Id
    private String id;

    @Column(name = COLUMN_TOTAL_SHIPPING_PERCENTAGE, nullable = true)
    private BigDecimal totalShippingPercentage;
    @Column(name = COLUMN_TOTAL_SHIPPING_AMOUNT, nullable = true)
    private BigDecimal totalShippingAmount;

    @Column(name = COLUMN_WEIGHT_PERCENTAGE, nullable = true)
    private BigDecimal weightPercentage;
    @Column(name = COLUMN_WEIGHT_AMOUNT, nullable = true)
    private BigDecimal weightAmount;

    @Column(name = COLUMN_INSURANCE_CHARGE_PERCENTAGE, nullable = true)
    private BigDecimal insuranceChargePercentage;
    @Column(name = COLUMN_INSURANCE_CHARGE_AMOUNT, nullable = true)
    private BigDecimal insuranceChargeAmount;

    @Column(name = COLUMN_PRICE_PERCENTAGE, nullable = true)
    private BigDecimal pricePercentage;
    @Column(name = COLUMN_PRICE_AMOUNT, nullable = true)
    private BigDecimal priceAmount;

    @Column(name = COLUMN_GIFT_WRAP_CHARGE_PERCENTAGE, nullable = true)
    private BigDecimal giftWrapChargePercentage;
    @Column(name = COLUMN_GIFT_WRAP_CHARGE_AMOUNT, nullable = true)
    private BigDecimal giftWrapChargeAmount;

    @Column(name = COLUMN_OTHER_CHARGE_PERCENTAGE, nullable = true)
    private BigDecimal otherChargePercentage;
    @Column(name = COLUMN_OTHER_CHARGE_AMOUNT, nullable = true)
    private BigDecimal otherChargeAmount;

    public Tolerance() {
    }

    public Tolerance(BigDecimal totalShippingPercentage, BigDecimal totalShippingAmount, BigDecimal weightPercentage, BigDecimal weightAmount, BigDecimal insuranceChargePercentage, BigDecimal insuranceChargeAmount, BigDecimal pricePercentage, BigDecimal priceAmount, BigDecimal giftWrapChargePercentage, BigDecimal giftWrapChargeAmount, BigDecimal otherChargePercentage, BigDecimal otherChargeAmount) {
        this.totalShippingPercentage = totalShippingPercentage;
        this.totalShippingAmount = totalShippingAmount;
        this.weightPercentage = weightPercentage;
        this.weightAmount = weightAmount;
        this.insuranceChargePercentage = insuranceChargePercentage;
        this.insuranceChargeAmount = insuranceChargeAmount;
        this.pricePercentage = pricePercentage;
        this.priceAmount = priceAmount;
        this.giftWrapChargePercentage = giftWrapChargePercentage;
        this.giftWrapChargeAmount = giftWrapChargeAmount;
        this.otherChargePercentage = otherChargePercentage;
        this.otherChargeAmount = otherChargeAmount;
    }
}
