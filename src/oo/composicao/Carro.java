package oo.composicao;

public class Carro {

    private Motor motor;

    public Carro() {
        this.motor = new Motor(this);
    }

    public boolean estaLigado() {
        return this.motor.isLigado();
    }

    public void ligar() {
        this.motor.setLigado(true);
    }

    public void desligar() {
        this.motor.setLigado(false);
    }

    public void acelerar() {
        if (this.motor.getFatorInjecao() < 2.6) {
            this.motor.setFatorInjecao(this.motor.getFatorInjecao() + 0.4);
        }
    }

    public void frear() {
        if (this.motor.getFatorInjecao() > 0.5) {
            this.motor.setFatorInjecao(this.motor.getFatorInjecao() - 0.4);
        }
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

}
