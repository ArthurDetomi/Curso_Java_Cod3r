package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    private List<Item> itens = new ArrayList<>();

    public void adicionarItem(Item item){
        this.itens.add(item);
    }

    public double obterValorTotal(){
        double valorTotal = 0;
        for(Item item : this.itens){
            valorTotal += item.getQuantidade() * item.getProduto().getPreco();
        }
        return valorTotal;
    }


    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
}
