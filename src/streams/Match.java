package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Bia", 6.1);
        Aluno a3 = new Aluno("Ju", 8.1);
        Aluno a4 = new Aluno("Gui", 10.1);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Predicate<Aluno> reprovado = aprovado.negate();

        // verifica se todos os alunos passaram, ou seja satisfazem o Predicate
        System.out.println(alunos.stream().allMatch(aprovado));
        // verifica se pelo menos um dos elementos satisfaz o Predicate
        System.out.println(alunos.stream().anyMatch(aprovado));
        // verifica se nenhum dos elementos satizfez o Predicate
        System.out.println(alunos.stream().noneMatch(aprovado));
        System.out.println(alunos.stream().noneMatch(reprovado));
    }

}
