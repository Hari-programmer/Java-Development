package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) {

		   System.setProperty("webdriver.chrome.driver","C:\\Users\\hari\\Selenium\\chromedriver_win32\\chromedriver.exe");
		   WebDriver dri=new ChromeDriver();
		   
		   dri.manage().window().maximize(); 
		   dri.get("https://bestvalued.com/");
		   
		   //ID LOCATORS
		  WebElement  s=dri.findElement(By.id("rvwprdsearchhome"));
		  
		  s.sendKeys("proxies");
		  
		  //xpath LOCATORS
		  dri.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/button[1]")).click();
		  
		  //LINKTEXT LOCATOR
		  dri.findElement(By.linkText("Net Nut Proxies - Protect Online Privacy Against Malware Attack")).click();
		  //partialLinkText
		 dri.findElement(By.partialLinkText(" Protect Online Privacy Against Malware Attack")).click();
		 
		 
		 //CLASS LOCATORS TO COUNT MORE THEN ON 
		 Dimension  i= dri.findElement(By.className("col-md-12")).getSize();
		 System.out.println(i);
		 
		 //TAGNAME LOCATORS ITS DISPALYED HOW MANY TAG ELEMENTS IS THERE  
		 Dimension	d= dri.findElement(By.tagName("a")).getSize();
		 System.out.println(d);
		 
		dri.close(); 
		  
	}
}
