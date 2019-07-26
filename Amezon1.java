import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amezon1 {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chrome74\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();

		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-size-medium inlineBlock unitLineHeight dealPriceText']"));
		
		List<String>list=new ArrayList<String>();
		
		for (WebElement price : prices)
		{
			list.add(price.getText());
			System.out.println(price.getText());
		}
		  
	System.out.println("Highest value is"	+Collections.max(list));
	System.out.println("Lowest value is"	+Collections.min(list));

	}

}
