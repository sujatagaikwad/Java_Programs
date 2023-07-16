package ProgramsPractice;
import java.util.HashMap;

public class CountOfCharacterUsingHashMap {
	
	public static void main(String[] args) {
		
		String a="dgdhha";    //d=2, g=1, h=2, a=1
		
		char ch[]=a.toCharArray();    //converting to character array
		
		HashMap<Character,Integer> hs=new HashMap<Character,Integer>();

		for(int i=0;i<ch.length;i++){
		    
		    if(hs.containsKey(ch[i])){
		        
		        hs.put(ch[i],hs.get(ch[i])+1);
		        
		    }
		    else{
		        hs.put(ch[i],1);
		    }
		    
		    
		}

		for(int i=0;i<ch.length;i++){
		    if(hs.get(ch[i])==1){
		        System.out.println("First non-repeted"+ch[i]);
		        break;
		    }
		}

		for(char k:ch){
		    if(hs.get(k)>1){
		        System.out.println("First repeted"+k);
		    
		        break;
		    }
		    }
	}

}
