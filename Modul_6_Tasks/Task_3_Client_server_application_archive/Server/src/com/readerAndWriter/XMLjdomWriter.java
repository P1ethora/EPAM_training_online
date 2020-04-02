package com.readerAndWriter;

import com.personRole.Login;
import com.personRole.PersonRole;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/** Класс записи JDOM документа в файл
 *
 */

public class XMLjdomWriter {

    public  XMLjdomWriter() throws IOException {

        String fileName = "src\\com\\dataBase\\accounts.xml";
        //Путь файла
        writeToXMLusingJDOM(PersonRole.logins, fileName);   //Вызываем наш метод записи
    }

    private static void writeToXMLusingJDOM(List<Login> logins, String fileName) throws IOException {
        Document doc = new Document();
        // создаем корневой элемент с пространством имен
        doc.setRootElement(new Element("Users"));

       // формируем JDOM документ из объектов Student
        for (Login log : logins) {

            Element userElement = new Element("User");


            userElement.addContent(new Element("login")
                    .setText(log.getLogin()));

            userElement.addContent(new Element("password")
                    .setText(log.getPassword()));

            userElement.addContent(new Element("role")
                    .setText(log.getRole()));


            doc.getRootElement().addContent(userElement);
        }
        //Запись JDOM документа в файл
        XMLOutputter xmlWriter = new XMLOutputter(Format.getPrettyFormat());
        // сохнаряем в файл
        xmlWriter.output(doc, new FileOutputStream(fileName));
    }
}