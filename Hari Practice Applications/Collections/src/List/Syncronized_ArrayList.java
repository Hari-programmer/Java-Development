package List;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class Syncronized_ArrayList {

	public static void main(String[] args) {
	 
		List<String> l=Collections.synchronizedList(new ArrayList<String>());
		l.add("Car");
		l.add("Bus");
		l.add("Bike");
		
		System.out.println(l);
		//synchronized (l) {
	Iterator i=l.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	//}	 
		
	}
	
	System.out.println("*********************************");
	
	CopyOnWriteArrayList <String> c=new CopyOnWriteArrayList<String >();
	  
	c.add("Men");
	c.add("Women");
	
	System.out.println(c);
	
Iterator  i1=c.iterator();
 while (i1.hasNext()) {
	 System.out.println(i1.next());
 }
	
	
	

	}

}
