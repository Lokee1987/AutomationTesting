package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirst {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","\"C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
	}

}
