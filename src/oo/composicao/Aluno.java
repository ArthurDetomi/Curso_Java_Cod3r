package oo.composicao;

import java.util.ArrayList;

public class Aluno {

    private final String nome;
    private final ArrayList<Curso> cursos = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Curso obterCursoPorNome(String nome){
        for(Curso curso : this.cursos){
            if(curso.getNome().equalsIgnoreCase(nome)){
                return curso;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    public void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.getAlunos().add(this);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

}
