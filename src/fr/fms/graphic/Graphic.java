/**
 * Programme permettant l'affichage de plusieurs formes g�om�triques
 * 
 * @author El babili - 2022
 * 
 */

package fr.fms.graphic;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import fr.fms.entities.Shape;


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



	@Override
	public void paint(Graphics g) { // le repère en haut à gauche (0,0)
		super.paint(g);
		
		for (Shape s : shapes.values()) {
			if (s!=null) {
				s.drawShape(g);
			}
		}

	
	}

	public static void main(String[] args) {
	}
}
