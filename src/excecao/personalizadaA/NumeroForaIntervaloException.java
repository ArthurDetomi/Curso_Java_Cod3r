package excecao.personalizadaA;

public class NumeroForaIntervaloException extends RuntimeException {

    private String nomeAtributo;

    public NumeroForaIntervaloException(String nomeAtributo) {
        this.nomeAtributo = nomeAtributo;
    }

    public String getMessage() {
        return String.format("O atributo %s está fora do intervalo", nomeAtributo);
    }

}
