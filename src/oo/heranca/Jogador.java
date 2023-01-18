package oo.heranca;

public class Jogador {

    private int vida = 100;
    private int x;
    private int y;

    public Jogador() {
        this(0,0);
    }

    public Jogador(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(this.x - oponente.getX());
        int deltaY = Math.abs(this.y - oponente.getY());
        if (deltaX == 0 && deltaY == 1) {
            oponente.setVida(oponente.getVida() - 10);
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.setVida(oponente.getVida() - 10);
            return true;
        }
        return false;
    }


    public boolean andar(Direcao direcao) {
        switch (direcao) {
            case NORTE:
                this.y--;
                return true;

            case SUL:
                this.y++;
                return true;


            case LESTE:
                this.x++;
                return true;


            case OESTE:
                this.x--;
                return true;
        }
        return false;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

}
