import java.util.Scanner;

public class Reverse_number_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements you want:");
		
		int n=sc.nextInt();
		int [] arr=new int[n];
		
		for(int i=0;i<n;i++) {
		System.out.println("Enterarray elemnts: "+ (i+1));
		arr[i]=sc.nextInt();
	
		}
		System.out.println("array original elements");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n\"reverse original elements are :\"");
		for(int i=n-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
