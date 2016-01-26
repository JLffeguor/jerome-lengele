package be.jl.cs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import be.jl.cs.dao.ElementUniversDao;
import be.jl.cs.model.vaisseau.composant.ElementUnivers;

@Service("ElementUniverBO")
@Transactional
public class ElementUniversService implements ElementUniverBO{
	
	@Autowired
	private ElementUniversDao elementUniver;

	
	public void creerElementUnivers(ElementUnivers e){
		
		if(e == null){
			throw new IllegalArgumentException("le paramêre ElementUnivers ne peut pas être null");
		}
		elementUniver.persist(e);
		
	}
}
