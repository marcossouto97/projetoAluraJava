public class Condicional {
    public static void main() {

        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "Plus";

        if(anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        }else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if(incluidoNoPlano && tipoPlano.equals("Plus")) {
            System.out.println("Filme Liberado!");
        }else {
            System.out.println("Cliente deve pagar locação!");
        }
    }

}
