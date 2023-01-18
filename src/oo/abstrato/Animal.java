package oo.abstrato;

public abstract class Animal {

    public String respirar() {
        return "Usando Oxigenio";
    }

    // tão generico que não podemos implementar
    public abstract String mover();
    //um metodo final não pode ser reescrito pelas subclasses
    public final String existir() {
        return "Existe";
    }

}
