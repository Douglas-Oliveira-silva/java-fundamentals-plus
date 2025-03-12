package section_03_fundamentos._Fundamentos.operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        a++; //a = a + 1
        a--; //a = a - 1

        ++b; // b = b + 1
        --b; // b = b - 1

        System.out.println(a);
        System.out.println(b);

        System.out.println("Mini Desafio");
        System.out.println(++a == b--); // precedência , ++ vem antes por isso ele igualou 2 = 2
        System.out.println(a);
        System.out.println(b);
    }
}
