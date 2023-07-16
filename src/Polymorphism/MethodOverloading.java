package Polymorphism;

public class MethodOverloading {
	
	//same method name with different parameters-
	//rules for giving parameters-
	//datatype should be different
	//count should be different
	
	public void addition(int a, int b) {
		
		System.out.println(a+b);
		
	}
	
	public void addition(double a, double b) {
		
		
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.addition(12, 13);
		obj.addition(12.5, 13.5);
		
		
	}

}
