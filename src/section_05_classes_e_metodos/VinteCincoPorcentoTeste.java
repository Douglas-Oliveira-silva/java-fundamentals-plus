package section_05_classes_e_metodos;

public class VinteCincoPorcentoTeste {
    public static void main(String[] args) {
        VinteCincoPorcento p1 = new VinteCincoPorcento("Notebook",4356.89);
        //p1.nome = "Notebook";
        //p1.preco = 4356.89;
        //p1.desconto =  0.25;

        Produto p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;

        VinteCincoPorcento.desconto = 0.50;

        System.out.println(p1.nome + " " + p1.precoComDesconto());
        System.out.println(p2.nome + " " + p2.precoComDesconto());

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = ((precoFinal1 + precoFinal2) / 2);

        System.out.printf("Média do carrinho = R$%.2f", mediaCarrinho);

    }
}
