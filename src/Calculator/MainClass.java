package Calculator;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		CalculatorClass objcal=new CalculatorClass();
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		String n1=s.nextLine();
		int num=Integer.parseInt(n1);
		objcal.setNumA(num);
		
		System.out.println("enter second number:");
		String num2=s.nextLine();
		int n=Integer.parseInt(num2);
		objcal.setNumB(n);
		
		
		System.out.println("enter the operator");
		String operator=s.nextLine();
		objcal.setOperator(operator);
		
		int result;
		CalculatorInterface calci;
		
		switch(objcal.getOperator())
		{
		case "+": calci=(numA,numB)-> numA+numB;
				 result=calci._calculator(objcal.getNumA(), objcal.getNumB());
				 System.out.println("Addition "+result);
				 break;
				 
		case "-": calci=(numA,numB)->numA-numB;
		 		result=calci._calculator(objcal.getNumA(), objcal.getNumB());
		 		 System.out.println("Subtraction "+result);
				 break;
				 
		case "*": calci=(numA,numB)->numA*numB;
 				result=calci._calculator(objcal.getNumA(), objcal.getNumB());
 				System.out.println("multiplication "+result);
 				break;
		
		 
		 
		case "/": calci=(numA,numB)->numA/numB;
 				 result=calci._calculator(objcal.getNumA(), objcal.getNumB());
 				 System.out.println("division "+result);
 				 break;
 				 
 		default:  System.out.println("invalid input");
 				 break;
 				 
		}
		
		}
		
		
		
		
		
		
		
	}

