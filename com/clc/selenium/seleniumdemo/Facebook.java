package com.clc.selenium.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facebook 
{
	@Test(dataProvider="facebook")
	
	public void testdata(String un,String pass)
	{
		
		System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chrome74\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/login/");
		
		driver.findElement(By.id("email")).sendKeys(un);
		
		driver.findElement(By.id("pass")).sendKeys(pass);
		
		driver.findElement(By.id("loginbutton")).click();
		
		
		
	}
	
	
	
	
	@DataProvider(name="facebook")
	
	public Object[][]verifyCredential()
	{
		
		FileRead obj=new FileRead("G:\\MAVENAUTO\\seleniumdemo\\src\\main\\java\\orangehrm.xlsx");
	     int row=obj.getrowcount(0);
		
		Object[][] value=new Object[row][2];
		
		for(int i=0;i<row;i++)
		{
			value[i][0]=obj.getdata(0, i, 0);
			value[i][1]=obj.getdata(0, i, 1);
		}
		return value;
		
		
		
	}

}
