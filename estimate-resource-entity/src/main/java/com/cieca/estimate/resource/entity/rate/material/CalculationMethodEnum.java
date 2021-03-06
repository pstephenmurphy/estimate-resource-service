package com.cieca.estimate.resource.entity.rate.material;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalculationMethodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CalculationMethodEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="1"/>
 *     &lt;enumeration value="2"/>
 *     &lt;enumeration value="3"/>
 *     &lt;enumeration value="4"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CalculationMethodEnum")
@XmlEnum
public enum CalculationMethodEnum {

    @XmlEnumValue("1")
    CALCULATE_PERCENT_MATERIAL_TYPE_DOLLARS("1"),
    @XmlEnumValue("2")
    RATE_THRESHOLD_OF_TOTAL_HOURS("2"),
    @XmlEnumValue("3")
    RATE_THRESHOLD_TABLE_HOURS("3"),
    @XmlEnumValue("4")
    RATE("4");
    
    private final String value;

    CalculationMethodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalculationMethodEnum fromValue(String v) {
        for (CalculationMethodEnum c: CalculationMethodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
