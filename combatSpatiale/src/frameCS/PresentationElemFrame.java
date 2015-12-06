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

public class PresentationElemFrame extends JFrame{

	//Cr�aton des �l�ment
	private JPanel contentPan = new JPanel();
	private JPanel panDroite = new JPanel();
	private JPanel panGauche = new JPanel();
	
	//je doit cr�e un Panel qui contiandra 2jlabel 
	private JPanel panNomElement = new JPanel();
	private JLabel labNom = new JLabel("Nom de l'�l�ment");
	private JTextField labNewNom = new JTextField();
	
	private JPanel panPoidMiliGrammes = new JPanel();
	private JLabel lanPoidMiliGrammes = new JLabel("Poids de l'�l�ment(mg)");
	private JTextField labNewPoidMiliGrammes = new JTextField();
	
	private JButton bCreerNouvelElement = new JButton("creer element"); 
	
	//creation d'un panel qui servira dans la fenetre comme panneau de console
	private JPanel stackFrame = new JPanel();
	private JLabel labStackFrame = new JLabel();
	
	
	private JFormattedTextField ftxtfieldPoid = new JFormattedTextField(NumberFormat.getNumberInstance());
	
	public PresentationElemFrame(){
		
		//position et gestion de l'�l�ment stackframe
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
				
				ElementUnivers elem = null;
				
				elem = new ElementUnivers(labNewNom.getText(),Double.valueOf(ftxtfieldPoid.getText()));
				
				labNewNom.setText("");
				ftxtfieldPoid.setText("");
				
				System.out.println("un nouvel element a �t� cr�e : " + elem.getNom() + " et son poid est de " + elem.getPoidGrammes() + " mg par unit�");
				contentPan.add(stackFrame);
				labStackFrame.getBaselineResizeBehavior();
				labStackFrame.setText("un nouvel element a �t� cr�e : " + elem.getNom() + " et son poid est de " + elem.getPoidGrammes() + " mg par unit�");
				
			}
		});
		
		this.setTitle("Cr�ation d'un nouvel elementUnivers");
		this.setSize(400, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.setContentPane(contentPan);
		this.setVisible(true);
	}
}
