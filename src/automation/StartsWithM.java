package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartsWithM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\prath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		 for (int i=0; i < links.size(); i++)
		 {
			 String linkname = links.get(i).getText();
			 if(linkname.startsWith("M") == true)
			 System.out.println( linkname);
			 
			 
		 }
		 driver.close();
		 
	}

}
