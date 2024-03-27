package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class poco {
public static void main(String args[]) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Poco F1");
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
	 driver.findElement(By.linkText("POCO")).click();
	driver.navigate().to("https://www.geeksforgeeks.org/");
	Thread.sleep(2000);
	driver.navigate().back();
	driver.quit();
	
}
}
