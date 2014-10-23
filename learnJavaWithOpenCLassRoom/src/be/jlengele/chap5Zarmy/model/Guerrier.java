package be.jlengele.chap5Zarmy.model;

import be.jlengele.chap5Zarmy.comportement.IntDeplacement;
import be.jlengele.chap5Zarmy.comportement.IntEspritCombattif;
import be.jlengele.chap5Zarmy.comportement.IntSoin;
import be.jlengele.chap5Zarmy.comportement.espritcombatif.CombatPistolet;

public class Guerrier extends Personnage{

	public Guerrier(){
		this.espritCombatif = new CombatPistolet();
	}
	public Guerrier(IntEspritCombattif esprit, IntSoin soin, IntDeplacement deplacement){
		super(esprit,soin,deplacement);
	}
}
