package section_03_fundamentos._Fundamentos.tipos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {

    // Ler num 1
    // Ler num 2
    // + - * / %
    // realizar operação

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o Número: ");
        double num1 = entrada.nextDouble();

        System.out.println("Informe o Número: ");
        double num2 = entrada.nextDouble();

        System.out.println("Informe a Operação: ");
        String op = entrada.next();

        // lógica
        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;


        System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);



        entrada.close();

    }



}
