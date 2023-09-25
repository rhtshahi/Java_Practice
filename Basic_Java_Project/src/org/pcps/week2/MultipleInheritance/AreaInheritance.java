/**
 * 
 */
package org.pcps.week2.MultipleInheritance;

/**
 * 
 */
public class AreaInheritance {
	
	public static void main(String[] args)
	{
		System.out.println("----Area of Circle----");
		Circle circ1 = new Circle(5);
		circ1.calculateAre();
		System.out.println("----------------------------");
		System.out.println("----Area of Square----");
		Square sq1 = new Square(13);
		sq1.calculateAre();
		System.out.println("----------------------------");
		System.out.println("----Area of Rectangle----");
		Rectangle rect1 = new Rectangle(13,3);
		rect1.calculateAre();
		System.out.println("----------------------------");
	}

}
