package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsPractice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver","C:\\Users\\prath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://uk.mail.yahoo.com");
		
		driver.manage().window().maximize();
		WebElement Username = driver.findElement(By.id("login-username"));
		WebElement Next_button = driver.findElement(By.name("signin"));
		
		 	
		Username.sendKeys("valluruloki@gmail.com");

		Thread.sleep(5000);
		Next_button.click();
			
		
		 
		 Thread.sleep(10000);
		 
		 driver.close();
		 
		 
		
	}

}
