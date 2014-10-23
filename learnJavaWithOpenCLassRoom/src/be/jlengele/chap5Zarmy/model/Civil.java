package be.jlengele.chap5Zarmy.model;

import be.jlengele.chap5Zarmy.comportement.IntDeplacement;
import be.jlengele.chap5Zarmy.comportement.IntEspritCombattif;
import be.jlengele.chap5Zarmy.comportement.IntSoin;

public class Civil extends Personnage{

	public Civil(){
		
	}
	
	public Civil(IntEspritCombattif esprit, IntSoin soin, IntDeplacement deplacement){
		super(esprit,soin,deplacement);
	}
}
