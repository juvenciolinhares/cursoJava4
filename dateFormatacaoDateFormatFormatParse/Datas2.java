package dateFormatacaoDateFormatFormatParse;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datas2 {

	public static void main(String[] args) throws ParseException {
		
		//iniciar um calendario:
		Calendar c = Calendar.getInstance();
		
		//definir uma data
		c.set(1980, Calendar.FEBRUARY, 12);
		
		Date date = c.getTime();
		System.out.println(date);//formatacao padrao
		
		
		//formatação de datas
		DateFormat f = DateFormat.getDateInstance();
		System.out.println(f.format(date));//recebe uma data como parametro e retorna uma string como resultado.
		
		//formatação do time
		f = DateFormat.getTimeInstance();
		System.out.println(f.format(date));
		
		//formatação de data e hora:
		f = DateFormat.getDateTimeInstance();
		System.out.println(f.format(date));//formato brasileiro
		
		//estilos de formatação de data; hora; data e hora.
		f = DateFormat.getDateInstance(DateFormat.FULL);//estilo sao constantes de DateFormat
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.LONG);//estilo Longo
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.MEDIUM);//estilo medio
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.SHORT);//estilo mais enxuto
		System.out.println(f.format(date));
		
		//converter uma String em uma data
		
		Date date2 = f.parse("12/02/1980");
		System.out.println(date2);
		
		//simpleDateFormat: 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(date)); 
		System.out.println(sdf.parse("10/10/2010")); //converter objetos com o metodo parse
		
		
	}
	

}
/*
 * classe date format: formatação e datas
 * é uma classe abstrata(nao posso inicializar com new).
 */
