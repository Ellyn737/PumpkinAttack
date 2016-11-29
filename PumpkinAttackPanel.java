package src;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.JPanel;

/**
 * 
 * Zuletzt bearbeitet: 29.11.2016 (Ellyn)
 *
 * @author Ellyn & Tara
 * 
 * Hintergrund wird erstellt
 * Himmel, Boden, BatsArray, pumpkin, alles was vorkommen soll
 *
 */
public class PumpkinAttackPanel extends JPanel{
	private Rectangle background = new Rectangle(0, 0, Settings.SCREEN_SIZE_WIDTH, Settings.SCREEN_SIZE_HEIGHT);
	private Rectangle ground = new Rectangle(0, Settings.SCREEN_SIZE_HEIGHT - Settings.GROUND_HEIGHT, Settings.SCREEN_SIZE_WIDTH, Settings.GROUND_HEIGHT);
	private ArrayList<Rectangle> bats = new ArrayList<>();
	private ArrayList<Rectangle> sweets = new ArrayList<>();
	private Rectangle pumpkin = new Rectangle(Settings.SCREEN_SIZE_WIDTH/2, Settings.SCREEN_SIZE_HEIGHT-Settings.GROUND_HEIGHT, 100, 100);
	
	public PumpkinAttackPanel(){
		repaint();
	}
	
	//Reihenfolge beim Malen beachten
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		//Himmel
		g.setColor(new Color(162, 210, 229));
		g.fillRect(background.x, background.y, background.width, background.height);
		
		//Boden
		g.setColor(new Color(141, 85, 52));
		g.fillRect(ground.x, ground.y, ground.width, ground.height);
		
		//Fledermaeuse
		g.setColor(new Color(0, 43, 69));
		for(Rectangle r: bats){
			g.fillRect(r.x, r.y, r.width, r.height);
		}
		
		//Suessigkeiten
		g.setColor(new Color(255, 37, 203));
		for(Rectangle s: sweets){
			g.fillRect(s.x, s.y, s.width, s.height);
		}
		
		//Kuerbis
		g.setColor(new Color(255, 125, 52));
		g.fillRect(pumpkin.x, pumpkin.y, pumpkin.width, pumpkin.height);
		
	}
	
	public void updatePanel(ArrayList<Rectangle> bats, ArrayList<Rectangle> sweets, Rectangle pumpkin){
		this.bats = bats;
		this.sweets = sweets;
		this.pumpkin = pumpkin;
		repaint();
	}
	
	
	
}
