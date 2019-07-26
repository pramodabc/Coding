package demo;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clutchco {
	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chrome74\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://clutch.co/it-services");
		WebElement allCompanies =driver.findElement(By.className("directory-list"));
		List<WebElement> noOfcompanie= allCompanies.findElements(By.className("provider-row"));
		System.out.println(noOfcompanie.size());
		String MainWindow = driver.getWindowHandle();
		for(WebElement ele:noOfcompanie)
		{
		String heading = ele.findElement(By.className("company-name")).getText();
		String box = ele.findElement(By.xpath("//*[@id=\"provider-26793\"]//a")).getText();
		String content = ele.findElement(By.xpath("//*[@id=\"provider-26793\"]//blockquote/p")).getText();
				
		Set<String>s1 =driver.getWindowHandles();
		Iterator<String> itr= s1.iterator();
		while(itr.hasNext())
		{
			String ChildWindow = itr.next();
			if(!MainWindow.equalsIgnoreCase(ChildWindow))
			{
				driver.switchTo().window(MainWindow);
				
			}
				
		}
		System.out.println("heading is: "+ heading);
		System.out.println("Box IS: " + box);
		System.out.println("Content is :" + content);
		}
	}
}
