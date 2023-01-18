package oo.heranca.desafio;

public class Ferrari extends Carro implements  Esportivo, Luxo{

    private boolean ligarTurbo;
    private boolean ligarArCondicionado;
    public Ferrari() {
        super(350, 15);
    }

    @Override
    public int getDELTA() {
        if(isLigarTurbo() && !isLigarArCondicionado()){
            setDELTA(35);
        }if(isLigarArCondicionado() && isLigarTurbo()){
            setDELTA(20);
        }if(!isLigarTurbo() && !isLigarArCondicionado()){
            setDELTA(20);
        }
        return super.getDELTA();
    }

    @Override
    public void frear() {
        super.frear();
        super.frear();
    }

    @Override
    public void ligarTurbo() {
        setLigarTurbo(true);
    }

    @Override
    public void desligarTurbo() {
        setLigarTurbo(false);
    }

    @Override
    public void ligarArCondicionado() {
        setLigarArCondicionado(true);
    }

    @Override
    public void desligarArCondicionado() {
        setLigarArCondicionado(false);
    }

    public boolean isLigarTurbo() {
        return ligarTurbo;
    }

    public void setLigarTurbo(boolean ligarTurbo) {
        this.ligarTurbo = ligarTurbo;
    }

    public boolean isLigarArCondicionado() {
        return ligarArCondicionado;
    }

    public void setLigarArCondicionado(boolean ligarArCondicionado) {
        this.ligarArCondicionado = ligarArCondicionado;
    }
}
