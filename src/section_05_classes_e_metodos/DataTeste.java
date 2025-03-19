package section_05_classes_e_metodos;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();

        Data d2 = new Data(29,9,1994);

        // Outra Forma de adicionar ao system.out.println
        String dataFormatada1 = d1.ObterData();

        System.out.println(dataFormatada1);
        System.out.println(d2.ObterData());

    }

}
