package streams;

import java.util.Arrays;
import java.util.List;

public class DesafioMap {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        StringBuilder stringBuilder = new StringBuilder();
        nums.stream()
            .map(Integer::toBinaryString)
            .map(palavra -> {
                return new StringBuilder(palavra).reverse().toString();
            })
            .map(palavra -> Integer.parseInt(palavra, 2))
            .forEach(System.out::println);
    }

}
