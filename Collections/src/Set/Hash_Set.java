package Set;
import java .util.*;
public class Hash_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<String> set=new HashSet<String>();  
        set.add("Ravi");  
        set.add("Vijay");  
        set.add("Arun");  
        set.add("Sumit");
        
        set.add("Vijay");// Duplicates not allow its show add() is false becuse of its boolean values .
        System.out.println("An initial list of elements: "+set);  
        
        
        //Removing specific element from HashSet  
        set.remove("Ravi");  
        System.out.println("After invoking remove(object) method: "+set); 
        
        
        HashSet<String> set1=new HashSet<String>();  
        set1.add("Ajay");  
        set1.add("Gaurav");  
        set.addAll(set1);  
        System.out.println("Updated List: "+set);  
        
        
        //Removing all the new elements from HashSet  
        set.removeAll(set1);  
        System.out.println("After invoking removeAll() method: "+set);  
        
        //Removing elements on the basis of specified condition  
        
        set.removeIf(str->str.contains("Vijay"));    
        System.out.println("After invoking removeIf() method: "+set);  
        
        //Removing all the elements available in the set  
        
        set.clear();  
        
        System.out.println("After invoking clear() method: "+set);  
        
        
        
       System.out.println("*************************************************************************");
       
       // HashSet from Another Collection 
       
       ArrayList<String> list=new ArrayList<String>();  
       list.add("Ravi");  
       list.add("Vijay");  
       list.add("Ajay");  
         
       HashSet<String> h=new HashSet(list);  
       h.add("Gaurav");  
       
     
       Iterator<String> i=h.iterator();  
       while(i.hasNext())  
       {  
       System.out.println(i.next());  
       }  

        
        
        
        
	}

}
