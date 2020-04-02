public class Sentence {

    private String sentence = "";

    public Sentence(Word... words) {

        for (Word word : words) {
            sentence += word;
        }
    }

    public String toString() {
        return sentence + "." + " ";
    }
}