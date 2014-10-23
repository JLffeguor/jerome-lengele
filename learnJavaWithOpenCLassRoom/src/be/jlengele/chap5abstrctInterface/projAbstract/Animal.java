package be.jlengele.chap5abstrctInterface.projAbstract;

public abstract class Animal {

	/**
	 * les variable sont en protected sinon on ne sait pas y acceder dans les classe filles
	 */
	public int poids;
	public String couleur;
	
	
	public void manger(String m){
		System.out.println("Je mange du/de la/des " + m);
	}
	public void boire(){
		System.out.println("je bois de l'eau");
	}
	public abstract void deplacement();
	public abstract void crier();
	
	public String toString(){
	    String str = "Je suis un objet de la " + this.getClass() + ", je suis " + this.couleur + ", je pèse " + this.poids;
	    return str;
	  } 
	
}
