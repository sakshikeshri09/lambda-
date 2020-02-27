package lab;

import java.util.Scanner;

public class Lab5 {

	public void factorial(int n)
	{
		if(n==1||n==0)
		{
			System.out.println("factorial of the number is "+1);
		}
		
		else { 
			
		int fact=1;
		
		for (int i = 1; i <=n; i++) {
			fact*=i;
		}

		System.out.println("factorial of the number is "+fact);
		
		}
	}
	
	public static void main(String[] args) {
		
		Lab5 obj=new Lab5();
		
		System.out.println("enter a number ");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		
		
		// lambda function
		//by creating the interface reference
		
		Lab5Interface interfaceobj=obj::factorial;
		interfaceobj._abstractMethod(num);
	}
	
	
}
