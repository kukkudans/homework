package com.sari.learn.java;

public class Sample1 {
	static int i;
	
	public static void main(String[] args) {
		//variable
		
		int j=20;
				i+=j;
		
				//if loop
		if(i!=j)
				System.out.println(i);
		else
			System.out.println("np");
		
		//input
		//odd or even
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter data");
		int a=sc.nextInt();
		if(a%2==0)
		System.out.println("Number is even");
		else
			System.out.println("Number is odd");
		
		//switch statement
		switch(a/2)
		{
		case 1:
			System.out.println("Switchcase1");
			break;
		case 2:
			System.out.println("Switchcase2");
			break;
	default:
			System.out.println("Switchanswer is nt 1 or 2");
		}
				
		//for loop
		for(i=1;i<=a;i++)
		{
			System.out.println("for loop number"+i);
		}
		
		//for loop array
		
		String[] color={"blue","green","yellow"};	
		for(String col:color)
		{
			System.out.println("Color is "+col);
		}
	
}
}