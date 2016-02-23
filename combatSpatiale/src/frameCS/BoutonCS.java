package frameCS;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class BoutonCS extends JButton implements MouseListener{

	private String name;
	
	public BoutonCS(String nom){
		super(nom);
		this.name = nom;
		//Dans le constructeur je rajoute un mouselistener, pour mettre l'objet a l'écoute d'un évenement de souris sur lui
		this.addMouseListener(this);
	}
	
	public void paintComponent(Graphics g){
		
		Graphics2D g2d = (Graphics2D) g;
		GradientPaint gp = new GradientPaint(0, 0,Color.blue, 0 ,20,Color.cyan,true );
		g2d.setPaint(gp);
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		g2d.setColor(Color.RED);
		g2d.drawString(this.name, this.getWidth() / 2 -	(this.getWidth()/ 2 /4), (this.getHeight() / 2) + 5);
		
	}

	@Override
	//appelé lors du clic
	public void mouseClicked(MouseEvent event) {
		
	}

	@Override
	//appelé lorsdu survol
	public void mouseEntered(MouseEvent event) {
		/** Explication de setToolTipText
		 * affiche une petite fenetre d'info au survol de la souris		 * 
		 * */
		this.setToolTipText("Je survol mon bouton" + this.getWidth());
	}

	@Override
	//appelé lorsque la souris sors du bouton.
	public void mouseExited(MouseEvent event) {
		
	}

	@Override
	//clic gauche
	public void mousePressed(MouseEvent event) {
		
	}

	@Override
	//clic droit
	public void mouseReleased(MouseEvent arg0) {
		
	}
}
