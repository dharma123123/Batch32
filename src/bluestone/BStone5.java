package bluestone;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BStone5 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.bluestone.com/");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    

	    driver.findElement(By.xpath("//a[@title='Gold Mine 10+1 Monthly Scheme']")).click();
	    
	    String amount="20000";
	    driver.findElement(By.id("amount")).sendKeys(amount);
	    String email="bhsdbsadn@gmail.com";
	    driver.findElement(By.id("Email")).sendKeys(email);
	    driver.findElement(By.id("tahLpSubmit")).click();
	    
	    
	    String actAmt=driver.findElement(By.name("subscriptionAmount")).getText();
	    
	}

}
