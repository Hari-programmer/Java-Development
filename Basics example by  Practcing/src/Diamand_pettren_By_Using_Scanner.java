import java .util.Scanner;
public class Diamand_pettren_By_Using_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter Row values");
        int row,space;
		Scanner s = new Scanner(System.in);
			row=s.nextInt();
		
			 
			
			//int space=1;
			space=row-1;
			
		for (int i=1;i<row;i++) {
				for(int j=1;j<=space;j++) {
					System.out.print(" ");	
				}
				space--;
				for(int j=1;j<2*i-1;j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
				
				space=1;
				for(int i=1;i<row-1;i++) {
					for(int j=1;j<=space;j++) {
						System.out.print(" ");
					}
					space++;
					for(int j=1;j<=2*(row-i)-1;j++) {
						System.out.print("*");
					}
					System.out.println(" ");
				}
		
		}
		
		
	}


