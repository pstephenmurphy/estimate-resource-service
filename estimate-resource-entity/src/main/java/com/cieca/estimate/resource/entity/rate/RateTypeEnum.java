package com.cieca.estimate.resource.entity.rate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RateTypeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="BE"/>
 *     &lt;enumeration value="BEAC"/>
 *     &lt;enumeration value="BELA"/>
 *     &lt;enumeration value="BELP"/>
 *     &lt;enumeration value="BEPA"/>
 *     &lt;enumeration value="BEPL"/>
 *     &lt;enumeration value="BEPM"/>
 *     &lt;enumeration value="BEPO"/>
 *     &lt;enumeration value="BEPP"/>
 *     &lt;enumeration value="BESL"/>
 *     &lt;enumeration value="BETP"/>
 *     &lt;enumeration value="LA"/>
 *     &lt;enumeration value="LA1"/>
 *     &lt;enumeration value="LA2"/>
 *     &lt;enumeration value="LA2S"/>
 *     &lt;enumeration value="LA2U"/>
 *     &lt;enumeration value="LA3"/>
 *     &lt;enumeration value="LA3S"/>
 *     &lt;enumeration value="LA4"/>
 *     &lt;enumeration value="LAB"/>
 *     &lt;enumeration value="LABA"/>
 *     &lt;enumeration value="LABS"/>
 *     &lt;enumeration value="LACG"/>
 *     &lt;enumeration value="LAD"/>
 *     &lt;enumeration value="LADT"/>
 *     &lt;enumeration value="LAE"/>
 *     &lt;enumeration value="LAE2"/>
 *     &lt;enumeration value="LAET"/>
 *     &lt;enumeration value="LAF"/>
 *     &lt;enumeration value="LAFA"/>
 *     &lt;enumeration value="LAFS"/>
 *     &lt;enumeration value="LAG"/>
 *     &lt;enumeration value="LAGA"/>
 *     &lt;enumeration value="LAGS"/>
 *     &lt;enumeration value="LAM"/>
 *     &lt;enumeration value="LAMA"/>
 *     &lt;enumeration value="LAMS"/>
 *     &lt;enumeration value="LAP"/>
 *     &lt;enumeration value="LAR"/>
 *     &lt;enumeration value="LARA"/>
 *     &lt;enumeration value="LARS"/>
 *     &lt;enumeration value="LAS"/>
 *     &lt;enumeration value="LASA"/>
 *     &lt;enumeration value="LASS"/>
 *     &lt;enumeration value="LASU"/>
 *     &lt;enumeration value="LAT"/>
 *     &lt;enumeration value="LATT"/>
 *     &lt;enumeration value="LAU"/>
 *     &lt;enumeration value="LAUT"/>
 *     &lt;enumeration value="MA2S"/>
 *     &lt;enumeration value="MA2T"/>
 *     &lt;enumeration value="MA3S"/>
 *     &lt;enumeration value="MABL"/>
 *     &lt;enumeration value="MACS"/>
 *     &lt;enumeration value="MAHW"/>
 *     &lt;enumeration value="MAPA"/>
 *     &lt;enumeration value="MASH"/>
 *     &lt;enumeration value="MAT"/>
 *     &lt;enumeration value="MATD"/>
 *     &lt;enumeration value="OT1"/>
 *     &lt;enumeration value="OT2"/>
 *     &lt;enumeration value="OT3"/>
 *     &lt;enumeration value="OT4"/>
 *     &lt;enumeration value="OTA"/>
 *     &lt;enumeration value="OTAC"/>
 *     &lt;enumeration value="OTBE"/>
 *     &lt;enumeration value="OTCO"/>
 *     &lt;enumeration value="OTDE"/>
 *     &lt;enumeration value="OTEC"/>
 *     &lt;enumeration value="OTFO"/>
 *     &lt;enumeration value="OTGL"/>
 *     &lt;enumeration value="OTLU"/>
 *     &lt;enumeration value="OTP"/>
 *     &lt;enumeration value="OTRC"/>
 *     &lt;enumeration value="OTSH"/>
 *     &lt;enumeration value="OTSI"/>
 *     &lt;enumeration value="OTSL"/>
 *     &lt;enumeration value="OTSP"/>
 *     &lt;enumeration value="OTST"/>
 *     &lt;enumeration value="OTTL"/>
 *     &lt;enumeration value="OTTR"/>
 *     &lt;enumeration value="OTTW"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="PAA"/>
 *     &lt;enumeration value="PAC"/>
 *     &lt;enumeration value="PAE"/>
 *     &lt;enumeration value="PAG"/>
 *     &lt;enumeration value="PAGD"/>
 *     &lt;enumeration value="PAGF"/>
 *     &lt;enumeration value="PAGP"/>
 *     &lt;enumeration value="PAGQ"/>
 *     &lt;enumeration value="PAGR"/>
 *     &lt;enumeration value="PAL"/>
 *     &lt;enumeration value="PAM"/>
 *     &lt;enumeration value="PAN"/>
 *     &lt;enumeration value="PAO"/>
 *     &lt;enumeration value="PAP"/>
 *     &lt;enumeration value="PAR"/>
 *     &lt;enumeration value="PASL"/>
 *     &lt;enumeration value="PAT"/>
 *     &lt;enumeration value="PAX1"/>
 *     &lt;enumeration value="PAX2"/>
 *     &lt;enumeration value="PAX3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RateTypeEnum")
