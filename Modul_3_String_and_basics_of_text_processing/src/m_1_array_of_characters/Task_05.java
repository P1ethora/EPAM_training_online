package m_1_array_of_characters;

/**
 * Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить
 * на одиночные пробелы. Крайние пробелы в строке удалить.
 */

public class Task_05 {

    public static void main(String[] args) {
        String text = "  text    text  text     text      ".trim();
        StringBuilder stringBuilder = new StringBuilder();

        boolean spc = false;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                if (!spc) {
                    stringBuilder.append(" ");
                }
                spc = true;
            } else {
                stringBuilder.append(text.charAt(i));
                spc = false;
            }
        }
        System.out.println(stringBuilder.toString() + ".");
    }
}