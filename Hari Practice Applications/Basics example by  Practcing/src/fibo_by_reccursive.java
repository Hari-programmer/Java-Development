
public class fibo_by_reccursive {

	public static int fib(int a,int b) {
	int c=a+b;
	if(c<100) {
		System.out.println(c);
		fib(b,c);
	}
	return c;
	}
	public static void main(String[] args) {
		
     fib(0,1);
	}

}
