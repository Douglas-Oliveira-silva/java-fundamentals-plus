package section_04_estruturas_de_controle.EstruturasDeControle;

public class Break {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; //não faz tanto sentido dentro do if
            }
            System.out.println(i);
        }

        System.out.println("Fim!");
    }
}
