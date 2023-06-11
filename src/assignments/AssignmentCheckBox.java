package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentCheckBox {
	


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/radio.html");
		// Maximizing browser window
		driver.manage().window().maximize();
		// Assigning the locater of web element
		WebElement option1 = driver.findElement(By.name("webform"));
		WebElement check2 = driver.findElement(By.id("vfb-6-1"));
		WebElement check3 = driver.findElement(By.id("vfb-6-2"));
		option1.click();
		check2.click();
		check3.click();
		// Holding the page for 2 Seconds
		Thread.sleep(2000);
		// Navigating to "https://demo.guru99.com/test/newtours/register.php"
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		WebElement country = driver.findElement(By.name("country"));
		// Creating object to automate dropdown
		Select obj = new Select(country);
		obj.selectByValue("KUWAIT");
		Thread.sleep(1000);
		// Closing Application
		driver.close();
		}
}
