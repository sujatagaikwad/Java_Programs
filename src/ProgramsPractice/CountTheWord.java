package ProgramsPractice;

import java.util.Arrays;

public class CountTheWord {

	public static void main(String[] args) {

		String h = "Hello i love java";

		// System.out.println(h.length()); to print character length

		// cut the string using space-

		String words[] = h.split(" ");

		System.out.println(Arrays.toString(words));

		System.out.println(words.length);
		String temp="";

		for (int i = words.length - 1; i >= 0; i--) {

			System.out.println(words[i]+" ");	
			
			for(int j= words[i].length()-1; j>=0; j--) {
				
				temp=temp+words[i].charAt(j);
					
				
			}
			
		}
		System.out.println(temp+" ");
		
		 
	}

}


