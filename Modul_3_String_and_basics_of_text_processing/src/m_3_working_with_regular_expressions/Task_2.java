package m_3_working_with_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_2 {

    private static Pattern openTag = Pattern.compile("<[\\w=\"\\s]+>");
    private static Pattern closeTag = Pattern.compile("<(/+[\\w]+?)>");
    private static Pattern emptyTag = Pattern.compile("<([\\w]+/)>");
    private static Pattern contentTag = Pattern.compile("[а-яА-яЁё\\s]+[!.?,]?");

    public static void main(String[] args) {

        String xml = "<notes>\n" +
                "<note id = \"1\">\n" +
                "<to>Петя</to>\n" +
                "<from>Пушкин</from>\n" +
                "<heading>Приветствие</heading>\n" +
                "<body>Привет</body>\n" +
                "</note>\n" +
                "<note id = \"2\">\n" +
                "<to>Пушкин</to>\n" +
                "<from>Петя</from>\n" +
                "<heading>Ответ</heading>\n" +
                "<body/>\n" +
                "</note>\n" +
                "</notes>";

        String[] xmlLines = xml.split("\\n");
        System.out.println(readerXML(xmlLines ,new StringBuilder()));
    }

    private static StringBuilder readerXML(String[] xml, StringBuilder stringBuilder) {

        for (String line : xml) {

            Matcher openingTagMatcher = openTag.matcher(line);
            if (openingTagMatcher.find()) {
                editStringBuilder(openingTagMatcher, stringBuilder, "(Открывающий) -> ");
            }

            Matcher tagWithoutBodyMatcher = emptyTag.matcher(line);
            if (tagWithoutBodyMatcher.find()) {
                editStringBuilder(tagWithoutBodyMatcher, stringBuilder, "(Пустой тег) ");
            }

            Matcher contentTagMatcher = contentTag.matcher(line);
            if (contentTagMatcher.find()
                    && !contentTagMatcher.group().equals(" ")) {
                editStringBuilder(contentTagMatcher, stringBuilder, "(Содержимое) ");
                stringBuilder.append(" ");
            }

            Matcher closeTagMatcher = closeTag.matcher(line);
            if (closeTagMatcher.find()) {
                editStringBuilder(closeTagMatcher, stringBuilder, " (Закрывающий) -> ");
            }
            stringBuilder.append("\n");
        }
      return stringBuilder;
    }

    private static void editStringBuilder( Matcher matcher, StringBuilder stringBuilder, String message){
        stringBuilder.append(message);
        stringBuilder.append(matcher.group());
    }
}