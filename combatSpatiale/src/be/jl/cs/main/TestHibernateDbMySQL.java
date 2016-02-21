package be.jl.cs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.jl.cs.model.vaisseau.composant.ElementUnivers;
import be.jl.cs.service.ElementUniversService;

/**
 * 
 * @author jlengele
 *Cette class vas servir uniquement pendant la phase de TEST et développement de la partie model, dao , service
 *elle va simuler l'appel à chaque service et la création d'au moins 1 enregistrement de chaque model.
 */
public class TestHibernateDbMySQL {

	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	ElementUniversService elementUniversService = (ElementUniversService) context.getBean("elementUniversService");
	
	public TestHibernateDbMySQL(){
		
		//recupération de élémént unviver
		
		ElementUnivers elemTest = new ElementUnivers("muche", null, 14.2, 100.2, 12.4, 100.1, 100.0);
		//test avec une composition
		ElementUnivers elemTest1 = new ElementUnivers("truc", elemTest, 44.2, 120.2, 412.4, 10.1, 50.0);
		
		/**
		 * commit des 2 élément truc et muche
		 */
		elementUniversService.creerElementUnivers(elemTest);
		elementUniversService.creerElementUnivers(elemTest1);
		
	}
	
}
