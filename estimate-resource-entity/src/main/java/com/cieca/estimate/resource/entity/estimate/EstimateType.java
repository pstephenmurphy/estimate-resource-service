package com.cieca.estimate.resource.entity.estimate;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.cieca.entity.Entity;
import com.cieca.estimate.resource.entity.admin.AdminInfoType;
import com.cieca.estimate.resource.entity.application.ApplicationInfoType;
import com.cieca.estimate.resource.entity.claim.ClaimInfoType;
import com.cieca.estimate.resource.entity.damage.DamageLineInfoType;
import com.cieca.estimate.resource.entity.document.DocumentInfoType;
import com.cieca.estimate.resource.entity.event.EventInfoType;
import com.cieca.estimate.resource.entity.idinfo.EstimatorIDsTypeType;
import com.cieca.estimate.resource.entity.payment.PaymentInfoType;
import com.cieca.estimate.resource.entity.profile.ProfileInfoType;
import com.cieca.estimate.resource.entity.totals.RepairTotalsInfoType;
import com.cieca.estimate.resource.entity.vehicle.VehicleInfoType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cieca.com/BMS}MessageHeaderType">
 *       &lt;sequence>
 *         &lt;element name="SvcProviderName" type="{http://www.cieca.com/BMS}Identifier" minOccurs="0"/>
 *         &lt;element name="RefClaimNum" type="{http://www.cieca.com/BMS}RefClaimNumType" minOccurs="0"/>
 *         &lt;element name="DocumentInfo" type="{http://www.cieca.com/BMS}DocumentInfoType"/>
 *         &lt;element name="ApplicationInfo" type="{http://www.cieca.com/BMS}ApplicationInfoType" maxOccurs="unbounded"/>
 *         &lt;element name="EventInfo" type="{http://www.cieca.com/BMS}EventInfoType"/>
 *         &lt;element name="AdminInfo" type="{http://www.cieca.com/BMS}AdminInfoType"/>
 *         &lt;element name="EstimatorIDs" type="{http://www.cieca.com/BMS}EstimatorIDsTypeType"/>
 *         &lt;element name="ClaimInfo" type="{http://www.cieca.com/BMS}ClaimInfoType"/>
 *         &lt;element name="VehicleInfo" type="{http://www.cieca.com/BMS}VehicleInfoType"/>
 *         &lt;element name="ProfileInfo" type="{http://www.cieca.com/BMS}ProfileInfoType"/>
 *         &lt;element name="DamageLineInfo" type="{http://www.cieca.com/BMS}DamageLineInfoType" maxOccurs="unbounded"/>
 *         &lt;element name="NonNewOEMPartInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="StorageDuration" type="{http://www.cieca.com/BMS}Integer" minOccurs="0"/>
 *         &lt;element name="RepairTotalsInfo" type="{http://www.cieca.com/BMS}RepairTotalsInfoType" maxOccurs="unbounded"/>
 *         &lt;element name="RepairTotalsHistory" type="{http://www.cieca.com/BMS}RepairTotalsHistoryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentInfo" type="{http://www.cieca.com/BMS}PaymentInfoType" minOccurs="0"/>
 *         &lt;element name="EstimateMemo" type="{http://www.cieca.com/BMS}C" minOccurs="0"/>
 *         &lt;element name="AdministrativeMemo" type="{http://www.cieca.com/BMS}C" minOccurs="0"/>
 *         &lt;element name="Disclaimers" type="{http://www.cieca.com/BMS}C" minOccurs="0"/>
 *         &lt;element name="CustomMemo" type="{http://www.cieca.com/BMS}C" minOccurs="0"/>
 *         &lt;element name="OtherMemos" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OtherMemoRef" type="{http://www.cieca.com/BMS}OtherMemoReferenceEnum"/>
 *                   &lt;element name="OtherMemo" type="{http://www.cieca.com/BMS}C"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "svcProviderName",
    "refClaimNum",
    "documentInfo",
    "applicationInfo",
    "eventInfo",
    "adminInfo",
    "estimatorIDs",
    "claimInfo",
    "vehicleInfo",
    "profileInfo",
    "damageLineInfo",
    "nonNewOEMPartInd",
    "storageDuration",
    "repairTotalsInfo",
    "paymentInfo",
    "estimateMemo",
    "administrativeMemo",
    "disclaimers",
    "customMemo",
    "otherMemos"
})
@XmlRootElement(name = "EstimateType")
public class EstimateType implements Serializable, Entity<String>
{
    private final static long serialVersionUID = 20120208L;
    
