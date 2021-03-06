package com.cieca.estimate.resource.entity.person;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cieca.estimate.resource.entity.communication.CommunicationsType;
import com.cieca.estimate.resource.entity.idinfo.IDInfoType;

/**
 * <p>Java class for ContactInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactJobTitle" type="{http://www.cieca.com/BMS}Char_32" minOccurs="0"/>
 *         &lt;element name="Communications" type="{http://www.cieca.com/BMS}CommunicationsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactName" type="{http://www.cieca.com/BMS}PersonNameType" minOccurs="0"/>
 *         &lt;element name="IDInfo" type="{http://www.cieca.com/BMS}IDInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfoType", propOrder = {
    "contactJobTitle",
    "communications",
    "contactName",
    "idInfo"
})
public class ContactInfoType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "ContactJobTitle")
    protected String contactJobTitle;
    @XmlElement(name = "Communications")
    protected List<CommunicationsType> communications;
    @XmlElement(name = "ContactName")
    protected PersonNameType contactName;
    @XmlElement(name = "IDInfo")
    protected List<IDInfoType> idInfo;

    /**
     * Gets the value of the contactJobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactJobTitle() {
        return contactJobTitle;
    }

    /**
     * Sets the value of the contactJobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactJobTitle(String value) {
        this.contactJobTitle = value;
    }

    /**
     * Gets the value of the communications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the communications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationsType }
     * 
     * 
     */
    public List<CommunicationsType> getCommunications() {
        if (communications == null) {
            communications = new ArrayList<CommunicationsType>();
        }
        return this.communications;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setContactName(PersonNameType value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the idInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDInfoType }
     * 
     * 
     */
    public List<IDInfoType> getIDInfo() {
        if (idInfo == null) {
            idInfo = new ArrayList<IDInfoType>();
        }
        return this.idInfo;
    }

}
