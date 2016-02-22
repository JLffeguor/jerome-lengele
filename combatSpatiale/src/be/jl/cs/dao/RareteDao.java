package be.jl.cs.dao;

import org.springframework.stereotype.Repository;

import be.jl.cs.model.vaisseau.composant.Rarete;

@Repository
@SuppressWarnings("unchecked")
public class RareteDao extends BaseRepository<Rarete>{

	public Rarete findByName(String nomRarete) {
		return getSingleOrNullResult(em.createQuery("select b from Rarete b where b.nom=:nom").setParameter("nom", nomRarete));
	}
	
}