    transient final protected String id;
    
    @XmlElement(name = "SvcProviderName")
    protected String svcProviderName;
    
    @XmlElement(name = "RefClaimNum")
    protected String refClaimNum;
    
    @XmlElement(name = "DocumentInfo", required = true)
    protected DocumentInfoType documentInfo;
    
    @XmlElement(name = "ApplicationInfo", required = true)
    protected List<ApplicationInfoType> applicationInfo;
    
    @XmlElement(name = "EventInfo", required = true)
    protected EventInfoType eventInfo;
    
    @XmlElement(name = "AdminInfo", required = true)
    protected AdminInfoType adminInfo;
    
    @XmlElement(name = "EstimatorIDs", required = true)
    protected EstimatorIDsTypeType estimatorIDs;
    
    @XmlElement(name = "ClaimInfo", required = true)
    protected ClaimInfoType claimInfo;
    
    @XmlElement(name = "VehicleInfo", required = true)
    protected VehicleInfoType vehicleInfo;
    
    @XmlElement(name = "ProfileInfo", required = true)
    protected ProfileInfoType profileInfo;
    
    @XmlElement(name = "DamageLineInfo", required = true)
    protected List<DamageLineInfoType> damageLineInfo;
    
    @XmlElement(name = "NonNewOEMPartInd")
    protected Boolean nonNewOEMPartInd;
    
    @XmlElement(name = "StorageDuration")
    protected BigInteger storageDuration;
    
    @XmlElement(name = "RepairTotalsInfo", required = true)
    protected List<RepairTotalsInfoType> repairTotalsInfo;
    
    @XmlElement(name = "PaymentInfo")
    protected PaymentInfoType paymentInfo;
    
    @XmlElement(name = "EstimateMemo")
    protected String estimateMemo;
    
    @XmlElement(name = "AdministrativeMemo")
    protected String administrativeMemo;
    
    @XmlElement(name = "Disclaimers")
    protected String disclaimers;
    
    @XmlElement(name = "CustomMemo")
    protected String customMemo;
    
    @XmlElement(name = "OtherMemos")
    protected List<OtherMemosType> otherMemos;

    public EstimateType() {
        this.id = UUID.randomUUID().toString();
    }
    
    public EstimateType(String id) {
        this.id = id;
    }

    /**
     * Gets the value of the svcProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcProviderName() {
        return svcProviderName;
    }

    /**
     * Sets the value of the svcProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcProviderName(String value) {
        this.svcProviderName = value;
    }

    /**
     * Gets the value of the refClaimNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefClaimNum() {
        return refClaimNum;
    }

    /**
     * Sets the value of the refClaimNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefClaimNum(String value) {
        this.refClaimNum = value;
    }

    /**
     * Gets the value of the documentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentInfoType }
     *     
     */
    public DocumentInfoType getDocumentInfo() {
        return documentInfo;
    }

    /**
     * Sets the value of the documentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentInfoType }
     *     
     */
    public void setDocumentInfo(DocumentInfoType value) {
        this.documentInfo = value;
    }

    /**
     * Gets the value of the applicationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationInfoType }
     * 
     * 
     */
    public List<ApplicationInfoType> getApplicationInfo() {
        if (applicationInfo == null) {
            applicationInfo = new ArrayList<ApplicationInfoType>();
        }
        return this.applicationInfo;
    }

    /**
     * Gets the value of the eventInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EventInfoType }
     *     
     */
    public EventInfoType getEventInfo() {
        return eventInfo;
    }

    /**
     * Sets the value of the eventInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventInfoType }
     *     
     */
    public void setEventInfo(EventInfoType value) {
        this.eventInfo = value;
    }

    /**
     * Gets the value of the adminInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdminInfoType }
     *     
     */
    public AdminInfoType getAdminInfo() {
        return adminInfo;
    }

    /**
     * Sets the value of the adminInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdminInfoType }
     *     
     */
    public void setAdminInfo(AdminInfoType value) {
        this.adminInfo = value;
    }

