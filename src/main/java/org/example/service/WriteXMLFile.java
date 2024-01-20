package org.example.service;

import org.example.model.Student;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class WriteXMLFile {

    public static void main(String[] args) throws JAXBException {
        System.out.println("Code started");
        //setting some values for the student object.
        Student student = new Student("Akshat Jaiswal", 23);
        JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.marshal(student, new File("/Users/alex/Downloads/Student.xml"));
        System.out.println("Ended successfully");
    }
}
