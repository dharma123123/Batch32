package bluestone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BStone6 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.bluestone.com/");
	    driver.findElement(By.linkText("Visit Our Stores")).click();
	    
	    
	 List<WebElement> lst = driver.findElements(By.xpath("//div[@class='map-info-text']"));
	    System.out.println(lst.size());
	    
	}

}
