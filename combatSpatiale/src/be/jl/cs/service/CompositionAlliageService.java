package be.jl.cs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import be.jl.cs.dao.CompositionAlliageDao;
import be.jl.cs.model.vaisseau.composant.CompositionAlliage;

@Component
@Service
public class CompositionAlliageService {

	@Autowired
	private CompositionAlliageDao compositionAlliageDao;
	
	public void creerCompositionAlliage(CompositionAlliage e){
		
		if(e == null){
			throw new IllegalArgumentException("le paramêtre CompositionAlliage ne peut pas être null");
		}
		compositionAlliageDao.persist(e);
		
	}
}