/**
 * 
 */
package org.cis.week1;

/**
 * 
 */
public class MyFirstClass {
	
	static PracticeQuestion pq = new PracticeQuestion();
	
	public MyFirstClass(int num3) {

		System.out.println("Inside Constructor " + num3);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		int numInt;
		String nameString;
		
		numInt = 0;
		nameString = "Rohit";
		
		System.out.println(numInt + " is of type: " + ((Object)numInt).getClass().getSimpleName());
		System.out.println(nameString + " is of type: " + ((Object)nameString).getClass().getSimpleName());
		
		float num1 = 20;
		float num2 = 5;
		
		float addition = num1 + num2;
		float sub = num1 - num2;
		float mul = num1 * num2;
		float div = num1/num2;
		
		System.out.println("Addition: " + addition);
		System.out.println("Subtraction: " + sub);
		System.out.println("Multiplication: " + mul);
		System.out.println("Division: " + div);
		
		MyFirstClass nfc = new MyFirstClass(4);
		
		//calling the method
		nfc.newMethod();
		addNum(10,5);
		subNum(75,25);
		mulNum(13,5);
		divNum(64,7);
		
		//pq.leapYear();
		//pq.randomNum();
		//pq.fibonacciSeries();
		//pq.factorial();
		pq.numMinMaxArray();

	}
	
	//Methods 
	static void newMethod() {
	    System.out.println("This is the method!!!");
	  }
	
	
	static void addNum(int num1, int num2) {
	    int num3 = num1 + num2;
	    System.out.println("This is from method, Add: "+num3);
	  }
	
	static void subNum(int num1, int num2) {
		int num3 = num1 - num2;
		System.out.println("This is from method, Sub: "+num3);
	  }
	
	static void mulNum(int num1, int num2) {
	    int num3 = num1 * num2;
	    System.out.println("This is from method, Mul: "+num3);
	  }
	
	static void divNum(float num1, float num2) {
		float num3 = num1/num2;
	    System.out.println("This is from method, Div: "+num3);
	  }

}

