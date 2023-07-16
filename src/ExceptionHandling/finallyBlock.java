package ExceptionHandling;

public class finallyBlock {
	
	public static void main(String[] args) {

		try {

			int a[] = { 10, 20, 30 };
			System.out.println(a[6]);

		} catch (Exception e) {

			System.out.println("handle exception");

		}
		finally {
			
			System.out.println("I will always excute");
		}
		
		System.out.println("Hello");

	}

}
