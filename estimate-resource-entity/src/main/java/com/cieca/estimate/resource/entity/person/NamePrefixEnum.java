package com.cieca.estimate.resource.entity.person;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NamePrefixEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NamePrefixEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}OpenEnum">
 *     &lt;enumeration value="1LT"/>
 *     &lt;enumeration value="1SG"/>
 *     &lt;enumeration value="1ST LT"/>
 *     &lt;enumeration value="1ST SGT"/>
 *     &lt;enumeration value="2LT"/>
 *     &lt;enumeration value="2ND LT"/>
 *     &lt;enumeration value="A1C"/>
 *     &lt;enumeration value="AB"/>
 *     &lt;enumeration value="ADM"/>
 *     &lt;enumeration value="AMN"/>
 *     &lt;enumeration value="AN"/>
 *     &lt;enumeration value="AVCAD"/>
 *     &lt;enumeration value="B GEN"/>
 *     &lt;enumeration value="BG"/>
 *     &lt;enumeration value="BRIG GEN"/>
 *     &lt;enumeration value="CADET"/>
 *     &lt;enumeration value="CAPT"/>
 *     &lt;enumeration value="CDR"/>
 *     &lt;enumeration value="CMSAF"/>
 *     &lt;enumeration value="CMSGT"/>
 *     &lt;enumeration value="CN"/>
 *     &lt;enumeration value="COL"/>
 *     &lt;enumeration value="COMO"/>
 *     &lt;enumeration value="CPL"/>
 *     &lt;enumeration value="CPO"/>
 *     &lt;enumeration value="CPT"/>
 *     &lt;enumeration value="CSM"/>
 *     &lt;enumeration value="CW2"/>
 *     &lt;enumeration value="CW3"/>
 *     &lt;enumeration value="CW4"/>
 *     &lt;enumeration value="CW5"/>
 *     &lt;enumeration value="CWO"/>
 *     &lt;enumeration value="CWO2"/>
 *     &lt;enumeration value="CWO3"/>
 *     &lt;enumeration value="CWO4"/>
 *     &lt;enumeration value="CWO5"/>
 *     &lt;enumeration value="DN"/>
 *     &lt;enumeration value="Dr"/>
 *     &lt;enumeration value="ENS"/>
 *     &lt;enumeration value="ENSIGN"/>
 *     &lt;enumeration value="FADM"/>
 *     &lt;enumeration value="FN"/>
 *     &lt;enumeration value="GA"/>
 *     &lt;enumeration value="GAF"/>
 *     &lt;enumeration value="GEN"/>
 *     &lt;enumeration value="GYSGT"/>
 *     &lt;enumeration value="HC"/>
 *     &lt;enumeration value="HN"/>
 *     &lt;enumeration value="LCDR"/>
 *     &lt;enumeration value="LCPL"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="LT COL"/>
 *     &lt;enumeration value="LT GEN"/>
 *     &lt;enumeration value="LTC"/>
 *     &lt;enumeration value="LTG"/>
 *     &lt;enumeration value="LTJG"/>
 *     &lt;enumeration value="MAJ"/>
 *     &lt;enumeration value="MAJ GEN"/>
 *     &lt;enumeration value="MCPO"/>
 *     &lt;enumeration value="MCPOCG"/>
 *     &lt;enumeration value="MCPON"/>
 *     &lt;enumeration value="MG"/>
 *     &lt;enumeration value="MGYSGT"/>
 *     &lt;enumeration value="MIDN"/>
 *     &lt;enumeration value="Miss"/>
 *     &lt;enumeration value="Mr"/>
 *     &lt;enumeration value="Mrs"/>
 *     &lt;enumeration value="Ms"/>
 *     &lt;enumeration value="MSG"/>
 *     &lt;enumeration value="MSGT"/>
 *     &lt;enumeration value="MWO"/>
 *     &lt;enumeration value="OC"/>
 *     &lt;enumeration value="OT"/>
 *     &lt;enumeration value="PFC"/>
 *     &lt;enumeration value="PO1"/>
 *     &lt;enumeration value="PO2"/>
 *     &lt;enumeration value="PO3"/>
 *     &lt;enumeration value="PSG"/>
 *     &lt;enumeration value="PV2"/>
 *     &lt;enumeration value="PVT"/>
 *     &lt;enumeration value="RADM"/>
 *     &lt;enumeration value="RDML"/>
 *     &lt;enumeration value="Rev"/>
 *     &lt;enumeration value="SA"/>
 *     &lt;enumeration value="SCPO"/>
 *     &lt;enumeration value="SFC"/>
 *     &lt;enumeration value="SGM"/>
 *     &lt;enumeration value="SGT"/>
 *     &lt;enumeration value="SGTMAJ"/>
 *     &lt;enumeration value="SGTMAJMC"/>
 *     &lt;enumeration value="SMA"/>
 *     &lt;enumeration value="SMSGT"/>
 *     &lt;enumeration value="SN"/>
 *     &lt;enumeration value="SP4"/>
 *     &lt;enumeration value="SP5"/>
 *     &lt;enumeration value="SP6"/>
 *     &lt;enumeration value="SP7"/>
 *     &lt;enumeration value="SPC"/>
 *     &lt;enumeration value="SR"/>
 *     &lt;enumeration value="SRA"/>
 *     &lt;enumeration value="SSG"/>
 *     &lt;enumeration value="SSGT"/>
 *     &lt;enumeration value="TSGT"/>
 *     &lt;enumeration value="VADM"/>
 *     &lt;enumeration value="WO"/>
 *     &lt;enumeration value="WO1"/>
 *     &lt;enumeration value="WOC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NamePrefixEnum")
