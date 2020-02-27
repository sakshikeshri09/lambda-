package EmployeeInterface;

public class LambdaMain {
	public static void main(String[] args) {
		
	

	Employee obj=new Employee();
	obj.setName("sakshi");
	
	EmployeeInterface objEmp=(obje)->System.out.println("employee name "+obje.getName());
	
	objEmp.abstractMethod(obj);
	
}
} 