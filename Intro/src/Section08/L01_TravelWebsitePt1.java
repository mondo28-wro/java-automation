package Section08;

import java.util.List;

/**
 * 1. Close cookies warning
 * 2. Send text: Londyn to from field
 * 3. Locate Luton and click
 * 4. List destinations that start with a
 * 5. Locate Antalya and click
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class L01_TravelWebsitePt1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Rozne\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.easyjet.com/en");
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ensCloseBanner")));

		driver.findElement(By.id("ensCloseBanner")).click();

		driver.findElement(By.cssSelector("input[name='origin']")).click();
		driver.findElement(By.cssSelector("input[name='origin']")).sendKeys("London");

		List<WebElement> origins = new WebDriverWait(driver, 5)
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#ui-id-1 li>a>span")));

		for (WebElement origin : origins) {
			if (origin.getText().contains("Luton")) {
				origin.click();
			}
		}

		driver.findElement(By.cssSelector("input[name='destination']")).click();
		driver.findElement(By.cssSelector("input[name='destination']")).sendKeys("a");

		List<WebElement> destinations = new WebDriverWait(driver, 5)
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#ui-id-2 li>a>span")));

		for (WebElement destination : destinations) {
			if (destination.getText().contains("Antalya")) {
				destination.click();
			}
		}

	}

}
