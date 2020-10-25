package m_1_linearArrays;

import java.util.*;

/**
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
 * Если таких чисел несколько, то определить наименьшее из них.
 */

public class Task_09 {

    public static void main(String[] args) {

        int[] list = {3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 4, 4};

        System.out.println(detect(list));
//        System.out.println(alternative(list));
    }

    private static int detect(int[] mass) {
        int[] list = Arrays.copyOf(mass, mass.length);
        int muchRepeat = -1;
        int maxCount = -1;

        for (int i = 0; i < list.length; i++) {
            if (i != 0 && list[i] == list[0]) continue;
            int count = 1;

            if (i < list.length - 1) {
                for (int j = i + 1; j < list.length; j++) {
                    if (list[i] == list[j]) {
                        count = count + 1;
                        list[j] = list[0];
                    }
                }
            }

            if (maxCount < count) {
                maxCount = count;
                muchRepeat = list[i];
            } else if (maxCount == count && muchRepeat > list[i]) {
                muchRepeat = list[i];
            }
        }

        return muchRepeat;
    }


//    public static int alternative(int[] mass) {
//        int[] array = {5, 5, 5, 4, 4, 4, 2, 1, 1, 1};
//        HashMap<Integer, Integer> keeperNumberArray = new HashMap<>();
//        ArrayList<Integer> listMax = new ArrayList<>();
//
//        for (int n : array) {                                                   //перебор всех чисел
//            int counter = 0;                                                    //установка каунтера
//            for (int value : array) {                                           //сравнение числа n со всеми значениями в массиве
//                if (n == value) {                                               //если есть совпадения то увеличиваем каунтер
//                    counter++;
//                }
//            }
//            keeperNumberArray.put(n, counter);                                  //цикл n пройден и что получилось добавляем в карту
//        }
//        int max = Collections.max(keeperNumberArray.values());                  //узнаем максимальное значение в карте
//        for (Map.Entry<Integer, Integer> pair : keeperNumberArray.entrySet()) { //перебор карты
//            Integer key = pair.getKey();
//            Integer value = pair.getValue();
//            if (value == max) {                                                 //сравниваем наш максимум с всеми вариантами в карте
//                listMax.add(key);                                               //Добавляем в листМакс наши одинаковые значения
//            }
//        }
//        return Collections.min(listMax);                                         //Вытягиваем самое большое число
//
//    }
}