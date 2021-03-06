package com.cieca.estimate.resource.entity.vehicle.description;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.cieca.estimate.resource.entity.address.CountryCodeOpenEnum;
import com.cieca.estimate.resource.entity.vehicle.license.LicensePlateTypeEnum;
import com.cieca.estimate.resource.entity.vehicle.options.OptionsType;


/**
 * <p>Java class for VehicleDescType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleDescType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductionDate" type="{http://www.cieca.com/BMS}YrMon" minOccurs="0"/>
 *         &lt;element name="ManufacturerCountryCode" type="{http://www.cieca.com/BMS}CountryCodeOpenEnum" minOccurs="0"/>
 *         &lt;element name="ModelYear" type="{http://www.cieca.com/BMS}Year" minOccurs="0"/>
 *         &lt;element name="MakeCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.cieca.com/BMS}C">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MakeDesc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.cieca.com/BMS}C">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ModelNum" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.cieca.com/BMS}C">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ModelName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.cieca.com/BMS}C">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SubModelDesc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.cieca.com/BMS}C">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VehicleType" type="{http://www.cieca.com/BMS}LicensePlateTypeEnum" minOccurs="0"/>
 *         &lt;element name="OdometerInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OdometerInd" type="{http://www.cieca.com/BMS}Boolean"/>
 *                   &lt;element name="OdometerReading" type="{http://www.cieca.com/BMS}Integer" minOccurs="0"/>
 *                   &lt;element name="OdometerReadingCode" type="{http://www.cieca.com/BMS}OdometerReadingCodeEnum" minOccurs="0"/>
 *                   &lt;element name="OdometerReadingMeasure" type="{http://www.cieca.com/BMS}UnitofMeasureClosedEnum" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Package" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.cieca.com/BMS}C">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VehicleOptions" type="{http://www.cieca.com/BMS}OptionsType" minOccurs="0"/>
 *         &lt;element name="DatabaseCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.cieca.com/BMS}C">
 *               &lt;maxLength value="10"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VehicleDescMemo" type="{http://www.cieca.com/BMS}C" minOccurs="0"/>
 *         &lt;element name="NICBInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NICBMake" type="{http://www.cieca.com/BMS}NICBType" minOccurs="0"/>
 *                   &lt;element name="NICBModel" type="{http://www.cieca.com/BMS}NICBType" minOccurs="0"/>
 *                   &lt;element name="NICBBodyStyle" type="{http://www.cieca.com/BMS}NICBType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="KeysAvailableInd" type="{http://www.cieca.com/BMS}Indicator" minOccurs="0"/>
 *         &lt;element name="Parts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MissingParts" type="{http://www.cieca.com/BMS}PartsType" minOccurs="0"/>
 *                   &lt;element name="AdditionalParts" type="{http://www.cieca.com/BMS}PartsType" minOccurs="0"/>
 *                   &lt;element name="NonStandardParts" type="{http://www.cieca.com/BMS}PartsType" minOccurs="0"/>
 *                   &lt;element name="DamagedParts" type="{http://www.cieca.com/BMS}PartsType" minOccurs="0"/>
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
@XmlType(name = "VehicleDescType", propOrder = {
    "productionDate",
    "manufacturerCountryCode",
    "modelYear",
    "makeCode",
    "makeDesc",
    "modelNum",
    "modelName",
    "subModelDesc",
    "vehicleType",
    "odometerInfo",
    "_package",
    "vehicleOptions",
    "databaseCode",
    "vehicleDescMemo",
    "nicbInfo",
    "keysAvailableInd",
    "parts"
})
public class VehicleDescType implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "ProductionDate")
    protected XMLGregorianCalendar productionDate;
    @XmlElement(name = "ManufacturerCountryCode")
    protected CountryCodeOpenEnum manufacturerCountryCode;
    @XmlElement(name = "ModelYear")
    protected XMLGregorianCalendar modelYear;
    @XmlElement(name = "MakeCode")
    protected String makeCode;
    @XmlElement(name = "MakeDesc")
    protected String makeDesc;
    @XmlElement(name = "ModelNum")
    protected String modelNum;
    @XmlElement(name = "ModelName")
    protected String modelName;
    @XmlElement(name = "SubModelDesc")
    protected String subModelDesc;
    @XmlElement(name = "VehicleType")
    protected LicensePlateTypeEnum vehicleType;
    @XmlElement(name = "OdometerInfo")
    protected OdometerInfoType odometerInfo;
    @XmlElement(name = "Package")
    protected List<String> _package;
    @XmlElement(name = "VehicleOptions")
    protected OptionsType vehicleOptions;
    @XmlElement(name = "DatabaseCode")
    protected String databaseCode;
    @XmlElement(name = "VehicleDescMemo")
    protected String vehicleDescMemo;
    @XmlElement(name = "NICBInfo")
    protected NICBInfoType nicbInfo;
    @XmlElement(name = "KeysAvailableInd")
    protected String keysAvailableInd;
    @XmlElement(name = "Parts")
    protected PartsType parts;

    /**
     * Gets the value of the productionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProductionDate() {
        return productionDate;
    }

    /**
     * Sets the value of the productionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProductionDate(XMLGregorianCalendar value) {
        this.productionDate = value;
    }

    /**
     * Gets the value of the manufacturerCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeOpenEnum }
     *     
     */
    public CountryCodeOpenEnum getManufacturerCountryCode() {
        return manufacturerCountryCode;
    }

    /**
     * Sets the value of the manufacturerCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeOpenEnum }
     *     
     */
    public void setManufacturerCountryCode(CountryCodeOpenEnum value) {
        this.manufacturerCountryCode = value;
    }

    /**
     * Gets the value of the modelYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModelYear() {
        return modelYear;
    }

    /**
     * Sets the value of the modelYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModelYear(XMLGregorianCalendar value) {
        this.modelYear = value;
    }

    /**
     * Gets the value of the makeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakeCode() {
        return makeCode;
    }

    /**
     * Sets the value of the makeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMakeCode(String value) {
        this.makeCode = value;
    }

    /**
     * Gets the value of the makeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakeDesc() {
        return makeDesc;
    }

    /**
     * Sets the value of the makeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMakeDesc(String value) {
        this.makeDesc = value;
    }

    /**
     * Gets the value of the modelNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNum() {
        return modelNum;
    }

    /**
     * Sets the value of the modelNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNum(String value) {
        this.modelNum = value;
    }

    /**
     * Gets the value of the modelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Sets the value of the modelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * Gets the value of the subModelDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubModelDesc() {
        return subModelDesc;
    }

    /**
     * Sets the value of the subModelDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubModelDesc(String value) {
        this.subModelDesc = value;
    }

    /**
     * Gets the value of the vehicleType property.
     * 
     * @return
     *     possible object is
     *     {@link LicensePlateTypeEnum }
     *     
     */
    public LicensePlateTypeEnum getVehicleType() {
        return vehicleType;
    }

    /**
     * Sets the value of the vehicleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicensePlateTypeEnum }
     *     
     */
    public void setVehicleType(LicensePlateTypeEnum value) {
        this.vehicleType = value;
    }

    /**
     * Gets the value of the odometerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OdometerInfoType }
     *     
     */
    public OdometerInfoType getOdometerInfo() {
        return odometerInfo;
    }

    /**
     * Sets the value of the odometerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OdometerInfoType }
     *     
     */
    public void setOdometerInfo(OdometerInfoType value) {
        this.odometerInfo = value;
    }

    /**
     * Gets the value of the package property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the package property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPackage() {
        if (_package == null) {
            _package = new ArrayList<String>();
        }
        return this._package;
    }

    /**
     * Gets the value of the vehicleOptions property.
     * 
     * @return
     *     possible object is
     *     {@link OptionsType }
     *     
     */
    public OptionsType getVehicleOptions() {
        return vehicleOptions;
    }

    /**
     * Sets the value of the vehicleOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsType }
     *     
     */
    public void setVehicleOptions(OptionsType value) {
        this.vehicleOptions = value;
    }

    /**
     * Gets the value of the databaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseCode() {
        return databaseCode;
    }

    /**
     * Sets the value of the databaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseCode(String value) {
        this.databaseCode = value;
    }

    /**
     * Gets the value of the vehicleDescMemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleDescMemo() {
        return vehicleDescMemo;
    }

    /**
     * Sets the value of the vehicleDescMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleDescMemo(String value) {
        this.vehicleDescMemo = value;
    }

    /**
     * Gets the value of the nicbInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleDescType.NICBInfo }
     *     
     */
    public NICBInfoType getNICBInfo() {
        return nicbInfo;
    }

    /**
     * Sets the value of the nicbInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleDescType.NICBInfo }
     *     
     */
    public void setNICBInfo(NICBInfoType value) {
        this.nicbInfo = value;
    }

    /**
     * Gets the value of the keysAvailableInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeysAvailableInd() {
        return keysAvailableInd;
    }

    /**
     * Sets the value of the keysAvailableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeysAvailableInd(String value) {
        this.keysAvailableInd = value;
    }

    /**
     * Gets the value of the parts property.
     * 
     * @return
     *     possible object is
     *     {@link PartsType }
     *     
     */
    public PartsType getParts() {
        return parts;
    }

    /**
     * Sets the value of the parts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartsType }
     *     
     */
    public void setParts(PartsType value) {
        this.parts = value;
    }
}
