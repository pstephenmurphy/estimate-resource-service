package com.cieca.estimate.resource.entity.damage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LaborTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LaborTypeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="LA1"/>
 *     &lt;enumeration value="LA2"/>
 *     &lt;enumeration value="LA2S"/>
 *     &lt;enumeration value="LA2U"/>
 *     &lt;enumeration value="LA3"/>
 *     &lt;enumeration value="LA3S"/>
 *     &lt;enumeration value="LA3U"/>
 *     &lt;enumeration value="LA4"/>
 *     &lt;enumeration value="LAB"/>
 *     &lt;enumeration value="LABA"/>
 *     &lt;enumeration value="LABR"/>
 *     &lt;enumeration value="LABS"/>
 *     &lt;enumeration value="LACG"/>
 *     &lt;enumeration value="LAD"/>
 *     &lt;enumeration value="LADT"/>
 *     &lt;enumeration value="LAE"/>
 *     &lt;enumeration value="LAE2"/>
 *     &lt;enumeration value="LAE3"/>
 *     &lt;enumeration value="LAET"/>
 *     &lt;enumeration value="LAF"/>
 *     &lt;enumeration value="LAFA"/>
 *     &lt;enumeration value="LAFS"/>
 *     &lt;enumeration value="LAG"/>
 *     &lt;enumeration value="LAGA"/>
 *     &lt;enumeration value="LAGS"/>
 *     &lt;enumeration value="LAI"/>
 *     &lt;enumeration value="LAM"/>
 *     &lt;enumeration value="LAMA"/>
 *     &lt;enumeration value="LAMS"/>
 *     &lt;enumeration value="LAP"/>
 *     &lt;enumeration value="LAR"/>
 *     &lt;enumeration value="LARA"/>
 *     &lt;enumeration value="LARN"/>
 *     &lt;enumeration value="LARS"/>
 *     &lt;enumeration value="LAS"/>
 *     &lt;enumeration value="LASA"/>
 *     &lt;enumeration value="LASS"/>
 *     &lt;enumeration value="LASU"/>
 *     &lt;enumeration value="LATT"/>
 *     &lt;enumeration value="LATU"/>
 *     &lt;enumeration value="LAU"/>
 *     &lt;enumeration value="LAUT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LaborTypeEnum")
@XmlEnum
public enum LaborTypeEnum {

    @XmlEnumValue("LA1")
    LA_1("LA1"),
    @XmlEnumValue("LA2")
    LA_2("LA2"),
    @XmlEnumValue("LA2S")
    LA_2_S("LA2S"),
    @XmlEnumValue("LA2U")
    LA_2_U("LA2U"),
    @XmlEnumValue("LA3")
    LA_3("LA3"),
    @XmlEnumValue("LA3S")
    LA_3_S("LA3S"),
    @XmlEnumValue("LA3U")
    LA_3_U("LA3U"),
    @XmlEnumValue("LA4")
    LA_4("LA4"),
    LAB("LAB"),
    LABA("LABA"),
    LABR("LABR"),
    LABS("LABS"),
    LACG("LACG"),
    LAD("LAD"),
    LADT("LADT"),
    LAE("LAE"),
    @XmlEnumValue("LAE2")
    LAE_2("LAE2"),
    @XmlEnumValue("LAE3")
    LAE_3("LAE3"),
    LAET("LAET"),
    LAF("LAF"),
    LAFA("LAFA"),
    LAFS("LAFS"),
    LAG("LAG"),
    LAGA("LAGA"),
    LAGS("LAGS"),
    LAI("LAI"),
    LAM("LAM"),
    LAMA("LAMA"),
    LAMS("LAMS"),
    LAP("LAP"),
    LAR("LAR"),
    LARA("LARA"),
    LARN("LARN"),
    LARS("LARS"),
    LAS("LAS"),
    LASA("LASA"),
    LASS("LASS"),
    LASU("LASU"),
    LATT("LATT"),
    LATU("LATU"),
    LAU("LAU"),
    LAUT("LAUT");
    private final String value;

    LaborTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LaborTypeEnum fromValue(String v) {
        for (LaborTypeEnum c: LaborTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
