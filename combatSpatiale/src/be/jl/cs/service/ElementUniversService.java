package be.jl.cs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import be.jl.cs.dao.ElementUniversDao;
import be.jl.cs.model.vaisseau.composant.ElementUnivers;

@Component
@Service
public class ElementUniversService {
	
	@Autowired
	private ElementUniversDao elementUniverDao;

	
	public void creerElementUnivers(ElementUnivers e){
		
		if(e == null){
			throw new IllegalArgumentException("le paramêtre ElementUnivers ne peut pas être null");
		}
		elementUniverDao.persist(e);
		
	}
}
