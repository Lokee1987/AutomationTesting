package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\prath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> ImageCount = driver.findElements(By.tagName("img"));
		
		
		int iCount = ImageCount.size();
		
		
		List<WebElement> linkCount = driver.findElements(By.tagName("a"));
		
		int lCount = linkCount.size();
		
		if (iCount > lCount)
			System.out.println("ImageCount is greather than linkCount ");
		else 
			System.out.println("linkCount is greather than ImageCount ");
		driver.close();
		
		
		
		
		
		
		

		
	}

	
}
