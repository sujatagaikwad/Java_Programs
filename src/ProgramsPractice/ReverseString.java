package ProgramsPractice;

public class ReverseString {

	public static void main(String[] args) {
		
		String a="Rahul";
	
		
		String temp="";
		for(int i=a.length()-1; i>=0; i--) {
			
		temp=temp+a.charAt(i);
		//System.out.println(temp);

		}
		System.out.println(temp);
		}

	
}
