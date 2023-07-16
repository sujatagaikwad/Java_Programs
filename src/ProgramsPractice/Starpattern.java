package ProgramsPractice;

public class Starpattern {
	  public static void main(String args[]) {
		    
		  for(int i=0; i<=4; i++){          //outer loop
		         for(int j=5; j>i; j--){        // inner loop 1
		             System.out.print(" ");        //to spaces print
		         }
		     
		         for(int j=0; j<=i; j++){      //inner loop 2
		             
		             System.out.print("*");     //print star
		         }
		         System.out.println("");      //move to next line
		 }
		 }

}
