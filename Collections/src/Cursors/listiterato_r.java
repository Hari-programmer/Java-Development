package Cursors;

import java.util.ListIterator;
import java.util.*;
public class listiterato_r {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	ListIterator l=new ListIterator();

		
		List <String > l=new ArrayList<String>();
		l.add("vv");
		l.add("ss");
		l.add("hh");
	
		//l.add(null);
		l.add("MM");
		l.add("KK");
		System.out.println(l);
		
    ListIterator ltr=l.listIterator();
   while(ltr.hasNext()) {
    String s=(String)ltr.next();
    //System.out.println(s);
    if(s.equals("vv")) {
    	ltr.remove();
    }
    else if (s.equals("MM")) {
    	ltr.add("AA");
    }
    else if(s.equals("KK")) {
    	ltr.set("NN");
    }
    System.out.println(ltr);
   }
   
	}

}
