package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();
        livros.add("Game of Thrones");  // retorna boolean
        livros.add("Senhor dos Aneis"); // retorna exception
        livros.add("Asterix");

        for(String livro : livros){
            System.out.println(livro);
        }

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.pop()); // retorna exception
        System.out.println(livros.poll());
        System.out.println(livros.remove());
        System.out.println(livros.poll());
        System.out.println(livros.poll());


        // livros.size();
        // livros.contains();
        // livros.clear();
        // livros.isEmpty();
    }

}
