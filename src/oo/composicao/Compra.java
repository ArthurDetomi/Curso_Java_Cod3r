package oo.composicao;

import java.util.ArrayList;

public class Compra {

    private String clienteNome;
    private ArrayList<Item> items = new ArrayList<>();

    public Double getValorTotal() {
        double valorTotal = 0;
        for (Item item : this.items) {
            if (item.getPreco() != null && item.getQuantidade() != null) {
                valorTotal += item.getPreco() * item.getQuantidade();
            }
        }
        return valorTotal;
    }

    public void addItem(Item item) {
        this.items.add(item);
        item.setCompra(this);
    }


    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
