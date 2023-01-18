package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();
        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println(conjunto.size());
        System.out.println(conjunto.remove('x'));

        System.out.println(conjunto.contains(1.2));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        //conjunto.addAll(nums); // União entre dois conjuntos
        conjunto.retainAll(nums); // Interseção entre dois conjuntos
        conjunto.clear(); // Limpar conjunto
        System.out.println(nums);
        System.out.println(conjunto);

    }

}
