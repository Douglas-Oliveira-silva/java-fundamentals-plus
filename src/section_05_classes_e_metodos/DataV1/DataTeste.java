package section_desafios.DataV1;
import section_05_classes_e_metodos.DataV1.Data;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();
        d1.setAno(2021);

        var d2 = new Data(29,9,1994);

        // Outra Forma de adicionar ao system.out.println
        String dataFormatada1 = d1.obterDataFormatada();

        System.out.println(dataFormatada1);
        System.out.println(d2.obterDataFormatada());

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();

    }

}
