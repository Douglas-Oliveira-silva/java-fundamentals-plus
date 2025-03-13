package section_04_estruturas_de_controle.ExerciciosFinais;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
     // 5. Refatorar o exercício 04, utilizando a estrutura switch.

        // variavel
        int contadorDeDivisoes = 0;

        // Inicio scanner
        Scanner entrada = new Scanner(System.in);

        // Interação com usuário
        System.out.println("\nDigite um numero para verificar se é primo");
        int numero = entrada.nextInt();

        // Estrutura de controle

        for (int i = 2; i < numero; i++){
            if (numero % i == 0){
                contadorDeDivisoes++;
            }
        }

        switch (contadorDeDivisoes){
            case 0:
                System.out.println("O Número " + numero + " é um número primo");
                break;

            default:
                System.out.println("O número " + numero + " não é um número primo");
        }

        // finalizando scanner
           entrada.close();
    }
}
