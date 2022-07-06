import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

        /*
        Задание 1

        Метод принимает на вход список имен. Вернуть строку в виде: "1. Ivan, 3. Peter ...",
        с именами из списка, стоящими под нечетным индексом (1, 3 и т.д.).
        */

public class Exercise1 {
    public static String getString(List<String> input) {
        return IntStream.range(0, input.size())
                .filter(n -> n % 2 != 0)
                .mapToObj(index -> String.format("%d. %s", index, input.get(index)))
                .collect(Collectors.joining(", "));
    }
}
