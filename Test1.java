import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 
{
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("beforemethod");
	}

	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeclass");
	}
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("beforesuite");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("beforetest");
	}
	
	
	@BeforeMethod
	
	public void beforemethod1()
	{
		System.out.println("beforemethod1");
	}
	@Test
	public void test()
	{
		System.out.println("test");
	}
	
	@Test
	public void test1()
	{
		System.out.println("test1");
		
		
	}
	
	
	
	
}
