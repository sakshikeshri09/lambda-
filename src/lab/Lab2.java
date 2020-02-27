package lab;

import java.util.Scanner;

public class Lab2 {
		
	public static void main(String[] args) {
		
		Lab2Class objclass=new Lab2Class();
			Lab2Interface obji=objclass::method;
			
			System.out.println("enter a string");	
			Scanner s=new Scanner(System.in);
			String a=s.nextLine();
	
	
	obji._abstractMethod(a);
			
		
	}
}
