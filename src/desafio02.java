import java.util.Random;
import java.util.Scanner;

public class desafio02 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int numeroAdivinhacao = new Random().nextInt(100);
        int chute = 0;
        int tentatvias = 0;

        while (chute != numeroAdivinhacao){
            System.out.println("Digite seu chute para adivinhar o número gerado:" );
            chute = leitura.nextInt();

            if (chute > numeroAdivinhacao){
                System.out.println(String.format("O número %d é maior que o número secreto", chute));
            }
            else if (chute < numeroAdivinhacao){
                System.out.println(String.format("O número %d é menor que o número secreto", chute));
            }
            else {
                System.out.println(String.format("Parabéns! Você acertou o número secreto: %d", numeroAdivinhacao));
                break;
            }

            if (tentatvias == 10)
                break;
            tentatvias ++;
        }

    }
}
