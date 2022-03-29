
package fr.fms.job;

import javax.swing.JFrame;

import java.awt.Graphics;

import fr.fms.entities.Circle;
import fr.fms.entities.Point;
import fr.fms.entities.Square;


public class TestJobFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private IJobImpl<Double> shapesJobImpl = null;
	
	public TestJobFrame()  {
		setTitle("Voici nos formes de poire !");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setVisible(true);
		
		 shapesJobImpl = new IJobImpl<Double>();
	}
	
	@Override 
	public void paint(Graphics g) { //méthode appelée à  chaque redimensionnement de la fenêtre
		super.paint(g);
		if(shapesJobImpl != null) 		shapesJobImpl.drawShapes(g);
		//2 : a  chaque redimensionnement de la fenêtre, afficher toutes les formes 
	}	
		
	public static void main(String[] args) {
		
		Circle<Double> c1 = new Circle<Double>(20 , 30.5, 50.7);	
		Point<Double> p = new Point<Double>( 100.9 , 150.3);
		Circle<Double> c2 = new Circle<Double>(15 , p);		
		Square<Double> s1 = new Square<Double>(50 , 200.5 , 200.3);	
		Square<Double> s2 = new Square<Double>(65, 200.2 , 50.1);		
		Circle<Double> c3 = new Circle<Double>(30 , 300.8 , 300.7);
		
		TestJobFrame frameApp = new TestJobFrame();	
		
		IJobImpl<Double> job=frameApp.getShapesJob();
		job.addShape(1,c1);
		job.addShape(2,c2);
		job.addShape(3,s1);
		job.addShape(4,s2);
		job.addShape(5,c3);

		
		job.displayAll();
		System.out.println("---------------------------------");
		job.squaresPerimeter();
		

	
	}
	public IJobImpl<Double> getShapesJob() {
		return shapesJobImpl;
	}
	
}
