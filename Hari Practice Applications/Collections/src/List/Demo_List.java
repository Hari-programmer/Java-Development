package List;

//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.*;

public class Demo_List {

	public static void main(String[] args) {
     
		List<String> li=new ArrayList<String>();
		li.add("hari went to insistute:..");
		li.add("This guy was searching for job... ");
		li.add("But he's Still not get a Job.....But...");
		li.add("he's was not disapointed Still he is learnig new Things....");
		
		//Collection.sort(li);
		// IT IS CONVERT  TO LIST TO ARRAY
		System.out.println("List is convert to array........");
		String [] a=li.toArray(new String[li.size()]);
		System.out.println("Printing Array"+Arrays.toString(a));
	    System.out.println("Printing List "+li);
	    
	    System.out.println("...................");
	    
	    // Accessing the elements 
	    System.out.println("Returning Elements :  "+li.get(1));
	    //Change the element
	    li.set(2, "Defnetly he's get job");
	    
	    System.out.println("#################################");
	    
	    //......................................
		for(String s:li) {
			System.out.println(" "+s);
		}
		System.out.println("........................");
		System.out.println("Sorting order By Using Collections:");
		
		
		//Sorting order Using Collections
		List<String> list1=new ArrayList<String>();  
		  list1.add("Mango");  
		  list1.add("Apple");  
		  list1.add("Banana");  
		  list1.add("Grapes"); 
		  
		  System.out.println("Integer numbers ...");
		  
		  List<Integer> list2=new ArrayList<Integer>();  
		  list2.add(51);
		  list2.add(10);
		  list2.add(80);
		  list2.add(90);
		  list2.add(1000);
	  	
		  Collections.sort(list2);
			 
			 for(Integer S1:list2) {
				 System.out.println(S1);
			 }
		  
		  System.out.println("....................   ");
		  
	 Collections.sort(list1);
	 
	 for(String S:list1) {
		 System.out.println(S);
	 }
	 
	 System.out.println("................");
	 
	 //Listitarator interface ....
	 
		  ListIterator<String> itr=list1.listIterator(); 
		  
	        System.out.println("Traversing elements in forward direction"); 
	        
	        while(itr.hasNext()){    
	              
	        System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());    
	        }    
	        System.out.println("Traversing elements in backward direction");
	        
	        while(itr.hasPrevious()){    
	          
	        System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());    
	        }    
		
		
		
	}

}
