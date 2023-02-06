package excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {
        try {
            geraErroUm();
        }catch (RuntimeException r) {
            r.printStackTrace();
        }

        try {
            geraErroDois();
        }catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :)");
    }
    // Não checada ou não verificada
    static void geraErroUm() {
        throw new RuntimeException("Ocorreu um erro #01");
    }
    // Exceção verificada deve registrar no metodo que irá lança-la
    //Exceção checada ou verificada
    static void geraErroDois() throws Exception{
        throw new Exception("Ocorreu um erro #02");
    }


}
