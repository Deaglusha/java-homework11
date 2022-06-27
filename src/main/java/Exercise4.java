import java.util.stream.Stream;

        /*
        Задание 4

        Используя Stream.iterate сделайте бесконечный стрим рандомных чисел, но не используя Math.random.
        Реализуйте свой "линейный конгруэнтный генератор". Для этого начните с x[0] = seed и затем каждый
        следующий элемент x[n + 1] = 1 (a x[n] + c) % m, для корректных значений a, c, и m. Необходимо
        имплементировать метод, который принимает на вход параметры a, c, m и seed и возвращает Stream<Long>.
        Для теста используйте данные a = 25214903917, c = 11 и m = 2^48 (2 в степени 48).
        */

public class Exercise4 {
    public static Stream<Long> getStreamRandomLong(Long seed, Long a, Long c, Long m) {
        return Stream.iterate(new Long[]{seed, a, c, m}, n -> new Long[]{(n[1] * n[0] + n[2]) % n[3], n[1], n[2], n[3]})
                .map(n -> n[0]);
    }
}
