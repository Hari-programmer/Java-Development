	
	// Java Program to Count Even and Odd Numbers in an Array using For Loop
	import java.util.Scanner;
	
	public class count_even_odd {
		
		//private static Scanner sc; 				// ITS NOT MANDACTORY 
		
		public static void main(String[] args) 
		{
			int Size ,i;
			int evenCount = 0, oddCount = 0;
			Scanner sc = new Scanner(System.in);
		 
			System.out.print(" Please Enter Number of elements in an array Size : ");
			Size = sc.nextInt();	
			
			int [] a = new int[Size];
			
			System.out.print(" Please Enter " + Size + " elements of an Array  : ");
			for (i = 0; i < Size; i++){
				a[i] = sc.nextInt();
			}   

			for(i = 0; i < Size; i++){
				if(a[i] % 2 == 0){
					evenCount++;
				}
				else{
					oddCount++;
				}
			}		
			System.out.println("\n Total Number of Even Numbers in this Array = " + evenCount);
			System.out.println("\n Total Number of Odd  Numbers in this Array = " + oddCount);
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	


