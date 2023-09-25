/**
 * 
 */
package org.pcps.week2.MultipleInheritance;

/**
 * 
 */
public class Rectangle implements AreaCalculation{
	
	double length,breadth, area;
	
	public Rectangle(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
		area = 0;
	}
	
	public void calculateAre() {
		
		this.area =  (this.length * this.breadth);
		System.out.println("Area of Rectangle: " + this.area);
		
	}

}
