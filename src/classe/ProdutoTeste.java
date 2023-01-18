package classe;

public class ProdutoTeste {

    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4393.89;
        p1.desconto = 0.25;
        atribuirValores(p1);
        Produto p2 = new Produto();
        p2.nome = "Caneta";
        p2.preco = 2.90;
        p2.desconto = 0.10;
        System.out.println(p1.nome);
        System.out.println(p2.nome);
    }
     static void atribuirValores(Produto produto){
        produto.desconto = 0.10;
        produto.nome = "Teclado Mecanico";
        produto.preco = 50.00;
    }
}
