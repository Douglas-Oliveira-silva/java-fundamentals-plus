package section_desafios.PequenosDesafios;

import java.util.Scanner;

public class AoQuadradoAoCubo {
    public static void main(String[] args) {
        //Iniciando scanner
        Scanner scanner = new Scanner(System.in);

        // interação com usuário
        System.out.println("Digite o primeiro valor: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double b = scanner.nextDouble();

        // lógica

        a = Math.pow(a,2);
        b = Math.pow(b,3);

        // Resultado na tela
        System.out.println("Primeiro valor ao Quadrado: " + a);
        System.out.println(("Segundo Valor ao Cubo: " + b));


        // Fechando aplicação
        scanner.close();

    }
}
