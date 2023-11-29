package snippet;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =1;i<=100;i++) {
			int count=0; 
			for(int j=i/2;j>=2;j--) {
				if(i/j==0) {
					count++;
				}else {
					if(count==0) {
						System.out.println(""+i);
					}
				}
				
			}
			
			
		}

	}

}
