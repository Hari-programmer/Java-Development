package webdrive_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Cammands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hari\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.navigate();
		
		d.get("https://www.amazon.com/");
		System.out.println(d.getTitle());
		
		d.navigate().to("https://www.facebook.com/");
		System.out.println(d.getTitle());
		
		d.navigate().back();
		System.out.println(d.getTitle());
		
		d.navigate().forward();
		System.out.println(d.getTitle());
		
		d.navigate().refresh();
		
		
		//d.close();
		
	
	}

}
