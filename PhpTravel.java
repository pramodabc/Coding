import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhpTravel {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chrome74\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.phptravels.net/");
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			
			driver.findElement(By.xpath("//span[text()='Flights   ']")).click();
			
			driver.findElement(By.xpath("//a//span[text()='Enter City Or Airport'][1]")).click();
			
			driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input")).sendKeys("Mumias Airport (MUM)");
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			
			
			
			driver.findElement(By.xpath("//div[@id='s2id_location_to']")).click();
			
	

	}
////div//input[@class='select2-input']
}
