package oo.composicao;

public class Motor {

    private Carro carro;
    private boolean ligado = false;
    private double fatorInjecao = 1;

    public Motor(Carro carro) {
        this.carro = new Carro();
    }

    public int giros() {
        if (!ligado) {
            return 0;
        }
        return (int) Math.round(fatorInjecao * 3000);
    }

    public double getFatorInjecao() {
        return fatorInjecao;
    }

    public void setFatorInjecao(double fatorInjecao) {
        this.fatorInjecao = fatorInjecao;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
}
