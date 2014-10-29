package be.jlengele.chap7enum.model;

public enum Langage {

	//objet directement conctruit
	JAVA("Langage JAVA"),
	C("Langage C"),
	CPLUS("Langage C++"),
	PHP("Langage PHP");
	
	private String name = "";
	
	//constructeur
	Langage(String name){
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
}
