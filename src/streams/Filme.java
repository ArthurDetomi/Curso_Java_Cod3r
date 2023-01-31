package streams;

import java.util.Objects;

public class Filme {

    private Integer id;
    private String nome;
    private Integer faixaEtaria;

    public Filme(Integer id, String nome, Integer faixaEtaria) {
        this.id = id;
        this.nome = nome;
        this.faixaEtaria = faixaEtaria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filme filme = (Filme) o;
        return id.equals(filme.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(Integer faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }
}
