package m_1_array_of_characters;

/**
 * Замените в строке все вхождения 'word' на 'letter'.
 */

public class Task_02 {

    public static void main(String[] args) {
        String text = "word word word word";
        System.out.println(swap(text));
    }

    private static String swap(String text) {
        char[] word = {'w', 'o', 'r', 'd'};
        char[] array = text.toCharArray();
        StringBuilder newText = new StringBuilder();
        int i = 0;
        while (i < array.length) {

            if (array[i] == word[0]) {
                boolean verify = true;
                for (int j = 1; j < word.length; j++) {
                    if (array[i + j] != word[j]) {
                        verify = false;
                        break;
                    }
                }

                if (verify) {
                    newText.append("letter");
                    i += word.length;
                    continue;
                }
            }
            newText.append(array[i]);
            i++;
        }
        return newText.toString();
    }
}