package oo.encapsulamento;

public class Pessoa {

    private String nome;
    private int idade;
    private String sobrenome;

    @Override
    public String toString() {
        return "Ola, meu nome eh " + this.getNomeCompleto() +
                " tenho " + this.getIdade() + " anos";
    }

    public Pessoa() {
        this(0, "", "");
    }

    public Pessoa(int idade, String nome, String sobrenome) {
        this.setIdade(idade);
        this.setNome(nome);
        this.setSobrenome(sobrenome);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        idade = Math.abs(idade);
        if (idade > 0 && idade <= 120) {
            this.idade = idade;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getNomeCompleto() {
        return this.getNome() + " " + this.getSobrenome();
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
