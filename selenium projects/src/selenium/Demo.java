package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
    
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hari\\Selenium\\chromedriver_win32\\chromedriver.exe");
        
		System.setProperty("webdriver.chrome.verboseLogging","true");
		WebDriver d=new ChromeDriver();
		
		d.get("http://www.amazon.com");
		System.out.println(d.getTitle());
		System.out.println("Test is passed");
		//d.quit();
	}

}
