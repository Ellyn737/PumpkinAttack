package src;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;

/**
 * 
 * Zuletzt bearbeitet: 29.11.2016 (Ellyn)
 *
 * @author Ellyn & Tara
 * 
 * setzt alles
 *
 */
public class PumpkinAttackView extends JFrame {
	private Pumpkin pumpkin = new Pumpkin();
	private PumpkinAttackPanel panel;
	
	public PumpkinAttackView(){
		
		// ScreenSize zuordnen
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Settings.SCREEN_SIZE_WIDTH = (int) screenSize.getWidth();
		Settings.SCREEN_SIZE_HEIGHT = (int) screenSize.getHeight();
		
		//Panel hinzufuegen
		panel = new PumpkinAttackPanel();
		add(panel);
		
		setTitle("PUMPKIN ATTACK");
		setSize(Settings.SCREEN_SIZE_WIDTH, Settings.SCREEN_SIZE_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
	}
	
	
	public void updateView(ArrayList<Rectangle> bats, ArrayList<Rectangle> sweets, Rectangle pumpkin){
		panel.updatePanel(bats, sweets, pumpkin);
		setVisible(true);
	}
	
}
