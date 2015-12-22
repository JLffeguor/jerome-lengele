package be.jl.cs.model.vaisseau.composant;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author jlengele
 *
 *C'est l'élement qui compose une pièce ex : fer, cuivre , agent , or
 *il possède 
 *une resistance a la pression au cm²/mm d'épaisseur,
 * une resistance a la perforation au cm²/mm d'épaisseur
 *une résistance a la chaleur, un poid au grammes, il peut etre composé de plusieur Composant 
 */

@javax.persistence.Entity
public class ElementUnivers {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	private List<ElementUnivers> compositionAliage;
	private Double resistancePression;// => cm²/mm d'épaisseur
	private Double resistancePerforation;// => cm²/mm d'épaisseur
	private Double resistanceChaleur;// => en K
	private Double poidmiliGrammes;// => en mg/mm³
	private Double prctDeComposition; // => lors d'un alliange, détermine le pourcentage de chaque composant.
	
	
	/*
	 * constructeur
	 */
	public ElementUnivers(){
		this.compositionAliage = null;
		this.prctDeComposition = Double.valueOf(100);
	}
	/**
	 * Constructeur simple avec le reste des elemen remplit par défaut
	 * @param nom
	 * @param poid
	 */
	public ElementUnivers(String nom,Double poid){
		
		this.nom = nom;
		this.poidmiliGrammes = poid;
		this.compositionAliage = null;
		this.resistancePression = 0.0;
		this.resistancePerforation = 0.0;
		this.resistanceChaleur = 0.0;
		this.prctDeComposition = 0.0;
	}

	/*
	 * getters et setters
	 */
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<ElementUnivers> getCompositionAliage() {
		return compositionAliage;
	}

	public void setCompositionAliage(List<ElementUnivers> compositionAliage) {
		this.compositionAliage = compositionAliage;
	}

	public Double getResistancePression() {
		return resistancePression;
	}

	public void setResistancePression(Double resistancePression) {
		this.resistancePression = resistancePression;
	}

	public Double getResistancePerforation() {
		return resistancePerforation;
	}

	public void setResistancePerforation(Double resistancePerforation) {
		this.resistancePerforation = resistancePerforation;
	}

	public Double getResistanceChaleur() {
		return resistanceChaleur;
	}

	public void setResistanceChaleur(Double resistanceChaleur) {
		this.resistanceChaleur = resistanceChaleur;
	}

	public Double getPoidGrammes() {
		return poidmiliGrammes;
	}

	public void setPoidGrammes(Double poidGrammes) {
		this.poidmiliGrammes = poidGrammes;
	}
	public Double getPrctDeComposition() {
		return prctDeComposition;
	}
	public void setPrctDeComposition(Double prctDeComposition) {
		this.prctDeComposition = prctDeComposition;
	}

	
}
