package be.jl.cs.model.vaisseau;

import be.jl.cs.exception.NomVaisseauException;
import be.jl.cs.model.vaisseau.deplacement.IntDeplacement;
import be.jl.cs.model.vaisseau.deplacement.Stationnaire;

public class PetitTransporteur extends Vaisseau{

	public PetitTransporteur(){
		this.modeDeplacement = new Stationnaire();
	}
	public PetitTransporteur(int f, double vb){
		super(f, vb);
		}
	
	/*
	 * je dois mettre le throws pour rappeler l'exception dans la classe mère Vaisseau
	 */
	public PetitTransporteur(String nom, IntDeplacement deplacement) throws NomVaisseauException{
		super (nom,deplacement);
	}
	
	
	
	
}
