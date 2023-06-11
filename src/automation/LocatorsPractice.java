package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\prath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		 driver.findElement(By.name("firstname")).sendKeys("Prathap");
		 driver.findElement(By.name("lastname")).sendKeys("Narravula");
		 driver.findElement(By.id("day")).sendKeys("24");
		  	
		 Thread.sleep(3000);
		 
		
		driver.close();
	}

}
