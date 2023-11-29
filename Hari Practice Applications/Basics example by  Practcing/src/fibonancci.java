import java.util.*;
public class fibonancci {

	public static void main(String[] args) {
        System.out.println("Enter the fib number :");
        Scanner sc=new Scanner (System.in);
        int n = sc.nextInt();
			    
			    int  j= 0, k = 1;
			    System.out.println("Fibonacci Series till " + n + " terms:");
                
			   for (int i = 1; i <=n; i++) {
			      System.out.print(j + ", ");

			      // compute the next term
			      
			      int next= j + k;
			            j = k;
		            k = next;
			    }
			 
			
	}

}
