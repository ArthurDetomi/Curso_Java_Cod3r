package generics;

import java.util.Arrays;
import java.util.List;

import static generics.ListaUtil.getUltimo1;
import static generics.ListaUtil.getUltimo2;

public class ListaUtilTeste {

    public static void main(String[] args) {
        List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        String ultimaLinguagem = (String) getUltimo1(langs);
        Integer ultimoNumero = (Integer) getUltimo1(nums);

        System.out.println(ultimaLinguagem);
        System.out.println(ultimoNumero);

        String ultimaLinguagem2 = getUltimo2(langs);
        Integer ultimoNumero2 = getUltimo2(nums);

        System.out.println(ultimaLinguagem2);
        System.out.println(ultimoNumero2);

    }
}
