
public class Text {

    private String header;
    private String text = "";

    public Text(Sentence... sentences) {

        for (Sentence sentence : sentences) {
            text += sentence + "\n";
        }
    }

    public void addSentence(Sentence sentence) {
        text += sentence;
    }

    public void header(String header) {
        this.header = header;
    }

    public void printText() {
        System.out.println(header +"\n");
        System.out.println(text);
    }
}