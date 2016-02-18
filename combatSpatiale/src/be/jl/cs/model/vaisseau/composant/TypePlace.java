package be.jl.cs.model.vaisseau.composant;

/**
 * 
 * @author jlengele
 * Chaque vaisseau possède un nomnre de case (place) repartie entre les différente partie du vaisseau ( moteur , armes, défense, etc.)
 * c'est le mécanisme qui permet de crée un modèle de vaisseau. 
 * mais certaine place son plus dangereuse que d'autre, e.g. : les place accupée par les noyau d'energie sont critiqe lors des combats , car si elles sont 
 * touchée cela provoque beaucoup de dégat, peut couper l'alimentation de certaine armes, les bouclies peuvent tomber , etc.
 * Pour chaque type de place on peut prévoir un comportement différent si elle est détruite.
 */
public class TypePlace {

	private String nom;
	private Integer degatCauser;
}
