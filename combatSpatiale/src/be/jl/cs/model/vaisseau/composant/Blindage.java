package be.jl.cs.model.vaisseau.composant;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * @author jlengele
 * @version 1.0
 * @since
 *Composant d'une coque
 */
@Entity
@Table(name="T_BLINDAGE")
public class Blindage extends BaseEntity{

	private Double epaisseurMM;
	private ElementUnivers materiel;
	private Double surfaceCmC;
	private Integer place;
	private TypePlace TypePlace; 
	
	/*
	 * constructeur
	 */
	public Blindage(){
		
	}
	
	/*
	 * gettes et setters
	 */
	public Double getEpaisseurMM() {
		return epaisseurMM;
	}

	public void setEpaisseurMM(Double epaisseurMM) {
		this.epaisseurMM = epaisseurMM;
	}

	public ElementUnivers getMateriel() {
		return materiel;
	}

	public void setMateriel(ElementUnivers materiel) {
		this.materiel = materiel;
	}
	public Double getSurface(){
		return surfaceCmC;
	}
	public void setSurface(Double surface){
		this.surfaceCmC = surface;
	}
	
	/**
	 * calcule ma résistance a la pression du blindage
	 * @return Double
	 */
	public Double resistancePressionBlindage(){
		return (materiel.getResistancePression()*this.epaisseurMM*this.surfaceCmC)/1000 ;
		
	}
	/**
	 * calcule la résistance a la perforation du blindage
	 * @return Double
	 * 
	 */
	public Double resistancePerforationBlindage(){
		return (materiel.getResistancePerforation()*this.epaisseurMM*this.surfaceCmC)/1000;
	}
	/**
	 * 
	 */
	public Double poidBlindageKg(){
		double volumeBlindageCmC,poid;
		//on obtient le volume en cm³
		volumeBlindageCmC = this.surfaceCmC * (this.epaisseurMM/1000);
		/*
		 * comme le poid est donné en mg/mm³, je dois le multiplier par 1000 pour obtenir le poid en cm³
		 * et je dois diviser tout par 1000000 pour obtenir le poid en kg ^^
		 */
		return ((materiel.getPoidGrammes()*1000) * volumeBlindageCmC) / 1000000;
	}
	
	
}
