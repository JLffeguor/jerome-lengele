package be.jl.cs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.jl.cs.model.User;
import be.jl.cs.model.vaisseau.composant.Blindage;
import be.jl.cs.model.vaisseau.composant.CompositionAlliage;
import be.jl.cs.model.vaisseau.composant.ElementUnivers;
import be.jl.cs.model.vaisseau.composant.Rarete;
import be.jl.cs.service.BlindageService;
import be.jl.cs.service.CompositionAlliageService;
import be.jl.cs.service.ElementUniversService;
import be.jl.cs.service.RareteService;

/**
 * 
 * @author jlengele
 *Cette class vas servir uniquement pendant la phase de TEST et développement de la partie model, dao , service
 *elle va simuler l'appel à chaque service et la création d'au moins 1 enregistrement de chaque model.
 */
public class TestHibernateDbMySQL {

	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	ElementUniversService elementUniversService = (ElementUniversService) context.getBean("elementUniversService");
	RareteService rareteService = (RareteService) context.getBean("rareteService");
	CompositionAlliageService compositionAlliageService= (CompositionAlliageService) context.getBean("compositionAlliageService");
	BlindageService blindageService =(BlindageService) context.getBean("blindageService");
	
	public TestHibernateDbMySQL(){
		
		//création des raretés
		Rarete rarete = new Rarete();
		rarete.setNom("normale");
		rarete.setPrctTrouve(33.3);
		
		
		//création des éléments		
		ElementUnivers elemTest = new ElementUnivers("muche",14.2, 100.2, 12.4, 100.1,rarete);
		ElementUnivers elemTest1 = new ElementUnivers("truc", 44.2, 120.2, 412.4, 10.1,rarete);
		ElementUnivers elemTest2 = new ElementUnivers("truc-muche", 44.2, 120.2, 412.4, 10.1,rarete);
		
		
		//Création des compositions
		CompositionAlliage cp = new CompositionAlliage(elemTest,50.0);
		CompositionAlliage cp1 = new CompositionAlliage(elemTest1,50.0);
		
		
		//création des Blindage
		Blindage blindage = new Blindage();
		Blindage blindage1 = new Blindage();
		blindage.setEpaisseurMM(100.0); blindage.setMateriel(elemTest);blindage.setSurfaceMC(100.0);
		blindage1.setEpaisseurMM(200.0);blindage1.setMateriel(elemTest1);blindage1.setSurfaceMC(100.0);
		
		
		
		//test avec une composition
		/**ici je décris l'élément elemTest2 comme étant un mélange de cp et cp1
		 * cp est 50% de elemTest
		 * cp1 est 50% de elemTest1
		 * ce qui permet dans le futur que chaque élément qui contiendra 50% de elemTest contiendra CP.
		 * */
		elemTest2.getCompositionAlliage().add(cp);
		elemTest2.getCompositionAlliage().add(cp1);
		
		
		/** persist les rareté*/
		rareteService.creerRarete(rarete);
		System.out.println(rarete + "\n Rarete persist");
		
		
		/** commit des 2 élément truc et muche */
		elementUniversService.creerElementUnivers(elemTest);
		elementUniversService.creerElementUnivers(elemTest1);
		System.out.println(elemTest + "\n elemTest persist\n" + elemTest1 + "\n elemTest1 persist");
		
		
		/** persist des composition*/
		compositionAlliageService.creerCompositionAlliage(cp);
		compositionAlliageService.creerCompositionAlliage(cp1);
		System.out.println(cp + "/n cp persist\n" + cp1 + "\n cp1 persist");
		
		
		elementUniversService.creerElementUnivers(elemTest2);

		/** persist des blindage*/
		blindageService.creerBlindage(blindage);
		blindageService.creerBlindage(blindage1);
		System.out.println(blindage + "\n Blindage persist");
		
		/** création de user*/
		User u1 = new User();
		User u2 = new User();
		u1.setFirstName("jerome");
		u1.setPassword("lengelé");
		u2.setPassword("Du Bois");
		u2.setFirstName("Céline");
	}
	
}
