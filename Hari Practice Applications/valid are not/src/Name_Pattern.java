import java.util.Scanner;

public class Name_Pattern {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
       
		  
		Scanner sc=new Scanner(System.in);
          System.out.println("Enter the String :");
        String s=sc.nextLine();
          char ch;
          
			for(int i=0;i<s.length();i++) {
				for(int j=0;j<=i;j++) {
					 ch=s.charAt(j);
					System.out.print(ch);
					
					/*
					 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
					 * Auto-generated catch block e.printStackTrace(); }
					 */
				}
				System.out.println();
			}
		
	}


	}


