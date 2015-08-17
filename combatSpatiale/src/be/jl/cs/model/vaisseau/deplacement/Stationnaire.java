package be.jl.cs.model.vaisseau.deplacement;

public class Stationnaire implements IntDeplacement{

	@Override
	public void deplace() {
		System.out.println("Le vaisseau est en vol stationnaire autour de la planete");
	}

}
