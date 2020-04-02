package pl.launch;

import pl.client.Client;
import pl.content.Note;
import pl.content.NoteBase;
import pl.content.PathToFile;
import pl.logic.fileOperation.ReadFile;
import pl.logic.fileOperation.WriteFile;

import java.io.File;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        WriteFile writeFile;
        File file = new File(PathToFile.fileNotes);
        if (file.length() == 0) {
            writeFile = new WriteFile();
        }

        if (!file.createNewFile()) {
            ReadFile readFile = new ReadFile();
        }
        Collections.sort(NoteBase.notes, Comparator.comparing(Note::getCreationDate));

        Client client = new Client();

        writeFile = new WriteFile();

    }
}