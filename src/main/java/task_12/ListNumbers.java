package task_12;

import org.json.JSONObject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListNumbers {

    public static void list() {
        List<Integer> numbers = Arrays.asList(1, 5, -3, 7);
        // 2.1. Который отрицательные числа делает положительными и возвращает коллекцию
        List<Integer> positiveNumbers = numbers.stream()
                .map(number -> number < 0 ? -number : number)
                .collect(Collectors.toList());
        System.out.println(positiveNumbers);

        // 2.2. Который четные числа умножает на 100, а от нечетных отнимает 100 и возвращает коллекцию.
        List<Integer> modifiedNumbers = numbers.stream()
                .map(number -> number % 2 == 0 ? number * 100 : number - 100)
                .collect(Collectors.toList());
        System.out.println(modifiedNumbers);

        // 2.3. Есть стринговый лист фамилий, нужно пройтись по списку, вытащить фамилии которые начинаются на А
        // и поместить их в другой список для дальнейшей работы с ними
        List<String> names = Arrays.asList("Ivanov", "Petrov", "Alekseev", "Abramov");
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(filteredNames);

        // 2.4 На вход получаем некий JSON. Проверить, что поле "isPopular" равно false
        JSONObject jsonObject = new JSONObject("{\"name\":\"product\", \"isPopular\":false}");
        boolean isPopular = jsonObject.getBoolean("isPopular");
        System.out.println(isPopular);

        // 2.5 Найти сумму нечетных чисел в коллекции.
        int sumOfOddNumbers = numbers.stream()
                .filter(number -> number % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumOfOddNumbers);
    }

}
