import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class ExerciseOne {
    public static void main(String[] args) {
        IntStream ints = IntStream.range(1,100);

        List<Integer>divisibleByThree = intsDivisibleByThree(ints);

        divisibleByThree.forEach(System.out::println);

    }

    public static List<Integer> intsDivisibleByThree(IntStream name) {
        return name
                .filter(num -> num % 3 == 0)
                .boxed()
                .collect(Collectors.toList());
    }
}
