package task_8;

import java.util.Arrays;
import java.util.List;

public class Anagram {

    public static void anagramWords(String text1, String text2) {
        List<String> result1 = Arrays.asList(text1.split(""));
        List<String> result2 = Arrays.asList(text2.split(""));
        if (result1.containsAll(result2)) {
            System.out.println(text1 + "<->" + text2 + "\n" + " <- \uD83E\uDD84 анаграмма \uD83E\uDD84 ->");
        } else {
            System.out.println("не анаграмма");
        }
    }

}
