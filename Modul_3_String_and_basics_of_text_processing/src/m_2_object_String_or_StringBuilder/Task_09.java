package m_2_object_String_or_StringBuilder;

/*
 * Посчитать количество строчных (маленьких) и прописных (больших)
 * букв в введенной строке. Учитывать только английские буквы.
 */

public class Task_09 {

    public static void main(String[] args) {
        String text = "In the RED field, a SILVER knight's cross";
        top(text);
    }

    private static void top(String text) {
        int countTop = 0;
        int countLower = 0;

        for (int i = 0; i < text.length(); i++) {
            int token = text.codePointAt(i);
            if (token >= (int) 'A' && token <= (int) 'Z') {
                countTop++;
            } else if (token >= (int) 'a' && token <= (int) 'z') {
                countLower++;
            }
        }
        System.out.print("Top registry: " + countTop + "\n" +
                "Lower register: " + countLower);
    }
}