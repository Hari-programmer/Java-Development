import java.util.Scanner;
public class Automorphic_number {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number:");
      int num=sc.nextInt();
      
      int count=0;
      int square=num*num;
      
      int tem=num;
      
      while(tem>0) {
    	  count++;
    	  tem=tem/10;
    	  
      }
      int lastDigit=(int)(square%(Math.pow(10,count)));
      if(num==lastDigit) {
    	  System.out.println(num+"is an automorphic number");
      }
    	  else
    	  {
    		  System.out.println(num+"is an not automorphic number");
    	  }
      }
		
	}


