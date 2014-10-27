package be.jlengele.chap6Exception.main;

import be.jlengele.chap6Exception.exception.NombreHabitantException;
import be.jlengele.chap6Exception.model.Ville;

public class TestChap6Main {

	public static void main(String[] args) {
		
		try{
			Ville v = new Ville("Jumet", -1000,"Belgique");
			System.out.println(v.toString());
		}catch (NombreHabitantException e){
			System.out.println("ERROR");
		}
	}

}
