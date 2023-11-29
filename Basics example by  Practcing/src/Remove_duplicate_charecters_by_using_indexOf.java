
import java.util.*;   

//Create RemoveDuplicatesExample4 class to remove duplicates from the string   
/*class Remove_duplicate_charecters_by_using_indexOf {   
      
  // Create removeDuplicates() method to remove duplicates using indexOf() method  
  public static void removeDuplicates(String str)   
  {   
      //Create an empty string   
      String newstr = new String();   
        
      //calculate length of the original string  
      int length = str.length();   
          
      // Traverse the string and check for the repeated characters   
      for (int i = 0; i < length; i++)    
      {   
          // store the character available at ith index in the string  
          char charAtPosition = str.charAt(i);   
              
          // check the index of the charAtPosition. If the indexOf() method returns true add it to the resuting string  
          if (newstr.indexOf(charAtPosition) < 0)   
          {   
              newstr += charAtPosition;   
          }   
      }   
      //Print string after removing duplicate characters   
      System.out.println(newstr);  
  }   
   
  public static void main(String[] args)   
  {   
      // Create a string variable with default value   
      //String str = "JavaTpoint is the best learning website";   
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the given String name:");
	  String str=sc.next();
      //call removeDuplicates() method for removing duplicate characters    
      removeDuplicates(str); 
  }   
}  */

// THIS IS ALSO DUPLICATE VALUES WILL BE REMOVED 

public class Remove_duplicate_charecters_by_using_indexOf{ 
	
	  public static void main(String[] args)   {
		  
		  System.out.println("Enter the String");
		  
		  Scanner sc=new Scanner(System.in);
		  
		  String s=sc.next(),str="";
		  
		  for(int i=0;i<s.length();i++) {
			  if(str.indexOf(s.charAt(i))==-1) {
				  str=str+s.charAt(i);
			  }
		  }
		  
		  System.out.println(str);
		  
	  }
	
} 





