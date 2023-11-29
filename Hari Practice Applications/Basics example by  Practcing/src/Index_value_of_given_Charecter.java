import java.util.*;

public class Index_value_of_given_Charecter {

	public static void main(String[] args) {
		
		/*System.out.println("Enter the String :");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println("Enter the given charecter:");
		char ch=sc.next().charAt(0);
		int i=-1;
		while(true) {
			i=s.indexOf(ch,i+1);
			if(i!=-1) {
				System.out.println(i);
				
			}else break;
		}
		
		*/
		// THIS IS EASY WAY 
		
		
		System.out.println("Enter the String :");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println("Enter the given charecter:");
		char ch=sc.next().charAt(0);
		
		for(int J=0;J<s.length();J++) {
			if(s.charAt(J)==ch) {
				System.out.println(J);
			}
		}

	}

}
