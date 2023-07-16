package ArrayDemo;

import java.util.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 } };

		// find out the length
		System.out.println(a.length); // 2
		System.out.println(a[0].length); // 4
		System.out.println(a[1].length); // 4
		System.out.println(a[0].length+a[1].length);
		
		//Access the value of specific index
		System.out.println(a[0][3]);  //40
		System.out.println(a[1][0]);   //50
		
		//update /modify the value
		
		a[0][1]=55;
		System.out.println(a[0][1]);
		
		//First way
		System.out.println(Arrays.toString(a[0])+Arrays.toString(a[1]));
		
		for(int i=0; i<a.length; i++) {
			
			System.out.println(Arrays.toString(a[i]));
		
			
		}
		
	for(int i=0; i<a.length; i++) {
		
			for(int j=0; j < a[i].length; j++) {
		
			
			System.out.print(a[i][j]+" ");
		}
		
		}
	
	//using for each loop--HW--
	for(int k:a[1]) {
		if(k>=4) {
			
		System.out.print(k+" ");
		}
	}	
		
	for(int[] p:a) {
	
	for(int val: p)
		System.out.print(val+" ");
	}
	
	}

}
