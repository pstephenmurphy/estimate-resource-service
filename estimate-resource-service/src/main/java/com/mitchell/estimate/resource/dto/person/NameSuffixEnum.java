//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.14 at 02:56:20 PM PST 
//


package com.mitchell.estimate.resource.dto.person;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameSuffixEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NameSuffixEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}OpenEnum">
 *     &lt;enumeration value="Jr"/>
 *     &lt;enumeration value="Sr"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="II"/>
 *     &lt;enumeration value="III"/>
 *     &lt;enumeration value="IV"/>
 *     &lt;enumeration value="V"/>
 *     &lt;enumeration value="VI"/>
 *     &lt;enumeration value="VII"/>
 *     &lt;enumeration value="VIII"/>
 *     &lt;enumeration value="IX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameSuffixEnum")
@XmlEnum
public enum NameSuffixEnum {

    @XmlEnumValue("Jr")
    JR("Jr"),
    @XmlEnumValue("Sr")
    SR("Sr"),
    I("I"),
    II("II"),
    III("III"),
    IV("IV"),
    V("V"),
    VI("VI"),
    VII("VII"),
    VIII("VIII"),
    IX("IX");
    
    private final String value;

    NameSuffixEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameSuffixEnum fromValue(String v) {
        for (NameSuffixEnum c: NameSuffixEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}