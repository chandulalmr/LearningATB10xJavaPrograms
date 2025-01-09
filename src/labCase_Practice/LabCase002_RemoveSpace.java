package labCase_Practice;

public class LabCase002_RemoveSpace {
    public static void main(String[] args) {
        String sentence = "Hello World";

        String removeSpace = sentence.replaceAll(" ", "");
        System.out.println(removeSpace);
    }
}
