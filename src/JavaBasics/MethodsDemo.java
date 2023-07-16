package JavaBasics;

public class MethodsDemo {

	// we have created method1      --Non static method

	public void method1() {

		System.out.println("Hello");
	}

	// we have created method1
	
	public void method2() {

		System.out.println("Hello2");
	}
	
	//static method
	public static void method3() {
		
		System.out.println("Hello3");
		
		
	}

	// parameterized method
	
	public void method4(String name, int age) {
		
		System.out.println(name+" "+age);
		
	}
	
	//method return type
	
	
	public int age() {
		
		int a=5;
		
		return a;
				
		
	}
	
	public void method() {
		
	
		
		
	}
	
	public static void main(String[] args) {

		// we have to call the method
		// to call the method follow below steps
		// 1.create the object of class- classname obj=new classame();
		// 2. then call the method with objectname.methodname

		MethodsDemo obj = new MethodsDemo();

		obj.method1(); // calling the method1
		obj.method2(); // calling the method2
        method3();     //This is static method so no need to of object to call the method
		obj.method4("Sujata"+",",25);     //value pass (call)
		
		/*MethodsDemo obj1 = new MethodsDemo();     // dont add same obj create new object for additional info in same method
		
		obj.method4("Ramesh"+",",30); */
	}

}
