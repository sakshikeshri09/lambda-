package lab;

import java.util.Scanner;

public class Lab3Main {


	private String username;
	private String password;
	
	  
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void isValidate(String name,String pass,Lab3Main obj[])
	{ 
		int count=0;
		
		for (int i = 0; i < 5; i++) {
		
		if(obj[i].getUsername().contentEquals(name)&& (obj[i].getPassword().contentEquals(pass)))
		{
			System.out.println("true ");
			count=1;
			
		}
		
	}if(count==0)
		System.out.println("false");
}
	
	public static void main(String[] args) {
		
	
		System.out.print("enter the user name and password");
		
		Scanner s= new Scanner(System.in);
		
		
		String name=s.nextLine();
		String pass=s.nextLine();
	
		Lab3Main obj[]=new Lab3Main[5];
		
	
			
		
		obj[0]=new Lab3Main();
		obj[0].setUsername("sakshi");
		obj[0].setPassword("11@34");
		obj[1]=new Lab3Main();
		obj[1].setUsername("tanya");
		obj[1].setPassword("11@54");
		obj[2]=new Lab3Main();
		obj[2].setUsername("nikhil");
		obj[2].setPassword("11@344");
		obj[3]=new Lab3Main();
		obj[3].setUsername("silky");
		obj[3].setPassword("11@44");
		obj[4]=new Lab3Main();
		obj[4].setUsername("sanjay");
		obj[4].setPassword("11434");
		
	/*	
		for (int i = 0; i < 5; i++) {
			System.out.println(obj[i].getUsername());
			System.out.println(obj[i].getPassword());
		}
		
		*/
		
		
		Lab3Interface inobj=new Lab3Main()::isValidate;
		
		inobj.isvalid(name,pass,obj);
	
	}
	
	
}
