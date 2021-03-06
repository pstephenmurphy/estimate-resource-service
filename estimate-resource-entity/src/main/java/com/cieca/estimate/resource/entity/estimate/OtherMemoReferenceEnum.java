package com.cieca.estimate.resource.entity.estimate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherMemoReferenceBaseEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OtherMemoReferenceBaseEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}OpenEnum">
 *     &lt;enumeration value="001"/>
 *     &lt;enumeration value="002"/>
 *     &lt;enumeration value="003"/>
 *     &lt;enumeration value="004"/>
 *     &lt;enumeration value="005"/>
 *     &lt;enumeration value="006"/>
 *     &lt;enumeration value="007"/>
 *     &lt;enumeration value="008"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OtherMemoReferenceBaseEnum")
@XmlEnum
public enum OtherMemoReferenceEnum {

    @XmlEnumValue("001")
    MESSAGE_1("001"),
    @XmlEnumValue("002")
    MESSAGE_2("002"),
    @XmlEnumValue("003")
    MESSAGE_3("003"),
    @XmlEnumValue("004")
    MESSAGE_4("004"),
    @XmlEnumValue("005")
    MESSAGE_5("005"),
    @XmlEnumValue("006")
    MESSAGE_6("006"),
    @XmlEnumValue("007")
    MESSAGE_7("007"),
    @XmlEnumValue("008")
    MESSAGE_8("008"),
    @XmlEnumValue("Disclaimer")
    DISCLAIMER("Disclaimer"),
    @XmlEnumValue("Remarks")
    REMARKS("Remarks");
    
    private final String value;

    OtherMemoReferenceEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OtherMemoReferenceEnum fromValue(String v) {
        for (OtherMemoReferenceEnum c: OtherMemoReferenceEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
