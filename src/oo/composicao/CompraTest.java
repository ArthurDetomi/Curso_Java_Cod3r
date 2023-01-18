package oo.composicao;

public class CompraTest {

    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.setClienteNome("Joao");

        c1.addItem(new Item("Caneta", 7.45, 20));
        c1.addItem(new Item("Borracha", 3.89, 12));
        c1.addItem(new Item("Caderno", 18.79, 3));

        System.out.println(c1.getItems().size());
        System.out.println(c1.getValorTotal());


    }

}
