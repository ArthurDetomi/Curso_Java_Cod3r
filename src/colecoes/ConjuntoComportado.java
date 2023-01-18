package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        //Set<String> lista = new HashSet<String>();
        SortedSet<String> lista = new TreeSet<String>();
        lista.add("Carlos");
        lista.add("Lucas");
        lista.add("Marcos");
        for (String nome : lista) {
            System.out.println(nome);
        }
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        for (int num : nums) {
            System.out.println(num);
        }

    }

}
