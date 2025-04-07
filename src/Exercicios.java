import java.util.Scanner;
import java.util.Locale;

public class Exercicios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        // -------------------------------
        // 1. Verificar se o número é positivo ou negativo
        // -------------------------------
        System.out.println("1) Digite um número (positivo ou negativo):");
        double numero = entrada.nextDouble();

        if (numero >= 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

        // -------------------------------
        // 2. Comparar dois números inteiros
        // -------------------------------
        System.out.println("\n2) Digite o primeiro número inteiro:");
        int num1 = entrada.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int num2 = entrada.nextInt();

        if (num1 == num2) {
            System.out.println("Os números são iguais");
        } else if (num1 > num2) {
            System.out.println("O primeiro número é maior que o segundo");
        } else {
            System.out.println("O segundo número é maior que o primeiro");
        }

        // -------------------------------
        // 3. Menu: área do quadrado ou círculo
        // -------------------------------
        System.out.println("\n3) Menu:");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        int opcao = entrada.nextInt();

        if (opcao == 1) {
            System.out.println("Digite o lado do quadrado:");
            double lado = entrada.nextDouble();
            double areaQuadrado = lado * lado;
            System.out.println("Área do quadrado: " + areaQuadrado);
        } else if (opcao == 2) {
            System.out.println("Digite o raio do círculo:");
            double raio = entrada.nextDouble();
            double areaCirculo = Math.PI * Math.pow(raio, 2);
            System.out.printf("Área do círculo: %.2f\n", areaCirculo);
        } else {
            System.out.println("Opção inválida");
        }

        // -------------------------------
        // 4. Tabuada de um número
        // -------------------------------
        System.out.println("\n4) Digite um número para ver a tabuada:");
        int numeroTabuada = entrada.nextInt();

        System.out.println("Tabuada de " + numeroTabuada + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroTabuada + " x " + i + " = " + (numeroTabuada * i));
        }

        // -------------------------------
        // 5. Verificar se um número é par ou ímpar
        // -------------------------------
        System.out.println("\n5) Digite um número inteiro:");
        int numeroParImpar = entrada.nextInt();

        if (numeroParImpar % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }

        // -------------------------------
        // 6. Cálculo do fatorial
        // -------------------------------
        System.out.println("\n6) Digite um número para calcular o fatorial:");
        int numeroFatorial = entrada.nextInt();
        long fatorial = 1;

        for (int i = 1; i <= numeroFatorial; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial de " + numeroFatorial + " é " + fatorial);

        // Fecha o scanner
        entrada.close();
    }
}

