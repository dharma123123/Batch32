package bluestone;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BStone4 {
	public static void main(String[] args) {
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.bluestone.com/");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    
	    driver.findElement(By.xpath("//a[@title='Gold Mine 10+1 Monthly Scheme']")).click();
	    driver.findElement(By.id("tahLpSubmit")).click();
	    
	  WebElement wb=driver.findElement(By.id("Email_error"));
	    boolean status=wb.isDisplayed();
	    if(status) {
	    	System.out.println("PAss");
	    }
	  
}

}
