package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;

public class ValidationCommandsPractice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\prath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		boolean emailEnabled = driver.findElement(By.id("email")).isEnabled();
		if (emailEnabled== true) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		
			boolean passwordEnabled = driver.findElement(By.id("pass")).isEnabled();
			
			if (passwordEnabled==true) {
				System.out.println("Pass");
			}
			else {
				System.out.println("Fail");
			}
			
			String Title = driver.getTitle();
			System.out.println("Title is " + Title);
			
			String Url = driver.getCurrentUrl();
			
			System.out.println("The current URL is " + Url);
     driver.close();
		
		
	}

}
