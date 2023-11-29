package snippet;

import java.util.Scanner;

public class km_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	
	int n=sc.nextInt();
	int m=n,rem;
	int sum=0;
	while(n!=0) {
		rem=n/10;
		int fact=1;
		for(int i=1;i<=rem;i++) {
			fact=fact*i;
			}
		sum=sum+fact;
		n=n/10;
	}
    // System.out.println(sum);
	if(sum==m) {
		System.out.println(n+  "this is km number");
	}else {
		System.out.println(n+  "this is not km number");
	}
	}
	}
	


