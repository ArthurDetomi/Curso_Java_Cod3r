package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();
        fila.add("Ana");
        fila.offer("Bia"); // retorna falso caso não consiga adicionar
        fila.add("Carlos");
        fila.offer("Rafael");
        fila.add("Maria");
        fila.offer("Joao");

        // peek() retorna o primeiro da fila
        System.out.println(fila.peek()); // retorna null se fila está vazia
        System.out.println(fila.peek());
        System.out.println(fila.element()); // retorna exceção se a fila está vazia
        System.out.println(fila.element());

        // fila.size(); // retorna o tamanho da fila
        // fila.clear(); // limpar fila
        // fila.isEmpty() // verifica se a fila esta vazia
        // fila.contains(...); // verifica se contem um objeto específico

        System.out.println(fila.poll()); // retorna o primeiro da fila e remove
        System.out.println(fila.poll()); // se não tiver mais elementos retorna null
        System.out.println(fila.remove()); // se chamar o remove com lista vazia lança exception
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

    }

}
