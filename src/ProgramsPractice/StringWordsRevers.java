package ProgramsPractice;

import java.util.Arrays;

public class StringWordsRevers {

	public static void main(String[] args) {

		String s = "Hello i love java";
		
		String temp = "";
		
		
		for (int i = s.length() - 1; i >= 0; i--) {

			temp = temp + s.charAt(i);

		}
	//	System.out.println(temp);        //String
            
		String words[] = temp.split(" ");
		
		System.out.println(Arrays.toString(words));
		
		for(int i=words.length-1; i>=0; i--) {
			
			System.out.print(words[i]+" ");
			
		}
	}

}
