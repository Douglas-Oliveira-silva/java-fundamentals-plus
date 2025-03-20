package section_05_classes_e_metodos;

import java.awt.geom.Area;

public class AreaCircTeste {
    public static void main(String[] args) {

        // Criando a Instancia
        AreaCirc a1 = new AreaCirc(10);
        //a.pi = 1000;
        // AreaCirc.PI = 3.1415; (criado para ser utilizado na propria instancia)

        System.out.println(a1.area());

        // Calculando utilizando a classe sem precisar da instancia
        System.out.println(AreaCirc.area(100));


        System.out.println(AreaCirc.PI);
        System.out.println(Math.PI);
    }
}
