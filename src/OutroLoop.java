import java.util.Scanner;

public class OutroLoop{

    static void main() {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Digite sua avaliação do filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();
            totalDeNotas += 1;
            }

        System.out.println("Media de notas é " + mediaAvaliacao / totalDeNotas);
        }

    }
