package section_desafios.PequenosDesafios;

import java.util.Scanner;

public class ConversorCelsiusFahrenheit {

    public static void main(String[] args) {

        // Criando o Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário valor em Fahrenheit
        System.out.println("Digite valor em Fahrenheit: ");
        double Fahrenheit = scanner.nextDouble();

        // Calculo de conversão

        double CalculoConversao = (5.0/9) * (Fahrenheit - 32);

        // Exibindo Resultados
        System.out.println("O Valor de " + Fahrenheit + " em Celcius é: " + CalculoConversao);

        // Fechando o scanner
           scanner.close();



    }
}
