package dateCalendarGetSetClearAddRoll;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Datas {

	public static void main(String[] args) {
		
		//01/01/1970
		//tempo atual em milisegundos:
		System.out.println(System.currentTimeMillis());//quantos milisegundos tem agora desde  01/01/1970
		
		//criar uma data:
		Date agora = new Date();
		System.out.println(agora);
		
		//data informando os milisegundos:
		Date data = new Date(1_000_000_000_000L);//qual a data desses milisegundos?
		System.out.println(data);
		
		//metodos classe date:
		data.getTime();//tempo atual em milisegundos.
		data.setTime(1_000_000_000_000L);//definir um tempo 
		data.compareTo(agora);//compara uma data com outra; if data<agora= -1,if data=agora= 0; if data>agora= 1;
		System.out.println(data.compareTo(agora));
		
		//Classe Calendar 
		Calendar calendario = Calendar.getInstance();//calendario gregoriano(mais usado)
		
		//posso criar da seguinte forma
		//new GregorianCalendar();
		
		//posso criar/definir uma determinada data:
		calendario.set(1980, Calendar.FEBRUARY, 12);
		
		//pegar o objeto date:
		System.out.println(calendario.getTime());
		
		//recuperar informa��es sobre a data:
		//ano:
		System.out.println(calendario.get(Calendar.YEAR));
		System.out.println(calendario.get(Calendar.MONTH));//fevereiro = 1 pq come�a a contar com 0;
		System.out.println(calendario.get(Calendar.DAY_OF_MONTH));//dia do mes
		
		//definar informa��es
		calendario.set(Calendar.YEAR, 1972);//altera o ano
		calendario.set(Calendar.MONTH, Calendar.MARCH);//alterar o ano;
		calendario.set(Calendar.MONTH, 2);//alterar o ano;
		calendario.set(Calendar.DAY_OF_MONTH, 25);//alterar dia do mes
		System.out.println(calendario.getTime());
		
		//limpar campos(m�todo clear):
		calendario.clear(Calendar.MINUTE);//limpa o campo minuto
		calendario.clear(Calendar.SECOND);//limpa o campo segundos
		System.out.println(calendario.getTime());
		
		//adicionar e remover unidades
		calendario.add(Calendar.DAY_OF_MONTH, 1);//adiciona um dia
		calendario.add(Calendar.YEAR, 1);//adiciona um ano
		System.out.println(calendario.getTime());
		calendario.add(Calendar.DAY_OF_MONTH, -1);//diminui um dia
		calendario.add(Calendar.YEAR, -1);//diminui um ano
		System.out.println(calendario.getTime());
		
		//aumentar ou diminuir unidades de tempo sem alterar tipos maiores(ver comentarios sobre o metodo roll)
		calendario.roll(Calendar.DAY_OF_MONTH, 20);//adiciona 20 dias
		System.out.println(calendario.getTime());
		calendario.roll(Calendar.DAY_OF_MONTH, -20);//diminui 20 dias
		System.out.println(calendario.getTime());
		
		//mensagem de sauda��o para o usu�rio: bom dia, boa tarde, boa noite:
		
		//criar manipula��o de datas:
		Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY);
		if(hora <= 12 ) {
			System.out.println("Bom dia");
		}else if(hora> 12 && hora <=18 ) {
			System.out.println("Boa tarde");
		}else {
			System.out.println("Boa noite");
		}
	
	}

}
/*
 * todo tempo em java � medido a partir de 01/01/1970(marco zero)
 * a classe calendar n�o deve ser inicializada(classe abstrata n�o � instanciada)
 * 
 * explica��o metodo roll: mes > que dia, ent�o ele altera o dia, mas mant�m o mes:
 * exemplo 25 de marco + 20 dias(correto: 14 de abril)
 * exemplo 25 de marco + 20 dias metodo roll: 14(altera o dia) de mar�o(n�o altera o mes)
 *
 * */
