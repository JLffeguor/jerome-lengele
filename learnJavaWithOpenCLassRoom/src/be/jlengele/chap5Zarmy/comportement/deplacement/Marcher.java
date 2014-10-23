package be.jlengele.chap5Zarmy.comportement.deplacement;

import be.jlengele.chap5Zarmy.comportement.IntDeplacement;

public class Marcher implements IntDeplacement{

	@Override
	public void deplace() {
		System.out.println("je me déplace en marchant");
	}

}
