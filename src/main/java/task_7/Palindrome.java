package task_7;

public class Palindrome {

    public static void PalindromeLine(String text) {
        String replace = text.replace(" ", "");
        String reversedStr = new StringBuilder(replace).reverse().toString();
        System.out.println(replace.equalsIgnoreCase(reversedStr));
    }

}
