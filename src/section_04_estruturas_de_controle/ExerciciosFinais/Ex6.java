package section_04_estruturas_de_controle.ExerciciosFinais;

import java.util.Random;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        //6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável.
        //O Jogador tem 10 tentativas para adivinhar o número gerado.
        //Ao final de cada tentativa, imprima a quantidade de tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado.

        // Inicando Scanner
        Scanner entrada = new Scanner(System.in);

        // Variaveis
        int continuar;
        int numeroSorteado;
        int tentativas;
        int numero;

        // Estruturas de controle
        do {
            System.out.println("Sorteando numero entre 0 e 100...\n");
            Random numeroAleatorio = new Random();
            numeroSorteado = numeroAleatorio.nextInt(101);

            System.out.println("Começou o jogo! Sera que consegue me vencer?");
            tentativas = 0;

            do {
                tentativas++;
                System.out.printf("Tentativa %d: ", tentativas);
                numero = entrada.nextInt();

                if (numero > numeroSorteado) {
                    System.out.printf("\nO numero sorteado é menor que %d\n\n", numero);
                } else if (numero < numeroSorteado) {
                    System.out.printf("\nO numero sorteado é maior  que %d\n\n", numero);
                } else {
                    System.out.printf("\nParabéns! Você acertou o número em %d tentativas!\n\n", tentativas);
                    break;
                }
            } while (tentativas != 10);
            System.out.println("Digite 0 para sair, ou qualquer outro número para continuar: ");
            continuar = entrada.nextInt();
        } while (continuar != 10);

        // Fechando scanner
        entrada.close();
    }
}
