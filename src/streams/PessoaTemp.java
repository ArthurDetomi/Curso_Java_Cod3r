package streams;

public class PessoaTemp {

    private String nome;
    private String estudioso;

    public PessoaTemp(Pessoa pessoa) {
        this.nome = pessoa.getNome();
        estudioso = "Sim";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstudioso() {
        return estudioso;
    }

    public void setEstudioso(String estudioso) {
        this.estudioso = estudioso;
    }

    @Override
    public String toString() {
        return nome + estudioso;
    }
}
