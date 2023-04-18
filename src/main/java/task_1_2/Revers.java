package task_1_2;

public class Revers {

    public static void reverseChar(char[] text) {
        for (int i = text.length - 1; i >= 0; i--) {
            char symbol = text[i];
            System.out.print(symbol);
        }
    }

    public static void reverseString(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            char symbol = text.charAt(i);
            System.out.print(symbol);
        }
    }

}
