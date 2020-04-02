package m_3_working_with_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_2 {

    public static void main(String[] args) {

        String xml = "<notes>\n" +
                "<note id = \"1\">\n" +
                "<to>Вася</to>\n" +
                "<from>Света</from>\n" +
                "<heading>Напоминание</heading>\n" +
                "<body>Позвони мне завтра!</body>\n" +
                "</note>\n" +
                "<note id = \"2\">\n" +
                "<to>Петя</to>\n" +
                "<from>Маша</from>\n" +
                "<heading>Важное напоминание</heading>\n" +
                "<body/>\n" +
                "</note>\n" +
                "</notes>";

        String[] examine = xml.split("\\n");
        StringBuilder stringBuilder = new StringBuilder();
        Pattern openTag = Pattern.compile("<[\\w=\"\\s]+>");
        Pattern closeTag = Pattern.compile("<(/+[\\w]+?)>");
        Pattern emptyTag = Pattern.compile("<([\\w]+/)>");
        Pattern contentTag = Pattern.compile("[а-яА-яЁё\\s]+[!.?,]?");

        for (String s : examine) {

            Matcher openingTagMatcher = openTag.matcher(s);
            if (openingTagMatcher.find()) {
                stringBuilder.append("Открывающий тег ");
                stringBuilder.append(openingTagMatcher.group());
            }

            Matcher tagWithoutBodyMatcher = emptyTag.matcher(s);
            if (tagWithoutBodyMatcher.find()) {
                stringBuilder.append(tagWithoutBodyMatcher.group());
                stringBuilder.append(" Тег без тела");
            }

            Matcher contentTagMatcher = contentTag.matcher(s);
            if (contentTagMatcher.find()
                    && !contentTagMatcher.group().equals(" ")) {
                stringBuilder.append(" Содержимое тега: ");
                stringBuilder.append(contentTagMatcher.group());
                stringBuilder.append(" ");
            }

            Matcher closeTagMatcher = closeTag.matcher(s);
            if (closeTagMatcher.find()) {
                stringBuilder.append(closeTagMatcher.group());
                stringBuilder.append(" Закрывающий тег");
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);
    }
}