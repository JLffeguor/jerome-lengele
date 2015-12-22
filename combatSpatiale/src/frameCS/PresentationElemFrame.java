package frameCS;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import be.jl.cs.model.vaisseau.composant.ElementUnivers;

@SuppressWarnings("serial")
public class PresentationElemFrame extends JFrame{

	//Créaton des élément
	private JPanel contentPan = new JPanel();
	private JPanel panDroite = new JPanel();
	private JPanel panGauche = new JPanel();
	
	//je doit crée un Panel qui contiandra 2jlabel 
	private JPanel panNomElement = new JPanel();
	private JLabel labNom = new JLabel("Nom de l'élément");
	private JTextField labNewNom = new JTextField();
	
	private JPanel panPoidMiliGrammes = new JPanel();
	private JLabel lanPoidMiliGrammes = new JLabel("Poids de l'élément(mg)");
	private JTextField labNewPoidMiliGrammes = new JTextField();
	
	private JButton bCreerNouvelElement = new JButton("creer element"); 
	
	//creation d'un panel qui servira dans la fenetre comme panneau de console
	private JPanel stackFrame = new JPanel();
	private JLabel labStackFrame = new JLabel();
	
	private ElementUnivers elem = null;
	
	private JFormattedTextField ftxtfieldPoid = new JFormattedTextField(NumberFormat.getNumberInstance());
	
	public PresentationElemFrame(){
		
		//position et gestion de l'élément stackframe
		stackFrame.setSize(this.getWidth(), 10);
		stackFrame.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		stackFrame.add(labStackFrame);
		
		//position de element concernant le nom
		labNewNom.setHorizontalAlignment(JLabel.RIGHT);
		labNewNom.setPreferredSize(new Dimension(220, 20));
		labNewNom.setBorder(BorderFactory.createLineBorder(Color.black));
		panNomElement.add(labNom,BorderLayout.WEST);
		panNomElement.add(labNewNom, BorderLayout.EAST);
		contentPan.add(panNomElement);
		
		//position des element concernant le poids
		ftxtfieldPoid.setHorizontalAlignment(JLabel.RIGHT);
		ftxtfieldPoid.setPreferredSize(new Dimension(220, 20));
		ftxtfieldPoid.setBorder(BorderFactory.createLineBorder(Color.black));
		panPoidMiliGrammes.add(lanPoidMiliGrammes,BorderLayout.WEST);
		panPoidMiliGrammes.add(ftxtfieldPoid, BorderLayout.EAST);
		contentPan.add(panPoidMiliGrammes);
		
		bCreerNouvelElement.setSize(40, 20);
		contentPan.add(bCreerNouvelElement);
		
		bCreerNouvelElement.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				ElementUnivers elemTemp = null;
				String nomElement = null;Double poidElement = 0.0;
				
				try{
					nomElement = labNewNom.getText();
					poidElement = Double.valueOf(ftxtfieldPoid.getText());
					labStackFrame.setVisible(false);
				}catch(NumberFormatException e){
					System.out.println(e.getCause());
					labStackFrame.setVisible(true);
					labStackFrame.setText("une erreur c'est produite");
					nomElement = "";
					poidElement = 0.0;
					
				}
				elem = new ElementUnivers(nomElement, poidElement);
				ElemDialog eDia = new ElemDialog(null, "Etes-vos certain de vouloir creer cet élément ?", true, elem);
				elem.setResistanceChaleur(eDia.getElem().getResistanceChaleur());
				eDia.showElemDialog();
				labNewNom.setText("");
				ftxtfieldPoid.setText("");
				
				System.out.println("un nouvel element a été crée : " + elem.getNom() + " et son poid est de " + elem.getPoidGrammes() + " mg par unité" 
								+ " et sa résistance a la chaleur est de " + elem.getResistanceChaleur() + "°C");
				contentPan.add(stackFrame);
//				labStackFrame.getBaselineResizeBehavior();
				
				
			}
		});
		
		this.setTitle("Création d'un nouvel elementUnivers");
		this.setSize(800, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.setContentPane(contentPan);
		this.setVisible(true);
	}
}
