package be.jl.cs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import be.jl.cs.dao.RareteDao;
import be.jl.cs.model.vaisseau.composant.Rarete;

@Component
@Service
public class RareteService {

	@Autowired 
	private RareteDao rareteDao;
	
	public void creerRarete(Rarete r){
		if(r == null){
			throw new IllegalArgumentException("le paramêtre Rarete ne peut pas être null");
		}
		
		rareteDao.persist(r);
	}
	
}
