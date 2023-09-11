package Section05;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class L12_Accordion {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Rozne\\drivers_v1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://automationtesting.co.uk/accordion.html");
		
		driver.findElement(By.cssSelector(".accordion > div:nth-of-type(1)")).click();
		Thread.sleep(1500);
		driver.findElement(By.cssSelector(".accordion > div:nth-of-type(1)")).click();
		Thread.sleep(1500);
		driver.findElement(By.cssSelector(".accordion > div:nth-of-type(3)")).click();
		Thread.sleep(1500);
		driver.findElement(By.cssSelector(".accordion > div:nth-of-type(3)")).click();
		Thread.sleep(1500);
		driver.findElement(By.cssSelector(".accordion > div:nth-of-type(5)")).click();
		Thread.sleep(1500);
		driver.findElement(By.cssSelector(".accordion > div:nth-of-type(5)")).click();
		
		// for loop used to loop the below code until the i < 10 condition is met
		//		for (int i = 0; i < 10; i++) {
		//			driver.findElement(By.cssSelector(".accordion > div:nth-of-type(1)")).click();
		//			driver.findElement(By.cssSelector(".accordion > div:nth-of-type(3)")).click();
		//			driver.findElement(By.cssSelector(".accordion > div:nth-of-type(5)")).click();
		
	}

	}
