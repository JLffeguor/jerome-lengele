package be.jlengele.chap5abstrctInterface.model;

import be.jlengele.chap5abstrctInterface.projAbstract.Felin;
import be.jlengele.chap5abstrctInterface.projInterface.RoiLion;

public class Lion extends Felin implements RoiLion{

	/**
	 * contructeur par défaut
	 */
	public Lion(){
		
	}
	
	public Lion (String couleur, int poids){
		this.couleur = couleur;
		this.poids = poids;
	}
	
	public void crier() {
		    System.out.println("Je rugis dans la savane !");
	}

	@Override
	public void sauverMaitre() {
		System.out.println("je sauve mon maitre");
	}

	@Override
	public void faireLechouille() {
		System.out.println("je fais un bisous");
	}

	@Override
	public void chanterhakunamatata() {
		System.out.println("je chante avec Timon et pumba");
	}
	
}
