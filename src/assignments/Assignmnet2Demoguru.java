package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmnet2Demoguru {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
        driver.get("(https://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		
		Select Country = new Select(driver.findElement(By.name("country")));
		 Country.deselectByVisibleText("KUWAIT");
		 
		 Thread.sleep(3000);
		 
		
		
		driver.close();
		
		 
		 }
	}
	


