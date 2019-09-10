//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.14 at 03:49:41 PM CEST 
//


package org.taktik.icure.be.ehealth.dto.kmehr.v20190301.be.fgov.ehealth.standards.kmehr.id.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ID-KMEHRschemes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ID-KMEHRschemes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ID-KMEHR"/>
 *     &lt;enumeration value="ID-IBAN"/>
 *     &lt;enumeration value="ID-SERIALNO"/>
 *     &lt;enumeration value="LOCAL"/>
 *     &lt;enumeration value="ID-CBE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ID-KMEHRschemes")
@XmlEnum
public enum IDKMEHRschemes {

    @XmlEnumValue("ID-KMEHR")
    ID_KMEHR("ID-KMEHR"),
    @XmlEnumValue("ID-IBAN")
    ID_IBAN("ID-IBAN"),
    @XmlEnumValue("ID-SERIALNO")
    ID_SERIALNO("ID-SERIALNO"),
    LOCAL("LOCAL"),
    @XmlEnumValue("ID-CBE")
    ID_CBE("ID-CBE");
    private final String value;

    IDKMEHRschemes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IDKMEHRschemes fromValue(String v) {
        for (IDKMEHRschemes c: IDKMEHRschemes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}