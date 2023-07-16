package JavaBasics;

public class javaOperations {

	//Arithmatic -- +, -,/,*,increement and decrement
	//Assignment
	//comparison
	//logical
	public static void main(String[] args) {

	int a=10;
	int b=20;
   //System.out.println(a+b);
	int c=a+b;
	System.out.println(c);
	
	int F=30;
	int H=20;
	int E=F-H;
	System.out.println(E);
	
	int x=44;
	int y=39;
	int z=x*y;
	System.out.println(z);
	
	float p=30;
	float q=7;
	System.out.println(p/q);
	
	float k=(float)p/(float)q;
	System.out.println(k);
	
	double w=(double)p/(double)q;
	System.out.println(w);
	
	//increment and decrement
	//increment
	//preincrement
	
	int m=7;
	System.out.println(++m);  //8
	System.out.println(m);    //8
	
	//postincrement
	
	int n=7;
	System.out.println(n++);  //7
	System.out.println(n);    //8
	
	
	int I=7;
	System.out.println(--I);  //6
	System.out.println(I);    //6
	
	//postincrement
	
	int L=7;
	System.out.println(L--);  //7
	System.out.println(L);    //6
		
	
	int o=5;
	System.out.println(o+++o);  //11
	System.out.println(o);    //6
	
	int t=5;
	System.out.println(--t-t);  //0
	System.out.println(t);    //4
	
	int ab=5;
	System.out.println(ab---ab);  //1
	System.out.println(ab);    //4
	

	int cd=39;
	int dc=5;
	System.out.println(cd%dc);
	
	//Assingment operator - =
	
	//comparison operator-- >, <, >=, <=, ==, !=
	
	int s=10;
	System.out.println(s<10);  //false
	System.out.println(s>10);  //false
	System.out.println(s<=10); //true
	System.out.println(s>=10); //true
	System.out.println(s==10);  //true
	System.out.println(s!=10);  //false
	
	
	
	
}

}






