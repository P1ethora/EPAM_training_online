/**
 * Создать объект класса Текст, используя классы Предложение, Слово.
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */

public class Main {

    public static void main(String[] args) {

        Sentence sentence1 = new Sentence(new Word("В"), new Word("молчании"), new Word("бешено"), new Word("скачет"), new Word("над"),
                new Word("землей"), new Word("дикая"), new Word("охота"), new Word("короля"), new Word("Стаха"));
        Sentence sentence2 = new Sentence(new Word("Я"), new Word("просыпаюсь"), new Word("и"), new Word("думаю,"), new Word("что"),
                new Word("не"), new Word("прошло"), new Word("ее"), new Word("время,"), new Word("пока"),
                new Word("существуют"), new Word("мрак,"), new Word("голод,"), new Word("неравноправие"), new Word("и"),
                new Word("темный"), new Word("ужас"), new Word("на"), new Word("земле"));
        Sentence sentence3 = new Sentence(new Word("Она —"), new Word("символ"), new Word("всего"), new Word("этого"));
        Sentence sentence4 = new Sentence(new Word("Утопая"), new Word("наполовину"), new Word("в"), new Word("тумане,"), new Word("мчит"),
                new Word("над"), new Word("мрачной"), new Word("землей"), new Word("дикая"), new Word("охота"));

        Text text = new Text(sentence1, sentence2, sentence3);

        text.addSentence(sentence4);
        text.header("Дикая охота");
        text.printText();

    }
}