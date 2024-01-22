package playground._21_reduction_operations_and_paralleism;

import java.util.List;
import java.util.stream.Collectors;

public class SimpleCollection {
    public static void main(String[] args) throws Exception {
        List.of("Fred", "Jim", "Sheila", "Bill", "Joe", "Sally", "John", "Tommy")
                .stream()
                .collect(Collectors.groupingBy(s -> s.length()))
                .forEach((k, v) -> System.out.printf("%d character words are %s\n", k, v));

    }
}
