/**
 * 
 */
package org.cis.week2;

/**
 * 
 */


public class InheritanceTester2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 hari = new Student2(1,"Hari","Bharatpur",
				"12345","PCPS","BSC","A");
		System.out.println("Hello " + hari.getName() + "!!!");
		System.out.println("Your id: " + hari.getId());
		System.out.println("You live in " + hari.getAddress());
		System.out.println("Your contact is " + hari.getContact());
		System.out.println("You study at " + hari.getSchoolname());
		System.out.println("Your study in class " + hari.getClassname());
		System.out.println("Your Section is " + hari.getSection());
	}

}
