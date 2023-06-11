package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1FacebookVerify {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prath\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		 driver.getTitle();
		 System.out.println("The Title of the page is "+ driver.getTitle());
		driver.close();
		
		
	}

}
