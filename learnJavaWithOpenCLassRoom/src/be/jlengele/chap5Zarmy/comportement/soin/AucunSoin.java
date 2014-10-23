package be.jlengele.chap5Zarmy.comportement.soin;

import be.jlengele.chap5Zarmy.comportement.IntSoin;

public class AucunSoin implements IntSoin{

	@Override
	public void soin() {
		System.out.println("je ne pratique aucun soin");
	}

}
