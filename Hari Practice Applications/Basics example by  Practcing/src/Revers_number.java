import java.util.Scanner;

public class Revers_number {
	
	
	/*public static void revNum(int  num) {
		
		if (num<10) {
			System.out.println(num);
			return;
		}
		else
		{
			System.out.print(num%10);
			revNum(num/10);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    System.out.print("Enter the number");
		Scanner sc=new Scanner (System.in);
		int  ch=sc.nextInt();
		System.out.print("the revers number");
		
		revNum(ch);
		*/
		
		//THE REVERS NUMBER GIVEN PROGRAM EXAMPE BY USING WHILE CONDITION
		public static void main(String[] args) {
		int num=27647476,rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("The reverse of the given number is:"+rev);
		
		
		
	}

}
