package colecoes;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();
        Usuario u1 = new Usuario("Arthur");
        Usuario u2 = new Usuario("Ines");
        lista.add(u1);
        lista.add(u2);
        lista.add(new Usuario("usuario"));
        lista.add(new Usuario("Alita"));
        lista.add(new Usuario("Atila"));
        lista.add(new Usuario("Rodrigo"));
        System.out.println(lista.get(0));
        System.out.println(lista.remove(1)); // retorna o objeto removido
        System.out.println(lista.remove(new Usuario("Marcos"))); // retorna true/false
        System.out.println(lista.contains(u2));

    }

}
