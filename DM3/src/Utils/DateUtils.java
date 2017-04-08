package Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	//                                                                2014.11.28:07:24
	private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd:HH.mm");

	@SuppressWarnings("deprecation")
	public static boolean isSameDay(Date d1, Date d2){
		return d1.getYear() == d2.getYear()
			&& d1.getMonth() == d2.getMonth()
			&& d1.getDate() == d2.getDate();
	}
	
	public static Date addTimestampToDate(Date date, long time) {
		return new Date(date.getTime() + time);
	}
	
	public static Date dateFromString(String dateString) throws ParseException{
		return formatter.parse(dateString);
	}
	
	public static String toString(Date date){
		return formatter.format(date);
	}
}