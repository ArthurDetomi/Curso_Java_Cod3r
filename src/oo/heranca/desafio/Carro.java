package oo.heranca.desafio;

public class Carro {

    private final int VELOCIDADE_MAX;
    private int velocidade_atual = 0;

    private int DELTA;

    public Carro(){
        this(180, 5);
    }

    public Carro(int velocidadeMaxima, int delta) {
        VELOCIDADE_MAX = velocidadeMaxima;
        DELTA = delta;
    }

    public void acelerar() {
        if (this.getVelocidade_atual() + getDELTA() > VELOCIDADE_MAX) {
            this.setVelocidade_atual(VELOCIDADE_MAX);
        }else {
            this.setVelocidade_atual(getVelocidade_atual() + getDELTA());
        }
    }

    @Override
    public String toString() {
        return "Velocidade atual = " + this.getVelocidade_atual() + " km/h";
    }

    public void frear() {
        if (this.getVelocidade_atual() >= DELTA) {
            this.setVelocidade_atual(this.getVelocidade_atual() - DELTA);
        }else{
            this.setVelocidade_atual(0);
        }
    }

    public int getVelocidade_atual() {
        return velocidade_atual;
    }

    public void setVelocidade_atual(int velocidade_atual) {
        this.velocidade_atual = velocidade_atual;
    }

    public int getDELTA() {
        return DELTA;
    }

    public void setDELTA(int DELTA) {
        this.DELTA = DELTA;
    }
}
