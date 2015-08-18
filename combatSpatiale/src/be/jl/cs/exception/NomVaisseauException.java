package be.jl.cs.exception;

public class NomVaisseauException extends Exception{
	
	//constructeur de l'exception
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5973545515254177501L;

	public NomVaisseauException(String message){
		System.out.println(message);
	}

}
