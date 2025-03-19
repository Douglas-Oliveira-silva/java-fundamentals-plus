package section_05_classes_e_metodos;

public class Produto {

    // Parametros
    String nome;
    double preco;
    double desconto;


    Produto(){

    }

    // Criar Metodo com o construtor
    Produto(String nomeInicial, double precoInicial, double descontoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    // Criando Metodo
    double precoComDesconto(){
        return preco * (1-desconto);
    }
    double precoComDesconto(double descontoDoGerente){
        return preco * (1- (desconto + descontoDoGerente));
    }

}
