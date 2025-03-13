package section_04_estruturas_de_controle.ExerciciosFinais;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        //3. Criar um programa que receba duas notas parciais, calcular a média final.
        // Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
        // se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", caso contrário imprime no console "Reprovado".

        //iniciando scanner
        Scanner entrada = new Scanner(System.in);

        // Interação com usuário
        System.out.println("Nota Parcial 1: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Nota Parcial 2: ");
        double nota2 = entrada.nextDouble();

        // calculos
        double media = (nota1 + nota2) / 2;

        // Estrutura de controle
        if (media >= 7){
            System.out.println("Sua média foi : "+ media + " e você está aprovado");
        } else if (media >= 4) {
            System.out.println("Sua média foi: "+ media + " e você está de recuperação");
        } else {
            System.out.println("Sua média foi: "+ media + " e você está reprovado");
        }

        // Finalizando sanner
        entrada.close();
    }
}
