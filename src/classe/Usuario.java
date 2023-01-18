package classe;

public class Usuario {

    private String nome;
    private String email;

    @Override
    public boolean equals(Object objeto) {
        if(objeto instanceof Usuario) {
            Usuario outro = (Usuario) objeto;
            boolean nomeIgual = outro.getNome().equals(this.nome);
            boolean emailIgual = outro.getEmail().equals(this.email);
            return nomeIgual && emailIgual;
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
