package Collections;

import java.util.HashMap;

public class HashMapDemo {
	
	//Map- interface
	//HashMap- class--
	//Duplicates are not allowed 
	//Sequence is not fix
	//Null-- only one null key allowed but multiple null values are allowed
	
	public static void main(String[] args) {
		
		HashMap<String,String> obj = new HashMap<String, String>(); // Declration
		
		obj.put("MH", "Mumbai");
		obj.put("KR", "BLR");
		obj.put("GJ", "Gandhinagar");
		obj.put("MH", "Mumbai");
		
		System.out.println(obj);
		
		//want to print fetch value using key
		
		System.out.println(obj.containsKey("MH"));
		
		System.out.println(obj.get("KR"));
		
		for(String k:obj.keySet()) {
			
			System.out.println(k);
			
			//i want to print all the values
			
			
			for(String a:obj.values()) {
				
				System.out.println(a);
				
			}
			// i want to print both key and values
			
			for(String b : obj.keySet()) {
				
				System.out.println(b+" "+obj.get(b));
				
			}
			
	
		}
		
		
	}

}
