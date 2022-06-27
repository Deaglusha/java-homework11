import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

        /*
        Задание 3

        Дан массив:
        ["1, 2, 0", "4, 5"]

        Получить из массива все числа, вернуть в отсортированном виде, разделенные запятой, то есть
        "0, 1, 2, 4, 5"
        */

public class Exercise3 {
    public static String arraySort(String[] strings) {
        return Arrays.stream(strings)
                .flatMap(s -> Stream.of(s.split(", ")))
                .map(Integer::valueOf)
                .sorted(Integer::compareTo)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
