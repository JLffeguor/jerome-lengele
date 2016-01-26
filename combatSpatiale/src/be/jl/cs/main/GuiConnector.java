package be.jl.cs.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import be.jl.cs.service.ElementUniversService;

/**
 * because gui classes aren't spring bean we need to have an util class who manage spring bean 
 *
 */
@Component
@Lazy
@Scope("singleton")
public class GuiConnector {

	@Autowired
	ElementUniversService elementUniversService;
	
	
	public ElementUniversService getElementUniversService(){
		return elementUniversService;
	}
}
