import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

        /*
        Задание 2

        Метод принимает на вход список из строк (можно список из Задания 1). Возвращает
        список этих строк  в верхнем регистре и отсортированные по убыванию (от Z до А).
        */

public class Exercise2 {
    public static List<String> getUpperCaseDescendedOrder(List<String> input) {
        return input.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
