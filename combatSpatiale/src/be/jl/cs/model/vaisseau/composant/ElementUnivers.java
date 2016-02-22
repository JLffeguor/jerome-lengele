package be.jl.cs.model.vaisseau.composant;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author jlengele
 *
 *C'est l'�lement qui compose une pi�ce ex : fer, cuivre , agent , or
 *il poss�de 
 *une resistance a la pression au cm�/mm d'�paisseur,
 * une resistance a la perforation au cm�/mm d'�paisseur
 *une r�sistance a la chaleur, un poid au grammes, il peut etre compos� de plusieur element
 * afin de faciliter la composition d'alliage, l'objet compositionAlliage a �t� cr�e
 * Donc un �l�ment comme le bronze aura une list avec 2 occurence de CompositionAlliage
 * 		- le premier CompositionAlliage aura pour element le cuivre et comme pourentage 50
 * 		- le second CompositionAlliage aura pour �l�ment l'�tain et comme pourcentage 50
 */

@Entity
@Table(name="T_Element_Univers")
public class ElementUnivers extends BaseEntity{

	@Column(nullable = false, unique = true,name="T_E_U_NOM")
	private String nom;
	@ManyToMany
	@JoinColumn(name = "T_COMPOSITION_ALLIAGE")/**l'annotation @joinColumn permet bien de choisir le nom de la table de jointure*/
	private List<CompositionAlliage> compositionAlliage = new ArrayList<CompositionAlliage>();
	@Column(nullable = false,name = "T_E_U_RESITANCE_PRESSION")
	private Double resistancePression;// => cm�/mm d'�paisseur
	@Column(nullable = false,name = "T_E_U_RESISTANCE_PERFORATION")
	private Double resistancePerforation;// => cm�/mm d'�paisseur
	@Column(nullable = false,name = "T_E_U_RESISTANCE_CHALEUR")
	private Double resistanceChaleur;// => en K
	@Column(nullable = false,name = "T_E_U_POID")
	private Double poidmiliGrammes;// => en mg/mm�
	@OneToOne
	private Rarete rarete;
	
	/*
	 * constructeur
	 */
	
	public ElementUnivers(){
		this.compositionAlliage = null;
	}
	/**
	 * Constructeur simple avec le reste des elemen remplit par d�faut
	 * @param nom
	 * @param poid
	 */
	public ElementUnivers(String nom,Double poid){
		
		this.nom = nom;
		this.poidmiliGrammes = poid;
		this.compositionAlliage = null;
		this.resistancePression = 0.0;
		this.resistancePerforation = 0.0;
		this.resistanceChaleur = 0.0;
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
	 * @param rarete
	 */
	public ElementUnivers(String n,Double rpre, Double rperf, Double rcha, Double poid, Rarete rarete){
		
		this.nom = n;
		this.resistancePression = rpre;
		this.resistancePerforation = rperf;
		this.resistanceChaleur = rcha;
		this.poidmiliGrammes = poid;
		this.rarete = rarete;
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
	public Rarete getRarete() {
		return rarete;
	}
	public void setRarete(Rarete rarete) {
		this.rarete = rarete;
	}
	public List<CompositionAlliage> getCompositionAlliage() {
		return compositionAlliage;
	}
	public void setCompositionAlliage(List<CompositionAlliage> compositionAlliage) {
		this.compositionAlliage = compositionAlliage;
	}
	
	

	
}
