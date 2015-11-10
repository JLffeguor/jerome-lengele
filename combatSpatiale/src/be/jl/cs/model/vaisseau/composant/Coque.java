package be.jl.cs.model.vaisseau.composant;

import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.LinkedList;
import be.jl.cs.exception.BlindageException;
import be.jl.cs.tools.DataTools;
/**
 * 
 * @author jlengele
 *Coque du vaisseau, compos�e de couche(Blindage) de diff�rent alliage et de diff�rente �paisseur
 */

public class Coque {

	private LinkedList<Blindage> listBlindage = new LinkedList<Blindage>();
	private int i = 0;
	
	
	public Coque(){
	}
	
	public LinkedList<Blindage> getCoques() {
		return listBlindage;
	}

	public void ajouterBlindage (Blindage b) throws BlindageException{
		if(b == null) throw new BlindageException("L'objet blindage est vide");
		listBlindage.add(b);
	}
	
	public StringBuffer presenterCoques(){
		
		StringBuffer retour = new StringBuffer();
		
		retour.append("\n---------COQUE---------\n");
		
		for(Blindage blindage : listBlindage){
			i++;
			retour.append("Blindage n� " + i
					+ "\n\t�paisseur(mm) : " + String.valueOf(blindage.getEpaisseurMM()) 
					+ "\n\tSurface(cm�) : " + String.valueOf(blindage.getSurface())
					+ "\n\t\t�l�m�nt : " + String.valueOf(blindage.getMateriel().getNom())
					+ "\n\t\t\tIl est compos� � " + String.valueOf(blindage.getMateriel().getPrctDeComposition()) +"% de cet �l�ment"
					+ "\n\t\t\tPoid du blindage : " + String.valueOf(blindage.poidBlindageKg() + "kg")
					+ "\n\t\t\tSa r�sistance a la pression est de : " + DataTools.doubleToString(blindage.resistancePressionBlindage())
					+ "\n\t\t\tSa r�sistance a la chaleur est de : " + String.valueOf(blindage.getMateriel().getResistanceChaleur())
					+ "\n\t\t\tSa r�sistance a la perforation est de : " + DataTools.doubleToString(blindage.resistancePerforationBlindage())
					);
		}
		return retour;
	}
}
