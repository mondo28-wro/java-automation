package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L07_Alerts {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Rozne\\drivers_v1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/popups.html");

		driver.findElement(By.cssSelector("[onclick='alertTrigger\\(\\)']")).click();

		// slowing the test down for demonstration purposes
		Thread.sleep(3000);

		// switching to the alert and clicking the ok button
		driver.switchTo().alert().accept();
	}

	}
