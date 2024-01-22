package playground._21_reduction_operations_and_paralleism.grouping_and_collectors;

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
}

public class App {

    public static void main(String[] args) {
        var result = Stream.of(new Customer("Fred", "North"))
                .collect(Collectors.groupingBy(Customer::getRegion));
        // Map<String,List<Customer>>

        System.out.println(result.toString());
        System.out.println(result.getClass().getGenericSuperclass());
    }

}
