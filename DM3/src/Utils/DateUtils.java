package Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	@SuppressWarnings("deprecation")
	public static boolean isSameDay(Date d1, Date d2){
		return d1.getYear() == d2.getYear() &&
			d1.getMonth() == d2.getMonth() &&
			d1.getDate() == d2.getDate();
	}
	
	public static SimpleDateFormat getFormatter(){
		//                           2014.11.28:07:24
		return new SimpleDateFormat("yyyy.MM.dd:HH.mm");
	}

	public static Date addTimestampToDate(Date date, long time) {
		return new Date(date.getTime() + time);
	}
	
}