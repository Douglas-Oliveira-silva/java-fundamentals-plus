package section_03_fundamentos._Fundamentos.operadores;

public class OperadoresRelacionais {

    public static void main(String[] args) {

        int a = 97;
        int b = 'a'; //base decimal

        System.out.println(a == b);

        System.out.println(3>4);
        System.out.println(3 >= 3);
        System.out.println(3 < 7);
        System.out.println(30 <= 7);
        System.out.println(30 != 7);

        double  nota = 7.3;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;

        boolean temDesconto = bomComportamento && passouPorMedia;
        String Resultado = temDesconto ? "sim": "Não";

        System.out.println("Tem desconto? " + Resultado);

    }

}
