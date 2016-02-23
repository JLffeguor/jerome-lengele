package be.jl.cs.model.vaisseau.composant;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import be.jl.cs.model.BaseEntity;

/**
 * @author jlengele
 * c'est l"integrit� structurele du vaisseau, qui permet de savoir l'�tat g�n�ral de la coque et des blindages
 * TODO il faut r�fl�chir sur la n�c�sit� de cet classe, quel information essentiel peut-elle apporter au projet
 * */
@Entity
@Table(name="T_INTEGRITE_STRUCT")
public class IntegriteStructurelle extends BaseEntity {

	@OneToOne
	private Coque coque;
	private Integer Etat; //TODO creer une classe paremetre por trouver le libell� de l'�tat.
	
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
