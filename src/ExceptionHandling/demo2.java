package ExceptionHandling;

public class demo2 {
	
	public static void main(String[] args) {
		try {
			int a = 10;
			System.out.println(a / 0);
		} catch ( ArrayIndexOutOfBoundsException e) { // to handle the exception
			e.printStackTrace(); // to print the exception details

			System.out.println("Array exception handling");

		}
		catch(ArithmeticException e) {
			
			System.out.println("Arithmatic exception handling");
		}

		System.out.println("Hello");

	}

}
