package section_05_classes_e_metodos;

public class VinteCincoPorcento {

    // Parametros
    String nome;
    double preco;
    static double desconto = 0.25;


    VinteCincoPorcento(){

    }

    // Criar Metodo com o construtor
    VinteCincoPorcento(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;

    }

    // Criando Metodo
    double precoComDesconto(){
        return preco * (1-desconto);
    }
    double precoComDesconto(double descontoDoGerente){
        return preco * (1- (desconto + descontoDoGerente));
    }


}
