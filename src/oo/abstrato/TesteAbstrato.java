package oo.abstrato;

public class TesteAbstrato {

    public static void main(String[] args) {

        Mamifero cachorro = new Cachorro();
        System.out.println(cachorro.mover());
        System.out.println(cachorro.respirar());
        System.out.println(cachorro.mover());
        System.out.println(cachorro.mamar());

    }

}
