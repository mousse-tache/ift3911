package Utils;

import java.util.Date;

public class DateUtils {
	@SuppressWarnings("deprecation")
	public static boolean isSameDay(Date d1, Date d2){
		return d1.getYear() == d2.getYear() &&
			d1.getMonth() == d2.getMonth() &&
			d1.getDate() == d2.getDate();
	}
}