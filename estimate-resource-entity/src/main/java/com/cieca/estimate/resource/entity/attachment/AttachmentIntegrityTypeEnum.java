package com.cieca.estimate.resource.entity.attachment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachmentIntegrityTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttachmentIntegrityTypeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}OpenEnum">
 *     &lt;enumeration value="MD5"/>
 *     &lt;enumeration value="SHA1"/>
 *     &lt;enumeration value="SHA256"/>
 *     &lt;enumeration value="SHA384"/>
 *     &lt;enumeration value="SHA512"/>
 *     &lt;enumeration value="PKCS7-Signature"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttachmentIntegrityTypeEnum")
@XmlEnum
public enum AttachmentIntegrityTypeEnum {

    @XmlEnumValue("MD5")
    MD_5("MD5"),
    @XmlEnumValue("SHA1")
    SHA_1("SHA1"),
    @XmlEnumValue("SHA256")
    SHA_256("SHA256"),
    @XmlEnumValue("SHA384")
    SHA_384("SHA384"),
    @XmlEnumValue("SHA512")
    SHA_512("SHA512"),
    @XmlEnumValue("PKCS7-Signature")
    PKCS_7_SIGNATURE("PKCS7-Signature");
    private final String value;

    AttachmentIntegrityTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttachmentIntegrityTypeEnum fromValue(String v) {
        for (AttachmentIntegrityTypeEnum c: AttachmentIntegrityTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
