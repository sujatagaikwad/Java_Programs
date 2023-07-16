package ArrayDemo;

import java.util.Arrays;

public class SingalDimensionalArray {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50, 60, 70 };

		System.out.println(a.length); // to find out the length

		System.out.println(a[4]); // I am accessing the value of specific index

		// first way to print-

		System.out.println(Arrays.toString(a));

		a[2] = 45; // Replace

		System.out.println(Arrays.toString(a));

		String[] b = { "rahul", "Rohit", "Sujata", "madhuri" };

		System.out.println(b.length);

		System.out.println(Arrays.toString(b));

		b[3] = "Radhika";

		System.out.println(Arrays.toString(b));

		// second way to print array using for loop

		for (int i = 0; i < b.length; i++) {

			System.out.print(b[i] + " ");

		}
		String h[] = { "Rahul", "Ramesh", "Ram" };

		for (int i = 0; i <=h.length; i++) {
			
			if(i<2) {		

			System.out.print(h[i] + " ");
			}
		}
			
			

	//ForEach

		
		for(String k:h) {
			if(k!="Ram") {
				
			System.out.println(k+" ");
			}
		}
	
	
		String j[] = { "Rahul", "Ramesh", "Ram" };
		
		System.out.println(Arrays.toString(j));

		
	}
	

}
