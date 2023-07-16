package ExceptionHandling;

public class tryCatchBlock {
	
	public static void main(String[] args) {
		try {
		int a[]= {10,20,30,40};
		System.out.println(a[6]);
		}
		catch(Exception e) {             //to handle the exception
           e.printStackTrace();
			
			
			System.out.println("Please try to access value within the range");

			
		}
		
		System.out.println("Hello");
		
		
	}

}




//Syntax
/*try {
          // Block of code to try
  }
 */
 