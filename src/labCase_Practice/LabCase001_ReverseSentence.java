package labCase_Practice;

public class LabCase001_ReverseSentence {
    public static void main(String[] args) {
        String Sentence = "Hello World";
// String Builder method
        StringBuilder reverseSentence = new StringBuilder(Sentence);
        System.out.println(reverseSentence.reverse().toString());
    }
}
