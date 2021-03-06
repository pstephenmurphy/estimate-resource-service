package com.cieca.estimate.resource.entity.loss;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointofImpactDescEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PointofImpactDescEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="Right Front Corner"/>
 *     &lt;enumeration value="Right Front Fender"/>
 *     &lt;enumeration value="Right Side"/>
 *     &lt;enumeration value="Right Rear Side"/>
 *     &lt;enumeration value="Right Rear Corner"/>
 *     &lt;enumeration value="Rear"/>
 *     &lt;enumeration value="Left Rear Corner"/>
 *     &lt;enumeration value="Left Rear Side"/>
 *     &lt;enumeration value="Left Side"/>
 *     &lt;enumeration value="Left Front Side"/>
 *     &lt;enumeration value="Left Front Corner"/>
 *     &lt;enumeration value="Front"/>
 *     &lt;enumeration value="Rollover"/>
 *     &lt;enumeration value="Unknown Point of Impact"/>
 *     &lt;enumeration value="Total Loss"/>
 *     &lt;enumeration value="Non-Collision"/>
 *     &lt;enumeration value="Left And Right"/>
 *     &lt;enumeration value="Front And Rear"/>
 *     &lt;enumeration value="All Over"/>
 *     &lt;enumeration value="Stripped"/>
 *     &lt;enumeration value="Undercarriage"/>
 *     &lt;enumeration value="Total Burn"/>
 *     &lt;enumeration value="Interior Burn"/>
 *     &lt;enumeration value="Engine Burn"/>
 *     &lt;enumeration value="Hood"/>
 *     &lt;enumeration value="Deck Lid"/>
 *     &lt;enumeration value="Roof"/>
 *     &lt;enumeration value="Fresh Water"/>
 *     &lt;enumeration value="Salt Water"/>
 *     &lt;enumeration value="Vandalized"/>
 *     &lt;enumeration value="No Damage"/>
 *     &lt;enumeration value="Engine"/>
 *     &lt;enumeration value="Windshield"/>
 *     &lt;enumeration value="Left Windshield"/>
 *     &lt;enumeration value="Right Windshield"/>
 *     &lt;enumeration value="Back Glass"/>
 *     &lt;enumeration value="Left Front Door Glass"/>
 *     &lt;enumeration value="Right Front Door Glass"/>
 *     &lt;enumeration value="Left Front Vent Glass"/>
 *     &lt;enumeration value="Right Front Vent Glass"/>
 *     &lt;enumeration value="Left Rear Door Glass"/>
 *     &lt;enumeration value="Right Rear Door Glass"/>
 *     &lt;enumeration value="Left Rear Vent Glass"/>
 *     &lt;enumeration value="Right Rear Vent Glass"/>
 *     &lt;enumeration value="Left Rear Quarter Glass"/>
 *     &lt;enumeration value="Right Rear Quarter Glass"/>
 *     &lt;enumeration value="Left Side Middle Glass"/>
 *     &lt;enumeration value="Right Side Middle Glass"/>
 *     &lt;enumeration value="Left Headlamp"/>
 *     &lt;enumeration value="Right Headlamp"/>
 *     &lt;enumeration value="Left Taillamp"/>
 *     &lt;enumeration value="Right Taillamp"/>
 *     &lt;enumeration value="Sunroof"/>
 *     &lt;enumeration value="Left T-Top"/>
 *     &lt;enumeration value="Right T-Top"/>
 *     &lt;enumeration value="Slider"/>
 *     &lt;enumeration value="Left Back Glass"/>
 *     &lt;enumeration value="Right Back Glass"/>
 *     &lt;enumeration value="Left Mirror"/>
 *     &lt;enumeration value="Right Mirror"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="All Glass"/>
 *     &lt;enumeration value="Interior "/>
 *     &lt;enumeration value="Transmission "/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PointofImpactDescEnum")
@XmlEnum
public enum PointofImpactDescEnum {

