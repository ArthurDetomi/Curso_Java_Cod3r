package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    // Ana mae = new Ana(); Se já uma herança não precisa usar composição
    void testesAcessos(){
        System.out.println(formaDeFalar);
        System.out.println(todosSabem);
    }

}
