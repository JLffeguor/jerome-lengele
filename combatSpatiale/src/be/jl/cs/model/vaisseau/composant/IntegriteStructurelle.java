package be.jl.cs.model.vaisseau.composant;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import be.jl.cs.model.BaseEntity;

/**
 * @author jlengele
 * c'est l"integrité structurele du vaisseau, qui permet de savoir l'état général de la coque et des blindages
 * TODO il faut réfléchir sur la nécésité de cet classe, quel information essentiel peut-elle apporter au projet
 * */
@Entity
@Table(name="T_INTEGRITE_STRUCT")
public class IntegriteStructurelle extends BaseEntity {

	@OneToOne
	private Coque coque;
	private Integer Etat; //TODO creer une classe paremetre por trouver le libellé de l'état.
	
	public void IntegriteStructurelle(){}

	public Coque getCoque() {
		return coque;
	}

	public void setCoque(Coque coque) {
		this.coque = coque;
	}

	public Integer getEtat() {
		return Etat;
	}

	public void setEtat(Integer etat) {
		Etat = etat;
	}
}
