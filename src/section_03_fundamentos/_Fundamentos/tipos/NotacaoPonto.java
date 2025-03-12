package section_03_fundamentos._Fundamentos.tipos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		double a = 2.3;
		String s = "Bom dia X";
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		String x = "Douglas".toUpperCase();
		
		System.out.println(s);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase();
		System.out.println(y);
	}
}
