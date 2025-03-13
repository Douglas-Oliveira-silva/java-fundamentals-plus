package section_04_estruturas_de_controle.ExerciciosFinais;

import java.util.Scanner;

public class Ex2 {
    //2. Criar um programa informa se o ano atual é um ano bissexto;

    public static void main(String[] args) {
       //iniciando scanner
        Scanner entrada = new Scanner(System.in);

        // Interação com usuário
        System.out.println("Digite o ano: ");
        int ano = entrada.nextInt();

        // Teste Lógico
        boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0 || ano % 400 == 0);

        // condição
        if (bissexto == true){
            System.out.println(ano + " é um ano bissexto");
        }else {
            System.out.println(ano + " Não é um ano bissexto");
        }
        //fechando escanner
        entrada.close();
    }
}
