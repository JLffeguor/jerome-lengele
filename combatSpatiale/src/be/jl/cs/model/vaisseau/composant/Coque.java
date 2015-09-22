package be.jl.cs.model.vaisseau.composant;

import java.util.ArrayList;
import java.util.LinkedList;


/**
 * 
 * @author jlengele
 *Coque du vaisseau, composée de couche(Blindage) de différent alliage et de différente épaisseur
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
