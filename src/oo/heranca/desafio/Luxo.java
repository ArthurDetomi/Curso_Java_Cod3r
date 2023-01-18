package oo.heranca.desafio;

public interface Luxo {

    void ligarArCondicionado();

    void desligarArCondicionado();
    // por padrão todos os metodos da interface são publicos e abstratos
    default int velocidadeDoAr() {
        return 1;
    }

}
