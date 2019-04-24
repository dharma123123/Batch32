package bluestone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BStone3 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.bluestone.com/");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.id("search_query_top_elastic_search")).sendKeys(Keys.chord("rings",Keys.ENTER));
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,2000)");
	    
	    
	    boolean status=driver.findElement(By.xpath("//img[@class='main-logo']")).isDisplayed();
	    
	    
	    driver.close();
	}

}
