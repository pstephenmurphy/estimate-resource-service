package com.cieca.estimate.resource.entity.parts;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cieca.estimate.resource.entity.vehicle.UnitofMeasureOpenEnum;

/**
 * <p>Java class for DimensionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DimensionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Length" type="{http://www.cieca.com/BMS}Decimal_Range_0-9999999999.99"/>
 *         &lt;element name="Width" type="{http://www.cieca.com/BMS}Decimal_Range_0-9999999999.99"/>
 *         &lt;element name="Height" type="{http://www.cieca.com/BMS}Decimal_Range_0-9999999999.99"/>
 *         &lt;element name="UnitOfMeasure" type="{http://www.cieca.com/BMS}UnitOfMeasureOpenEnumType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DimensionsType", propOrder = {
    "length",
    "width",
    "height",
    "unitOfMeasure"
})
public class DimensionsType implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "Length", required = true)
    protected BigDecimal length;
    @XmlElement(name = "Width", required = true)
    protected BigDecimal width;
    @XmlElement(name = "Height", required = true)
    protected BigDecimal height;
    @XmlElement(name = "UnitOfMeasure", required = true)
    protected UnitofMeasureOpenEnum unitOfMeasure;

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLength(BigDecimal value) {
        this.length = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWidth(BigDecimal value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeight(BigDecimal value) {
        this.height = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitofMeasureOpenEnum }
     *     
     */
    public UnitofMeasureOpenEnum getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitofMeasureOpenEnum }
     *     
     */
    public void setUnitOfMeasure(UnitofMeasureOpenEnum value) {
        this.unitOfMeasure = value;
    }

}
