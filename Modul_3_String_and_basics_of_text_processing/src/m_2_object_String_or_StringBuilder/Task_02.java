package m_2_object_String_or_StringBuilder;

/**
 * В строке вставить после каждого символа 'a' символ 'b'.
 */

public class Task_02 {

    public static void main(String[] args) {
        String text = "yandex";
        System.out.println(editor(text));
    }

    private static String editor(String text) {
        text = text.replaceAll("a", "ab");
        return text;
    }
}