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


import fr.fms.entities.Shape;


public class Graphic extends JFrame {
	private static final long serialVersionUID = 1L;

	public Graphic() {
		super("Chalut !");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) { // le repère commance en haut à gauche (0,0)
		super.paint(g);
		
		/*
		 * for (Shape s : job) { s.drawShape(g); }
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
