package com.cieca.estimate.resource.entity.payment;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.cieca.estimate.resource.entity.party.PartyType;
import com.cieca.estimate.resource.entity.totals.TotalSubTypeEnum;


/**
 * <p>Java class for PaymentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PayerType" type="{http://www.cieca.com/BMS}PayerTypeEnum"/>
 *         &lt;element name="PaymentType" type="{http://www.cieca.com/BMS}PaymentTypeEnum"/>
 *         &lt;element name="Payee" type="{http://www.cieca.com/BMS}PayeeType" minOccurs="0"/>
 *         &lt;element name="PayeeInfo" type="{http://www.cieca.com/BMS}PartyType" minOccurs="0"/>
 *         &lt;element name="PayerInfo" type="{http://www.cieca.com/BMS}PartyType" minOccurs="0"/>
 *         &lt;element name="PaymentDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="PaymentAmt" type="{http://www.cieca.com/BMS}Currency"/>
 *         &lt;element name="PaymentID" type="{http://www.cieca.com/BMS}PaymentIDType" minOccurs="0"/>
 *         &lt;element name="PaymentMemo" type="{http://www.cieca.com/BMS}C" minOccurs="0"/>
 *         &lt;element name="PaymentAmtType" type="{http://www.cieca.com/BMS}TotalSubTypeEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInfoType", propOrder = {
    "payerType",
    "paymentType",
    "payee",
    "payeeInfo",
    "payerInfo",
    "paymentDateTime",
    "paymentAmt",
    "paymentID",
    "paymentMemo",
    "paymentAmtType"
})
public class PaymentInfoType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "PayerType", required = true)
    protected PayerTypeEnum payerType;
    @XmlElement(name = "PaymentType", required = true)
    protected PaymentTypeEnum paymentType;
    @XmlElement(name = "Payee")
    protected String payee;
    @XmlElement(name = "PayeeInfo")
    protected PartyType payeeInfo;
    @XmlElement(name = "PayerInfo")
    protected PartyType payerInfo;
    @XmlElement(name = "PaymentDateTime")
    protected XMLGregorianCalendar paymentDateTime;
    @XmlElement(name = "PaymentAmt", required = true)
    protected BigDecimal paymentAmt;
    @XmlElement(name = "PaymentID")
    protected String paymentID;
    @XmlElement(name = "PaymentMemo")
    protected String paymentMemo;
    @XmlElement(name = "PaymentAmtType")
    protected TotalSubTypeEnum paymentAmtType;

    /**
     * Gets the value of the payerType property.
     * 
     * @return
     *     possible object is
     *     {@link PayerTypeEnum }
     *     
     */
    public PayerTypeEnum getPayerType() {
        return payerType;
    }

    /**
     * Sets the value of the payerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerTypeEnum }
     *     
     */
    public void setPayerType(PayerTypeEnum value) {
        this.payerType = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeEnum }
     *     
     */
    public PaymentTypeEnum getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeEnum }
     *     
     */
    public void setPaymentType(PaymentTypeEnum value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the payee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayee() {
        return payee;
    }

    /**
     * Sets the value of the payee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayee(String value) {
        this.payee = value;
    }

    /**
     * Gets the value of the payeeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getPayeeInfo() {
        return payeeInfo;
    }

    /**
     * Sets the value of the payeeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setPayeeInfo(PartyType value) {
        this.payeeInfo = value;
    }

    /**
     * Gets the value of the payerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getPayerInfo() {
        return payerInfo;
    }

    /**
     * Sets the value of the payerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setPayerInfo(PartyType value) {
        this.payerInfo = value;
    }

    /**
     * Gets the value of the paymentDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDateTime() {
        return paymentDateTime;
    }

    /**
     * Sets the value of the paymentDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDateTime(XMLGregorianCalendar value) {
        this.paymentDateTime = value;
    }

    /**
     * Gets the value of the paymentAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentAmt() {
        return paymentAmt;
    }

    /**
     * Sets the value of the paymentAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentAmt(BigDecimal value) {
        this.paymentAmt = value;
    }

    /**
     * Gets the value of the paymentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentID() {
        return paymentID;
    }

    /**
     * Sets the value of the paymentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentID(String value) {
        this.paymentID = value;
    }

    /**
     * Gets the value of the paymentMemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMemo() {
        return paymentMemo;
    }

    /**
     * Sets the value of the paymentMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMemo(String value) {
        this.paymentMemo = value;
    }

    /**
     * Gets the value of the paymentAmtType property.
     * 
     * @return
     *     possible object is
     *     {@link TotalSubTypeEnum }
     *     
     */
    public TotalSubTypeEnum getPaymentAmtType() {
        return paymentAmtType;
    }

    /**
     * Sets the value of the paymentAmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalSubTypeEnum }
     *     
     */
    public void setPaymentAmtType(TotalSubTypeEnum value) {
        this.paymentAmtType = value;
    }

}
