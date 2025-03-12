package section_03_fundamentos._Fundamentos.operadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        System.out.println(2+3);

        var x = 34.56;
        double y = 2.2;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        int a = 8;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a/b);
        System.out.println(a / (double) b); //double para converter e mostrar o número depois da virgula
        System.out.println(a/(float) b); //float para converter e mostrar o número completo, porém mais assertivo

        System.out.println(8 % 3);
        System.out.println(a % b);

        System.out.println(x+y - a * b);

    }
}
