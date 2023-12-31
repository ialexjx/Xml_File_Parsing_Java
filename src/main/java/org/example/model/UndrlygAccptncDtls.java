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
public class UndrlygAccptncDtls {

    @XmlElement(name = "OrgnlMsgInf")
    private OrgnlMsgInf orgnlMsgInf;

    @XmlElement(name = "AccptncRslt")
    private AccptncRslt accptncRslt;

    @XmlElement(name = "OrgnlMndt")
    private OrgnlMndt orgnlMndt;
}
