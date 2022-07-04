import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Exercise1
        List<String> input1 = Arrays.asList("Eric", "Long",
                "Amanda", "Scott",
                "Teresa", "Diaz",
                "Wanda", "Thomas");
        System.out.println(Exercise1.getString(input1));

        //Exercise2
        List<String> input2 = Arrays.asList("Harry", "Ross",
                "Bruce", "Cook",
                "Carolyn", "Morgan",
                "Albert", "Walker");
        List<String> result2 = Exercise2.getUpperCaseDescendedOrder(input2);
        result2.forEach(System.out::println);

        //Exercise3
        String[] input3 = new String[]{"1, 2, 0", "4, 5"};
        System.out.println(Exercise3.arraySort(input3));

        //Exercise4
        Stream<Long> random = Exercise4.getStreamRandomLong(1L, 25214903917L, 11L, (long) Math.pow(2, 48));
        random.limit(10).forEach(x -> System.out.print(x + " "));

        //Exercise5
        Stream<String> first = Stream.of("Ruth", "Jackson",
                "Debra", "Allen",
                "Gerald", "Harris",
                "Raymond", "Carter");
        Stream<String> second = Stream.of("Brooks", "Howard",
                "Rachel", "Edwards",
                "Christopher", "Perez",
                "Thomas", "Baker");
        Stream<String> resultStream = Exercise5.zip(first, second);
        List<String> result5 = resultStream.collect(Collectors.toList());
        result5.forEach(System.out::println);
    }
}
