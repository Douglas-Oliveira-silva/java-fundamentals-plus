package section_05_classes_e_metodos.DataV1;

public class Data {
  private int dia;
  private int mes;
  private int ano;

   public Data(){
        //dia = 1;
        //mes = 1;
        //ano = 1970;
        this(1, 1, 1970);
        
    }
    public Data (int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
   public String obterDataFormatada(){
        return String.format(formato, dia,mes,ano);
   }

   public  void imprimirDataFormatada(){
        System.out.println(this.obterDataFormatada());
    }
    // Criando Getter e Setter para 'ano'
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    String formato = "%d/%d/%d";
}
