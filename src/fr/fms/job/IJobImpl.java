package fr.fms.job;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import fr.fms.entities.Shape;
import fr.fms.entities.Square;
import fr.fms.graphic.Graphic;


public class IJobImpl implements IJob {
	private Map<Integer, Shape> shapes;
	
	public IJobImpl() {
		shapes = new HashMap<>();
	}
	
	@Override
	public void addShape(int id, Shape shape) {
		shapes.put(id,  shape);
	}
	
	@Override
	public void deleteShape(int id) {
		shapes.remove(id);
	}
	
	@Override
	public Shape getShapeById(int id) {
		return shapes.get(id);
	}
	
	@Override
	public void moveShape(int id, int x, int y) {
		Shape shape = shapes.get(id);
		
		shape.getCenter().setX(x);
		shape.getCenter().setY(y);
	}
	
	@Override
	public void drawShape() {
		new Graphic(getShapes());

	}
	
	public Map<Integer, Shape> getShapes() {
		return shapes;
	}

	@Override
	public void displayAll() {
		for(Shape s : shapes.values()) {
			System.out.println(s);
		}
	}
	
	public void squaresPerimeter() {
		Iterator<Shape> it = shapes.values().iterator();
		while(it.hasNext()) {
			Shape shape = it.next();
			if(shape instanceof Square) {
				System.out.println(shape + " périmètre = " + ((Square)shape).perimeter());
			}
		}
	}

}
