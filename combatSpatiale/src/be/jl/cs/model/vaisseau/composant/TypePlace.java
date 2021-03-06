package be.jl.cs.model.vaisseau.composant;

import javax.persistence.Entity;
import javax.persistence.Table;

import be.jl.cs.model.BaseEntity;

/**
 * 
 * @author jlengele
 * Chaque vaisseau poss�de un nomnre de case (place) repartie entre les diff�rente partie du vaisseau ( moteur , armes, d�fense, etc.)
 * c'est le m�canisme qui permet de cr�e un mod�le de vaisseau. 
 * mais certaine place son plus dangereuse que d'autre, e.g. : les place accup�e par les noyau d'energie sont critiqe lors des combats , car si elles sont 
 * touch�e cela provoque beaucoup de d�gat, peut couper l'alimentation de certaine armes, les bouclies peuvent tomber , etc.
 * Pour chaque type de place on peut pr�voir un comportement diff�rent si elle est d�truite.
 */
@Entity
@Table(name = "T_TYPE_PLACE")
public class TypePlace extends BaseEntity{

	private String nomType;
	private Integer degatCauser;
}
