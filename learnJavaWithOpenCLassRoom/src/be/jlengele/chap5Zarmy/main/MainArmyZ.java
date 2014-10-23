package be.jlengele.chap5Zarmy.main;

import java.util.ArrayList;

import be.jlengele.chap5Zarmy.model.Civil;
import be.jlengele.chap5Zarmy.model.Guerrier;
import be.jlengele.chap5Zarmy.model.Medecin;
import be.jlengele.chap5Zarmy.model.Personnage;

public class MainArmyZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Personnage> tPers = new ArrayList<Personnage>();
		
		tPers.add(new Guerrier());
		tPers.add(new Medecin());
		tPers.add(new Civil());
		
		/**
		 * utilisation du for each pour un array list
		 */
		
		for(Personnage personnage: tPers){
			System.out.println("\nInstance de " + personnage.getClass().getSimpleName());
			System.out.println("**************************************************");
			personnage.combattre();
			personnage.seDeplacer();
			personnage.soigner();
		}
	}

}
