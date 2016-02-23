package be.jl.cs.model.vaisseau.composant;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import be.jl.cs.model.BaseEntity;

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
	@OneToOne
	private ElementUnivers materiel;
	private Double surfaceMC;
	private Integer nbrPlace;
	@OneToOne
	private TypePlace TypePlace; 
	
	/*
	 * constructeur
	 */
	public Blindage(){}
	
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
		return surfaceMC;
	}
	public void setSurfaceMC(Double surface){
		this.surfaceMC = surface;
	}
	
	/**
	 * calcule ma résistance a la pression du blindage
	 * @return Double
	 */
	public Double resistancePressionBlindage(){
		return (materiel.getResistancePression()*this.epaisseurMM*this.surfaceMC)/1000 ;
		
	}
	/**
	 * calcule la résistance a la perforation du blindage
	 * @return Double
	 * 
	 */
	public Double resistancePerforationBlindage(){
		return (materiel.getResistancePerforation()*this.epaisseurMM*this.surfaceMC)/1000;
	}
	/**
	 * calcule poid du blindage en kg
	 * @return Double
	 */
	public Double poidBlindageKg(){
		double volumeBlindageCmC,poid;
		//on obtient le volume en cm³
		volumeBlindageCmC = this.surfaceMC * (this.epaisseurMM/1000);
		/*
		 * comme le poid est donné en mg/mm³, je dois le multiplier par 1000 pour obtenir le poid en cm³
		 * et je dois diviser tout par 1000000 pour obtenir le poid en kg ^^
		 */
		return ((materiel.getPoidGrammes()*1000) * volumeBlindageCmC) / 1000000;
	}
	
	
}
