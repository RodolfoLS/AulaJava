package datautil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ConversaoData {
	public Date converterStringDate(String data) {
		//O Slipt separa a data por indices quando encontra uma "/"
		String dt[] = data.split("/");
		
		Calendar calendar = new GregorianCalendar();
		
		calendar.set(Integer.parseInt(dt[2]),
				 	 Integer.parseInt(dt[1])-1,
				 	 Integer.parseInt(dt[0]));
		
		return calendar.getTime();
	}
	
	public Date converterStringDateBanco(String data) {
		//O Slipt separa a data por indices quando encontra uma "/"
		String dt[] = data.split("-");
		
		Calendar calendar = new GregorianCalendar();
		
		calendar.set(Integer.parseInt(dt[2]),
				 	 Integer.parseInt(dt[1])-1,
				 	 Integer.parseInt(dt[0]));
		
		return calendar.getTime();
	}
	
	public String converteDateMysql (Date data) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.format(data);
	}
}
