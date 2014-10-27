package be.jlengele.chap6Exception.model;

import be.jlengele.chap6Exception.exception.NombreHabitantException;

public class Ville {

	private String nom;
	private int nombreHabitant;
	private String pays;
	
	
	
	public Ville (String pNom, int pNbre,String pPays) throws NombreHabitantException {
		
		if (pNbre < 0){
			throw new NombreHabitantException(pNbre);
		}else{
			nom = pNom;
			nombreHabitant = pNbre;
			pays = pPays;
		}
	}
}
