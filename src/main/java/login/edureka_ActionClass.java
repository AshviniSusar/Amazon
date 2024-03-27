package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class edureka_ActionClass {
public static void main(String args[]) throws InterruptedException {
	
	
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.edureka.co/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//input[@class='new-search-inp ui-autocomplete-input']")).click();
//		driver.findElement(By.xpath("//span//b[@class='caret'][1]")).click();
//		
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//a[@class='dropdown-toggle hidden-xs hidden-sm ga_browse_top_cat']"))).build().perform();
	
		Thread.sleep(2000);
		
		WebElement link = driver.findElement(By.xpath("//a[@title='Software Testing']"));
		builder.moveToElement(link).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li//a[text()='Software Testing']")).click();
		Thread.sleep(4000);
		
		WebElement act = driver.findElement(By.id("search-input"));
		builder.moveToElement(act).build().perform();
		Thread.sleep(4000);
		
		WebElement search = driver.findElement(By.xpath("//div[@class='search_input_result']"));
		builder.moveToElement(search).build().perform();
		
		Thread.sleep(4000);
		Action seriesOfActions;
		seriesOfActions = builder
				.sendKeys(act,"selenium")
				.keyDown(search,Keys.SHIFT)
				.keyUp(search,Keys.SHIFT)
				.build();
		seriesOfActions.perform();
		
		Thread.sleep(4000);
		driver.quit();
}
}
