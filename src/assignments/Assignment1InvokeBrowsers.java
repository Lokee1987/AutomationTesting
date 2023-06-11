package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class Assignment1InvokeBrowsers {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(6000);
		 driver.getTitle();
		 System.out.println("The Title of the page is "+ driver.getTitle());
		driver.close();
	}

}
