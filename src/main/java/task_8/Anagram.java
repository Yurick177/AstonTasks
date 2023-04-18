package task_8;

import java.util.Arrays;
import java.util.List;

public class Anagram {

    public static void anagramWords(String text1, String text2, String text3) {
        List<String> result1 = Arrays.asList(text1.split(""));
        List<String> result2 = Arrays.asList(text2.split(""));
        List<String> result3 = Arrays.asList(text3.split(""));
        if (result1.containsAll(result2)) {
            System.out.println(text1 + "<->" + text2 + "анаграмма");
        } else if (result1.containsAll(result3)) {
            System.out.println(text1 + " <-> " + text3 + " анаграмма");
        } else if (result2.containsAll(result3)) {
            System.out.println(text2 + " <-> " + text3 + " анаграмма");
        } else {
            System.out.println(" Все слова не анаграмма");
        }

    }

}
