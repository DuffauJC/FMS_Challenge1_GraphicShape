package fr.fms.entities;

import java.awt.Graphics;

public class Circle extends Shape{

	private double radius;

	//constructor
	public Circle(double radius, int x, int y) {
		super(x, y);
		setRadius(radius);
	}

	public Circle(double radius, Point center) {
		super(center);
		setRadius(radius);
	}


	public Circle() {
		super(1, 1);
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
	
	
	public void drawShape(Graphics g) {
		g.fillOval(getCenter().getX(), getCenter().getY(), (int)Math.sqrt(area()), (int)Math.sqrt(area()));
	}

	@Override
	public String toString() {
		return "Circle : radius=" + radius +" "+ super.toString();
	}




}
