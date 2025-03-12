package section_03_fundamentos._Fundamentos.operadores.desafios;

public class DesafioOperadoresAritmeticos {

    public static void main(String[] args) {

        //Dica: int a = 2 * 4 - 10;
        //      int b = (int)Math.pow(a,3);
        // System.out.println(b);

        //Fixo
        double DenominadorSupremo = Math.pow(10,3);


        // 1 parte (esquerda nominador)
        int a  = 6*(3+2);
        double aElevadoAoQuadrado = Math.pow(a,2);
        double aDivisao = 3*2;
        double aResult = aElevadoAoQuadrado /aDivisao ;

        // 2 parte (direita nominador)
        int b1 = 1 - 5;
        int b2 = 2 - 7;
        int bMultiplicacao = b1 * b2;
        double bDivisao = 2;
        double bResult = bMultiplicacao / bDivisao  ;

        double bResultElevadoAoQuadrado = Math.pow(bResult,2);

        // 3 Parte


        System.out.println("O Resultado de a é: " + aResult);
        System.out.println("O Resultado de b é: " + bResultElevadoAoQuadrado);

        System.out.println("Agora subtraia estes resultados e divida por 10³ ");


        double ResultadoX = aResult - bResultElevadoAoQuadrado;
        System.out.println("A Subtração de a - b é igual a: " + ResultadoX);
        System.out.println("Agora pegue este valor e eleve ao cubo");

        double ResultadoXaoCubo = Math.pow(ResultadoX,3);

        System.out.println("o Resultado deste valor elevado ao cubo é igual a: " + ResultadoXaoCubo);

        System.out.println("Agora divida este valor por 10³ ");

        double ResultadoFinal = ResultadoXaoCubo / DenominadorSupremo ;

        System.out.println("O Resultado final do desafio é igual a: " + (int)ResultadoFinal);


    }

}
