import java.util.Scanner;

public class fibbo2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int a=0,b=1,c;
		System.out.println(a);
		System.out.println(b);
		
		while(true) {
			c=a+b;
			if(c<num) {
				System.out.println("fibbo number is :"+c);
				}
			else
				break;
			a=b;
			b=c;
			
		}

	}

}
