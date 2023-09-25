/**
 * 
 */
package org.cis.week2;

/**
 * 
 */
public class InheritanceTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		
		st.setId(1);
		st.setName("Raju");
		st.setAddress("Kathmandu");
		st.setContact("9807898764");
		st.setSchoolname("PCPS");
		st.setClassname("BSC");
		st.setSection("A");
		
		System.out.println("Hello "+st.getName()+". Your ID is "+st.getId()+". You study at "+st.getSchoolname()+".");;

	}

}
