package generics;

import java.util.TreeSet;

public class ComparableTest {

    public static void main(String[] args) {
        TreeSet<Integer> listNums = new TreeSet<>();

        listNums.add(100);
        listNums.add(7);
        listNums.add(1);
        listNums.add(9);
        listNums.add(-1);
        listNums.add(0);

        listNums.forEach(System.out::println);
    }

}