@XmlEnum
public enum NamePrefixEnum {

    @XmlEnumValue("1LT")
    FIRST_LT_1("1LT"),
    @XmlEnumValue("1SG")
    FIRST_SG_1("1SG"),
    @XmlEnumValue("1ST LT")
    FIRST_LT_2("1ST LT"),
    @XmlEnumValue("1ST SGT")
    FIRST_SG_2("1ST SGT"),
    @XmlEnumValue("2LT")
    SECOND_LT_1("2LT"),
    @XmlEnumValue("2ND LT")
    SECOND_LT_2("2ND LT"),
    @XmlEnumValue("A1C")
    A1C("A1C"),
    @XmlEnumValue("AB")
    AB("AB"),
    @XmlEnumValue("ADM")
    ADM("ADM"),
    @XmlEnumValue("AMN")
    AMN("AMN"),
    @XmlEnumValue("AN")
    AN("AN"),
    @XmlEnumValue("AVCAD")
    AVCAD("AVCAD"),
    @XmlEnumValue("B GEN")
    BRIG_GEN_1("B GEN"),
    @XmlEnumValue("BG")
    BRIG_GEN_2("BG"),
    @XmlEnumValue("BRIG GEN")
    BRIG_GEN_3("BRIG GEN"),
    @XmlEnumValue("CADET")
    CADET("CADET"),
    @XmlEnumValue("CAPT")
    CAPT("CAPT"),
    @XmlEnumValue("CDR")
    CDR("CDR"),
    @XmlEnumValue("CMSAF")
    CMSAF("CMSAF"),
    @XmlEnumValue("CMSGT")
    CMSGT("CMSGT"),
    @XmlEnumValue("CN")
    CN("CN"),
    @XmlEnumValue("COL")
    COL("COL"),
    @XmlEnumValue("COMO")
    COMO("COMO"),
    @XmlEnumValue("CPL")
    CPL("CPL"),
    @XmlEnumValue("CPO")
    CPO("CPO"),
    @XmlEnumValue("CPT")
    CPT("CPT"),
    @XmlEnumValue("CSM")
    CSM("CSM"),
    @XmlEnumValue("CW2")
    CW2("CW2"),
    @XmlEnumValue("CW3")
    CW3("CW3"),
    @XmlEnumValue("CW4")
    CW4("CW4"),
    @XmlEnumValue("CW5")
    CW5("CW5"),
    @XmlEnumValue("CWO")
    CWO("CWO"),
    @XmlEnumValue("CWO2")
    CWO2("CWO2"),
    @XmlEnumValue("CWO3")
    CWO3("CWO3"),
    @XmlEnumValue("CWO4")
    CWO4("CWO4"),
    @XmlEnumValue("CWO5")
    CWO5("CWO5"),
    @XmlEnumValue("DN")
    DN("DN"),
    @XmlEnumValue("Dr")
    DR("Dr"),
    @XmlEnumValue("ENS")
    ENS("ENS"),
    @XmlEnumValue("ENSIGN")
    ENSIGN("ENSIGN"),
    @XmlEnumValue("FADM")
    FADM("FADM"),
    @XmlEnumValue("FN")
    FN("FN"),
    @XmlEnumValue("GA")
    GA("GA"),
    @XmlEnumValue("GAF")
    GAF("GAF"),
    @XmlEnumValue("GEN")
    GEN("GEN"),
    @XmlEnumValue("GYSGT")
    GYSGT("GYSGT"),
    @XmlEnumValue("HC")
    HC("HC"),
    @XmlEnumValue("HN")
    HN("HN"),
    @XmlEnumValue("LCDR")
    LCDR("LCDR"),
    @XmlEnumValue("LCPL")
    LCPL("LCPL"),
    @XmlEnumValue("LT")
    LT("LT"),
    @XmlEnumValue("LT COL")
    LT_COL("LT COL"),
    @XmlEnumValue("LT GEN")
    LT_GEN("LT GEN"),
    @XmlEnumValue("LTC")
    LTC("LTC"),
    @XmlEnumValue("LTG")
    LTG("LTG"),
    @XmlEnumValue("LTJG")
    LTJG("LTJG"),
    @XmlEnumValue("MAJ")
    MAJ("MAJ"),
    @XmlEnumValue("MAJ GEN")
    MAJ_GEN("MAJ GEN"),
    @XmlEnumValue("MCPO")
    MCPO("MCPO"),
    @XmlEnumValue("MCPOCG")
    MCPOCG("MCPOCG"),
    @XmlEnumValue("MCPON")
    MCPON("MCPON"),
    @XmlEnumValue("MG")
    MG("MG"),
    @XmlEnumValue("MGYSGT")
    MGYSGT("MGYSGT"),
    @XmlEnumValue("MIDN")
    MIDN("MIDN"),
    @XmlEnumValue("Miss")
    MISS("Miss"),
    @XmlEnumValue("Mr")
    MR("Mr"),
    @XmlEnumValue("Mrs")
    MRS("Mrs"),
    @XmlEnumValue("Ms")
    MS("Ms"),
    @XmlEnumValue("MSG")
    MSG("MSG"),
    @XmlEnumValue("MSGT")
    MSGT("MSGT"),
    @XmlEnumValue("MWO")
    MWO("MWO"),
    @XmlEnumValue("OC")
    OC("OC"),
    @XmlEnumValue("OT")
    OT("OT"),
    @XmlEnumValue("PFC")
    PFC("PFC"),
    @XmlEnumValue("PO1")
    PO1("PO1"),
    @XmlEnumValue("PO2")
    PO2("PO2"),
    @XmlEnumValue("PO3")
    PO3("PO3"),
    @XmlEnumValue("PSG")
    PSG("PSG"),
    @XmlEnumValue("PV2")
    PV2("PV2"),
    @XmlEnumValue("PVT")
    PVT("PVT"),
    @XmlEnumValue("RADM")
    RADM("RADM"),
    @XmlEnumValue("RDML")
    RDML("RDML"),
    @XmlEnumValue("Rev")
    REV("Rev"),
    @XmlEnumValue("SA")
    SA("SA"),
    @XmlEnumValue("SCPO")
    SCPO("SCPO"),
    @XmlEnumValue("SFC")
    SFC("SFC"),
    @XmlEnumValue("SGM")
    SGM("SGM"),
    @XmlEnumValue("SGT")
    SGT("SGT"),
    @XmlEnumValue("SGTMAJ")
    SGTMAJ("SGTMAJ"),
    @XmlEnumValue("SGTMAJMC")
    SGTMAJMC("SGTMAJMC"),
    @XmlEnumValue("SMA")
    SMA("SMA"),
    @XmlEnumValue("SMSGT")
    SMSGT("SMSGT"),
    @XmlEnumValue("SN")
    SN("SN"),
    @XmlEnumValue("SP4")
    SP4("SP4"),
    @XmlEnumValue("SP5")
    SP5("SP5"),
    @XmlEnumValue("SP6")
    SP6("SP6"),
    @XmlEnumValue("SP7")
    SP7("SP7"),
    @XmlEnumValue("SPC")
    SPC("SPC"),
    @XmlEnumValue("SR")
    SR("SR"),
    @XmlEnumValue("SRA")
    SRA("SRA"),
    @XmlEnumValue("SSG")
    SSG("SSG"),
    @XmlEnumValue("SSGT")
    SSGT("SSGT"),
    @XmlEnumValue("TSGT")
    TSGT("TSGT"),
    @XmlEnumValue("VADM")
    VADM("VADM"),
    @XmlEnumValue("WO")
    WO("WO"),
    @XmlEnumValue("WO1")
    WO1("WO1"),
    @XmlEnumValue("WOC")
    WOC("WOC");
    
    private final String value;

    NamePrefixEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NamePrefixEnum fromValue(String v) {
        for (NamePrefixEnum c: NamePrefixEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
