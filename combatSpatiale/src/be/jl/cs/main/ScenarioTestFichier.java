package be.jl.cs.main;

import java.io.File;

public class ScenarioTestFichier {

	public ScenarioTestFichier(){
		
		File fVaisseau = new File("Liste_Vaisseau.txt");

		System.out.println("Le chemin absolu du fichier est : " + fVaisseau.getAbsolutePath());
		System.out.println("Nom du fichier : " + fVaisseau.getName());
		
	}
	
	/**
	 * 
	 */
	public void getLecteurRacinesPC(){
		
		File fVaisseau = new File("Liste_Vaisseau.txt");
		
		for(File file : fVaisseau.listRoots())
		{
			System.out.println(file.getAbsolutePath());
			try {
				int i = 1;
				//On parcourt la liste des fichiers et repertoires
				for(File nom : file.listFiles()){
					//s'il s'agit d'un dossier on ajoute "/"
					System.out.println("\t\t" + ((nom.isDirectory()) ? nom.getName() + "/" : nom.getName()));
					
					if((i%4) == 0 ){
						System.out.println("\n");
					}
					i++;
				}
				System.out.println("\n");
			}catch(NullPointerException e){
				/*
				 * L'instruction peut générer une NullPointerException s'il n'y a pas de sous-fichier
				 */
			}
		}
		
	}

}
