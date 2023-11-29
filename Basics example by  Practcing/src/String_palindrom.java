import java.util.*;
public class String_palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");
		Scanner sc=new Scanner (System.in);
		String s=sc.next(), str="";
		
   for (int i=0;i<s.length();i++) {
	   str=s.charAt(i)+str;
   } 
   //System.out.println(str); 	//if you cut the  if condition you can print reverse string .
   
	  if(str.equals(s)) {
		   System.out.println("Is a palindrom");
	   }
		   else {
			   System.out.println("Is not a palindrom");
		   }
	   }
   
	}
	

