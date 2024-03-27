package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class ebay {
public static void main(String args[]) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		driver.findElement(By.cssSelector("#gh-ac")).sendKeys("iPhone14");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#gh-btn")).click();
		
		js.executeScript("window.scrollBy(0,500)");
		
		
		
	
	

	
	
	
	
}
}
