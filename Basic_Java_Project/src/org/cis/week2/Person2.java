/**
 * 
 */
package org.cis.week2;

/**
 * 
 */


public class Person2 {
	int id;
	String name;
	String address;
	String contact;
	
	public Person2(
			int id, String name, String address, String contact
			)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.contact=contact;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}

}

