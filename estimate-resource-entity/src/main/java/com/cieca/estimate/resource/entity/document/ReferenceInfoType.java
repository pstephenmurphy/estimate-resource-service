package com.cieca.estimate.resource.entity.document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferenceInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassThroughInfo" type="{http://www.cieca.com/BMS}PassThroughInfoType" minOccurs="0"/>
 *         &lt;element name="InternalGroupInfo" type="{http://www.cieca.com/BMS}InternalGroupInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ThirdPartyAdministratorIDInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Affiliation" type="{http://www.cieca.com/BMS}AffiliationEnum"/>
 *                   &lt;element name="FileID" type="{http://www.cieca.com/BMS}FileIDType"/>
 *                   &lt;element name="RelatedFileID" type="{http://www.cieca.com/BMS}FileIDType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CompanyID" type="{http://www.cieca.com/BMS}CompanyIDType" minOccurs="0"/>
 *         &lt;element name="RepairOrderID" type="{http://www.cieca.com/BMS}RepairOrderIDType" minOccurs="0"/>
 *         &lt;element name="InsuranceCompanyPrimaryID" type="{http://www.cieca.com/BMS}CompanyPrimaryIDType" minOccurs="0"/>
 *         &lt;element name="RentalCarCompanyPrimaryID" type="{http://www.cieca.com/BMS}CompanyPrimaryIDType" minOccurs="0"/>
 *         &lt;element name="StockNum" type="{http://www.cieca.com/BMS}StockNumType" minOccurs="0"/>
 *         &lt;element name="OtherReferenceInfo" type="{http://www.cieca.com/BMS}OtherReferenceInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceInfoType", propOrder = {
    "passThroughInfo",
    "internalGroupInfo",
    "thirdPartyAdministratorIDInfo",
    "companyID",
    "repairOrderID",
    "insuranceCompanyPrimaryID",
    "rentalCarCompanyPrimaryID",
    "stockNum",
    "otherReferenceInfo"
})
public class ReferenceInfoType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "PassThroughInfo")
    protected String passThroughInfo;
    @XmlElement(name = "InternalGroupInfo")
    protected List<InternalGroupInfoType> internalGroupInfo;
    @XmlElement(name = "ThirdPartyAdministratorIDInfo")
    protected List<ThirdPartyAdministratorIDInfoType> thirdPartyAdministratorIDInfo;
    @XmlElement(name = "CompanyID")
    protected String companyID;
    @XmlElement(name = "RepairOrderID")
    protected String repairOrderID;
    @XmlElement(name = "InsuranceCompanyPrimaryID")
    protected String insuranceCompanyPrimaryID;
    @XmlElement(name = "RentalCarCompanyPrimaryID")
    protected String rentalCarCompanyPrimaryID;
    @XmlElement(name = "StockNum")
    protected String stockNum;
    @XmlElement(name = "OtherReferenceInfo")
    protected List<OtherReferenceInfoType> otherReferenceInfo;

    /**
     * Gets the value of the passThroughInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassThroughInfo() {
        return passThroughInfo;
    }

    /**
     * Sets the value of the passThroughInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassThroughInfo(String value) {
        this.passThroughInfo = value;
    }

    /**
     * Gets the value of the internalGroupInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalGroupInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalGroupInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternalGroupInfoType }
     * 
     * 
     */
    public List<InternalGroupInfoType> getInternalGroupInfo() {
        if (internalGroupInfo == null) {
            internalGroupInfo = new ArrayList<InternalGroupInfoType>();
        }
        return this.internalGroupInfo;
    }

    /**
     * Gets the value of the thirdPartyAdministratorIDInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thirdPartyAdministratorIDInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThirdPartyAdministratorIDInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThirdPartyAdministratorIDInfoType }
     * 
     * 
     */
    public List<ThirdPartyAdministratorIDInfoType> getThirdPartyAdministratorIDInfo() {
        if (thirdPartyAdministratorIDInfo == null) {
            thirdPartyAdministratorIDInfo = new ArrayList<ThirdPartyAdministratorIDInfoType>();
        }
        return this.thirdPartyAdministratorIDInfo;
    }

    /**
     * Gets the value of the companyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyID() {
        return companyID;
    }

    /**
     * Sets the value of the companyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyID(String value) {
        this.companyID = value;
    }

    /**
     * Gets the value of the repairOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepairOrderID() {
        return repairOrderID;
    }

    /**
     * Sets the value of the repairOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepairOrderID(String value) {
        this.repairOrderID = value;
    }

    /**
     * Gets the value of the insuranceCompanyPrimaryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceCompanyPrimaryID() {
        return insuranceCompanyPrimaryID;
    }

    /**
     * Sets the value of the insuranceCompanyPrimaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceCompanyPrimaryID(String value) {
        this.insuranceCompanyPrimaryID = value;
    }

    /**
     * Gets the value of the rentalCarCompanyPrimaryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentalCarCompanyPrimaryID() {
        return rentalCarCompanyPrimaryID;
    }

    /**
     * Sets the value of the rentalCarCompanyPrimaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentalCarCompanyPrimaryID(String value) {
        this.rentalCarCompanyPrimaryID = value;
    }

    /**
     * Gets the value of the stockNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockNum() {
        return stockNum;
    }

    /**
     * Sets the value of the stockNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockNum(String value) {
        this.stockNum = value;
    }

    /**
     * Gets the value of the otherReferenceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherReferenceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherReferenceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherReferenceInfoType }
     * 
     * 
     */
    public List<OtherReferenceInfoType> getOtherReferenceInfo() {
        if (otherReferenceInfo == null) {
            otherReferenceInfo = new ArrayList<OtherReferenceInfoType>();
        }
        return this.otherReferenceInfo;
    }
}
