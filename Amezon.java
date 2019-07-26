import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amezon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chrome74\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();

		List<WebElement> prices = driver
				.findElements(By.xpath("//span[@class='a-size-medium inlineBlock unitLineHeight dealPriceText']"));
		String max = "";
		
		for (WebElement price : prices) {

			String singleprice = price.getText();

		System.out.println(singleprice);

			int i = singleprice.compareTo(max);
			if (i >= 0) {
				max = singleprice;
			}
		}
		         System.out.println("Maximum price:" + max);
		
	

	}

}
