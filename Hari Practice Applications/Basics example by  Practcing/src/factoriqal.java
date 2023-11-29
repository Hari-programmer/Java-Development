import java.util.*;
public class factoriqal {

	public static void main(String[] args) {
       System.out.println("Enter the number:");
       Scanner sc=new Scanner(System.in);
		        int num =sc.nextInt();
		        int fact= 1;
		        for(int i = 1; i <= num; i++)
		        {
		            // factorial = factorial * i;
		            fact = fact*i;
		        }
		        System.out.printf("Factorial of given  number is:: "+ fact);
		    }
		
	}

