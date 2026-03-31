import java.util.Scanner;

public class Leitura {
    static void main() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do seu filme favorito : ");
        String filmeFavorito = leitura.nextLine();
        System.out.println("Qual o ano de lançamento? ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Diga sua avaliação: ");
        double avaliacao = leitura.nextDouble();

        System.out.println("Seu filme favorito é " + filmeFavorito + " com ano de lançamento " + anoDeLancamento + " e sua avaliação é " + avaliacao);
    }
}
