
public class example {

	 static public void main(String[] yahoo) {
		// TODO Auto-generated method stub
            int n=9;
           for(int i=1;i<n;i++) {
            	for(int j=i;j<=n;j++) {
            		
            		//if(i==j||i+j==n+1) 			// CROSS PETTERN LOGIC
            		//if(i==1||j==n)				// SQURE PARALLAL PETTREN
            		//if(i==n/2+1||j==n/2+1)		//SQURE PLUS PETTREN
            		if(i==1||j==1||i==n||j==n)	// HOLLO SQUARE PETTREN
            	System.out.print("*");
            	else
            	
            	System.out.print(" ");
            	
          }
            
          	System.out.println();
	 }

            
            
     // .n..n..n..n..n..n..n..n..n..n..n..n..n..n..n..n..n..n..n..n..n..n..n..n..n.      
            //HILLS HOLLW PETTREN PROGRAM
            
            
       /*  for(int i=1;i<n;i++) {
            	for(int j=1;j<=n;j++) {
            		System.out.print(" ");
            	}
            	for(int j=1;j<i;j++) {
            		if (i==n||j==1)
            		System.out.print("* ");
            		else
            			System.out.print(" ");
            	}
            	for(int j=1;j<=i;j++) {
            		if(i==n||j==i)
            		System.out.print("* ");
            		else
            			System.out.print(" ");
            	}
            	System.out.println();
            	
		
	}
*/
}
}