package com.cieca.estimate.resource.entity.attachment;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AttachmentIntegrityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentIntegrityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IntegrityType" type="{http://www.cieca.com/BMS}AttachmentIntegrityTypeEnum"/>
 *         &lt;element name="IntegrityCaptureDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="IntegrityBinary" type="{http://www.cieca.com/BMS}EmbeddedAttachmentTypeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentIntegrityType", propOrder = {
    "integrityType",
    "integrityCaptureDateTime",
    "integrityBinary"
})
public class AttachmentIntegrityType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "IntegrityType", required = true)
    protected AttachmentIntegrityTypeEnum integrityType;
    @XmlElement(name = "IntegrityCaptureDateTime")
    protected XMLGregorianCalendar integrityCaptureDateTime;
    @XmlElement(name = "IntegrityBinary", required = true)
    protected EmbeddedAttachmentTypeType integrityBinary;

    /**
     * Gets the value of the integrityType property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentIntegrityTypeEnum }
     *     
     */
    public AttachmentIntegrityTypeEnum getIntegrityType() {
        return integrityType;
    }

    /**
     * Sets the value of the integrityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentIntegrityTypeEnum }
     *     
     */
    public void setIntegrityType(AttachmentIntegrityTypeEnum value) {
        this.integrityType = value;
    }

    /**
     * Gets the value of the integrityCaptureDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIntegrityCaptureDateTime() {
        return integrityCaptureDateTime;
    }

    /**
     * Sets the value of the integrityCaptureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIntegrityCaptureDateTime(XMLGregorianCalendar value) {
        this.integrityCaptureDateTime = value;
    }

    /**
     * Gets the value of the integrityBinary property.
     * 
     * @return
     *     possible object is
     *     {@link EmbeddedAttachmentTypeType }
     *     
     */
    public EmbeddedAttachmentTypeType getIntegrityBinary() {
        return integrityBinary;
    }

    /**
     * Sets the value of the integrityBinary property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbeddedAttachmentTypeType }
     *     
     */
    public void setIntegrityBinary(EmbeddedAttachmentTypeType value) {
        this.integrityBinary = value;
    }

}
