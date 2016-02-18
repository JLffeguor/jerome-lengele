package frameCS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import be.jl.cs.service.ElementUniversService;

@Component
@Lazy
@Scope("singleton")
public class GUIConnector {
	
	@Autowired
	ElementUniversService elementUniversService;

	
	public ElementUniversService getElementUniversService(){
		return elementUniversService;
	}
}
