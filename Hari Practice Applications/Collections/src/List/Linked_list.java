package List;
import java.util.*;
public class Linked_list {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("Duake");
		l1.add("KTM");
		l1.add("HERO");
		l1.add("RoyalEnField");
		System.out.println("Contect Of Elements:"+l1);
		
		l1.addFirst("Pulsure");
		l1.addLast("Yamaha");
		System.out.println("Contect Of Elements:"+l1);
		
		System.out.println(l1.get(3));
		l1.set(0, "CCC");
		System.out.println("Contect Of Elements:"+l1);
		
		System.out.println("*************************************************");
		// Printing elements different ways 
		
		// for loop....
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		
		System.out.println("*****************************************************");
		
		// for_each loop....
	 for(String s:l1) {
		 System.out.println(s);
	 }
	 System.out.println("*********************************************************");
	 
	 Collections.sort(l1); 				// sort method  in assending order
	 Iterator i=l1.iterator();
	   while(i.hasNext()) {
		   System.out.println(i.next());
		   
	   }
	
	 
	}
	

}
