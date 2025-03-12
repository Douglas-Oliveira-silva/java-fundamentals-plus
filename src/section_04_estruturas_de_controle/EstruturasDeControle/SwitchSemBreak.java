package section_04_estruturas_de_controle.EstruturasDeControle;

public class SwitchSemBreak {
    public static void main(String[] args) {

        // if (boolean)...
        // While (boolean)...
        // for(;boolean;)

        String faixa = "preta";

        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("Sei o Bassai-Dai...");
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "laranja":
                System.out.println("Sei o Heian Yodan");
            case "vermelha":
                System.out.println("Sei o Heian Sandan");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
                break;
            default:
                System.out.println("Não sei nada");
        }
    }

}
