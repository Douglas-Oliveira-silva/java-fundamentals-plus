package section_04_estruturas_de_controle.EstruturasDeControle;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe o número: "); //
        int numero = Integer.parseInt(valor); //converter string para inteiro

        if (numero % 2 == 0) {
            System.out.println("Número par!");
        } else {
            System.out.println("Número Ímpar!");
         }
        }
    }