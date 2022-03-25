package fr.fms.entities;

import java.awt.Graphics;


public abstract class Shape {
	private Point center;

	public Shape(int x, int y) {
		this.center = new Point(x, y);
	}

	public Shape(Point center){
		this.center = new Point(center.getX(), center.getY());
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}



	public double area() {
		return 0;
	}
	
	public void drawShape() {
		
	}

	@Override
	public String toString() {
		return "Shape [center = " + center + "]";
	}




}
