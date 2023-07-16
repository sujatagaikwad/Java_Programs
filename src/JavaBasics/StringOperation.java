package JavaBasics;

public class StringOperation {
	//lenght-- starts with 1
	//index start with 0
	public static void main(String[] args) {
		
		String a="Hello i love me";
	System.out.println(a);
	
	System.out.println(a.length());
	
	System.out.println(a.toUpperCase());
	
	System.out.println(a.toLowerCase());
	
	//Character as specific index
	
	System.out.println(a.charAt(6));
	
	//escape character-  \    -backslash character
	// Hello i "love" me
    String h="Hello i \"love\" me";
    System.out.println(h);
    
    //Expcted -- i love \ backslash character
    String e="i love \\ backslash character";
    System.out.println(e);
    //Expcted - i love \\character
    String p="i love \\\\character";
    System.out.println(p);
    String t=" i love \\@ chaacter";
    System.out.println(t);
    
    String x="Hello";
    String y="hello";
    
    System.out.println(x.equals(y));
    System.out.println(y.equals(x));
    
    System.out.println(x.equalsIgnoreCase(y));  //Ignore case(capital,small)
    
    String b="Hello java";
    String c="Hello";
    System.out.println(b.contains(c));
    String s="   hello i love me   ";
    System.out.println(s.trim());     // Starting and ending space remove
    
    //concatention-
    
    String ab="hello";
    String cb="java";
    System.out.println(ab+" "+cb);  //This is 1st method
    System.out.println(ab.concat(" "+cb));  //This is 2nd method
    
    
    String v="hello java";
    System.out.println(v.replace("h","k"));   
    
    
	}
	
	

}
