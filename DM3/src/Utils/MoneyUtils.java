package Utils;

import java.text.DecimalFormat;
import java.text.ParseException;

public class MoneyUtils {

	private static DecimalFormat moneyFormat = new DecimalFormat("0.00");
	
	public static String doubleToString(double amt){
		return moneyFormat.format(amt);
	}

	public static Double stringToDouble(String amtString) throws ParseException {
		return moneyFormat.parse(amtString).doubleValue();
	}

}
