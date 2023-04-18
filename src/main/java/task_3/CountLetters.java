package task_3;

import java.util.HashMap;

public class CountLetters {

    public static void wordCount(String text) {
        String[] words = text.split(" ");
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        System.out.println(wordCount);
    }

}