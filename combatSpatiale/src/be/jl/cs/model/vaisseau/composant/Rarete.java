package be.jl.cs.model.vaisseau.composant;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * @author jlengele
 * défini la rareté d'un element ou tout autre composant 
 */
@Entity
@Table(name ="T_RARETE")
public class Rarete extends BaseEntity {

	private String nom;
	private Double prctTrouve;
	
	//constructeur
	public void rarete( String n,Double p){
		this.nom = n;
		this.prctTrouve = p;
	}

	//getters et setters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Double getPrctTrouve() {
		return prctTrouve;
	}
	public void setPrctTrouve(Double prctTrouve) {
		this.prctTrouve = prctTrouve;
	}
}
