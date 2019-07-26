import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OrangeHrmDate {

	public static void main(String[] args) 
	{
      System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chrome74\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		
		Actions action	=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu__Performance\"]"))).moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_performance_ManageReviews\"]"))).moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_performance_searchPerformancReview\"]"))).click().build().perform();
		
    
	
		
		driver.findElement(By.xpath("//*[@id=\"performanceReview360SearchForm\"]/fieldset/ol/li[4]/img")).click();	
	
	
		
		
		WebElement calender=	driver.findElement(By.id("ui-datepicker-div"));
		
		
		Select year=new Select(calender.findElement(By.className("ui-datepicker-year")));
	
		year.selectByVisibleText("2004");
	
	Select select=new Select(calender.findElement(By.className("ui-datepicker-month")));
		
		select.selectByIndex(7);
		
		
	calender.findElement(By.tagName("tbody"));	
	
List<WebElement>listdate=calender.findElements(By.xpath("//tbody//tr//td//a[@class='ui-state-default']"));
		for (WebElement date : listdate) 
		{
			System.out.println(date.getText());
			
			if(date.getText().equals("12"))
			{
				date.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
}
}