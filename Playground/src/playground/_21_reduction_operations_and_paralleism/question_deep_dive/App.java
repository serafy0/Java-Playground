package playground._21_reduction_operations_and_paralleism.question_deep_dive;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Student {
    String name;
    String favoriteCourse;

    public Student(String name, String favCource) {
        this.name = name;
        this.favoriteCourse = favCource;
    }

    public String getFavoriteCourse() {
        return favoriteCourse;
    }

    public String getName() {
        return name;
    }
}

public class App {
    public static void main(String[] args) {
        var res = List.of(
                new Student("Fred", "programming"),
                new Student("Jim", null),
                new Student("Shelia", "Tensor Calculus"))
                .stream().collect(
                        Collectors.groupingBy(s -> Optional.of(s.getFavoriteCourse() /* null causes exception */),
                                Collectors.mapping(Student::getName,
                                        Collectors.joining(", ", "liked by: ", ""))));
        // res is of type Map<Optional<String>,String>
        // an exception at runtime

    }
}
