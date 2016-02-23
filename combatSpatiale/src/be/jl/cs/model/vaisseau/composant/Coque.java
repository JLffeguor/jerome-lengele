package be.jl.cs.model.vaisseau.composant;

import java.util.LinkedList;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.dom4j.tree.BaseElement;

import be.jl.cs.exception.BlindageException;
import be.jl.cs.model.BaseEntity;
import be.jl.cs.tools.DataTools;
/**
 * 
 * @author jlengele
 *Coque du vaisseau, compos�e de couche(Blindage) de diff�rent alliage et de diff�rente �paisseur
 */
@Entity
@Table(name = "T_COQUE")
public class Coque extends BaseEntity{

	
	private LinkedList<Blindage> listBlindage = new LinkedList<Blindage>();
	
	public Coque(){
	}
	
	public LinkedList<Blindage> getCoques() {
		return listBlindage;
	}

	public void ajouterBlindage (Blindage b) throws BlindageException{
		if(b == null) throw new BlindageException("L'objet blindage est vide");
		listBlindage.add(b);
	}
	
	public Double getPoidCoque(){
		
		/**TODO faire un for each pour additionner tout les poid des blindage*/
		
		return 0.0;
	}
	
	public StringBuffer presenterCoques(){
		
		StringBuffer retour = new StringBuffer();
		int i = 0;
		retour.append("\n---------COQUE---------\n");
		
		for(Blindage blindage : listBlindage){
			i++;
			retour.append("Blindage n� " + i
					+ "\n\t�paisseur(mm) : " + String.valueOf(blindage.getEpaisseurMM()) 
					+ "\n\tSurface(cm�) : " + String.valueOf(blindage.getSurface())
					+ "\n\t\t�l�m�nt : " + String.valueOf(blindage.getMateriel().getNom())
					+ "\n\t\t\tPoid du blindage : " + String.valueOf(blindage.poidBlindageKg() + "kg")
					+ "\n\t\t\tSa r�sistance a la pression est de : " + DataTools.doubleToString(blindage.resistancePressionBlindage())
					+ "\n\t\t\tSa r�sistance a la chaleur est de : " + String.valueOf(blindage.getMateriel().getResistanceChaleur())
					+ "\n\t\t\tSa r�sistance a la perforation est de : " + DataTools.doubleToString(blindage.resistancePerforationBlindage())
					);
		}
		return retour;
	}
}
