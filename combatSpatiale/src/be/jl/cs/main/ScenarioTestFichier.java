package be.jl.cs.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class ScenarioTestFichier {

	public ScenarioTestFichier(){
		
//		File fVaisseau = new File("Liste_Vaisseau.txt");
//
//		System.out.println("Le chemin absolu du fichier est : " + fVaisseau.getAbsolutePath());
//		System.out.println("Nom du fichier : " + fVaisseau.getName());
		
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
	
	public void getLecteurRacineJava7(){
		
		Path path = Paths.get("test.txt");
		System.out.println("Chemin absolu du fichier : " + path.toAbsolutePath());
		System.out.println("Est-ce qu'il existe ? " + Files.exists(path));
		System.out.println("Nom du fichier : " + path.getFileName());
		System.out.println("Est-ce un répertoire ? " + Files.isDirectory(path));
		
		//On récupère maintenant la liste des répertoires dans une collection typée
		//Via l'objet FileSystem qui représente le système de fichier de l'OS hébergeant la JVM
		Iterable<Path> roots = FileSystems.getDefault().getRootDirectories();

		//Maintenant, il ne nous reste plus qu'à parcourir
		for(Path chemin : roots){
		  System.out.println(chemin);
		  //Pour lister un répertoire, il faut utiliser l'objet DirectoryStream
		  //L'objet Files permet de créer ce type d'objet afin de pouvoir l'utiliser
		  try(DirectoryStream<Path> listing = Files.newDirectoryStream(chemin,"*.avi")){
		    int i = 0;
		    for(Path nom : listing){
		      System.out.print("\t\t" + ((Files.isDirectory(nom)) ? nom+"/" : nom));
		      i++;
		      if(i%4 == 0)System.out.println("\n");
		    }
		  } catch (IOException e) {
		    e.printStackTrace();
		  }
		}
	}
	
}
