package com.cieca.estimate.resource.entity.vehicle.license;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicensePlateTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LicensePlateTypeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="BV"/>
 *     &lt;enumeration value="CC"/>
 *     &lt;enumeration value="CI"/>
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="CU"/>
 *     &lt;enumeration value="DL"/>
 *     &lt;enumeration value="DV"/>
 *     &lt;enumeration value="DX"/>
 *     &lt;enumeration value="FD"/>
 *     &lt;enumeration value="FG"/>
 *     &lt;enumeration value="FM"/>
 *     &lt;enumeration value="HT"/>
 *     &lt;enumeration value="IP"/>
 *     &lt;enumeration value="MC"/>
 *     &lt;enumeration value="OL"/>
 *     &lt;enumeration value="PC"/>
 *     &lt;enumeration value="S1"/>
 *     &lt;enumeration value="SN"/>
 *     &lt;enumeration value="ST"/>
 *     &lt;enumeration value="SV"/>
 *     &lt;enumeration value="TK"/>
 *     &lt;enumeration value="TL"/>
 *     &lt;enumeration value="TM"/>
 *     &lt;enumeration value="TP"/>
 *     &lt;enumeration value="TR"/>
 *     &lt;enumeration value="TX"/>
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="UV"/>
 *     &lt;enumeration value="VN"/>
 *     &lt;enumeration value="RV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LicensePlateTypeEnum")
@XmlEnum
public enum LicensePlateTypeEnum {

    BV("BV"),
    CC("CC"),
    CI("CI"),
    CO("CO"),
    CU("CU"),
    DL("DL"),
    DV("DV"),
    DX("DX"),
    FD("FD"),
    FG("FG"),
    FM("FM"),
    HT("HT"),
    IP("IP"),
    MC("MC"),
    OL("OL"),
    PC("PC"),
    @XmlEnumValue("S1")
    S1("S1"),
    SN("SN"),
    ST("ST"),
    SV("SV"),
    TK("TK"),
    TL("TL"),
    TM("TM"),
    TP("TP"),
    TR("TR"),
    TX("TX"),
    US("US"),
    UV("UV"),
    VN("VN"),
    RV("RV");
    
    private final String value;

    LicensePlateTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LicensePlateTypeEnum fromValue(String v) {
        for (LicensePlateTypeEnum c: LicensePlateTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
