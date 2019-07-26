import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHrm {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chrome74\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		
		


		
		
		String name="binduu";
		
		
		
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]"))).moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"))).moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"))).click().build().perform();
	
		
		//id=
		//tagname=tbody
		//tagname=tr
		// inside tr tagname=td
		
WebElement	totaltable=	driver.findElement(By.id("resultTable"));

 WebElement  totalfieldintable=totaltable.findElement(By.tagName("tbody"));
 
  List<WebElement> rows=totalfieldintable.findElements(By.tagName("tr"));
  
  for (WebElement row : rows) 
  {
	//System.out.println(row.getText());
	  
	 List<WebElement> colums=row.findElements(By.tagName("td"));
	 
	 WebElement singcolm=    colums.get(1).findElement(By.tagName("a"));
	 System.out.println(singcolm.getText());
	 
	 if(name.equals(singcolm.getText()))
	 {
		 colums.get(0).findElement(By.tagName("input")).click();
	 }
  }
                 
		
		
		
		
	}

}
