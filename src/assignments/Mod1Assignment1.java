package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Mod1Assignment1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//Launch URL
		driver.get("https://www.amazon.co.uk/");
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Verify page title
		System.out.println(" The title of the page is " + driver.getTitle());
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		
		System.setProperty("webdriver.gecko.driver", "c:\\Users\\prath\\Downloads\\firefoxdriver\\firefox.exe");
		WebDriver driver1= new geckoDriver();
		
		System.setProperty("weddriver.edge.driver", "c:\\Users\\Loki\\Downloads\\edgedriver.exe");
		
		WebDriver driver2 = new EdgeDriver();
		
		
				
		
		driver.close();
	}
	

}
