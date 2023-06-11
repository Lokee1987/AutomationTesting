package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver","C:\\Users\\prath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.makemytrip.com/");
		driver1.manage().window().maximize();
		Thread.sleep(6000);
		
		
	}
	
	

}
