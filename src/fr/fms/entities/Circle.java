package fr.fms.entities;

import java.awt.Graphics;

public class Circle<T> extends Shape<T>{

	private double radius;

	//constructor
	public Circle(double radius, T x, T y) {
		super(x, y);
		setRadius(radius);
	}

	public Circle(double radius, Point<T> center) {
		super(center);
		setRadius(radius);
	}


	//accessor
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius<0) {
			radius=1;
		}else {
			this.radius = radius;
		}

	}

	@Override
	public double area() {
		return Math.PI *this.radius*this.radius;
		//return super.area();
	}

	@Override
	public String toString() {
		return "Circle : radius=" + radius +" "+ super.toString();
	}

	@Override
	public void draw(Graphics g) {
		g.fillOval(((Double)getCenter().getX()).intValue(), ((Double) getCenter().getY()).intValue(), (int)radius*2, (int)radius*2);
		
	}
}
