import java.util.Scanner;

public class Sum_Of_Arrays {

	  public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter number of elements: ");
	    int number = scan.nextInt();

	    int array[] = new int[number];
	    System.out.println("Enter array elements: ");
	    
	    for (int i=0;i<array.length;i++) {
	      array[i] = scan.nextInt();
	    }

	    int sum = 0;
	    for (int i=0; i<array.length; i++) {
	      sum =sum+ array[i];
	    }
	    System.out.println("Sum of array elements= " + sum);
	  }
	}