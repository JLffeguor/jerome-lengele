package be.jlengele.chap5abstrctInterface.projAbstract;

public abstract class Animal {

	int poid;
	String couleur;
	
	
	protected void manger(String m){
		System.out.println("Je mange du/de la/des " + m);
	}
	protected void boire(){
		System.out.println("je bois de l'eau");
	}
	abstract void deplacement();
	abstract void crier();
	
}
