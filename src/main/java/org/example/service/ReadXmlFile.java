package org.example.service;

import org.example.model.Document;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class ReadXmlFile {

    public static Document readXmlFile(File xmlFile)throws JAXBException{
        try{
            System.out.println("in readXMLFile method with the XML file " + xmlFile.getName());
            JAXBContext jaxbContext = JAXBContext.newInstance(Document.class);
            System.out.println("Code is here ");
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Document document = (Document) jaxbUnmarshaller.unmarshal(xmlFile);
            System.out.println("return from the readXmlFile");
            return document;
        }catch (JAXBException e){
            System.out.println("An unexpected error occured in the readXmlFile method " + e.getMessage());
            throw new JAXBException("Un-expected error faced", e);
        }
    }
}
