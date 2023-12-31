package org.example;

import org.example.model.Document;
import org.example.service.ReadXmlFile;

import javax.xml.bind.JAXBException;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, JAXBException {
        System.out.println("Hello world!");

        String filePath = "/Users/alex/Downloads/MMS-CREATE-YESB-NACH00000000008325-14092023-INP-RES.xml";
        File xmlFile = new File(filePath);

        Document document = ReadXmlFile.readXmlFile(xmlFile);
        System.out.println(document);

        if(document != null && document.getMndtAccptncRpt() != null){
            System.out.println("Message id is " + document.getMndtAccptncRpt().getGrpHdr().getMessageId());
            System.out.println("Second Message Id is :- " + document.getMndtAccptncRpt().getUndrlygAccptncDtls().getOrgnlMsgInf().getMsgId());
        }else{
            System.out.println("Error: unable to read the XML file or the document is null");
        }
    }
}