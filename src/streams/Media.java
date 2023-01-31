package streams;

public class Media {

    private double total;
    private int quantidade;

    public Media adicionar(double valor) {
        total += valor;
        quantidade++;
        return this;
    }

    public double getValor() {
        return total / quantidade;
    }

    public static Media combinar(Media m1, Media m2) {
        Media resultante = new Media();
        resultante.quantidade = m1.getQuantidade() + m2.getQuantidade();
        resultante.total = m1.getTotal() + m2.getTotal();
        return resultante;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
