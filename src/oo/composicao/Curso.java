package oo.composicao;

import java.util.ArrayList;

public class Curso {

    private final String nome;
    private final ArrayList<Aluno> alunos = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.getCursos().add(this);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

}
