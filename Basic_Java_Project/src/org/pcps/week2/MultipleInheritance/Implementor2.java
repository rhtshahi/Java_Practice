package org.pcps.week2.MultipleInheritance;




public class Implementor2 {
	int firstnum, secondnum, thirdnum, result;
	
	public Implementor2(int first, int second, int third)
	{
		this.firstnum = first;
		this.secondnum = second;
		this.thirdnum = third;
		this.result = 0;
	}
	
	public void add()
	{
		this.result = this.firstnum + this.secondnum + this.thirdnum;
		System.out.println("Result of addition: " + this.result);
	}
	
	public void substract()
	{
		this.result = this.firstnum - this.secondnum - this.thirdnum;
		System.out.println("Result of substraction: " + this.result);
	}
}

