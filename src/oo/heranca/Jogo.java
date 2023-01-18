package oo.heranca;

public class Jogo {

    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.setX(10);
        monstro.setY(10);

        Heroi heroi = new Heroi();
        heroi.setX(10);
        heroi.setY(11);

        System.out.println(monstro.getVida());
        System.out.println(heroi.getVida());

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("monstro = " + monstro.getVida());
        System.out.println("heroi = " + heroi.getVida());


    }

}
