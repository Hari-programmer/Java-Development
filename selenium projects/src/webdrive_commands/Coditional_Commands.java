package webdrive_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coditional_Commands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hari\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		
	WebElement	email=d.findElement(By.xpath("//input[@id='email']"));
	WebElement	pass=d.findElement(By.xpath("//input[@id='pass']"));
		
		if(email.isDisplayed() && email.isEnabled()) {
			email.sendKeys("harishm9959@gmail.com");
			
		}
		
		if(pass.isDisplayed() && pass.isEnabled()) {
			pass.sendKeys("Hari@1234");
		}
		
	
		// female
		
		/*System.out.println(d.findElement(By.xpath("//label[contains(text(),'Female')]")).isSelected()); //false 
		
		// male
		 * 
		System.out.println(d.findElement(By.xpath("//label[contains(text(),'Male')]")).isSelected());  // false
		
		// female radio  button click on
		
		if(d.findElement(By.xpath("//label[contains(text(),'Female')]")).isSelected()==false) {
			
			d.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
			
		}
		*/
		
		
		
		
		System.out.println("Test is passed");
		d.close();
	}

}
