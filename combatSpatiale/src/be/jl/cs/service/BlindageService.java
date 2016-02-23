package be.jl.cs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import be.jl.cs.dao.BlindageDao;
import be.jl.cs.model.vaisseau.composant.Blindage;

@Component
@Service
public class BlindageService {
	
	@Autowired
	private BlindageDao blindageDao;
	
	public void creerBlindage(Blindage b){
		blindageDao.persist(b);
	}

}
