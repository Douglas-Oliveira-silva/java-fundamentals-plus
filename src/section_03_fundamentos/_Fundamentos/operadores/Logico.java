package section_03_fundamentos._Fundamentos.operadores;

public class Logico {
    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;



        System.out.println("------Tabela verdade E (AND)------");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("------Tabela verdade OU (OR)------");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("------Tabela verdade OU Exclusivo (XOR)------");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("------Tabela verdade NOT ------");
        System.out.println(!true);
        System.out.println(!false);



    }

}
