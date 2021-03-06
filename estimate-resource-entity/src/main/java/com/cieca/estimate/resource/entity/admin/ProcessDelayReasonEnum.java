package com.cieca.estimate.resource.entity.admin;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessDelayReasonEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessDelayReasonEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="CT"/>
 *     &lt;enumeration value="CV"/>
 *     &lt;enumeration value="DP"/>
 *     &lt;enumeration value="EV"/>
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="FT"/>
 *     &lt;enumeration value="GI"/>
 *     &lt;enumeration value="HA"/>
 *     &lt;enumeration value="HD"/>
 *     &lt;enumeration value="IA"/>
 *     &lt;enumeration value="ID"/>
 *     &lt;enumeration value="IR"/>
 *     &lt;enumeration value="IT"/>
 *     &lt;enumeration value="IV"/>
 *     &lt;enumeration value="LG"/>
 *     &lt;enumeration value="LI"/>
 *     &lt;enumeration value="LR"/>
 *     &lt;enumeration value="MD"/>
 *     &lt;enumeration value="NO"/>
 *     &lt;enumeration value="NP"/>
 *     &lt;enumeration value="NS"/>
 *     &lt;enumeration value="NV"/>
 *     &lt;enumeration value="OP"/>
 *     &lt;enumeration value="OR"/>
 *     &lt;enumeration value="OT"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="PL"/>
 *     &lt;enumeration value="PO"/>
 *     &lt;enumeration value="RA"/>
 *     &lt;enumeration value="RE"/>
 *     &lt;enumeration value="SI"/>
 *     &lt;enumeration value="SN"/>
 *     &lt;enumeration value="SU"/>
 *     &lt;enumeration value="TH"/>
 *     &lt;enumeration value="VE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProcessDelayReasonEnum")
@XmlEnum
public enum ProcessDelayReasonEnum {

    CT,
    CV,
    DP,
    EV,
    FR,
    FT,
    GI,
    HA,
    HD,
    IA,
    ID,
    IR,
    IT,
    IV,
    LG,
    LI,
    LR,
    MD,
    NO,
    NP,
    NS,
    NV,
    OP,
    OR,
    OT,
    PA,
    PL,
    PO,
    RA,
    RE,
    SI,
    SN,
    SU,
    TH,
    VE;

    public String value() {
        return name();
    }

    public static ProcessDelayReasonEnum fromValue(String v) {
        return valueOf(v);
    }

}
