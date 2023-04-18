package task_5;

public class CountSymbol_B {

    public static void countSymbol_B_InLine(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentChar = Character.toLowerCase(text.charAt(i));
            if (currentChar == 'в' || currentChar == 'B') {
                count++;
            }
        }
        System.out.println(count);
    }

}
