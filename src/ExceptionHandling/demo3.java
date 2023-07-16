package ExceptionHandling;

public class demo3 {

	public static void main(String[] args) {
		try {
			int a = 10;
			System.out.println(a / 0);
	} catch (Exception e) { // to handle the exception
	e.printStackTrace(); // to print the exception details

	System.out.println("Array exception handling");

	}
	//This will compile time error-- unreachable block
	/*catch(ArithmeticException e) {

	System.out.println("Arithmatic exception handling");
	}*/

	System.out.println("Hello");

	}

}
