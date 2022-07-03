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
    /*public static List<String> getOddString(List<String> input) {
        return IntStream.range(0, input.size())
                .filter(n -> n % 2 != 0)
                .mapToObj(input::get)
                .collect(Collectors.toList());
    }*/

    public static String getOddString(List<String> input) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < input.size(); i++) {
            if (i % 2 != 0) {
                builder.append(i);
                builder.append(". ");
                builder.append(input.get(i));
                builder.append(", ");
            }
        }
        String result = String.valueOf(builder);
        result = result.substring(0, result.length() - 2);
        return result;
    }
}
