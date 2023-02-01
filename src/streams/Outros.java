package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Bia", 6.1);
        Aluno a3 = new Aluno("Ju", 8.1);
        Aluno a4 = new Aluno("Gui", 10.1);
        Aluno a5 = new Aluno("Ana", 7.1);
        Aluno a6 = new Aluno("Pedro", 7.7);
        Aluno a7 = new Aluno("Maria", 9.2);
        Aluno a8 = new Aluno("Gui", 10.1);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        System.out.println("distinct...");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("Skip / Limit");
        alunos.stream()
                .distinct()
                .skip(2L) // quantos irão pular
                .limit(2L) // quantos irá pegar
                .forEach(System.out::println);

        System.out.println("Take/While");
        alunos.stream()
                .distinct()
                .takeWhile(a -> a.nota >= 7) // pegue o proximo elemento enquanto, Predicate(condição)
                .forEach(System.out::println);



    }

}
