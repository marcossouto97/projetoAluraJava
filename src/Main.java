public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamnto : " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        //Media calculada baseada em 3 notas
        double notaDoFilme = 8.1;
        System.out.println(notaDoFilme);

        double media = (8.1 + 5.0 + 7.6) /3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Top Gun
                Filme de ação dos anos 80
                Muito bem avaliado!
                Ano de lançamento:                 
                """ + anoDeLancamento ;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}