package be.jl.cs.main;

import java.util.ArrayList;

import be.jl.cs.exception.BlindageException;
import be.jl.cs.exception.NomVaisseauException;
import be.jl.cs.model.vaisseau.PetitTransporteur;
import be.jl.cs.model.vaisseau.Vaisseau;
import be.jl.cs.model.vaisseau.composant.Blindage;
import be.jl.cs.model.vaisseau.composant.ComposantPiece;
import be.jl.cs.model.vaisseau.composant.Coque;
import be.jl.cs.model.vaisseau.deplacement.Combustion;
import be.jl.cs.model.vaisseau.deplacement.Stationnaire;
import be.jl.cs.tools.DataTools;

public class ScenarioTest1 {

	public ScenarioTest1() {

		ArrayList<Vaisseau> alVaisseau = new ArrayList<Vaisseau>();

		alVaisseau.add(new PetitTransporteur());

		/*
		 * J'utilise ici le pattern strategy Je vais utiliser le fait d'avoir
		 * isoler ce qui peut varier dans le vaisseau ( le mode de déplacement)
		 * et je vais pouvoir modifer le type de déplacement du petit
		 * transporteur sans devoir intervenir dans le code ^^
		 * 
		 * ceci permetra plus tard de pouvoir changer le mode de propulsion au
		 * fur et a mesure que des technologie seront développée.
		 */

		Vaisseau pt = null;
		try {
			pt = new PetitTransporteur("Premier petit transporteur",new Combustion());
		} catch (NomVaisseauException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// création d'un composant
		ComposantPiece fer = new ComposantPiece();
		fer.setNom("FER");
		fer.setResistancePerforation(Double.valueOf(4));
		fer.setPoidGrammes(Double.valueOf(7.8740));
		fer.setResistanceChaleur(Double.valueOf(1811.2));
		fer.setResistancePression(Double.valueOf(7.8740));
		fer.setPrctDeComposition(Double.valueOf(100));
		
		Blindage blindage =  new Blindage();
		blindage.setEpaisseurMM(Double.valueOf(125));
		blindage.setMateriel(fer);
		blindage.setSurface(Double.valueOf(300000));
		
		Coque coque = new Coque();
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






}