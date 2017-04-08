package Utils;

import java.text.DecimalFormat;

public class MoneyUtils {

	private static DecimalFormat moneyFormat = new DecimalFormat("0.00");
	
	public static String doubleToString(double amt){
		return moneyFormat.format(amt);
	}

}
