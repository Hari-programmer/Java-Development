	import java.util.*;
public class number_convert_to_word {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    
     int i= n%10;
     int j=n/10;
     int k=j%10;
     int h=n/100;
     int th=n/1000;
    String[] sw= new String[]{" ","one","two","three","four","five", "six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen", "nineteen"};
   
    String[] tw= new String[]{" ","ten","twenty","thirty","forty","fifty","sixty", "seventy","eighty","ninety"};
    
    String hw="Hundred";
    
    String thw="Thousand";
    
    if(n<20) {
        System.out.println(sw[n]);}
    
    else if(n<100) {
        System.out.println(tw[k]+" "+sw[i]);}
    else if(n<1000){
        System.out.println(sw[h]+" "+hw+" "+tw[k]+" "+sw[i]);
		    }else
		    {
		    	System.out.println(sw[th]+" "+thw+" "+tw[k]+" "+sw[i]);
		    }
		}

}


