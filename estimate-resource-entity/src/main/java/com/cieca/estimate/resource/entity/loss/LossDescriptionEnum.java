package com.cieca.estimate.resource.entity.loss;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LossDescriptionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LossDescriptionEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="01"/>
 *     &lt;enumeration value="02"/>
 *     &lt;enumeration value="03"/>
 *     &lt;enumeration value="04"/>
 *     &lt;enumeration value="05"/>
 *     &lt;enumeration value="06"/>
 *     &lt;enumeration value="07"/>
 *     &lt;enumeration value="08"/>
 *     &lt;enumeration value="09"/>
 *     &lt;enumeration value="10"/>
 *     &lt;enumeration value="11"/>
 *     &lt;enumeration value="12"/>
 *     &lt;enumeration value="13"/>
 *     &lt;enumeration value="14"/>
 *     &lt;enumeration value="15"/>
 *     &lt;enumeration value="16"/>
 *     &lt;enumeration value="17"/>
 *     &lt;enumeration value="18"/>
 *     &lt;enumeration value="19"/>
 *     &lt;enumeration value="20"/>
 *     &lt;enumeration value="21"/>
 *     &lt;enumeration value="22"/>
 *     &lt;enumeration value="23"/>
 *     &lt;enumeration value="24"/>
 *     &lt;enumeration value="25"/>
 *     &lt;enumeration value="26"/>
 *     &lt;enumeration value="27"/>
 *     &lt;enumeration value="28"/>
 *     &lt;enumeration value="29"/>
 *     &lt;enumeration value="30"/>
 *     &lt;enumeration value="31"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LossDescriptionEnum")
@XmlEnum
public enum LossDescriptionEnum {

    @XmlEnumValue("01")
    VALUE_1("01"),
    @XmlEnumValue("02")
    VALUE_2("02"),
    @XmlEnumValue("03")
    VALUE_3("03"),
    @XmlEnumValue("04")
    VALUE_4("04"),
    @XmlEnumValue("05")
    VALUE_5("05"),
    @XmlEnumValue("06")
    VALUE_6("06"),
    @XmlEnumValue("07")
    VALUE_7("07"),
    @XmlEnumValue("08")
    VALUE_8("08"),
    @XmlEnumValue("09")
    VALUE_9("09"),
    @XmlEnumValue("10")
    VALUE_10("10"),
    @XmlEnumValue("11")
    VALUE_11("11"),
    @XmlEnumValue("12")
    VALUE_12("12"),
    @XmlEnumValue("13")
    VALUE_13("13"),
    @XmlEnumValue("14")
    VALUE_14("14"),
    @XmlEnumValue("15")
    VALUE_15("15"),
    @XmlEnumValue("16")
    VALUE_16("16"),
    @XmlEnumValue("17")
    VALUE_17("17"),
    @XmlEnumValue("18")
    VALUE_18("18"),
    @XmlEnumValue("19")
    VALUE_19("19"),
    @XmlEnumValue("20")
    VALUE_20("20"),
    @XmlEnumValue("21")
    VALUE_21("21"),
    @XmlEnumValue("22")
    VALUE_22("22"),
    @XmlEnumValue("23")
    VALUE_23("23"),
    @XmlEnumValue("24")
    VALUE_24("24"),
    @XmlEnumValue("25")
    VALUE_25("25"),
    @XmlEnumValue("26")
    VALUE_26("26"),
    @XmlEnumValue("27")
    VALUE_27("27"),
    @XmlEnumValue("28")
    VALUE_28("28"),
    @XmlEnumValue("29")
    VALUE_29("29"),
    @XmlEnumValue("30")
    VALUE_30("30"),
    @XmlEnumValue("31")
    VALUE_31("31");
    private final String value;

    LossDescriptionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LossDescriptionEnum fromValue(String v) {
        for (LossDescriptionEnum c: LossDescriptionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
