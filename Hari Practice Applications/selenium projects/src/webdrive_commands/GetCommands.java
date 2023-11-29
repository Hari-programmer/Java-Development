package webdrive_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hari\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		
		d.get("https://www.facebook.com/");
	System.out.println(d.getTitle());
	System.out.println(d.getCurrentUrl());
	
	String test=d.findElement(By.xpath("//input[@id='email'")).getText();
	System.out.println(test);
	
	d.close(); // close current window
	d.quit();  // closes multiple windows
	}
	

}
