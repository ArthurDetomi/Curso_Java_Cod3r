package oo.composicao.desafio;

public class ClienteTeste {

    public static void main(String[] args) {

        Produto arroz = new Produto("Arroz", 1.0);
        Produto feijao = new Produto("Feijao", 1.0);

        Item item1 = new Item();
        Item item2 = new Item();
        item1.adicionarProduto(arroz, 3);
        item2.adicionarProduto(feijao, 4);


        Compra compra1 = new Compra();
        compra1.adicionarItem(item1);
        compra1.adicionarItem(item2);
        System.out.println("compra 1 = " + compra1.obterValorTotal());


        Compra compra2 = new Compra();
        compra2.adicionarItem(item1);
        compra2.adicionarItem(item2);
        System.out.println("compra 2 = " + compra2.obterValorTotal());

        Cliente cliente = new Cliente();
        cliente.setNome("Joao");
        cliente.adicionarCompra(compra1);
        cliente.adicionarCompra(compra2);

        System.out.println("Nome = " + cliente.getNome());
        System.out.println("Sua compra deu um total de R$" + cliente.obterValorTotal());

    }

}
