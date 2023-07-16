package Inheritance;

public class SingleLeveldog extends SingleLevelAnimal {        //animal property will come inside dog class

	public static void main(String[] args) {
		
		SingleLeveldog obj = new SingleLeveldog();
		obj.drinkWater();
		
		
		
		
	}
}

/*In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:

subclass (child) - the class that inherits from another class
superclass (parent) - the class being inherited from
To inherit from a class, use the extends keyword.
class (subclass) inherits the attributes and methods from the (superclass):

 * Why And When To Use "Inheritance"?
- It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.
 */
