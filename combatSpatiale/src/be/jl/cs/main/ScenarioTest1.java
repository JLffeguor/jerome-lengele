package be.jl.cs.main;

import java.util.ArrayList;

import be.jl.cs.exception.NomVaisseauException;
import be.jl.cs.model.vaisseau.PetitTransporteur;
import be.jl.cs.model.vaisseau.Vaisseau;
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

		Vaisseau pt = new PetitTransporteur();

		pt.deplacement();
		pt.setModeDeplacement(new Combustion());
		pt.deplacement();

		try {
			Vaisseau v1 = new PetitTransporteur("hello", new Stationnaire());
			System.out.println(v1.toString());
		} catch (NomVaisseauException e) {
			System.out.println("ERROR");
		}

		Vaisseau pt1 = new PetitTransporteur(100, 1000, 10);

		System.out.println("le vaisseau a " + pt1.getFret()
				+ " de taille de soute");
		pt1.setFret((int) DataTools.ajprctvaleur(pt1.getFret(), 50));
		System.out.println("le vaisseau a " + pt1.getFret()
				+ " de taille de soute");

	}
}