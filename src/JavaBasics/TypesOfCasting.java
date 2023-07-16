package JavaBasics;

public class TypesOfCasting {
	
	 public static void main(String[] args) {	  

		 /*
		   Widening Casting (automatically) - converting a smaller type to a larger type size--implicit type casting
		 byte -> short -> char -> int -> long -> float -> double

		 Narrowing Casting (manually) - converting a larger type to a smaller size type----explicit type casting
		 double -> float -> long -> int -> char -> short -> byte
		 */
		   
		   
		   //widening
		   int a=10;
		   float b=a;
		  
		   System.out.println(b); //10.0
		   
		   byte c=20;
		   double d=c;
		   
		   System.out.println(d); //20.0
		   
		   
		   // narrowing
		   float f=10.0f;
		   int z=(int)f;
		   
		   System.out.println(z);
		   

		   double f1=9.0;
		   int v=(int)f1;
		   
		   System.out.println(v);
		   
		   int k=17;
		   float l=(k);
		   System.out.println(l);
		   
		   int a1=70;
		   char c1=(char)a1;
		   System.out.println(c1);
		   
		   char b1='A';           //widening
		   int b2=b1;
		   System.out.println(b2);
		   
		   
		   // Byte to char and short to char are the exceptio-- we need to sue narrowing for both
		   byte t1=67;          
		   char c2=(char)t1;
		   System.out.println(c2);
				  
		   
}

}
