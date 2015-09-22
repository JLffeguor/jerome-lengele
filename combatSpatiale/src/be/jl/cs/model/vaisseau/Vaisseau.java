package be.jl.cs.model.vaisseau;

import be.jl.cs.exception.NomVaisseauException;
import be.jl.cs.model.vaisseau.composant.Coque;
import be.jl.cs.model.vaisseau.deplacement.Combustion;
import be.jl.cs.model.vaisseau.deplacement.IntDeplacement;
import be.jl.cs.model.vaisseau.deplacement.Stationnaire;

/**
 * @author jlengele
 * @version 1.0
 */
public abstract class Vaisseau {
	
	

	/*
	 * instance de déplacement ==> ce qui va nous permettre de crée 
	 * des vaisseaux en changeant le mode de propulsion de manière dynamique
	 */
	protected IntDeplacement modeDeplacement = new Stationnaire();
	
	private String nom;
	private int fret;
	private double vitesseBase;
	private Coque coqueVaisseau;
	
	
	/**
	 * Constructeur sans paramètre
	 * @author jlengele
	 * @param null - constructeur par défaut			
	 * @return null 
	 * @version 1.0	  
	 */
	public Vaisseau() {
		
	}; 
	
	public Vaisseau(int fret, double vb){
		this.fret=fret;
		this.vitesseBase = vb;
	}
	
	/**
	 * Constructeur avec parametre
	 * @param nom
	 * @param deplacement
	 */
	public Vaisseau(String nom, IntDeplacement deplacement)  {
		
			this.nom = nom;
			this.modeDeplacement = deplacement;
	}	
	
	//getter et setter
	public void deplacement(){
		modeDeplacement.deplace();
	}

	public void setModeDeplacement(IntDeplacement modeDeplacement) {
		this.modeDeplacement = modeDeplacement;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getFret() {
		return fret;
	}

	public void setFret(int fret) {
		this.fret = fret;
	}

	public double getVitesseBase() {
		return vitesseBase;
	}

	public void setVitesseBase(double vitesseBase) {
		this.vitesseBase = vitesseBase;
	}
	
}
