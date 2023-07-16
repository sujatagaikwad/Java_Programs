package ExceptionHandling;

public class demo1 {

	//ArrayIndexOutOfBoundsException
	//ArithmeticException 
	public static void main(String[] args) {
		try {
			int a = 10;
			System.out.println(a / 0);
		} catch (Exception e) { // to handle the exception
			e.printStackTrace(); // to print the exception details

			System.out.println("Please try to access value within the range");

		}

		System.out.println("Hello");

	}

}
