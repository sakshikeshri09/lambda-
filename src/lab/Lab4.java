package lab;

import java.util.Scanner;

public class Lab4 {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void newMethod(Lab4 obj,String name)
	{
		
		System.out.println("this is an example of instance creation "+name);
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		Lab4 obj =new Lab4();
		
		System.out.println("enter the name ");
		Scanner s=new Scanner(System.in);
		String n=s.next();
		obj.setName(n);
		
		//create the interface reference
		Lab4Interface interfaceref=new Lab4()::newMethod;
		
		//calling the interface method
		
		interfaceref._method(obj,n);
		
	}
	
	
	
}
