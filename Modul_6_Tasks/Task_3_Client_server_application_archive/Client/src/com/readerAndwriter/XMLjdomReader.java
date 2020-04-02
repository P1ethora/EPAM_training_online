package com.readerAndwriter;

import com.model.Person;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.view.PersonOverviewController.listPerson;

public class XMLjdomReader {

    public XMLjdomReader() {

        String fileName = "src\\com\\hashFile\\persons.xml";
        try {
            // мы можем создать экземпляр JDOM Document из классов DOM, SAX и STAX Builder
            Document jdomDocument = createJDOMusingSAXParser(fileName);
            Element root = jdomDocument.getRootElement();
            // получаем список всех элементов Student
            List<Element> studListElements = root.getChildren("Person");
            // список объектов Student, в которых будем хранить
            // считанные данные по каждому элементу
            List<Person> persons = new ArrayList<>();

            for (Element studentEl : studListElements) {

               Person person = new Person();

                person.setFirstName(studentEl.getAttributeValue("firstName"));
                person.setLastName((studentEl.getChildText("lastName")));
                person.setCity(studentEl.getChildText("city"));
                person.setStreet(studentEl.getChildText("street"));
                person.setPostalCode(String.valueOf(studentEl.getChildText("postalCode")));
                person.setBirthday((LocalDate.parse(studentEl.getChildText(("birthday")))));

                listPerson.add(person);
            }
            // печатаем полученный список объектов Student
            for (Person person : persons) {
                System.out.println(persons);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static Document createJDOMusingSAXParser(String fileName)
            throws JDOMException, IOException {
        SAXBuilder saxBuilder = new SAXBuilder();
        return saxBuilder.build(new File(fileName));
    }

}