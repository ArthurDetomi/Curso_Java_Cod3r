package oo.composicao.desafio;

public class Item {

    private Integer quantidade;
    private Produto produto;

    public void adicionarProduto(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }


    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

}
