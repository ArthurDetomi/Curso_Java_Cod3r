package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> somaTotal = (i, num) -> i + num;

        int total = nums.stream().reduce(somaTotal).get();
        System.out.println(total);

        Integer total2 = nums.stream().reduce(100, somaTotal);
        System.out.println(total2);

        nums.stream().filter(n -> n > 5).reduce(somaTotal).ifPresent(System.out::println);
    }

}
