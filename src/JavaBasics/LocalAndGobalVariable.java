package JavaBasics;

public class LocalAndGobalVariable {

	int a=10;       //global variable
	public void method() {
		
		int b=10;                 //local variable-- block or inside the method scope
		System.out.println(b);
		
	}
	
	public void method2() {
		
		System.out.println(a);
		
		
	}
	
}
