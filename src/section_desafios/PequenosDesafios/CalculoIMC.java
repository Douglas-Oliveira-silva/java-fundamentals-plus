package section_desafios.PequenosDesafios;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {

        // IMC = PESO/ALTURA²
        //PESO IDEAL IMC = 18.5 >= && <= 24.9

        // Criando o Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que informe peso e altura
        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();

        // calculando o IMC
        double imc = peso / (altura*altura); // altura²

        // Verificando se está no peso ideal (entre 18.5 e 24.9)
        boolean pesoIdeal = (imc >= 18.5 && (imc <= 24.9));

        // Exibindo os resultados
        System.out.println("\nSeu IMC é: " + imc);
        System.out.println("Está no peso ideal? :" + pesoIdeal);

        // Fechando o Scanner
           scanner.close();

    }
}
