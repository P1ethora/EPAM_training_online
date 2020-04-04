import java.io.IOException;

/**
 * Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
 * вывести на консоль содержимое, дополнить, удалить.
 */

public class Main {

    public static void main(String[] args) throws IOException {
        TextFile textFile = new TextFile();

        String text = "Hello World!";

        textFile.createFile(textFile, "f:\\File.txt");
        textFile.addText(textFile, text);
        textFile.printContent(textFile);
        textFile.renameFile(textFile, "f:\\Hello_World.txt");
        textFile.deleteFile(textFile);
    }
}