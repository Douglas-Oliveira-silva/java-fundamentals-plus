package section_03_fundamentos._Fundamentos.operadores;

public class Atribuicao {
    public static void main(String[] args) {
        int a = 3;
        int b = a;
        int c = a + b ;

        c += b; //c = c + b;
        c -= b; // c = c - b;
        c *= b; // c = c * b;
        c /= b; // c = c / b;

        System.out.println(c);

        c %= 2; // c = c%2 ;
        System.out.println(c);



    }
}
