package alertHandling;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilityPackage.ReadExcelUtility;

public class ToolqaAlert 
{

	@Test(dataProvider="method")
	 
	  public void loginPage(String un,String pass)
	{
		
		
		  System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chrome74\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			driver.findElement(By.id("txtUsername")).sendKeys(un);
			driver.findElement(By.id("txtPassword")).sendKeys(pass);
			driver.findElement(By.id("btnLogin")).click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		String title=driver.getTitle();
		System.out.println(title);
		
	String geturl=	driver.getCurrentUrl();
	System.out.println(geturl);
	
	Assert.assertTrue(driver.getCurrentUrl().contains("https://opensource-demo.orangehrmlive.com/index.php/dashboard"));
	
	System.out.println("Login Successfully........");
		
			
			
			

	}

	@DataProvider(name="method")
	
	public Object[][] setData()
	{
		
		
		ReadExcelUtility rd=new ReadExcelUtility("G:\\MAVENAUTO\\seleniumdemo\\src\\main\\java\\Excel\\exp.xlsx");
		
		int rows=rd.rowcount(0);
		
		Object[][] data=new Object[rows][2];
		
	for(int i=0;i<rows;i++)
	{
		data[i][0]=rd.getData(0, i, 0);
		data[i][1]=rd.getData(0, i, 1);
		
		
		
		
		
	}
		/*data[0][0]="";
		data[0][1]="";
		
		data[1][0]="Admin";
		data[1][1]="admin123";
		
		data[2][0]="admin";
		data[2][1]="Admin123";
		*/
		return data;
	}
	
	
}
