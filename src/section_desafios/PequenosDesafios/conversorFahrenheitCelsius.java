package section_desafios.PequenosDesafios;

import java.util.Scanner;

public class conversorFahrenheitCelsius {
    public static void main(String[] args) {

        // criando scanner de entrada
        Scanner scanner = new Scanner(System.in);

        // Solicitando usuário entrada

        System.out.println("Digite o Valor em Celcius");
        double celsius = scanner.nextDouble();

        // cálculo de conversão
        double conversao = (celsius * 1.8) + 32;

        // Mostrando Resultado na tela
        System.out.println("O Resultado da conversão de Celcius para Fahrenheit é: " + conversao);

        // fechando sistema scanner
        scanner.close();


    }
}
