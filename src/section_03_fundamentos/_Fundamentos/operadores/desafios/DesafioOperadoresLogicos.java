package section_03_fundamentos._Fundamentos.operadores.desafios;

public class DesafioOperadoresLogicos {

    public static void main(String[] args) {

        // Trabalho na terça ( V ou F )
        // Trabalho na quinta (V ou F )
        // se os trabalhos de terça e quinta forem verdadeiros, vou comprar para minha familia uma TV de 50"
        // se 1 dos trabalhos derem certo ,vou comprar apenas 1 tv de 32"
        // eu comprando uma tv de 50" ou uma tv de 32" a familia indo para o shopping, vamos tomar sorvete juntos para comemorar a compra da TV

        // Eu nao conseguindo nenhum dos trabalhos , a familia fica em casa e sem TV e sem sorvete

        boolean trabalho1 = true;
        boolean trabalho2 = false;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;

        //Operador Unário!
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou Tv 50\" ? " + comprouTv50);
        System.out.println("Comprou Tv 32\" ? " + comprouTv32);
        System.out.println("Comprou Sorvete ? " + comprouSorvete);
        System.out.println("Mais saudável ? " + maisSaudavel);



    }

}