    /**
     * Gets the value of the estimatorIDs property.
     * 
     * @return
     *     possible object is
     *     {@link EstimatorIDsTypeType }
     *     
     */
    public EstimatorIDsTypeType getEstimatorIDs() {
        return estimatorIDs;
    }

    /**
     * Sets the value of the estimatorIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatorIDsTypeType }
     *     
     */
    public void setEstimatorIDs(EstimatorIDsTypeType value) {
        this.estimatorIDs = value;
    }

    /**
     * Gets the value of the claimInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimInfoType }
     *     
     */
    public ClaimInfoType getClaimInfo() {
        return claimInfo;
    }

    /**
     * Sets the value of the claimInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimInfoType }
     *     
     */
    public void setClaimInfo(ClaimInfoType value) {
        this.claimInfo = value;
    }

    /**
     * Gets the value of the vehicleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleInfoType }
     *     
     */
    public VehicleInfoType getVehicleInfo() {
        return vehicleInfo;
    }

    /**
     * Sets the value of the vehicleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleInfoType }
     *     
     */
    public void setVehicleInfo(VehicleInfoType value) {
        this.vehicleInfo = value;
    }

    /**
     * Gets the value of the profileInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileInfoType }
     *     
     */
    public ProfileInfoType getProfileInfo() {
        return profileInfo;
    }

    /**
     * Sets the value of the profileInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileInfoType }
     *     
     */
    public void setProfileInfo(ProfileInfoType value) {
        this.profileInfo = value;
    }

    /**
     * Gets the value of the damageLineInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the damageLineInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDamageLineInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DamageLineInfoType }
     * 
     * 
     */
    public List<DamageLineInfoType> getDamageLineInfo() {
        if (damageLineInfo == null) {
            damageLineInfo = new ArrayList<DamageLineInfoType>();
        }
        return this.damageLineInfo;
    }

    /**
     * Gets the value of the nonNewOEMPartInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNonNewOEMPartInd() {
        return nonNewOEMPartInd;
    }

    /**
     * Sets the value of the nonNewOEMPartInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonNewOEMPartInd(Boolean value) {
        this.nonNewOEMPartInd = value;
    }

    /**
     * Gets the value of the storageDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStorageDuration() {
        return storageDuration;
    }

    /**
     * Sets the value of the storageDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStorageDuration(BigInteger value) {
        this.storageDuration = value;
    }

    /**
     * Gets the value of the repairTotalsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repairTotalsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepairTotalsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepairTotalsInfoType }
     * 
     * 
     */
    public List<RepairTotalsInfoType> getRepairTotalsInfo() {
        if (repairTotalsInfo == null) {
            repairTotalsInfo = new ArrayList<RepairTotalsInfoType>();
        }
        return this.repairTotalsInfo;
    }

    /**
     * Gets the value of the paymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInfoType }
     *     
     */
    public PaymentInfoType getPaymentInfo() {
        return paymentInfo;
    }

    /**
     * Sets the value of the paymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInfoType }
     *     
     */
    public void setPaymentInfo(PaymentInfoType value) {
        this.paymentInfo = value;
    }

    /**
     * Gets the value of the estimateMemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimateMemo() {
        return estimateMemo;
    }

    /**
     * Sets the value of the estimateMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimateMemo(String value) {
        this.estimateMemo = value;
    }

    /**
     * Gets the value of the administrativeMemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrativeMemo() {
        return administrativeMemo;
    }

    /**
     * Sets the value of the administrativeMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrativeMemo(String value) {
        this.administrativeMemo = value;
    }

    /**
     * Gets the value of the disclaimers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclaimers() {
        return disclaimers;
    }

    /**
     * Sets the value of the disclaimers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclaimers(String value) {
        this.disclaimers = value;
    }

    /**
     * Gets the value of the customMemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomMemo() {
        return customMemo;
    }

    /**
     * Sets the value of the customMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomMemo(String value) {
        this.customMemo = value;
    }

    /**
     * Gets the value of the otherMemos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherMemos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherMemos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstimateType.OtherMemos }
     * 
     * 
     */
    public List<OtherMemosType> getOtherMemos() {
        if (otherMemos == null) {
            otherMemos = new ArrayList<OtherMemosType>();
        }
        return this.otherMemos;
    }

    @Override
    public String getID() {
        return this.id;
    }

}
