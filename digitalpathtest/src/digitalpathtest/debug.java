package digitalpathtest;

import java.util.Arrays;

 
public  class debug{



public static String toRna(String dna) {
    

String output = null;
    

for (int i = 0; i < dna.length() - 1; i++) {
        

	char[] current = dna.toCharArray();
 
       
	if (current.equals("G") ){
            
	output += 'C';
	System.out.println("C");
        
	} else if (current.equals("C")) 
	{
            output += 'G';
        
	} else if (current.equals("T") )
	{
            
	output += 'C';
        
	} else {
            
	output += 'U';
        
	}
	
    }
    
	return output;
}

public void answer(){
	System.out.println( toRna("T") );
	
}
	

     

public static void main(String args[]) {
	
}
        
}