@XmlEnum
public enum RateTypeEnum {

    ALL("ALL"),
    BE("BE"),
    BEAC("BEAC"),
    BELA("BELA"),
    BELP("BELP"),
    BEPA("BEPA"),
    BEPL("BEPL"),
    BEPM("BEPM"),
    BEPO("BEPO"),
    BEPP("BEPP"),
    BESL("BESL"),
    BETP("BETP"),
    LA("LA"),
    LA1("LA1"),
    LA2("LA2"),
    LA2S("LA2S"),
    LA2U("LA2U"),
    LA3("LA3"),
    LA3S("LA3S"),
    LA4("LA4"),
    LAB("LAB"),
    LABA("LABA"),
    LABS("LABS"),
    LACG("LACG"),
    LAD("LAD"),
    LADT("LADT"),
    LAE("LAE"),
    LAE2("LAE2"),
    LAET("LAET"),
    LAF("LAF"),
    LAFA("LAFA"),
    LAFS("LAFS"),
    LAG("LAG"),
    LAGA("LAGA"),
    LAGS("LAGS"),
    LAM("LAM"),
    LAMA("LAMA"),
    LAMS("LAMS"),
    LAP("LAP"),
    LAR("LAR"),
    LARA("LARA"),
    LARS("LARS"),
    LAS("LAS"),
    LASA("LASA"),
    LASS("LASS"),
    LASU("LASU"),
    LAT("LAT"),
    LATT("LATT"),
    LAU("LAU"),
    LAUT("LAUT"),
    MA2S("MA2S"),
    MA2T("MA2T"),
    MA3S("MA3S"),
    MABL("MABL"),
    MACS("MACS"),
    MAHW("MAHW"),
    MAPA("MAPA"),
    MASH("MASH"),
    MAT("MAT"),
    MATD("MATD"),
    OT1("OT1"),
    OT2("OT2"),
    OT3("OT3"),
    OT4("OT4"),
    OTA("OTA"),
    OTAC("OTAC"),
    OTBE("OTBE"),
    OTCO("OTCO"),
    OTDE("OTDE"),
    OTEC("OTEC"),
    OTFO("OTFO"),
    OTGL("OTGL"),
    OTLU("OTLU"),
    OTP("OTP"),
    OTRC("OTRC"),
    OTSH("OTSH"),
    OTSI("OTSI"),
    OTSL("OTSL"),
    OTSP("OTSP"),
    OTST("OTST"),
    OTTL("OTTL"),
    OTTR("OTTR"),
    OTTW("OTTW"),
    PA("PA"),
    PAA("PAA"),
    PAC("PAC"),
    PAE("PAE"),
    PAG("PAG"),
    PAGD("PAGD"),
    PAGF("PAGF"),
    PAGP("PAGP"),
    PAGQ("PAGQ"),
    PAGR("PAGR"),
    PAL("PAL"),
    PAM("PAM"),
    PAN("PAN"),
    PAO("PAO"),
    PAP("PAP"),
    PAR("PAR"),
    PASL("PASL"),
    PAT("PAT"),
    PAX1("PAX1"),
    PAX2("PAX2"),
    PAX3("PAX3");
    
    private final String value;

    RateTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RateTypeEnum fromValue(String v) {
        for (RateTypeEnum c: RateTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
