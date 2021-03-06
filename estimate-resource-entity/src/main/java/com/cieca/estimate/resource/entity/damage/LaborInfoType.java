package com.cieca.estimate.resource.entity.damage;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cieca.estimate.resource.entity.adjustment.LaborAdjustmentType;

/**
 * <p>Java class for LaborInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LaborInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LaborType" type="{http://www.cieca.com/BMS}LaborTypeClosedEnumType"/>
 *         &lt;element name="DatabaseLaborType" type="{http://www.cieca.com/BMS}LaborTypeClosedEnumType" minOccurs="0"/>
 *         &lt;element name="LaborOperation" type="{http://www.cieca.com/BMS}LaborOperationClosedEnumType" minOccurs="0"/>
 *         &lt;element name="LaborHours" type="{http://www.cieca.com/BMS}Decimal_Range_-999.9-999.9" minOccurs="0"/>
 *         &lt;element name="DatabaseLaborHours" type="{http://www.cieca.com/BMS}Decimal_Range_-999.9-999.9" minOccurs="0"/>
 *         &lt;element name="LaborHoursCalc" type="{http://www.cieca.com/BMS}Decimal_Range_-999.9-999.9" minOccurs="0"/>
 *         &lt;element name="LaborTier" type="{http://www.cieca.com/BMS}Integer_Range_1-9" minOccurs="0"/>
 *         &lt;element name="LaborInclInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="LaborOverlapInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="LaborAmt" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="DatabaseLaborAmt" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="LaborHourlyRate" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="LaborAdjustment" type="{http://www.cieca.com/BMS}LaborAdjustmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaxableInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="LaborAmtJudgmentInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="LaborHoursJudgmentInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="LaborOperationJudgmentInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="LaborTypeJudgmentInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="DrillingInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="PaintStagesNum" type="{http://www.cieca.com/BMS}Integer_Range_0-9" minOccurs="0"/>
 *         &lt;element name="PaintTonesNum" type="{http://www.cieca.com/BMS}Integer_Range_0-99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LaborInfoType", propOrder = {
    "laborType",
    "databaseLaborType",
    "laborOperation",
    "laborHours",
    "databaseLaborHours",
    "laborHoursCalc",
    "laborTier",
    "laborInclInd",
    "laborOverlapInd",
    "laborAmt",
    "databaseLaborAmt",
    "laborHourlyRate",
    "laborAdjustment",
    "taxableInd",
    "laborAmtJudgmentInd",
    "laborHoursJudgmentInd",
    "laborOperationJudgmentInd",
    "laborTypeJudgmentInd",
    "drillingInd",
    "paintStagesNum",
    "paintTonesNum"
})
public class LaborInfoType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "LaborType", required = true)
    protected LaborTypeEnum laborType;
    @XmlElement(name = "DatabaseLaborType")
    protected LaborTypeEnum databaseLaborType;
    @XmlElement(name = "LaborOperation")
    protected LaborOperationEnum laborOperation;
    @XmlElement(name = "LaborHours")
    protected BigDecimal laborHours;
    @XmlElement(name = "DatabaseLaborHours")
    protected BigDecimal databaseLaborHours;
    @XmlElement(name = "LaborHoursCalc")
    protected BigDecimal laborHoursCalc;
    @XmlElement(name = "LaborTier")
    protected Integer laborTier;
    @XmlElement(name = "LaborInclInd")
    protected Boolean laborInclInd;
    @XmlElement(name = "LaborOverlapInd")
    protected Boolean laborOverlapInd;
    @XmlElement(name = "LaborAmt")
    protected BigDecimal laborAmt;
    @XmlElement(name = "DatabaseLaborAmt")
    protected BigDecimal databaseLaborAmt;
    @XmlElement(name = "LaborHourlyRate")
    protected BigDecimal laborHourlyRate;
    @XmlElement(name = "LaborAdjustment")
    protected List<LaborAdjustmentType> laborAdjustment;
    @XmlElement(name = "TaxableInd")
    protected Boolean taxableInd;
    @XmlElement(name = "LaborAmtJudgmentInd")
    protected Boolean laborAmtJudgmentInd;
    @XmlElement(name = "LaborHoursJudgmentInd")
    protected Boolean laborHoursJudgmentInd;
    @XmlElement(name = "LaborOperationJudgmentInd")
    protected Boolean laborOperationJudgmentInd;
    @XmlElement(name = "LaborTypeJudgmentInd")
    protected Boolean laborTypeJudgmentInd;
    @XmlElement(name = "DrillingInd")
    protected Boolean drillingInd;
    @XmlElement(name = "PaintStagesNum")
    protected Integer paintStagesNum;
    @XmlElement(name = "PaintTonesNum")
    protected Integer paintTonesNum;

    /**
     * Gets the value of the laborType property.
     * 
     * @return
     *     possible object is
     *     {@link LaborTypeEnum }
     *     
     */
    public LaborTypeEnum getLaborType() {
        return laborType;
    }

    /**
     * Sets the value of the laborType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaborTypeEnum }
     *     
     */
    public void setLaborType(LaborTypeEnum value) {
        this.laborType = value;
    }

    /**
     * Gets the value of the databaseLaborType property.
     * 
     * @return
     *     possible object is
     *     {@link LaborTypeEnum }
     *     
     */
    public LaborTypeEnum getDatabaseLaborType() {
        return databaseLaborType;
    }

    /**
     * Sets the value of the databaseLaborType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaborTypeEnum }
     *     
     */
    public void setDatabaseLaborType(LaborTypeEnum value) {
        this.databaseLaborType = value;
    }

    /**
     * Gets the value of the laborOperation property.
     * 
     * @return
     *     possible object is
     *     {@link LaborOperationEnum }
     *     
     */
    public LaborOperationEnum getLaborOperation() {
        return laborOperation;
    }

    /**
     * Sets the value of the laborOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaborOperationEnum }
     *     
     */
    public void setLaborOperation(LaborOperationEnum value) {
        this.laborOperation = value;
    }

    /**
     * Gets the value of the laborHours property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLaborHours() {
        return laborHours;
    }

    /**
     * Sets the value of the laborHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLaborHours(BigDecimal value) {
        this.laborHours = value;
    }

    /**
     * Gets the value of the databaseLaborHours property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatabaseLaborHours() {
        return databaseLaborHours;
    }

    /**
     * Sets the value of the databaseLaborHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatabaseLaborHours(BigDecimal value) {
        this.databaseLaborHours = value;
    }

    /**
     * Gets the value of the laborHoursCalc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLaborHoursCalc() {
        return laborHoursCalc;
    }

    /**
     * Sets the value of the laborHoursCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLaborHoursCalc(BigDecimal value) {
        this.laborHoursCalc = value;
    }

    /**
     * Gets the value of the laborTier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLaborTier() {
        return laborTier;
    }

    /**
     * Sets the value of the laborTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLaborTier(Integer value) {
        this.laborTier = value;
    }

    /**
     * Gets the value of the laborInclInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLaborInclInd() {
        return laborInclInd;
    }

    /**
     * Sets the value of the laborInclInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLaborInclInd(Boolean value) {
        this.laborInclInd = value;
    }

    /**
     * Gets the value of the laborOverlapInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLaborOverlapInd() {
        return laborOverlapInd;
    }

    /**
     * Sets the value of the laborOverlapInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLaborOverlapInd(Boolean value) {
        this.laborOverlapInd = value;
    }

    /**
     * Gets the value of the laborAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLaborAmt() {
        return laborAmt;
    }

    /**
     * Sets the value of the laborAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLaborAmt(BigDecimal value) {
        this.laborAmt = value;
    }

    /**
     * Gets the value of the databaseLaborAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatabaseLaborAmt() {
        return databaseLaborAmt;
    }

    /**
     * Sets the value of the databaseLaborAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatabaseLaborAmt(BigDecimal value) {
        this.databaseLaborAmt = value;
    }

    /**
     * Gets the value of the laborHourlyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLaborHourlyRate() {
        return laborHourlyRate;
    }

    /**
     * Sets the value of the laborHourlyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLaborHourlyRate(BigDecimal value) {
        this.laborHourlyRate = value;
    }

    /**
     * Gets the value of the laborAdjustment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the laborAdjustment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLaborAdjustment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LaborAdjustmentType }
     * 
     * 
     */
    public List<LaborAdjustmentType> getLaborAdjustment() {
        if (laborAdjustment == null) {
            laborAdjustment = new ArrayList<LaborAdjustmentType>();
        }
        return this.laborAdjustment;
    }

    /**
     * Gets the value of the taxableInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxableInd() {
        return taxableInd;
    }

    /**
     * Sets the value of the taxableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxableInd(Boolean value) {
        this.taxableInd = value;
    }

    /**
     * Gets the value of the laborAmtJudgmentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLaborAmtJudgmentInd() {
        return laborAmtJudgmentInd;
    }

    /**
     * Sets the value of the laborAmtJudgmentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLaborAmtJudgmentInd(Boolean value) {
        this.laborAmtJudgmentInd = value;
    }

    /**
     * Gets the value of the laborHoursJudgmentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLaborHoursJudgmentInd() {
        return laborHoursJudgmentInd;
    }

    /**
     * Sets the value of the laborHoursJudgmentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLaborHoursJudgmentInd(Boolean value) {
        this.laborHoursJudgmentInd = value;
    }

    /**
     * Gets the value of the laborOperationJudgmentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLaborOperationJudgmentInd() {
        return laborOperationJudgmentInd;
    }

    /**
     * Sets the value of the laborOperationJudgmentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLaborOperationJudgmentInd(Boolean value) {
        this.laborOperationJudgmentInd = value;
    }

    /**
     * Gets the value of the laborTypeJudgmentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLaborTypeJudgmentInd() {
        return laborTypeJudgmentInd;
    }

    /**
     * Sets the value of the laborTypeJudgmentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLaborTypeJudgmentInd(Boolean value) {
        this.laborTypeJudgmentInd = value;
    }

    /**
     * Gets the value of the drillingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDrillingInd() {
        return drillingInd;
    }

    /**
     * Sets the value of the drillingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDrillingInd(Boolean value) {
        this.drillingInd = value;
    }

    /**
     * Gets the value of the paintStagesNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaintStagesNum() {
        return paintStagesNum;
    }

    /**
     * Sets the value of the paintStagesNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaintStagesNum(Integer value) {
        this.paintStagesNum = value;
    }

    /**
     * Gets the value of the paintTonesNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaintTonesNum() {
        return paintTonesNum;
    }

    /**
     * Sets the value of the paintTonesNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaintTonesNum(Integer value) {
        this.paintTonesNum = value;
    }

}
