package frameCS;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import be.jl.cs.model.vaisseau.composant.ElementUnivers;
/**
 * 
 * @author jlengele
 * Cette classe est le premier element de boite de doialoqgue que je vais creer .
 * il va s'agir ici d'une boite de dialogue qui va s'ouvrir a la création d'un nouvel element, 
 * elle demandera confirmation si l'on veut creer l'element avec certain champs rempli par défaut
 * elle proposera d'entre une valeur et de confirmer la création de l'élement avec ces nouveau paremetre
 */
public class ElemDialog extends JDialog{

	private boolean sendData;
	private ElementUnivers elem = null;
	private JLabel resistanceChaleurLabel,resistancePerforationLAbel,resistancePressionLabel;
	private JTextField resistanceChaleurJTF,resistancePerforationJTF,resistancePressionJTF;
	
	
	public ElemDialog (JFrame parent,String title,boolean modal,ElementUnivers elem1){
		//On appele le consruteur de Jdialog correspondant
		super(parent,title,modal);
		this.elem = elem1;
		//on spécifie une taille
		this.setSize(400, 800);
		//la position
		this.setLocationRelativeTo(null);
		//la boite ne devra pas etre redimensionable
		this.setResizable(false);
		//on fini en effichant notre jdialog
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
//		this.setVisible(true);
		//pour leco moment tout ceci ressemble a la déclartion d'une JFrame
		this.initComponent();
	}
	
	public ElementUnivers showElemDialog(){
		this.sendData = false;
		this.setVisible(true);
		return this.elem;
	}
	
	public ElementUnivers getElem(){
		return elem;
	}
	
	private void initComponent(){
		
		JPanel panIcon = new JPanel();
		panIcon.setBackground(Color.white);
		
		//la resistance a la chaleur
		JPanel panResistChaleur = new JPanel();
		panResistChaleur.setBackground(Color.WHITE);
		panResistChaleur.setPreferredSize(new Dimension(200,300));
		resistanceChaleurJTF = new JTextField();
		resistanceChaleurJTF.setPreferredSize(new Dimension(100, 25));
		panResistChaleur.setBorder(BorderFactory.createTitledBorder("Resistance à la chaleur"));
		resistanceChaleurLabel = new JLabel("Saisir une temparature (°c)");
		panResistChaleur.add(resistanceChaleurLabel);
		panResistChaleur.add(resistanceChaleurJTF);	
		
		
		JPanel content = new JPanel();
		content.setBackground(Color.white);
		content.add(panResistChaleur);
		
		JPanel control = new JPanel();
		JButton okBouton = new JButton("OK");
		okBouton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				elem.setResistanceChaleur(Double.valueOf(resistanceChaleurJTF.getText()));
				setVisible(false);
			}
		});
		
		JButton cancelBouton = new JButton("Annuler");
		cancelBouton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		
		control.add(okBouton);
		control.add(cancelBouton);
		this.getContentPane().add(panIcon, BorderLayout.WEST);
		this.getContentPane().add(content, BorderLayout.CENTER);
		this.getContentPane().add(control, BorderLayout.SOUTH);
	}
}
