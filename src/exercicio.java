public class exercicio {
    public static void main(String[] args) {
        double temperaturaCelsius = 30.0;
        double temperaturaFarenheit = (temperaturaCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura em Farenheit é de %2f º", temperaturaFarenheit);

        System.out.println(mensagem);

        int farenheitInteira = (int) temperaturaFarenheit;
        String mensagemInteira = String.format("A temperatura em Farenheit inteira é %d ", farenheitInteira );

        System.out.println(mensagemInteira);
        

        double calculaMedia = (8.5 + 7.5) /2;
        int calculaMediaInteira = (int) calculaMedia;
        System.out.println("A média inteira é de: " + calculaMediaInteira);


        double variavelDouble = 7.4;
        int conversorDoubleInt = (int) variavelDouble;
        System.out.println(conversorDoubleInt);


        double precoProduto = 54.5;
        int quantidade = 3;
        double valorFinal = precoProduto * quantidade;
        String mensagemValorFinal = ("O Valor total foi de " + valorFinal);
        System.out.println(mensagemValorFinal);


        double valorEmDolares = 70.5;
        double valorEmReal = 4.94 * valorEmDolares;
        String valorConvertido = String.format("A conversão de %.2f dólares em reais é %.2f", valorEmDolares, valorEmReal);
        System.out.println(valorConvertido);

        double precoOriginal = 55.90;
        double percentualDesconto = 10.0/100;
        double valorDeDesconto = precoOriginal * percentualDesconto;
        double valorFinalComDesconto = precoOriginal - valorDeDesconto;
        String mensagemValorDesconto = ("O valor final do produto com Desconto é de: " + valorFinalComDesconto);
        System.out.println(mensagemValorDesconto);

    }
}
