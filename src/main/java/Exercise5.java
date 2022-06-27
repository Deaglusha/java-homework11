import java.util.Iterator;
import java.util.stream.Stream;

        /*
        Задание 5

        Напишите метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) который "перемешивает"
        элементы из стримов first и second, останавливается тогда, когда у одного из стримов закончатся элементы.
        */

public class Exercise5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iteratorFirst = first.iterator();
        Iterator<T> iteratorSecond = second.iterator();
        Stream<T> resultStream = Stream.empty();

        while (iteratorFirst.hasNext() && iteratorSecond.hasNext()) {
            resultStream = Stream.concat(resultStream, Stream.of(iteratorFirst.next(), iteratorSecond.next()));
        }

        return resultStream;
    }
}
