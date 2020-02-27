package methodreference;

public class MainClass {

	public static void main(String[] args) {
		
	
	MutlipleReference obj =new MutlipleReference();
	MethodReference obji=obj::instance;
	
	obji._abstractMethod("sakshi ",203.1);
	obji._abstractMethod("si ",23.1);
	
	
	MutlipleReference obj1 =new MutlipleReference();
	MethodReference obj2=obj1::instance;
	obj2._abstractMethod("keshri ",23.1);
	
	
}
}