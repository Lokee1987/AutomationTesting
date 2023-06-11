package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\prath\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://docs.oracle.com/javase/7/docs/api/");
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			WebElement f1 = driver.findElement(By.name("PackageListFrame"));
			
			List<WebElement> Links =  driver.switchTo().frame(f1).findElements(By.tagName("a"));
			
			
			for (int i=0; i<= Links.size(); i++) {			
				System.out.println(Links.get(i).getText());
			}
			
			driver.close();
			
	}

}
