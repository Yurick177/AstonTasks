package task_4;

public class Replace {

    public static void replace_A(String text) {
        String replace = text.replace("*", "а");
        System.out.println(replace);
    }

    public static void replaceSymbol(String text) {
        String replace = text.replace("!", "");
        System.out.println(replace);
    }

}
