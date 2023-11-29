package snippet;

public class PrimeNumber {
	public static void main(String[] args) {
	/*int n=100;
		for(int i=2;i<=n;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println("Prime numbers of :  "+i+" ");
			}
		}
		}
		}
		*/
		
		
		
		//*************************************************************
		int num = 9;
	    boolean b = false;
	    for (int i = 2; i <= num / 2; i++) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        b = true;
	        break;
	      }
	    }

	    if (!b)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
	}
