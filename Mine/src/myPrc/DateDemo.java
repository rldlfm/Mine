package myPrc;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	
	public static void main(String[] args) throws ParseException {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date day1 = df.parse("2016-2-28"); //2016是闰年
		Date day2 = df.parse("2016-3-1");
		final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
		System.out.println((day2.getTime() - day1.getTime())/ MILLIS_PER_DAY);
	}
}
