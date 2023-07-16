package Polymorphism;

public class AxisBank extends Bank {

	public void checkBalance() {

		System.out.println("balance is 2000");

	}

	public void method2() {

		System.out.println("Hello");
	}

	/*public static void method3() {
               Not allowed
	}*/

	public void main(String[] args) {

		// child reference child object

		AxisBank obj = new AxisBank(); // this will parent and child methods (ovrerided child method will get called)
		obj.checkBalance(); // child overide method
		obj.method2(); // child
		obj.method1(); // parent
        //method3();    //not possible
		// parent ref parent object
		Bank obj1 = new Bank(); // This will call only parent method
		obj.checkBalance(); // 1000
		obj.method1(); // I am from bank

		// parent ref child object //upcasting
		Bank obj2 = new AxisBank(); // This will call only parent method except overrided method(child override
									// method will get called)

		obj2.method1();
		obj2.checkBalance();

		// child ref parent object //downcasting
		// AixsBank obj3 = new Bank(); //its not possible

	}

}
//can we overload static method - yes
//can we overide static method - No
//can we overload main method - Yes possible but different parameters
//can we overide main method - No
