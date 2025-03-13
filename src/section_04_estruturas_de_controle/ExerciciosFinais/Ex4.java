package section_04_estruturas_de_controle.ExerciciosFinais;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        //4. Criar um programa que receba um número e diga se ele é um número primo.

        // variavel
        int contadorDeDivisoes = 0;

        //iniciando scanner
        Scanner entrada = new Scanner(System.in);

        // Interação com usuario
        System.out.println("\nDigite um numero para verificar se é primo: ");
        int numero = entrada.nextInt();

        // Estrutura de controle
        for (int i = 2; i < numero; i++){
            if (numero % i == 0){
                contadorDeDivisoes++;
            }
        }
        if ( contadorDeDivisoes == 0){
            System.out.println("\nO numero " + numero + " é primo");
        }else {
            System.out.println("\nO numero " + numero + " não é primo");
        }
        // fechando scanner
        entrada.close();
    }
}
