package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.8);
        Aluno a2 = new Aluno("Gui", 5.8);
        Aluno a3 = new Aluno("Pedro", 9.8);
        Aluno a4 = new Aluno("Ju", 6.8);
        Aluno a5 = new Aluno("Isa", 7.1);
        Aluno a6 = new Aluno("Bia", 8.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
        Function<Aluno, String> saudacao = a -> "Parabéns " + a.nome + " !!Vc foi aprovado !!";

        alunos.stream()
                .filter(aprovado)
                .map(saudacao)
                .forEach(System.out::println);


    }

}
