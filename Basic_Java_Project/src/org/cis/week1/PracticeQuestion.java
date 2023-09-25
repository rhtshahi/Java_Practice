/**
 * 
 */
package org.cis.week1;

import java.util.*;  


/**
 * 
 */
public class PracticeQuestion {

	/**
	 * @param args
	 */
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	
	//Leap Year
	static void leapYear() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Year: ");
		
		int year = sc.nextInt();
		
		if(year % 400 == 0 && year % 100 !=0 || year % 4 == 0) {
			System.out.println("It is leap Year!!!");
		}
		
		else {
			System.out.println("It is not leap Year!!!");
		}
				
	}
	
	//Random number guessing game
	static void randomNum() {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int randomNum = rand.nextInt(10);
		//int randomNum = 5;
		System.out.print("Enter Number between 0 and 9: ");
		int num = sc.nextInt();
		
		if (num != randomNum) {
			
			while(num != randomNum) {
				System.out.print("INCORRECT. The Number was: "+ randomNum +". Guess Again: ");
				 num = sc.nextInt();
				 
				 if (num == randomNum) {
					 System.out.print("CORRECT!!!");
				 }
				
			}
			
		}
		
		else {
			
			System.out.print("CORRECT!!!");
			
		}
	
		
	}
	
	
	static void fibonacciSeries() {
		
		int n, n1 = 0, n2 = 0, n3 = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("How many numbers do you want in Fibonacci Series?: ");
        n = s.nextInt();
        System.out.print("Fibonacci Series:");
        for(int i = 1; i <= n; i++)
        {
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
            System.out.print(n1+" ");
        }
	}
	
	
	static void factorial() {
		
		Scanner s = new Scanner(System.in);
		
		int n1 = 1;
		int f1 = 1;
		
		
		System.out.print("Enter a number: ");
		int num = s.nextInt();
		
		if(num == 0) {
			System.out.println("0! = 1");
		}
		
		else {
			
			while(n1<=num) {
				f1 = f1 * n1;
				n1++;
			}
			System.out.println(num + "! = "+f1);
			
		}
	}
	
	static void numMinMaxArray() {
		
		int n, max, min;
		
		int[] arr1 = {9, 12, -3, 14, 5, 6, 20, 0, -22};
		
		n = arr1.length;	
		
		Arrays.sort(arr1);
		
		for (int num : arr1) {
            System.out.print(num + " ");
        }
		
		min = arr1[0];
		max = arr1[n-1];
		
		System.out.print("\n Highest Number: " + max);
		System.out.print("\n Lowest Number: " + min);
		
	}

	
	
	
}
