package colecoes;

import java.util.Objects;

public class Usuario {

    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Meu nome eh "+this.nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return nome.equals(usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
