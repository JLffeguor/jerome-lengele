package be.jl.cs.model.vaisseau.composant;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author jlengele
 *
 *C'est l'élement qui compose une pièce ex : fer, cuivre , agent , or
 *il possède 
 *une resistance a la pression au cm²/mm d'épaisseur,
 * une resistance a la perforation au cm²/mm d'épaisseur
 *une résistance a la chaleur, un poid au grammes, il peut etre composé de plusieur element
 *dans le cas ou l'élément est pur compositionAliage=null et prctDeComposition = 100 
 */

@Entity
@Table(name="T_Element_Univers")
public class ElementUnivers extends BaseEntity{

	@Column(nullable = false, unique = true,name="T_E_U_NOM")
	private String nom;
	@Column(name = "T_E_U_COMPOSITION_ALLIAGE")
	@OneToMany
	private List<ElementUnivers> compositionAliage;
	@Column(nullable = false,name = "T_E_U_RESITANCE_PRESSION")
	private Double resistancePression;// => cm²/mm d'épaisseur
	@Column(nullable = false,name = "T_E_U_RESISTANCE_PERFORATION")
	private Double resistancePerforation;// => cm²/mm d'épaisseur
	@Column(nullable = false,name = "T_E_U_RESISTANCE_CHALEUR")
	private Double resistanceChaleur;// => en K
	@Column(nullable = false,name = "T_E_U_POID")
	private Double poidmiliGrammes;// => en mg/mm³
	@Column(nullable = false,name="T_E_U_COMPOSITION")
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
	/**
	 * Constructeur Complet
	 * @param n
	 * @param compa
	 * @param rpre
	 * @param rperf
	 * @param rcha
	 * @param poid
	 * @param compo
	 */
	public ElementUnivers(String n, ElementUnivers compa,Double rpre, Double rperf, Double rcha, Double poid, Double compo){
		
		this.nom = n;
		if(compa != null)
		{
			this.compositionAliage.add(compa);
		}
		this.resistancePression = rpre;
		this.resistancePerforation = rperf;
		this.resistanceChaleur = rcha;
		this.poidmiliGrammes = poid;
		this.prctDeComposition = compo;
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
