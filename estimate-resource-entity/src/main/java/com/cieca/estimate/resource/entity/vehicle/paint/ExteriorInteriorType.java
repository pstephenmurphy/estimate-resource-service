package com.cieca.estimate.resource.entity.vehicle.paint;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExteriorInteriorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExteriorInteriorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Color" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ColorName" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.cieca.com/BMS}C">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="80"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OEMColorCode" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.cieca.com/BMS}C">
 *                         &lt;maxLength value="20"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="VendorColorCode" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.cieca.com/BMS}C">
 *                         &lt;maxLength value="20"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CustomColorCode" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.cieca.com/BMS}C">
 *                         &lt;maxLength value="20"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExteriorInteriorType", propOrder = {
    "color"
})
public class ExteriorInteriorType implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    
    @XmlElement(name = "Color", required = true)
    protected List<ColorType> color;

    /**
     * Gets the value of the color property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the color property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColorType }
     * 
     * 
     */
    public List<ColorType> getColor() {
        if (color == null) {
            color = new ArrayList<ColorType>();
        }
        return this.color;
    }

}
