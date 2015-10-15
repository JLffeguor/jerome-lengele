package be.jl.cs.tools;

import java.text.DecimalFormat;
import java.text.FieldPosition;



/**
 * 
 * @author jlengele
 *
 */
public class DataTools {

	
	
	/**
	 * @param vald
	 * @param prctajout
	 * @return result
	 */
	public static double ajprctvaleur(double vald, double prctajout){
		
		double result;
		result = vald + (vald/100*prctajout);
		return result;
	}
	
	
	public static String doubleToString(Double val){
		
		DecimalFormat format = new DecimalFormat("0000000000000000000000.0000");
		
		String retour = new String();
		StringBuffer temp = new StringBuffer(); 	
		format.format(val, temp, new FieldPosition(0));
		
		retour = temp.substring(0);
		
		while(retour.startsWith("0")) {
			retour = retour.substring(1);
		}
		
		return retour;
		
	}
}
