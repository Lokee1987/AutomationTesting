package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mod1Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		driver.manage().window().maximize();
		
		WebElement option1 = driver.findElement(By.id("vfb-7-1"));
		
		option1.click();
		
		WebElement Checkbox2 = driver.findElement(By.id("vfb-6-1"));
		Checkbox2.click();
		
		WebElement Checkbox3 = driver.findElement(By.id("vfb-6-2"));
		
		Checkbox3.click();
		
		
		
		
			
		driver.close();
		
		
	}

}
