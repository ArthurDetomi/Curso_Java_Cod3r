package oo.heranca.desafio;

public class DesafioTest {

    public static void main(String[] args) {

        Civic civic = new Civic();
        Ferrari ferrari = new Ferrari();

        ferrari.ligarTurbo();
        ferrari.ligarArCondicionado();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.desligarTurbo();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();


        civic.frear();
        civic.frear();
        ferrari.frear();

        System.out.println("Ferrari = " + ferrari);
        System.out.println("Civic = " + civic);
        System.out.println(ferrari.velocidadeDoAr());


    }

}
