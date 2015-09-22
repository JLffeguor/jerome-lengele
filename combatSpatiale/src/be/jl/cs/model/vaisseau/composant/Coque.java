package be.jl.cs.model.vaisseau.composant;

import java.util.ArrayList;
import java.util.LinkedList;


/**
 * 
 * @author jlengele
 *Coque du vaisseau, compos�e de couche(Blindage) de diff�rent alliage et de diff�rente �paisseur
 */

public class Coque {

	private LinkedList<Blindage> coques;
	
	public LinkedList<Blindage> getCoques() {
		return coques;
	}

	public void ajouterBlindage (Blindage b){
		coques.add(b);
	}
	
}
