/**
 * Programme permettant l'affichage de plusieurs formes g�om�triques
 * 
 * @author El babili - 2022
 * 
 */

package fr.fms.graphic;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;

import fr.fms.entities.Circle;
import fr.fms.entities.Shape;
import fr.fms.entities.Square;

public class Graphic extends JFrame {
	private static final long serialVersionUID = 1L;

	private Map<Integer, Shape> shapes = new HashMap<Integer, Shape>();

	public Map<Integer, Shape> getShapes() {
		return shapes;
	}

	public void setShapes(Map<Integer, Shape> shapes) {
		this.shapes = shapes;
	}

	public Graphic(Map<Integer, Shape> shapes) throws HeadlessException {
		super("Voici nos formes de poire !");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setVisible(true);
		this.shapes = shapes;
	}

	public Graphic() {
		super("Voici nos formes poires !");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) { // le rep�re x,y commence en haut � gauche (0,0)
		super.paint(g);
		
		for (Shape s : shapes.values()) {
			if (s!=null) {
				s.drawShape(g);
			}
		}

		/*
		 * for (Shape s : shapes.values()) { if (s instanceof Square) {
		 * g.fillRect(s.getCenter().getX(), s.getCenter().getY(), 50, 50); } else if (s
		 * instanceof Circle) { g.fillOval(s.getCenter().getX(), s.getCenter().getY(),
		 * 30, 30); }
		 * 
		 * }
		 */
//		g.fillOval(50, 50, 35, 35);	// x , y , largeur , hauteur (diam�tre)
//		g.drawOval(150, 50, 45, 70);
//		g.drawRect(50, 150, 50, 50);
//		g.fillRect(150, 150, 70, 50);		

//		Graphics2D g2d = (Graphics2D)g;
//		g2d.setPaint( new GradientPaint(0, 0, Color.GREEN, 50, 50, Color.RED, true));
//		g2d.fillRect(250, 50, 70, 50);		
//		
//		g2d.fillOval(250,150,55,55);		
	}

	public static void main(String[] args) {
		//new Graphic();
	}
}
