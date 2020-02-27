package Calculator;

import java.util.Scanner;

public class CalculatorClass {

	private int numA,numB;
	private String operator;
	 Scanner s=new Scanner(System.in);
	
	
	public int getNumA() {
		return numA;
	}
	public void setNumA(int numA) {
		this.numA = numA;
		System.out.println("number is "+numA);
	//	s.hasNextLine();
		
	}
	public int getNumB() {
		return numB;
	}
	public void setNumB(int numB) {
		this.numB = numB;
		System.out.println("number is "+numB);
	//	s.nextLine();
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
		
	}
	
	
		
		
		
	
}
