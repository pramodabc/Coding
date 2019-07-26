package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class University {
	static WebDriver driver;
		@FindBy(name="first_name")
		WebElement First;
		@FindBy(name="last_name")
		WebElement Last;
		@FindBy(name="email")
		WebElement Email;
		@FindBy(name="message")
		WebElement Comments;
		
		public University()
		{
			PageFactory.initElements(driver, this);
		}
		public  void enterValue(String fName)
		{
			First.sendKeys(fName);
		}
		public void enterLasstname(String lName)
		{
			Last.sendKeys(lName);
		}
		public void Mail(String eMail)
		{
			Email.sendKeys(eMail);
		}
		public void Comments(String mComment)
		{
			Comments.sendKeys(mComment);
		}
		
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chrome74\\chromedriver.exe");

		 driver = new ChromeDriver();

		driver.get("http://webdriveruniversity.com/index.html");
		driver.findElement(By.partialLinkText("CONTACT US")).click();
		String MainWindow =driver.getWindowHandle();
		Set s1 =driver.getWindowHandles();
		Iterator<String> li = s1.iterator();
		while(li.hasNext())
		{
			String ChildWindow = li.next();
			if(!MainWindow.equalsIgnoreCase(ChildWindow))
			{
				driver.switchTo().window(ChildWindow);
				University details = new University();
				details.enterValue("sam");
				System.out.println("value added");
				details.enterLasstname("ssss");
				details.Mail("sam@org.com");
				details.Comments("Here are the details about address....");
				driver.findElement(By.cssSelector("input.contact_button")).click();
				driver.switchTo().window(MainWindow);
			}
					
		}
		
	}}

