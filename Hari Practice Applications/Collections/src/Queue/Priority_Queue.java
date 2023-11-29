package Queue;

import java.util.Collection;
import java.util.PriorityQueue;
import java.util.*;
public class Priority_Queue{
	public static void main(String [] args) {
		
		
		Queue p=new PriorityQueue();
		
		//Add The element we will use two methods add() and offer()
		
		p.add(3);
		p.add(5);
		p.add(1);
		p.add(2);
		p.add(9);
		
		System.out.println("PriorityQueue");
		System.out.println(p);
		
		//the haed is return what we will inset first that will be disoalyed there are two method element() and poll()
		
		//System.out.println(p.element());
		//System.out.println(p.peek());
		 
		// return & remove there two methods remove() and poll()
		//System.out.println(p.remove("Orange"));
		//System.out.println(p);
		
		
		System.out.println(" Poll "+" "+p.poll());
		System.out.println(p);
	
	   /*Iterator i= p.iterator();
	    
	   while (i.hasNext()) {
		   System.out.println(i.next());
		   
	   }
	   System.out.println("**************************************");
		for(Object s :p) {
			System.out.println(s);
		}*/
	
		
		System.out.println("LinkedLIst Queue");
		

		Queue p1=new LinkedList();
		//Add The element we will use two methods add() and offer()
		
		p1.add(9);
		p1.add(3);
		p1.add(5);
		p1.add(4);
		p1.add(1);
		
		
		System.out.println(p1);
		
		System.out.println("Poll"+" "+p1.poll());
		System.out.println(p1);
		
		
		
	}

}
