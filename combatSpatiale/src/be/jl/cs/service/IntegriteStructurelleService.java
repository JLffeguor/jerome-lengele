package be.jl.cs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import be.jl.cs.dao.IntegriteStructurelleDao;
import be.jl.cs.model.vaisseau.composant.IntegriteStructurelle;

@Component
@Service
public class IntegriteStructurelleService {

	@Autowired
	private IntegriteStructurelleDao integriteStructurelleDao;
	
	public void creerIntegriteStructurelle(IntegriteStructurelle e){
		
		if(e == null){
			throw new IllegalArgumentException("le paramêtre IntegriteStructurelle ne peut pas être null");
		}
		integriteStructurelleDao.persist(e);
		
	}
}
