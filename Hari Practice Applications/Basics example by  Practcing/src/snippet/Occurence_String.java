package snippet;

public class Occurence_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="java";
		String str="jav";
		
		for(int i=0;i<str.length();i++) {
			int count=0;
			for(int j=0;j<s.length();j++) {
				if(str.charAt(i)==s.charAt(j)) {
			// char ch=str.charAt(i);
			 count ++;
				}
			}
				System.out.println(str.charAt(i)+" "+ "occurence"+" "+ count);
			}
		}
	}


