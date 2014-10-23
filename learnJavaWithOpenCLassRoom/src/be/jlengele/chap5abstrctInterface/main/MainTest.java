package be.jlengele.chap5abstrctInterface.main;

import be.jlengele.chap5abstrctInterface.model.Lion;
import be.jlengele.chap5abstrctInterface.projInterface.RoiLion;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lion l = new Lion("bleu",28);
		
		l.crier();
		l.deplacement();
		l.boire();
		l.manger("viande");

		/**
		 * utilisation de la méthode getClass
		 */
		System.out.println(l);
		
		System.out.println("------------------------------------");
		
		//les méthode de l'interface
		l.chanterhakunamatata();
		l.faireLechouille();
		l.sauverMaitre();
		
		System.out.println("------------------------------------");
		//utilisation du polymorphisme de notre interface
		RoiLion cb = new Lion();
		cb.chanterhakunamatata();
		cb.faireLechouille();
		cb.sauverMaitre();
	}

}
