package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    public Data(){
        this(1, 1, 1980);
    }

    public Data(int dia, int mes, int ano) {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }

    public String obterDataFormata(){
        String data = String.format("%02d/%02d/%d\n", this.dia, this.mes, this.ano);
        return data;
    }

    public void imprimirDataFormatada(){
        System.out.println(this.obterDataFormata());
    }


}
