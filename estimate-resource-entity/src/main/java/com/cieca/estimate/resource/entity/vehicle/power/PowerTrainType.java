package com.cieca.estimate.resource.entity.vehicle.power;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cieca.estimate.resource.entity.vehicle.options.OptionsType;


/**
 * <p>Java class for PowertrainType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowertrainType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EngineNum" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.cieca.com/BMS}C">
 *               &lt;maxLength value="20"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EngineDesc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.cieca.com/BMS}C">
 *               &lt;maxLength value="80"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EngineCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.cieca.com/BMS}C">
 *               &lt;maxLength value="30"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EngineOptions" type="{http://www.cieca.com/BMS}OptionsType" minOccurs="0"/>
 *         &lt;element name="TransmissionInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TransmissionCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.cieca.com/BMS}C">
 *                         &lt;maxLength value="30"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TransmissionDesc" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.cieca.com/BMS}C">
 *                         &lt;maxLength value="80"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TransmissionOptions" type="{http://www.cieca.com/BMS}OptionsType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Configuration" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.cieca.com/BMS}C">
 *               &lt;maxLength value="20"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FuelType" type="{http://www.cieca.com/BMS}FuelTypeEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowertrainType", propOrder = {
    "engineNum",
    "engineDesc",
    "engineCode",
    "engineOptions",
    "transmissionInfo",
    "configuration",
    "fuelType"
})
public class PowerTrainType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "EngineNum")
    protected String engineNum;
    @XmlElement(name = "EngineDesc")
    protected String engineDesc;
    @XmlElement(name = "EngineCode")
    protected String engineCode;
    @XmlElement(name = "EngineOptions")
    protected OptionsType engineOptions;
    @XmlElement(name = "TransmissionInfo")
    protected TransmissionInfoType transmissionInfo;
    @XmlElement(name = "Configuration")
    protected String configuration;
    @XmlElement(name = "FuelType")
    protected FuelTypeEnum fuelType;

    /**
     * Gets the value of the engineNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineNum() {
        return engineNum;
    }

    /**
     * Sets the value of the engineNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineNum(String value) {
        this.engineNum = value;
    }

    /**
     * Gets the value of the engineDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineDesc() {
        return engineDesc;
    }

    /**
     * Sets the value of the engineDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineDesc(String value) {
        this.engineDesc = value;
    }

    /**
     * Gets the value of the engineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineCode() {
        return engineCode;
    }

    /**
     * Sets the value of the engineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineCode(String value) {
        this.engineCode = value;
    }

    /**
     * Gets the value of the engineOptions property.
     * 
     * @return
     *     possible object is
     *     {@link OptionsType }
     *     
     */
    public OptionsType getEngineOptions() {
        return engineOptions;
    }

    /**
     * Sets the value of the engineOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsType }
     *     
     */
    public void setEngineOptions(OptionsType value) {
        this.engineOptions = value;
    }

    /**
     * Gets the value of the transmissionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PowerTrainType.TransmissionInfo }
     *     
     */
    public TransmissionInfoType getTransmissionInfo() {
        return transmissionInfo;
    }

    /**
     * Sets the value of the transmissionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerTrainType.TransmissionInfo }
     *     
     */
    public void setTransmissionInfo(TransmissionInfoType value) {
        this.transmissionInfo = value;
    }

    /**
     * Gets the value of the configuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfiguration(String value) {
        this.configuration = value;
    }

    /**
     * Gets the value of the fuelType property.
     * 
     * @return
     *     possible object is
     *     {@link FuelTypeEnum }
     *     
     */
    public FuelTypeEnum getFuelType() {
        return fuelType;
    }

    /**
     * Sets the value of the fuelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuelTypeEnum }
     *     
     */
    public void setFuelType(FuelTypeEnum value) {
        this.fuelType = value;
    }
}
