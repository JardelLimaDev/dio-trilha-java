package tratamentoExcecoes;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExececao {
	public static void main(String[] args) {
		Number valor;
		try {
			valor = NumberFormat.getInstance().parse("a1.69");
			System.out.println(valor);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
