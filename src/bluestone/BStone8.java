package bluestone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BStone8 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	  driver.get("https://www.yatra.com/");
	  
	  driver.findElement(By.id("BE_flight_origin_city")).sendKeys("BLR");
	  driver.findElement(By.id("BE_flight_arrival_city")).sendKeys("BBI");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//i[@class='font-icon icon-inside icon-calendar blur_class BE_flight_arrival_date']")).click();
	  int date=17;
	  driver.findElement(By.id("+"+date+"+/04/2019")).click();
}
}
