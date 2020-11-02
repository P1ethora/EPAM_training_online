package m_3_working_with_regular_expressions;

import java.util.*;
import static java.util.Comparator.comparingInt;

/**
 * Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
 * операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
 * алфавиту.
 */

public class Task_1 {

    public static void main(String[] args) {

        String text = "There are a lot of people who wants to move and live in the UK. Most of all people are even dreaming of it, but certainly they don’t know everything about the weather in Britain." +
                "\n" +
                "In the spring the weather is mild in some parts of Britain. It rains a lot, especially in the west and in the centre of England. You can never be right about the weather for a day. You can get wet through and in twenty minutes the sun appears. If you go out without an umbrella, this means it will be raining for sure." +
                "\n" +
                "In summer the weather is better. The south and the east parts are the warmest parts. Average temperatures can reach 30 degrees on some days. At the end of summer it is getting foggy more often." +
                "\n" +
                "In autumn it’s windy and foggy; and it rains quite often. This season can be called neither too cold nor warm." +
                "\n" +
                "In winter there are a few sunny days. In the south of England you can see blue sky sometimes. But as a rule it is very cold, and the sky is often cloudy. Especially it can be noticed in the north and east. Winter is not very pleasant in these regions.";

       System.out.println("Абзацы по количеству предложений: \n");
       sortParagraph(text);
       System.out.println("\nОтсортированые слова в каждом предложении по длине: \n");
       sortWord(text);
       System.out.println();
       System.out.println("Введите символ:");
       sortLiteral(text, new Scanner(System.in).next().charAt(0));  //берем первую букву
    }

    private static void sortParagraph(String text) {
        Arrays.stream(text.split("\\n"))
                .sorted(comparingInt(o -> (o.split("[.!?]").length)))
                .forEach(System.out::println);
    }

    private static void sortWord(String text) {
        for (String sentence : text.split("[.!?]")) {
            Arrays.stream(sentence.split("\\p{P}?[ \\t\\n\\r]+"))
                    .sorted(comparingInt(String::length))
                    .map(i -> i + " ")
                    .forEach(System.out::print);
            System.out.println();
        }
    }

    private static void sortLiteral(String text, char letter) {

        for (String sentence : text.split("[.!?]")) {  //Текст на Предложения
            HashMap<String, Integer> map = new HashMap<>(); //хранилище нужных слов
            for (String word : sentence.split("\\p{P}?[ \\t\\n\\r]+")) {  //Предложения на слова
                boolean check = false;     //Указатель наличия символа
                int count = 0;            //счетчик символа в слове
                for (char ch : word.toCharArray()) {                   //слова на символы
                    if (ch == letter || String.valueOf(ch).equalsIgnoreCase(String.valueOf(letter))) {    //если есть символ с учетом реестра
                        check = true;              //Подтверждаем наличие
                        count++;                   //Счетчик +1
                    }
                }
                if (check) {
                    map.put(word.toLowerCase(), count);//если указатель показал наличие символа отправляем слово и счетчик в карту
                    check = false;   //сбросить указатель
                }
            }

            map.entrySet().stream()                       //Сортируем коллекцию по ключу и знчению
                    .sorted(Map.Entry.<String, Integer>comparingByValue()
                            .thenComparing(Map.Entry.comparingByKey()))
                    .map(i -> i.getKey() + " ")            //объект вывода
                    .forEach(System.out::print);            //вывод каждого слова в строку

            if (map.size() != 0) {   //если пусто значит в предложении нет таких слов
                System.out.println();//каждое предложение с новой строки
            }
        }
    }
//
//            if (text.indexOf(letter) != -1) {
//            String[] sentences = text.split("([.!?]+)");
//            for (String s : sentences) {
//                String[] mass = s.split("\\W");
//                for (int k = 0; k < mass.length; k++) {
//                    if (mass[k].indexOf(letter) == -1) {
//                        mass[k] = mass[k].replaceAll(".", "");
//                    }
//                }
//                for (int k = 0; k < mass.length; k++) {
//                    for (int j = 0; j < mass.length - 1; j++) {
//                        if (CountLiteral(mass[j], letter) > CountLiteral(mass[j + 1], letter)) {
//                            String temp = mass[j];
//                            mass[j] = mass[j + 1];
//                            mass[j + 1] = temp;
//                        }
//                    }
//                }
//                for (int k = 0; k < mass.length; k++) {
//                    for (int j = 0; j < mass.length - 1; j++) {
//                        if (CountLiteral(mass[j], letter) == CountLiteral(mass[j + 1], letter) && mass[j].compareTo(mass[j + 1]) > 0) {
//                            String temp = mass[j];
//                            mass[j] = mass[j + 1];
//                            mass[j + 1] = temp;
//                        }
//                    }
//                }
//                int count = 1;
//                for (String a : mass) {
//                    if (!a.equals("")) {
//                        if (count == mass.length) {
//                            System.out.print(a);
//                            System.out.println();
//                        } else {
//                            System.out.print(a + " ");
//                        }
//                    }
//                    count++;
//                }
//            }
//        } else {
//            System.out.println("Отсутствует");
//        }
//    }

//    private static int CountLiteral(String str, char letter) {
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == letter) {
//                count++;
//            }
//        }
//        return count;
//    }
}