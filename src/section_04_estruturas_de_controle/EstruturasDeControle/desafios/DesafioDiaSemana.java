package section_04_estruturas_de_controle.EstruturasDeControle.desafios;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {

        // Domingo -> 1
        // Quarta -> 4
        // terça - > 3

        // Iniciando Sistema
         Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome do dia: ");

        // Usuario digitando
        String dia = entrada.next();

        // Estrutura de controle
        if ("domingo".equalsIgnoreCase(dia)){
            System.out.println(1);
        }else if ("segunda".equalsIgnoreCase(dia)){
            System.out.println("2");
        }else if ("terça".equalsIgnoreCase(dia)){
            System.out.println("3");
        }else if ("quarta".equalsIgnoreCase(dia)){
            System.out.println("4");
        }else if ("quinta".equalsIgnoreCase(dia)){
            System.out.println("5");
        }else if ("sexta".equalsIgnoreCase(dia)){
            System.out.println("6");
        }else if ("sábado".equalsIgnoreCase(dia) || "sabado".equalsIgnoreCase(dia)){
            System.out.println("7");
        }else {
            System.out.println("Entrada inválida !");
        }

        //Fechando sistema
        entrada.close();

    }
}
