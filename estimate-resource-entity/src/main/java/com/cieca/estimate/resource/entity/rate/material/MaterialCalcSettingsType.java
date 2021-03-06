package com.cieca.estimate.resource.entity.rate.material;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cieca.estimate.resource.entity.damage.LaborOperationEnum;

/**
 * <p>Java class for MaterialCalcSettingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaterialCalcSettingsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CalcMethodCode" type="{http://www.cieca.com/BMS}CalculationMethodClosedEnumType"/>
 *         &lt;element name="CalcMaxAmt" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="CalcMaxHours" type="{http://www.cieca.com/BMS}Decimal_Range_0-999.9" minOccurs="0"/>
 *         &lt;element name="OperationInclCode" type="{http://www.cieca.com/BMS}LaborOperationClosedEnumType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialCalcSettingsType", propOrder = {
    "calcMethodCode",
    "calcMaxAmt",
    "calcMaxHours",
    "operationInclCode"
})
public class MaterialCalcSettingsType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    
    @XmlElement(name = "CalcMethodCode", required = true)
    protected CalculationMethodEnum calcMethodCode;
    
    @XmlElement(name = "CalcMaxAmt")
    protected BigDecimal calcMaxAmt;
    
    @XmlElement(name = "CalcMaxHours")
    protected BigDecimal calcMaxHours;
    
    @XmlElement(name = "OperationInclCode")
    protected List<LaborOperationEnum> operationInclCode;

    /**
     * Gets the value of the calcMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationMethodEnum }
     *     
     */
    public CalculationMethodEnum getCalcMethodCode() {
        return calcMethodCode;
    }

    /**
     * Sets the value of the calcMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationMethodEnum }
     *     
     */
    public void setCalcMethodCode(CalculationMethodEnum value) {
        this.calcMethodCode = value;
    }

    /**
     * Gets the value of the calcMaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalcMaxAmt() {
        return calcMaxAmt;
    }

    /**
     * Sets the value of the calcMaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalcMaxAmt(BigDecimal value) {
        this.calcMaxAmt = value;
    }

    /**
     * Gets the value of the calcMaxHours property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalcMaxHours() {
        return calcMaxHours;
    }

    /**
     * Sets the value of the calcMaxHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalcMaxHours(BigDecimal value) {
        this.calcMaxHours = value;
    }

    /**
     * Gets the value of the operationInclCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationInclCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationInclCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LaborOperationEnum }
     * 
     * 
     */
    public List<LaborOperationEnum> getOperationInclCode() {
        if (operationInclCode == null) {
            operationInclCode = new ArrayList<LaborOperationEnum>();
        }
        return this.operationInclCode;
    }

}
