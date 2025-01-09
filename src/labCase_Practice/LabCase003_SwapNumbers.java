package labCase_Practice;

public class LabCase003_SwapNumbers {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a = a+b;
        b = a - b;
        a = a-b;

        System.out.println(a);
        System.out.println(b);
    }
}
