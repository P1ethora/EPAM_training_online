package m_2_object_String_or_StringBuilder;

/**
 * Из заданной строки получить новую, повторив каждый символ дважды.
 */

public class Task_06 {

    public static void main(String[] args) {
        String text = "google";
        System.out.println(editor(text));
    }

    private static String editor(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        for (int i = 0; i < stringBuilder.length(); i = i + 2) {
            stringBuilder.insert(i, stringBuilder.charAt(i));
        }
        return stringBuilder.toString();
    }
}