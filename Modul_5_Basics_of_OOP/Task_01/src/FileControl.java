import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface FileControl {

    default void createFile(TextFile textFile, String stringPath) {
        try {
            textFile.setPath(Files.createFile(Paths.get(stringPath)));
            System.out.println("Файл создан");
        } catch (IOException e) {
            System.out.println("Файл не был создан");
        }
    }

    default boolean addText(TextFile textFile, String textAdd) {
        if (Files.exists(textFile.getPath())) {

            try (FileWriter fw = new FileWriter(textFile.getPath().toFile(), true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                out.println(textAdd);
            } catch (IOException e) {
                return false;
            }

            return true;

        } else {
            return false;
        }
    }

    default boolean renameFile(TextFile textFile, String newName) {
        if (Files.exists(textFile.getPath())) {
            try {
                Files.move(textFile.getPath(), textFile.getPath().resolveSibling(newName));
            } catch (IOException e) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    default void printContent(TextFile textFile) {
        if (Files.exists(textFile.getPath())) {
            List<String> lines = null;

            try {
                lines = Files.readAllLines(textFile.getPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Содержимое: ");
            for (String ls : lines) {
                System.out.println(ls);
            }
        } else {
            System.out.println("Файл отсутствует");
        }
    }

    default boolean deleteFile(TextFile textFile) throws IOException {
        if (Files.exists(textFile.getPath())) {
            Files.delete(textFile.getPath());
            return true;
        } else {
            return false;
        }
    }
}