package be.jlengele.chap5Zarmy.model;

import be.jlengele.chap5Zarmy.comportement.IntDeplacement;
import be.jlengele.chap5Zarmy.comportement.IntEspritCombattif;
import be.jlengele.chap5Zarmy.comportement.IntSoin;
import be.jlengele.chap5Zarmy.comportement.deplacement.Marcher;
import be.jlengele.chap5Zarmy.comportement.espritcombatif.Pacifiste;
import be.jlengele.chap5Zarmy.comportement.soin.AucunSoin;

public abstract class Personnage {


	/*
	 * nos instances de comportement
	 */
	public IntEspritCombattif espritCombatif = new Pacifiste();
	public IntSoin soin = new AucunSoin();
	public IntDeplacement deplacement = new Marcher();
	
	//constructeur par défaut
	public Personnage(){}
	
	//contructeur avec parametre
	public Personnage(IntEspritCombattif espritCombatif, IntSoin soin, IntDeplacement deplacement){
		this.espritCombatif = espritCombatif;
		this.soin = soin;
		this.deplacement = deplacement;
	}
	
	//méthode de deplacement du personnage
	public void seDeplacer(){
		//on utilise les objets de déplacement de manière polymorphe
		deplacement.deplace();
	}
	
	//méthode que les combattant utilise
	public void combattre(){
		//on utilise les objets de espriCombatif de manière polymorphe
		espritCombatif.combat();
	}
	//méthode de soin
	public void soigner(){
		//on utilise les obets de soin de manière polymorhpe
		soin.soin();
	}

	// setters
	public void setEspritCombatif(IntEspritCombattif espritCombatif) {
		this.espritCombatif = espritCombatif;
	}

	public void setSoin(IntSoin soin) {
		this.soin = soin;
	}

	public void setDeplacement(IntDeplacement deplacement) {
		this.deplacement = deplacement;
	}
	
	
}
