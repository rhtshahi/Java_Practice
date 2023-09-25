/**
 * 
 */
package org.pcps.week2.MultipleInheritance;

/**
 * 
 */
public class Circle implements AreaCalculation{
	
	double radius, area;
	
	public Circle(float radius) {
		this.radius = radius;
		area = 0;
	}
	
	public void calculateAre() {
		
		this.area =  3.14 * (this.radius * this.radius);
		System.out.println("Area of Circle: " + this.area);
		
	}

}
