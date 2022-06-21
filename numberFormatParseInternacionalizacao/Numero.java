package numberFormatParseInternacionalizacao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Numero {

	public static void main(String[] args) throws ParseException {
		
		double saldo = 123_456.789;
		
		//classe NumberFormat(abstrata):
		
		//opcoes de formatador numberFormat:
		
		//numeros genericos:
		NumberFormat f = NumberFormat.getInstance();
		System.out.println(f.format(saldo)); 
		
		//numeros inteiros:
		f = NumberFormat.getIntegerInstance();//exclui a fra��o
		System.out.println(f.format(saldo)); 
		
		//numeros percentuais:
		f = NumberFormat.getPercentInstance();//percentual
		System.out.println(f.format(0.25)); //25%
		
		//formata��o de moedas(a localiza��o interfere nessa formata��o):
		f = NumberFormat.getCurrencyInstance();
		System.out.println(f.format(saldo));// imprime com R$ e duas casas decimais(centavos)
		
		//definir o n�mero de casas decimais:
		f.setMaximumFractionDigits(1);//uma casa decimal
		System.out.println(f.format(saldo));
		
		//internacionaliza��o desses n�meros:
		
		//EUA:
		f = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(f.format(saldo));//imprime $ 123,456.79
		
		//fran�a:
		f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println(f.format(saldo));//imprime 123?456,79��
		
		//converter numeros:
		f = NumberFormat.getCurrencyInstance();//instancia default:brasil
		System.out.println(f.parse("R$ 1.100,25"));// nao funcionou pra mim: exception Unparseable number: "R$ 1.100,25"
		
	}

}
