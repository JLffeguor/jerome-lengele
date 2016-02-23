package frameCS;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	
	private JPanel jpan = new JPanel();
	private JButton bouton = new BoutonCS("Mon premier bouton");
	private JPanel 	container = new JPanel();
	private Panneau pan = new Panneau();	
	private JLabel label = new JLabel();
	private int compteur = 0;
	
	
	
  public MainFrame(){
	  
	  
	  this.setTitle("Welcome On Batleship fight");
	  this.setSize(300, 300);
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  this.setLocationRelativeTo(null);
	  label.setText("Welcome into the game");
	  
	  container.setBackground(Color.WHITE);
	  container.setLayout(new BorderLayout());
	  container.add(pan,BorderLayout.CENTER);
	  
	  /**
	   * utilisation da la classe interne
	   * */
//	  /*Utilisation de la classe intenre*/
//	  bouton.addActionListener(new BoutonListener());
	  
	  /**
	   * utilisation d'une classe anonyme ( anonymous inner class)
	   * */
	  /*idem que precedent mais avec une classe anonyme*/
	  bouton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			label.setText("Vous avez cliqué sur le bouton 1");
		}
	});
	  
	  container.add(bouton,BorderLayout.SOUTH);
	  container.add(label,BorderLayout.NORTH);
	  this.setContentPane(container);
	  this.setVisible(true);
	  go();
  
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
  
  public void testBouton(){
	  
	  //2 possibilité pour instancié un bouton
	  
	  //1 - instancation avec le libellé
	  
	  
	  //2 - instanciation sans libellé, et on l'ajoute avec la méthode settext()
	  JButton bouton2 = new JButton();
	  bouton2.setText("Mon deuxième bouton");
	  
	  //ajout du bouton dans le contentPane de la jframe
//	  jpan.add(bouton);
	  
	  //gestion du positionement des element avet le BorderLayout
	  this.setLayout(new BorderLayout());
	  this.getContentPane().add(bouton,BorderLayout.EAST);
	  this.getContentPane().add(bouton2,BorderLayout.CENTER);
	  
	  this.setVisible(true);
	  
  }
  
  public void go(){
	  //On commence par les coordonnée de départ de notre rond
	  int x = pan.getPosX(), y = pan.getPosY();
	  //on défini un boolean pour savoir si on recule ou pas dans la fenetre sur l'axe X
	  boolean backX = false;
	  //on défini un boolean pour savoir si on doit aussi reculer ou pas dans la fenetre sur l'axe Y
	  boolean backY = false;
	  
	  //pour l'exemple , un boucle While est utilisée
	  while(true){
		  //si la coordonnée x est < 1 on avance
		  if(x < 1) backX=false;
		  // si la coordonnée x est supérieur a la taille du panneau moins celle du rond, on recule
		  if(x > pan.getWidth()-50) backX = true;
		  //idem pour y
		  if(y < 1) backY=false;
		  if(y > pan.getHeight()-50) backY = true;
		  
		  
		  //si on avance, on incrémente la coordonnée x
		  if (!backX) pan.setPosX(++x);
		  else pan.setPosX(--x);
		  //idem Y
		  if (!backY) pan.setPosY(++y);
		  else pan.setPosY(--y);
		  
		  //on redessine le panneau
		  pan.repaint();
		  //on fait vite une petite pose de quelque millisecondes
		  try{
			  Thread.sleep(3);
		  }catch(InterruptedException e){
			  e.printStackTrace();
		  }
	  }
  }

//@Override
//	/**
//	 * Méthode qui seras appelée lors d'un clis sur le bouton
//	 * */
//	public void actionPerformed(ActionEvent e) {
//	/**
//	 * getSource sur un event permet si jamais il y a plusieur bouton d'exécuter 2 action différent ( une par élément)
//	 * */
//	if (e.getSource() == bouton)
//	{
//	this.compteur++;
//	label.setText("Welcome into the game" + compteur);
//	}
//}
	/**
	 * afin d'utiliser au mieux l'orienté objet et le polymorphisme, on crée une classe interne uniquement pour écouter la variable Bouton*/
	class BoutonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText("Vous avez cliqué sur le bouton 1");
			
		}
		
	}
	
}