package be.jl.cs.dao;

import org.springframework.stereotype.Repository;

import be.jl.cs.model.vaisseau.composant.ElementUnivers;

@Repository
@SuppressWarnings("unchecked")
public class ElementUniversDao extends BaseRepository<ElementUnivers>{

	
	public ElementUnivers findByName(String nomElementUnivers) {
		return getSingleOrNullResult(em.createQuery("select b from ElementUnivers b where b.nom=:nom").setParameter("nom", nomElementUnivers));
	}
}
