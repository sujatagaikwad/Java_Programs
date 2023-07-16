package Inheritance;

public class MultiLevelBabydog extends MultiLevelDog {
	
public void method3() {
		
		System.out.println("I am from Babydog");
		
		
	}


  public static void mai(String[] args) {
	  
	  MultiLevelBabydog obj = new MultiLevelBabydog();
	  obj.method2();
	  obj.method3();
	  
  }

}
