package Section08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L01_TravelWebsitePt1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Rozne\\drivers_v1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.easyjet.com/pl");
		
		driver.findElement(By.id("ensCloseBanner")).click();
		
		driver.findElement(By.cssSelector("input[name='origin']")).sendKeys("London");
	}

}
