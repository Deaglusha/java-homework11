import java.util.Iterator;
import java.util.stream.Stream;

        /*
        Задание 5

        Напишите метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) который "перемешивает"
        элементы из стримов first и second, останавливается тогда, когда у одного из стримов закончатся элементы.
        */

public class Exercise5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstElements = first.iterator();
        Iterator<T> secondElements = second.iterator();
        Stream<T> result = Stream.empty();

        while (firstElements.hasNext() && secondElements.hasNext()) {
            result = Stream.concat(result, Stream.of(firstElements.next(), secondElements.next()));
        }

        return result;
    }
}
