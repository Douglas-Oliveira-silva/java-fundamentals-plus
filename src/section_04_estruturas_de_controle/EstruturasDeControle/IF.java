package section_04_estruturas_de_controle.EstruturasDeControle;

import java.util.Scanner;

public class IF {

    //porta de entrada para o software
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a média: ");
        double  media = scanner.nextDouble();

        if(media <= 10 && media >= 7.0){
            System.out.println("Aprovado!");
            System.out.println("Parabéns!");
        }
        if (media < 7 && media >= 7.0) {
            System.out.println("Recuperação!");
        }

        boolean criterioReprovacao = media < 4.5 && media >=0;
        if (criterioReprovacao){
            System.out.println("Reprovado!");
        }


              scanner.close();

    }

}
