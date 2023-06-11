package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\prath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("prathap.narravula");
		driver.findElement(By.id("pass")).sendKeys("N@rravula1983");
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(10000);
		
		driver.close();
		
	}

}
