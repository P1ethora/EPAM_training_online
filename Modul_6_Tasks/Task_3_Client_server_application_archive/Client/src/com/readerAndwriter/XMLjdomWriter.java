package com.readerAndwriter;

import com.model.Person;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import static com.view.PersonOverviewController.listPerson;

/** Класс записи JDOM документа в файл
 *
 */

public class XMLjdomWriter {

    public  XMLjdomWriter() throws IOException {

        String fileName = "src\\com\\hashFile\\persons.xml";   //Путь файла
        writeToXMLusingJDOM(listPerson, fileName);   //Вызываем наш метод записи
    }

    private static void writeToXMLusingJDOM(List<Person> students, String fileName) throws IOException {
        Document doc = new Document();
        // создаем корневой элемент с пространством имен
        doc.setRootElement(new Element("Persons"));

       // формируем JDOM документ из объектов Student
        for (Person student : students) {

            Element studentElement = new Element("Person");

            studentElement.setAttribute("firstName",
                    String.valueOf(student.getFirstName()));

            studentElement.addContent(new Element("lastName")
                    .setText(student.getLastName()));

            studentElement.addContent(new Element("city")
                    .setText(String.valueOf(student.getCity())));

            studentElement.addContent(new Element("street")
                    .setText(student.getStreet()));

            studentElement.addContent(new Element("postalCode")
                    .setText(String.valueOf(student.getPostalCode())));

            studentElement.addContent(new Element("birthday")
                    .setText(String.valueOf(student.getBirthday())));

            doc.getRootElement().addContent(studentElement);
        }
        //Запись JDOM документа в файл
        XMLOutputter xmlWriter = new XMLOutputter(Format.getPrettyFormat());
        // сохнаряем в файл
        xmlWriter.output(doc, new FileOutputStream(fileName));
    }
}