package be.jlengele.chap6Exception.exception;

public class NombreHabitantException extends Exception{

	public NombreHabitantException(int nbre){
		System.out.println("Instanciation avec un nombre d'habitant négatif.");
		System.out.println("\t => " + nbre);
	}
}
