import task_10.Factorial;
import task_11.OperationNumber;
import task_12.ListNumbers;
import task_1_2.Revers;
import task_3.CountLetters;
import task_4.Replace;
import task_5.CountSymbol_B;
import task_6.PrintLine3Count;
import task_7.Palindrome;
import task_8.Anagram;
import task_9.NumbersFibonacci;

public class Runner {

    public static void main(String[] args) {
        char[] text1 = "Никогда не ошибается тот, кто ничего не делает".toCharArray();
        Revers.reverseChar(text1);
        System.out.println();
        String text2 = "Никогда не ошибается тот, кто ничего не делает";
        Revers.reverseString(text2);
        System.out.println();
        String countLetters = "Упади семь раз и восемь раз поднимись";
        CountLetters.wordCount(countLetters);
        String text3 = "Неуд*ч* – это просто возможность н*ч*ть снов*, но уже более мудро.";
        Replace.replace_A(text3);
        String text4 = "Работать нужно не 12 часов, а головой!";
        Replace.replaceSymbol(text4);
        String text5 = "Работать нужно не 12 часов, а головой!";
        CountSymbol_B.countSymbol_B_InLine(text5);
        String text6 = "Работать нужно не 12 часов, а головой!";
        PrintLine3Count.PrintLine3CountAndSeparator(text6, "-----------------");
        String text7 = "Аргентина манит негра";
        Palindrome.PalindromeLine(text7);
        Anagram.anagramWords("обезьянство", "место", "мечеть");
        NumbersFibonacci.fibonacci();
        Factorial.getFactorialNumber(4);
        OperationNumber.abracadabraWithNumber(100);
        ListNumbers.list();
    }

}
