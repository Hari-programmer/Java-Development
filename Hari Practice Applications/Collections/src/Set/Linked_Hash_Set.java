package Set;
import java.util.*;
public class Linked_Hash_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  LinkedHashSet<String> set=new LinkedHashSet();  
          set.add("One");    
          set.add("Two");    
          set.add("Three");   
          set.add("Four");  
          set.add("Five");  
          // Duplictes not allowed 
          //
          
          // 
          set.add("Two");
          Iterator<String> i=set.iterator();  
          while(i.hasNext())  
          {  
          System.out.println(i.next());  
          }  

	}

}
