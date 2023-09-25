package org.pcps.week2.MultipleInheritance;



public class Implementor1 implements Calculation{
	int firstnum, secondnum, result;
	
	public Implementor1(int first, int second)
	{
		this.firstnum=first;
		this.secondnum=second;
		result=0;
	}
	
	public void add()
	{
		this.result=this.firstnum + this.secondnum;
		System.out.println("Result of addition: " + this.result);
	}
	
	public void substract()
	{
		this.result=this.firstnum - this.secondnum;
		System.out.println("Result of substraction: " + this.result);
	}
}

