package frameCS;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class PanelHelper extends JFrame{

	private static GUIConnector guiConnector;
	
	static GUIConnector getGuiConnector(){
		System.out.println("is it thread safe? " + SwingUtilities.isEventDispatchThread());
		return guiConnector;
	}	
	static void setConnector(GUIConnector connector) {
		guiConnector = connector;	
	}
}
