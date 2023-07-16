package Polymorphism;

public class Bank {

	// Method overriding -- same method name and same parameters-
    /* Rules for java overriding
     * The method must have the same name as in the parent class
     * The method must have the same parameter as in the parent class
     * there must be an IS-A relationship (inheritance).*/
   

	public void checkBalance() {
		
		System.out.println("balance is 1000");

	}
	
	/*public static void method3() {
		
	}*/

	public void  method1() {
		
		System.out.println("I am from bank");
	}
	
}
