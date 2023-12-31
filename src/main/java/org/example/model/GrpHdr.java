package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class GrpHdr {

    @XmlElement(name = "MsgId")
    private String messageId;

    @XmlElement(name = "CreDtTm")
    private String creDtTm;

    @XmlElement(name = "InstgAgt")
    private InstgAgt initiatingAgent;

    @XmlElement(name = "InstdAgt")
    private InstdAgt instructedAgent;
}
