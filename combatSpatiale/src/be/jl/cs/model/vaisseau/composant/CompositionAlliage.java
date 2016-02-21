package be.jl.cs.model.vaisseau.composant;

import javax.persistence.Entity;
/**
 * 
 * @author jerronimo31
 * Cette class permer de gerer les �l�ment compos� de plusieur �l�m�nt en tenant compte du pourcentage de composition de chacun des �l�ments
 */
@Entity
public class CompositionAlliage extends BaseEntity{

	private ElementUnivers element;
	private Double pourcentage;
	
	public CompositionAlliage(){}

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
