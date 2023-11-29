import java.util.*;

public class Revers_String {
	
public static void main(String [] args) {
	
	System.out.println("Enter the String :");
	Scanner sc=new Scanner(System.in);
	String s=sc.next(),str="";
	
	for(int i=0;i<s.length();i++) {
		
		str=s.charAt(i)+str;
	}
	
	System.out.println("revers string is::"+" "+str);
	
}
}
