package be.jlengele.chap5Zarmy.comportement.espritcombatif;

import be.jlengele.chap5Zarmy.comportement.IntEspritCombattif;

public class CombatCouteau implements IntEspritCombattif{

	@Override
	public void combat() {
		System.out.println("je combat au couteau");
	}

}
