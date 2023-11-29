import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class user{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your name: ");
      String name = sc.nextLine();
      System.out.println("Enter your Phone number: ");
      String phone = sc.next();
    
      String number = "\\d{10}";
      Pattern p = Pattern.compile(number);
      Matcher matcher = p.matcher(phone);
     
      if(matcher.matches()) {
         System.out.println(name+" phone number is valid");
      } else { 
         System.out.println(name+" phone number is not valid");
      }
         
   }
}


	


