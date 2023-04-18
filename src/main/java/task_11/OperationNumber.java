package task_11;

public class OperationNumber {

    public static void abracadabraWithNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("Число четное");
            if (number % 10 == 0) {
                System.out.println(number / 10);
            }
        } else if (number % 3 == 0) {
            int result = 1;
            for (int i = 1; i <= number; i++) {
                result = result * i;
                System.out.println(result);
            }
        }
    }

}
