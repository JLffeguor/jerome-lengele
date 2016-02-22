package be.jl.cs.model.vaisseau.composant;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
/**
 * 
 * @author jerronimo31
 * Cette class permer de gerer les élément composé de plusieur élémént en tenant compte du pourcentage de composition de chacun des éléments
 */
@Entity
public class CompositionAlliage extends BaseEntity{
	
	@OneToOne
	private ElementUnivers element;
	private Double pourcentage;
	
	public CompositionAlliage(){}

	public CompositionAlliage(ElementUnivers e, Double p){
		this.element = e;
		this.pourcentage = p;
	}
	
	public ElementUnivers getElement() {
		return element;
	}
	
	public void setElement(ElementUnivers element) {
		this.element = element;
	}

	public Double getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(Double pourcentage) {
		this.pourcentage = pourcentage;
	}
	
	
	
}
