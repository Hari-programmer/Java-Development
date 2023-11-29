
public class positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row=9;
		int space=1;
		space =row-1;
		
		for(int i=1;i<row;i++) {
			
			for(int j=1;j<=space;j++) {
				System.out.println(" ");
			}
			space --;
			for(int j=1;j<=2*j-1;j++) {
				System.out.println("*");
			}
			System.out.println("");
		}
		space =1;
for(int i=1;i<row-1;i++) {
			
			for(int j=1;j<=space;j++) {
				System.out.println(" ");
			}
			space ++;
			for(int j=1;j<=2*(row-1);j++) {
				System.out.println("*");
			}
			System.out.println("");
		}
		
			
				}

}
