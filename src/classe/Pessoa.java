package classe;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private double peso;
    private List<Comida> comidasList;

    public Pessoa(){
        this("Joaquim", 70.5);
    }

    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    private void addComida(Comida comida){
        if(this.comidasList == null){
            comidasList = new ArrayList<>();
        }
        comidasList.add(comida);
    }

    public List<Comida> getComidasList() {
        return comidasList;
    }

    public void setComidasList(List<Comida> comidasList) {
        this.comidasList = comidasList;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comer(Comida comida) {
        this.peso += comida.getPeso();
        addComida(comida);
    }

}
