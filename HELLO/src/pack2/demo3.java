package pack2;
//import java.util.Scanner;
public class demo3 {
	public static void main(String[] args){
	  ;//Scanner scan=new Scanner(System.in);
	  //System.out.println("enter the integer");
	  int num=6442;
	  int sum=0;
	  int rem;
	  while(num>0){
	    rem=num%10;
	    sum=sum+rem;
	    num=num/10;
	   // System.out.println(sum);
	  }
	  System.out.println("The total number will add: " + sum);
	  int r,quo;
	  String s="";
	  while(sum>0) {
					r=(sum-1)%26;
					quo=(sum-1)/26;
					s=(char)(r+97)+s;
					
					if(quo==1) {
						s=(char)(97)+s;
						break;
					}else
						sum=(sum-1)/26;
				}
				System.out.println("Alphabet charecter is:: "  + s);
	}


	}


