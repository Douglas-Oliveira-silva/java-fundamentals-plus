package section_04_estruturas_de_controle.ExerciciosFinais;

import java.util.Scanner;

public class Ex1 {
    //1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;

    public static void main(String[] args) {

        //iniciando scanner
        Scanner entrada = new Scanner(System.in);

        //interagindo com usuário
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        if (numero >=0 && numero <= 10){
            if (numero % 2 == 0){
                System.out.println("O Número " + numero + " está entre 0 e 10 e é um par");
            }else {
                System.out.println("O Número " + numero + " está entre 0 e 10 e é impar");
            }
        } else System.out.println("O número digitado " + numero + " não está entre 0 e 10");

        //finalizando Scanner
          entrada.close();

    }


}
