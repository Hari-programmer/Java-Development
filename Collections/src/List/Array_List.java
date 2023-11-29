package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;
public class Array_List {

	public static void main(String[] args) {
		int[] i=new int[3];
		
		ArrayList a=new ArrayList();
		
		a.add(2);
		a.add(33);
		a.add(55);
		a.add(44);
		
		System.out.println(a.size());
		
		a.add("hari");
		a.add(22.00);
		a.add(22.4f);
		a.add(true);
		a.add('h');
		System.out.println(a.size());
		
		
		
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("hari");
		arr.add("prasad");
		System.out.println(arr);
		
	///.................................................................................................
		//Blue print class  is Array_List1 another class we access to current class include in main method 
		
		//Create object in another class 
		
		Array_List1 a1=new Array_List1("priya",23,"Yanam");
		Array_List1 a2=new Array_List1("divya",22,"Hyderabad");
		Array_List1 a3=new Array_List1("merry",21,"Vijag");
		
		//Arraylist creat in class referance object
		
		ArrayList<Array_List1> arr1=new ArrayList<Array_List1>();
		arr1.add(a1);
		arr1.add(a2);
		arr1.add(a3);
		
	Iterator<Array_List1 >it=arr1.iterator();
 while(it.hasNext()) {
Array_List1	 emp=it.next();
System.out.println("name:"+emp.name+" "+"age:"+emp.age+" "+"City:"+emp.city);
 }
 
 
 ///...............................................................................................
 
 System.out.println("************************");
 
 
 ArrayList<String> ar=new ArrayList<String>();
 ar.add("Java");
 ar.add("JDBC");
 ar.add("Spring");
 
 
 ArrayList<String> ar1=new ArrayList<String>();
 ar1.add("AD Java");
 ar1.add("Hypernet");
 ar1.add("Spring Boot");
 
 ar.addAll(ar1);						//This method is used for two  are more object elements will be added 
 
 for(int j=0;j<ar.size();j++) {
	 System.out.println(ar.get(j));
 }
 
 
 System.out.println("*******************************");
 

 ArrayList<String> ar2=new ArrayList<String>();
 ar2.add("Java");
 ar2.add("JDBC");
 ar2.add("Spring");
 
 
 ArrayList<String> ar3=new ArrayList<String>();
 ar3.add("AD Java");
 ar3.add("Hypernet");
 ar3.add("Spring Boot");
 
 ar2.removeAll(ar3);		//This method will be use in we dont have partucular object elements that should be removed			
 
 for(int j=0;j<ar2.size();j++) {
	 System.out.println(ar2.get(j));
 }
 
 
 System.out.println("***************************");
 
 

 ArrayList<String> ar4=new ArrayList<String>();
 ar4.add("Java");
 ar4.add("JDBC");
 ar4.add("Spring");
 
 
 ArrayList<String> ar5=new ArrayList<String>();
 ar5.add("Java");
 ar5.add("Hypernet");
 ar5.add("Spring Boot");
 
 ar4.retainAll(ar5);				//This method is common Object elemnets will be displayed 
 
 for(int j=0;j<ar4.size();j++) {
	 System.out.println(ar4.get(j));
 }
 
 
 
	}

}
