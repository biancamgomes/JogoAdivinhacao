import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int tentativas = 0;

        System.out.println("Vamos fazer uma brincadeira?");
        System.out.println("Eu vou escolher um número entre 0 e 20, você tem que adivinhar qual é. Vamos começar? ");
        System.out.println("Escolha um número entre 0 e 20: ");
        int numeroEscolhido = scanner.nextInt();

        int numeroComputador = random.nextInt(20);

        while (numeroEscolhido != numeroComputador) {
            if (numeroEscolhido > numeroComputador) {
                tentativas++;
                System.out.println("um pouco menos..");
                numeroEscolhido = scanner.nextInt();
            } else {
                tentativas++;
                System.out.println("um pouco mais..");
                numeroEscolhido = scanner.nextInt();
            }
        }
        System.out.println("Parabéns, você acertou com " + tentativas + " tentativas. O número certo é: " + numeroComputador);
    }
}
