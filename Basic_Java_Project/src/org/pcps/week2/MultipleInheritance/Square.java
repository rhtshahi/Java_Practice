/**
 * 
 */
package org.pcps.week2.MultipleInheritance;

/**
 * 
 */
public class Square implements AreaCalculation{
	
	double length, area;
	
	public Square(float length) {
		this.length = length;
		area = 0;
	}
	
	public void calculateAre() {
		
		this.area =  (this.length * this.length);
		System.out.println("Area of Square: " + this.area);
		
	}

}