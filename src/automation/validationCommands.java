package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validationCommands {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\prath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		String Url = driver.getCurrentUrl();
		if (Url.contains(".com"))
		{
			System.out.println("Url contains .com");
			
		}
		else {
			System.out.println("Url doesnot contains .com");
		}
		
		
		driver.close();
		
		
		
		
		
		
				
			
			

	}

	}


