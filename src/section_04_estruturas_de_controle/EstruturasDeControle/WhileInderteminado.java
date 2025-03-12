package section_04_estruturas_de_controle.EstruturasDeControle;

import java.util.Scanner;

public class WhileInderteminado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String valor = "";

        //Enquanto o valor não for digitado execute infinitamente (estratégia interessante)
        while (!valor.equalsIgnoreCase("sair")){
            System.out.print("Você diz: ");
            valor = entrada.nextLine();
        }

        entrada.close();
    }
}
