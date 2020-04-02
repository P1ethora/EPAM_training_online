package m_1_array_of_characters;

import java.util.Arrays;

/**
 * Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */

public class Task_01 {

    public static void main(String[] args) {
        String[] array = {"javaCode", "camelCase", "snakeCase"};

        for (int i = 0; i < array.length; i++) {
            array[i] = editor(array[i]);
        }
        System.out.println(Arrays.toString(array));
    }

    private static String editor(String a) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] array = a.toCharArray();
        for (char enumeration : array) {
            if (Character.isUpperCase(enumeration)) {
                stringBuilder.append("_").append(Character.toLowerCase(enumeration));
            } else {
                stringBuilder.append(enumeration);
            }
        }
        return stringBuilder.toString();
    }
}