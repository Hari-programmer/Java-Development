package Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterat_or {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		for(int i=0;i<=10;i++) {
			a.add(i);
		}
		System.out.println(a);
		
	Iterator i1=a.iterator();
	while(i1.hasNext()) {
	Integer i2=(Integer)i1.next();
	
//ystem.out.println(i2);
	
	if(i2%2==0) {
		System.out.println(i2);
		
	}else
	 i1.remove();
	}
	System.out.println(a);
		
	}
		
	}


