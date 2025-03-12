package section_04_estruturas_de_controle.EstruturasDeControle;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = entrada.nextDouble();

        if (nota > 10 || nota < 0){
            System.out.println("Nota Inválida");
        } else if (nota >= 8.1){
                System.out.println("Conceito A");
                System.out.println("Parabéns!");
            } else if (nota >= 6.1){
                System.out.println("Conceito B");
            } else if (nota >= 4.1) {
            System.out.println("Conceito C");
        } else if(nota >= 2.1){
            System.out.println("Conceito D");
        } else {
            System.out.println("Conceito E");
            System.out.println("Estude mais");
        }


        System.out.println("Fim!");
        entrada.close();
    }
}
