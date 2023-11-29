package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Case_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver","C:\\Users\\hari\\Selenium\\chromedriver_win32\\chromedriver.exe");
   WebDriver dri=new ChromeDriver();
   
   dri.manage().window().maximize();  // this method  is  shows browse will maximize 
  
   dri.get("http://www.google.com/");
   
   dri.findElement(By.id("input")).sendKeys("javatpoint tutorials");
   dri.findElement(By.name("btnK")).click();
   
   
   
   /*String exp_title="Javatpoint:";
   String act_title= dri.getTitle();
   System.out.println(act_title);
   if(exp_title.equals(act_title)==true) {
	   System.out.println("Test is passed");
   }
   else {
	   System.out.println("Test is Failed");
   }*/
   
   dri.close();
   
   
   
   
	}

}
