package section_05_classes_e_metodos;

public class AreaCirc {

    double raio;

    // constante pertencente a classe
    final static double PI = 3.1415;

    AreaCirc(double raioInicial){
        raio = raioInicial;
    }
    double area(){
        return PI * Math.pow(raio,2);
    }
    //Metodo estatico , neste metodo nao é necessario criar instancia e nao precisamos utilizar atributos de classe para acessar
    static double area (double raio){
        return PI * Math.pow(raio,2);
    }

}
