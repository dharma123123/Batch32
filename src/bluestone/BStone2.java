package bluestone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BStone2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.bluestone.com/");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.id("search_query_top_elastic_search")).sendKeys(Keys.chord("rings",Keys.ENTER));
	    
	    WebElement genderWb=driver.findElement(By.xpath("//span[text()='Gender']"));
	    Actions act=new Actions(driver);
	    act.moveToElement(genderWb).perform();
	    WebElement count=driver.findElement(By.xpath("//span[@data-displayname='women']/child::span[@class='items-count']"));
	    System.out.println(count.getText());
	    driver.close();
	    
	}

}
