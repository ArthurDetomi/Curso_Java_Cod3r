package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map2 {

    public static void main(String[] args) {
        Pessoa a1 = new Pessoa(1, "Arthur", "thur");
        Pessoa a2 = new Pessoa(2, "Julia", "Ju");
        Pessoa a3 = new Pessoa(3, "Guilherme", "Gui");
        Pessoa a4 = new Pessoa(4, "Vitoria", "Ana");

        List<Pessoa> pessoas = Arrays.asList(a1, a2, a3, a4);

        List<PessoaTemp> listAlunosTemp = pessoas.stream()
                .map(PessoaTemp::new)
                .collect(Collectors.toList());

        listAlunosTemp.forEach(System.out::println);
    }

}
