import java.util.Scanner;

public class Max_Element_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the how many elemnts you want:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int max=0;
        
        for(int i=0;i<n;i++) {
		System.out.println("Enter array elemnts: "+ (i+1));
		arr[i]=sc.nextInt();
        }
        for(int ele:arr) {
        
        	if(ele>max) {
        		max=ele;
        	}
        }
        System.out.println("The value of maximum element is:"+max);
	}

}
