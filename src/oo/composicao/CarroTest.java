package oo.composicao;

public class CarroTest {

    public static void main(String[] args) {

        Carro c1 = new Carro();
        System.out.println(c1.estaLigado());

        c1.ligar();
        System.out.println(c1.estaLigado());
        System.out.println(c1.getMotor().giros());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println(c1.getMotor().giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();

        System.out.println(c1.getMotor().giros());

        // relação bidirecional
        System.out.println(c1.getMotor().getCarro().getMotor().giros());

    }

}
