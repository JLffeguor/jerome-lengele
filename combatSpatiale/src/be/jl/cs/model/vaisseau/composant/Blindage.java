package be.jl.cs.model.vaisseau.composant;

import java.text.DecimalFormat;

/**
 * 
 * @author jlengele
 * @version 1.0
 * @since
 *Composant d'un coque
 */
public class Blindage {

	private Double epaisseurMM;
	private ComposantPiece materiel;
	private Double surfaceCmC;
	
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

	public ComposantPiece getMateriel() {
		return materiel;
	}

	public void setMateriel(ComposantPiece materiel) {
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
