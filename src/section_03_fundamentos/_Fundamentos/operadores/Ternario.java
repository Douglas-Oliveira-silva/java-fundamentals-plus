package section_03_fundamentos._Fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {

        double media = 8.5;
        String resultadoFinal = media >= 7.0 ? "aprovado" : "em recuperação"; // Atribuição condicional

        System.out.println("O Aluno está " + resultadoFinal);

        double  nota = 7.3;
        boolean bomComportamento = false;
        boolean passouPorMedia = nota >= 7;

        boolean temDesconto = bomComportamento && passouPorMedia;
        String Resultado = temDesconto ? "sim": "Não";

        System.out.println("Tem desconto? " + Resultado);

    }
}
