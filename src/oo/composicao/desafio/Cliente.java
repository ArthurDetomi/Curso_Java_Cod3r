package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private List<Compra> compras = new ArrayList<>();

    public void adicionarCompra(Compra compra){
        this.compras.add(compra);
    }

    public double obterValorTotal() {
        double valorTotal = 0;
        for(Compra compra : this.compras){
            valorTotal += compra.obterValorTotal();
        }
        return valorTotal;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
