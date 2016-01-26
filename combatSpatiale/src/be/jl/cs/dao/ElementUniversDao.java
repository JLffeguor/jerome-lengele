package be.jl.cs.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import be.jl.cs.model.vaisseau.composant.ElementUnivers;

@Repository
@Transactional
public class ElementUniversDao {

	@PersistenceContext 
	EntityManager em;
	
	
	public void persist(ElementUnivers entity){
		em.persist(entity);
		
	}
}
