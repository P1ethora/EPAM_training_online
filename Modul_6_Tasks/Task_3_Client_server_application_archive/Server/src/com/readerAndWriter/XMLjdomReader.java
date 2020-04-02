package com.readerAndWriter;

import com.personRole.Login;
import com.personRole.PersonRole;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class XMLjdomReader {

    public XMLjdomReader() {
        PersonRole.logins.clear();
        String fileName = "src\\com\\dataBase\\accounts.xml";
        try {
            // создаем экземпляр JDOM Document из классов DOM, SAX и STAX Builder
            Document jdomDocument = createJDOMusingSAXParser(fileName);
            Element root = jdomDocument.getRootElement();
            // получаем список всех элементов Student
            List<Element> studListElements = root.getChildren("User");

            // список объектов Student, в которых будем хранить
            // считанные данные по каждому элементу
            for (Element logins : studListElements) {

                Login login = new Login();

                login.setLogin(logins.getChildText("login"));
                login.setPassword(logins.getChildText("password"));
                login.setRole(logins.getChildText("role"));

                PersonRole.logins.add(login);

                // печатаем полученный список объектов Student
                System.out.println(PersonRole.logins);
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