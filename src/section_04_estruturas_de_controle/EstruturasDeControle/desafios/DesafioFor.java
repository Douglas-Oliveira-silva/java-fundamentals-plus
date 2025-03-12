package section_04_estruturas_de_controle.EstruturasDeControle.desafios;

public class DesafioFor {
    public static void main(String[] args) {


        String valor = "#";
       for (int i = 1; i <= 5; i++){
           System.out.println(valor);
           valor += "#";

       }

        // Versão do desafio
        // Restrição: não pode usar valor número para controlar o laço.

        for (String v = "#"; !v.equals("######"); v += "#"){
            System.out.println(v);
        }
    }
}
