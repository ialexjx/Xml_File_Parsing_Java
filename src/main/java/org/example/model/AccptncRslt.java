package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class AccptncRslt {

    @XmlElement(name = "Accptd", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.012.001.01")
    private String accepted;

    @XmlElement(name = "RjctRsn", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.012.001.01")
    private RjctRsn rejectionReason;

}
