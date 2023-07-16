package ProgramsPractice;

import java.util.Arrays;

public class SecondMaxNumberFromArray {

	public static void main(String[] args) {

		int a[] = { 30, 50, 23, 56, 67 };

		// System.out.println(a[4]);
		
		int temp;

		for (int i = 0; i < a.length; i++) { // outer loop

			for (int j = i + 1; j < a.length; j++) { // inner loop

				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
			
		}
		System.out.println(a[1]);
		
		System.out.println(Arrays.toString(a));
	
	for(int k:a) {
		
		System.out.print(k+" ");
		
		
	}
	
	
	}
	
	

}

// <--second large
//  >-- second small
