package p1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MultipleClass {

	
	public static void main(String[] args) {
		
		MultipleParameter obj=(greetings,weekdays,date,time)->System.out.println("greeting "+ greetings +" weekday "+ weekdays+" date "+date+" time "+time);
			
			String greetings="Good Morning";
			
			Date todaydate=new Date();
			SimpleDateFormat weekday=new SimpleDateFormat("EEEE");
			String weekdays=weekday.format(todaydate);
			
			SimpleDateFormat dateformat=new SimpleDateFormat("dd mm yyyy");
			String date=dateformat.format(todaydate);
			
			SimpleDateFormat timeformat =new SimpleDateFormat("hh:mm:ss");
			String time=timeformat.format(todaydate);
			
			
			obj.multiPara(greetings, date, weekdays, time);
		
		
	}

}