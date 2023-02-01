package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Bia", 6.1);
        Aluno a3 = new Aluno("Ju", 8.1);
        Aluno a4 = new Aluno("Gui", 5.1);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
        // compara dois objetos
        Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
            if (aluno1.nota > aluno2.nota) {
                return 1;
            } else if (aluno1.nota < aluno2.nota) {
                return -1;
            } else {
                return 0;
            }
        };

        Comparator<Aluno> piorNota = melhorNota.reversed();

        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().max(piorNota));

        System.out.println(alunos.stream().min(melhorNota));

    }

}
