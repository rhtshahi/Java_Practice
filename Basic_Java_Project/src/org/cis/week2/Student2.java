/**
 * 
 */
package org.cis.week2;

/**
 * 
 */


public class Student2 extends Person2{

	/**
	 * This class contains the definition of a student
	 */
	
	String schoolname;
	String classname;
	String section;
	
	public Student2(
			int id, String name, String address, String contact,
			String school_name, String class_name, String section
			) {
		// TODO Auto-generated constructor stub
		
		super(id,name,address,contact);
		this.schoolname=school_name;
		this.classname=class_name;
		this.section=section;
	}
	
	public String getSchoolname()
	{
		return this.schoolname;
	}
	
	public String getClassname()
	{
		return this.classname;
	}
	
	public String getSection()
	{
		return this.section;
	}
}

