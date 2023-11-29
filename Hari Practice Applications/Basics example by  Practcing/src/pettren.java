
public class pettren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int star=8;
		int space =-1;
		for(int i=1;i<=7;i++) {
			if(i<=4) {
				star--;
				space++;
			}else {
				star++;
				space--;
			}
			for(int j=1;j<=star;j++) {
				if(j<=space) {
					System.out.print(" ");
				}else if(i==4) {
			
				System.out.print("@");
		}else {
			System.out.print("*");
			}
			}
				System.out.println();
		}

	}

}
