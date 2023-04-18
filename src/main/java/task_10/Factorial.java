package task_10;

public class Factorial {

    public static void getFactorialNumber(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        System.out.println(result);
    }

}
