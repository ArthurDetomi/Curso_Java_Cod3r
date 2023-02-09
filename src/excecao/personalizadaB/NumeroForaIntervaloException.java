package excecao.personalizadaB;

public class NumeroForaIntervaloException extends Exception {

    private String nomeAtributo;

    public NumeroForaIntervaloException(String nomeAtributo) {
        this.nomeAtributo = nomeAtributo;
    }

    public String getMessage() {
        return String.format("O atributo %s está fora do intervalo", nomeAtributo);
    }

}
