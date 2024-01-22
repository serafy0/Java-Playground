package playground._21_reduction_operations_and_paralleism.downstream_operations.quick_questions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

class Customer {
    String name;
    String region;

    public Customer(String name, String region) {
        this.name = name;
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public String getName() {
        return name;
    }
}

public class App {

    public static void main(String[] args) {

        System.out.println(Stream.of(
                new Customer("Fred", "North"),
                new Customer("Alice", "North"),
                new Customer("William", "East")

        ).collect(Collectors.groupingBy(Customer::getRegion,
                Collectors.mapping(Customer::getName, Collectors.joining(", ")))));
        // {North= Fred, Alice, East= William
    }

}
