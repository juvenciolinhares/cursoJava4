package dateInternacionalizacaoLocale;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Datas3 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.FEBRUARY, 12);
		
		//recuperar um objeto do tipo date:
		Date date = c.getTime();
		
		Locale padrao = Locale.getDefault();//recupera de acordo com meu sistema operacional
		
		//definir meu pr�prio locale:
		Locale brasil = new Locale("pt","BR");//portugues Brasil: retorna a localiza��o do Brasil e lingua portuguesa 
				
		//formatar datas 
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(f.format(date));//formato brasileiro 
		
		//utiliza��o do formatador para a localiza��o do Brasil:
		f = DateFormat.getDateInstance(DateFormat.FULL, brasil);
		System.out.println(f.format(date));
		
		//localiza��o pra india:
		Locale india = new Locale("hi","IN");
		f = DateFormat.getDateInstance(DateFormat.FULL, india);
		System.out.println(f.format(date));
		
		//localiza��o pra Estados Unidos:
		Locale usa = Locale.US;
		f = DateFormat.getDateInstance(DateFormat.FULL, usa);
		System.out.println(f.format(date));
		
		//localiza��o Japao:
		Locale japao = Locale.JAPAN;
		f = DateFormat.getDateInstance(DateFormat.FULL, japao);
		System.out.println(f.format(date));
		
		//localiza��o pra italia:
		Locale italia = Locale.ITALY;
		f = DateFormat.getDateInstance(DateFormat.FULL, italia);
		System.out.println(f.format(date));
		
		

	}

}

/*lista completa de linguas e paises:
 * iso 639-> lingua
 * iso 3166-> pa�s
 */
