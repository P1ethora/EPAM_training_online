package pl.logic.fileOperation;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import pl.content.Note;
import pl.content.NoteBase;
import pl.content.PathToFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class WriteFile {

    public WriteFile() throws IOException {

        writeToXMLusingJDOM(NoteBase.notes, PathToFile.fileNotes);
    }

    private static void writeToXMLusingJDOM(List<Note> notes, String fileName) throws IOException {

        Document doc = new Document();

        doc.setRootElement(new Element("Notes"));
        for (Note note : notes) {

            Element noteElement = new Element("Note");

            noteElement.addContent(new Element("date")
                    .setText(String.valueOf(note.getCreationDate())));

            noteElement.addContent(new Element("subject")
                    .setText(note.getSubject()));

            noteElement.addContent(new Element("email")
                    .setText(note.getEmail()));

            noteElement.addContent(new Element("message")
                    .setText(note.getMessage()));

            doc.getRootElement().addContent(noteElement);
        }

        XMLOutputter xmlWriter = new XMLOutputter(Format.getPrettyFormat());

        xmlWriter.output(doc, new FileOutputStream(fileName));

    }
}