package be.jl.cs.model.vaisseau.composant;

import java.util.List;

/**
 * 
 * @author jlengele
 *
 *C'est l'�lement qui compose une pi�ce ex : fer, cuivre , agent , or
 *il poss�de 
 *une resistance a la pression au cm�/mm d'�paisseur,
 * une resistance a la perforation au cm�/mm d'�paisseur
 *une r�sistance a la chaleur, un poid au grammes, il peut etre compos� de plusieur Composant 
 */
public class ComposantPiece {

	private String nom;
	private List<ComposantPiece> compositionAliage;
	private Double resistancePression;// => cm�/mm d'�paisseur
	private Double resistancePerforation;// => cm�/mm d'�paisseur
	private Double resistanceChaleur;// => en K
	private Double poidmiliGrammes;// => en mg/mm�
	private Double prctDeComposition; // => lors d'un alliange, d�termine le pourcentage de chaque composant.
	
	/*
	 * constructeur
	 */
	public ComposantPiece(){
		this.compositionAliage = null;
		this.prctDeComposition = Double.valueOf(100);
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

	public List<ComposantPiece> getCompositionAliage() {
		return compositionAliage;
	}

	public void setCompositionAliage(List<ComposantPiece> compositionAliage) {
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
	
	
}
