package frameCS;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	
  public MainFrame(){
	  
	    this.setTitle("Welcome on  Space Batlleship Fight");
	    this.setSize(400, 500);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    this.setVisible(true);
//	    this.setLocation(20, 20);
	    this.setResizable(true);
	    
	    ajoutContentPanelGraphic();
  }
  
  public void ajoutContentPanel(){
	  
	  //Instanciantion d'un objet Jpanel
	  JPanel pan = new JPanel();
	  //definition de sa couleur de fond
	  pan.setBackground(Color.BLUE);
	  // on prévien  notre Jframe que pan seras son ContentPanel
	  this.setContentPane(pan);
	  this.getContentPane().setVisible(true);
	  
  }
  	   
  public void ajoutContentPanelGraphic(){
	  	  this.setContentPane(new Panneau());
  }
}
