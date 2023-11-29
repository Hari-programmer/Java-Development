package snippet;

import java.util.Scanner;

public class Number_programs {

	public static void main(String[] args) {	
		
// THIS PROGRAM IS CREATE THE NUMBER IS  SPY NUMBER OR NOT.. 
		
    /* System.out.println("Enter the number");
     Scanner sc =new Scanner (System.in);
     int n=sc.nextInt();
     int m=n;
     
    
     int sum=0,rem,prod=1;
     while(n!=0) {
    	 rem=n%10;
    	 sum=sum+rem;
    	 prod=prod*rem;
    	 n=n/10;
     }
     if(sum==prod) {
    	 System.out.println(m+"this is Spy number");	 
     }else
     {
    	 System.out.println(m+" this is  not Spy number");
     }
    
     
     
	}

}*/

//THIS PROGRAM WAS DUCK NUMBER ARE NOT 
		// THAT MEANS IF GIVEN INPUT IS ANY ONE DIGIT IS ZERO THAT IS DUCK NUMBER

System.out.println("Enter the number");
Scanner sc =new Scanner (System.in);
int n=sc.nextInt();
int m=n;
int count =0,rem;
       while(n!=0) {
    	   rem=n%10;
    	   if(rem==0) {
    		   count ++;
    	   }
    	   n=n/10;	   
       }
       if(count>0) {
    	   System.out.println("this is duck  number");
    	   }else {
        	   System.out.println("this is not duck number");
   
    	   }
}
}