    @XmlEnumValue("Right Front Corner")
    RIGHT_FRONT_CORNER("Right Front Corner"),
    @XmlEnumValue("Right Front Fender")
    RIGHT_FRONT_FENDER("Right Front Fender"),
    @XmlEnumValue("Right Side")
    RIGHT_SIDE("Right Side"),
    @XmlEnumValue("Right Rear Side")
    RIGHT_REAR_SIDE("Right Rear Side"),
    @XmlEnumValue("Right Rear Corner")
    RIGHT_REAR_CORNER("Right Rear Corner"),
    @XmlEnumValue("Rear")
    REAR("Rear"),
    @XmlEnumValue("Left Rear Corner")
    LEFT_REAR_CORNER("Left Rear Corner"),
    @XmlEnumValue("Left Rear Side")
    LEFT_REAR_SIDE("Left Rear Side"),
    @XmlEnumValue("Left Side")
    LEFT_SIDE("Left Side"),
    @XmlEnumValue("Left Front Side")
    LEFT_FRONT_SIDE("Left Front Side"),
    @XmlEnumValue("Left Front Corner")
    LEFT_FRONT_CORNER("Left Front Corner"),
    @XmlEnumValue("Front")
    FRONT("Front"),
    @XmlEnumValue("Rollover")
    ROLLOVER("Rollover"),
    @XmlEnumValue("Unknown Point of Impact")
    UNKNOWN_POINT_OF_IMPACT("Unknown Point of Impact"),
    @XmlEnumValue("Total Loss")
    TOTAL_LOSS("Total Loss"),
    @XmlEnumValue("Non-Collision")
    NON_COLLISION("Non-Collision"),
    @XmlEnumValue("Left And Right")
    LEFT_AND_RIGHT("Left And Right"),
    @XmlEnumValue("Front And Rear")
    FRONT_AND_REAR("Front And Rear"),
    @XmlEnumValue("All Over")
    ALL_OVER("All Over"),
    @XmlEnumValue("Stripped")
    STRIPPED("Stripped"),
    @XmlEnumValue("Undercarriage")
    UNDERCARRIAGE("Undercarriage"),
    @XmlEnumValue("Total Burn")
    TOTAL_BURN("Total Burn"),
    @XmlEnumValue("Interior Burn")
    INTERIOR_BURN("Interior Burn"),
    @XmlEnumValue("Engine Burn")
    ENGINE_BURN("Engine Burn"),
    @XmlEnumValue("Hood")
    HOOD("Hood"),
    @XmlEnumValue("Deck Lid")
    DECK_LID("Deck Lid"),
    @XmlEnumValue("Roof")
    ROOF("Roof"),
    @XmlEnumValue("Fresh Water")
    FRESH_WATER("Fresh Water"),
    @XmlEnumValue("Salt Water")
    SALT_WATER("Salt Water"),
    @XmlEnumValue("Vandalized")
    VANDALIZED("Vandalized"),
    @XmlEnumValue("No Damage")
    NO_DAMAGE("No Damage"),
    @XmlEnumValue("Engine")
    ENGINE("Engine"),
    @XmlEnumValue("Windshield")
    WINDSHIELD("Windshield"),
    @XmlEnumValue("Left Windshield")
    LEFT_WINDSHIELD("Left Windshield"),
    @XmlEnumValue("Right Windshield")
    RIGHT_WINDSHIELD("Right Windshield"),
    @XmlEnumValue("Back Glass")
    BACK_GLASS("Back Glass"),
    @XmlEnumValue("Left Front Door Glass")
    LEFT_FRONT_DOOR_GLASS("Left Front Door Glass"),
    @XmlEnumValue("Right Front Door Glass")
    RIGHT_FRONT_DOOR_GLASS("Right Front Door Glass"),
    @XmlEnumValue("Left Front Vent Glass")
    LEFT_FRONT_VENT_GLASS("Left Front Vent Glass"),
    @XmlEnumValue("Right Front Vent Glass")
    RIGHT_FRONT_VENT_GLASS("Right Front Vent Glass"),
    @XmlEnumValue("Left Rear Door Glass")
    LEFT_REAR_DOOR_GLASS("Left Rear Door Glass"),
    @XmlEnumValue("Right Rear Door Glass")
    RIGHT_REAR_DOOR_GLASS("Right Rear Door Glass"),
    @XmlEnumValue("Left Rear Vent Glass")
    LEFT_REAR_VENT_GLASS("Left Rear Vent Glass"),
    @XmlEnumValue("Right Rear Vent Glass")
    RIGHT_REAR_VENT_GLASS("Right Rear Vent Glass"),
    @XmlEnumValue("Left Rear Quarter Glass")
    LEFT_REAR_QUARTER_GLASS("Left Rear Quarter Glass"),
    @XmlEnumValue("Right Rear Quarter Glass")
    RIGHT_REAR_QUARTER_GLASS("Right Rear Quarter Glass"),
    @XmlEnumValue("Left Side Middle Glass")
    LEFT_SIDE_MIDDLE_GLASS("Left Side Middle Glass"),
    @XmlEnumValue("Right Side Middle Glass")
    RIGHT_SIDE_MIDDLE_GLASS("Right Side Middle Glass"),
    @XmlEnumValue("Left Headlamp")
    LEFT_HEADLAMP("Left Headlamp"),
    @XmlEnumValue("Right Headlamp")
    RIGHT_HEADLAMP("Right Headlamp"),
    @XmlEnumValue("Left Taillamp")
    LEFT_TAILLAMP("Left Taillamp"),
    @XmlEnumValue("Right Taillamp")
    RIGHT_TAILLAMP("Right Taillamp"),
    @XmlEnumValue("Sunroof")
    SUNROOF("Sunroof"),
    @XmlEnumValue("Left T-Top")
    LEFT_T_TOP("Left T-Top"),
    @XmlEnumValue("Right T-Top")
    RIGHT_T_TOP("Right T-Top"),
    @XmlEnumValue("Slider")
    SLIDER("Slider"),
    @XmlEnumValue("Left Back Glass")
    LEFT_BACK_GLASS("Left Back Glass"),
    @XmlEnumValue("Right Back Glass")
    RIGHT_BACK_GLASS("Right Back Glass"),
    @XmlEnumValue("Left Mirror")
    LEFT_MIRROR("Left Mirror"),
    @XmlEnumValue("Right Mirror")
    RIGHT_MIRROR("Right Mirror"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("All Glass")
    ALL_GLASS("All Glass"),
    @XmlEnumValue("Interior ")
    INTERIOR("Interior "),
    @XmlEnumValue("Transmission ")
    TRANSMISSION("Transmission ");
    private final String value;

    PointofImpactDescEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PointofImpactDescEnum fromValue(String v) {
        for (PointofImpactDescEnum c: PointofImpactDescEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
