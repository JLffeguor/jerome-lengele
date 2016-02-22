package be.jl.cs.main;

import java.util.ArrayList;

import be.jl.cs.exception.BlindageException;
import be.jl.cs.exception.NomVaisseauException;
import be.jl.cs.model.vaisseau.PetitTransporteur;
import be.jl.cs.model.vaisseau.Vaisseau;
import be.jl.cs.model.vaisseau.composant.Blindage;
import be.jl.cs.model.vaisseau.composant.ElementUnivers;
import be.jl.cs.model.vaisseau.composant.Coque;
import be.jl.cs.model.vaisseau.deplacement.Combustion;
import be.jl.cs.model.vaisseau.deplacement.Stationnaire;
import be.jl.cs.tools.DataTools;

public class ScenarioTest1 {

	
	private ArrayList<Vaisseau> alVaisseau = new ArrayList<Vaisseau>();
	private Vaisseau pt = null;
	private ElementUnivers fer = new ElementUnivers();
	private Blindage blindage =  new Blindage();
	private Coque coque = new Coque();
	
	public ScenarioTest1() {

		

		alVaisseau.add(new PetitTransporteur());

		/**
		 * J'utilise ici le pattern strategy Je vais utiliser le fait d'avoir
		 * isoler ce qui peut varier dans le vaisseau ( le mode de déplacement)
		 * et je vais pouvoir modifer le type de déplacement du petit
		 * transporteur sans devoir intervenir dans le code ^^
		 * 
		 * ceci permetra plus tard de pouvoir changer le mode de propulsion au
		 * fur et a mesure que des technologie seront développée.
		 * 
		 * L'objectif de la bonne programmation JAVA est qu'une fois le code taper , tout le reste du programme, toutes les modifications que l'on
		 * pourrait apporter a un objet se fasse dans le code du main ( exemple avec le changememt de mode de déplacement)
		 * 
		 */

		
		try {
			pt = new PetitTransporteur("Premier petit transporteur",new Combustion());
		} catch (NomVaisseauException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// création d'un composant
		
		fer.setNom("FER");
		fer.setResistancePerforation(Double.valueOf(4));
		fer.setPoidGrammes(Double.valueOf(7.8740));
		fer.setResistanceChaleur(Double.valueOf(1811.2));
		fer.setResistancePression(Double.valueOf(7.8740));
		
		
		blindage.setEpaisseurMM(Double.valueOf(125));
		blindage.setMateriel(fer);
		blindage.setSurface(Double.valueOf(300000));
		
		
		try {
			coque.ajouterBlindage(blindage);
		} catch (BlindageException e1) {
			e1.getCause();
		}
		
//		pt.deplacement();
//		pt.setModeDeplacement(new Combustion());
//		pt.deplacement();
		pt.setCoqueVaisseau(coque);

		System.out.println(pt.presenterVaisseau());

	}

	public ArrayList<Vaisseau> getAlVaisseau() {
		return alVaisseau;
	}

	public void setAlVaisseau(ArrayList<Vaisseau> alVaisseau) {
		this.alVaisseau = alVaisseau;
	}

	public Vaisseau getPt() {
		return pt;
	}

	public void setPt(Vaisseau pt) {
		this.pt = pt;
	}

	public ElementUnivers getFer() {
		return fer;
	}

	public void setFer(ElementUnivers fer) {
		this.fer = fer;
	}

	public Blindage getBlindage() {
		return blindage;
	}

	public void setBlindage(Blindage blindage) {
		this.blindage = blindage;
	}

	public Coque getCoque() {
		return coque;
	}

	public void setCoque(Coque coque) {
		this.coque = coque;
	}






}