package be.jlengele.chap5Zarmy.model;

import be.jlengele.chap5Zarmy.comportement.IntDeplacement;
import be.jlengele.chap5Zarmy.comportement.IntEspritCombattif;
import be.jlengele.chap5Zarmy.comportement.IntSoin;
import be.jlengele.chap5Zarmy.comportement.soin.PremierSoin;

public class Medecin extends Personnage{

	public Medecin(){
		this.soin = new PremierSoin();
	}
	
	public Medecin(IntEspritCombattif esprit, IntSoin soin, IntDeplacement deplacement){
		super(esprit,soin,deplacement);
	}
}
