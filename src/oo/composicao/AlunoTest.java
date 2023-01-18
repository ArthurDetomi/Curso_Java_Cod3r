package oo.composicao;

public class AlunoTest {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Joao");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Jose");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("Web");
        Curso curso3 = new Curso("React");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for (Aluno aluno : curso3.getAlunos()) {
            System.out.println(aluno.getNome() + " estou matriculado no curso 1");
        }

        for(Curso curso : aluno1.getCursos()){
            System.out.println(aluno1.getNome() + " meu curso eh " + curso2.getNome());
        }

        Curso cursoEncontrado = aluno1.obterCursoPorNome("Web");
        if(cursoEncontrado != null){
            System.out.println(cursoEncontrado.getNome());
            System.out.println(cursoEncontrado.getAlunos());
        }

    }

}
