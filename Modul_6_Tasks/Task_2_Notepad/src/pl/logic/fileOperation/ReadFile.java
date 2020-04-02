package pl.logic.fileOperation;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import pl.content.Note;
import pl.content.NoteBase;
import pl.content.PathToFile;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class ReadFile {

    public ReadFile() throws JDOMException, IOException {

        Document jdomDocument = createJDOMusingSAXParser(PathToFile.fileNotes);
        Element root = jdomDocument.getRootElement();

        List<Element> studListElements = root.getChildren("Note");

        for (Element note1 : studListElements) {

            Note note = new Note();

            note.setCreationDate((LocalDate.parse(note1.getChildText(("date")))));
            note.setSubject((note1.getChildText("subject")));
            note.setEmail(note1.getChildText("email"));
            note.setMessage(note1.getChildText("message"));


            NoteBase.notes.add(note);
        }
    }

    private static Document createJDOMusingSAXParser(String fileName)
            throws JDOMException, IOException {
        SAXBuilder saxBuilder = new SAXBuilder();
        return saxBuilder.build(new File(fileName));
    }
}