import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		/*
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your name: ");
	      String name = sc.nextLine();
	      System.out.println("Enter your Phone number: ");
	      String phone = sc.next();
	    
	      String number = "\\d{10}";
	      Pattern p = Pattern.compile(number);
	      Matcher matcher = p.matcher(phone);
	     
	      if(matcher.matches()) {
	         System.out.println(name+" phone number is valid");
	      } else { 
	         System.out.println(name+" phone number is not valid");
	      }
	      
	      */
		
	    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
      String s=sc.nextLine();
        char ch;
        
			for(int i=0;i<s.length();i++) {
				for(int j=0;j<=i;j++) {
					 ch=s.charAt(j);
					System.out.print(ch);
					
					  try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
					   e.printStackTrace(); }
					 
				}
				System.out.println();
			}
	         
		/*	
			for (int i=0;i<10;i++) {
				for (int j=0;j<=i;j++) {
					
				System.out.println("LOVE YOU"+"😘");
				Thread.sleep(1000);
			}
			System.out.println("LOVE YOU SO MUCH :) ❤️ :( ");

			}
        */
	}

}
