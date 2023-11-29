import java.util.Scanner;

public class StringConvertedToIndexValue {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	System.out.println("Enter the string");
	String s =scan.nextLine(),str = "";
	for(int i = 0;i<=str.length();i++) {
		int count=0;
		for(int j=0;j<=s.length();j++) {
			if(str.charAt(i)==s.charAt(j)) {
				count++;
			}
		
		}
		if (count ==1) {
			str=str+s.charAt(i);
		}
	}
		System.out.println(str);
		
		for(int i=0;i<str.length();i++) {
			int count =0;
			for(int j=0;j<s.length();j++) {
				if(str.charAt(i)==s.charAt(j)) {
					count++;
					
				}
			}
			
			System.out.println(str.charAt(i)+"occurse"+count);
		}
	}

	

}
