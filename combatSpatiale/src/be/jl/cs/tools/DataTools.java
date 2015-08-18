package be.jl.cs.tools;



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
}
