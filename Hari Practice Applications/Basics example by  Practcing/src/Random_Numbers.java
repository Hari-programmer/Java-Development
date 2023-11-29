
import java.util.Random;

public class Random_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		int x=rand.nextInt();
		int y=rand.nextInt();
		System.out.println("Randomlly integer values");
		System.out.println(x);
		System.out.println(y);
		
		
		double a = rand.nextDouble();   
		double b = rand.nextDouble();   
		// Prints random double values  
		System.out.println("Randomly Generated Double Values");  
		System.out.println(a);   
		System.out.println(b);    
		// Generates Random float values  
		float f=rand.nextFloat();  
		float i=rand.nextFloat();  
		// Prints random float values  
		System.out.println("Randomly Generated Float Values");  
		System.out.println(f);   
		System.out.println(i);   
		// Generates Random Long values  
		long p = rand.nextLong();   
		long q = rand.nextLong();   
		// Prints random long values  
		System.out.println("Randomly Generated Long Values");  
		System.out.println(p);   
		System.out.println(q);    
		// Generates Random boolean values  
		boolean m=rand.nextBoolean();        
		boolean n=rand.nextBoolean();  
		// Prints random boolean values  
		System.out.println("Randomly Generated Boolean Values");  
		System.out.println(m);   
		System.out.println(n);   
		}   
		
		
		
	}


