/**
 * 
 */
package org.pcps.week2.MultipleInheritance;

/**
 * 
 */


public class InheritanceTester {
	
	public static void main(String[] args)
	{
		System.out.println("----From First Implementor----");
		Implementor1 imp1 = new Implementor1(5, 2);
		imp1.add();
		imp1.substract();
		System.out.println("----------------------------");
		System.out.println("----From Second Implementor----");
		Implementor2 imp2 = new Implementor2(9, 2, 4);
		imp2.add();
		imp2.substract();
		
		System.out.println("----------------------------");
	}
}

