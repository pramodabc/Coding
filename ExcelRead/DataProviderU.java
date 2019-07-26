package ExcelRead;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilityPackage.ReadExcelUtility;

public class DataProviderU 
{
	
	@Test(dataProvider="pramod")
	public void test(String un,String pass)
	{
		
		
		System.out.println(un);
		System.out.println(pass);
	}
	
	
	
	
	
	
	
	
	
	
	
	@DataProvider(name="pramod")
	
	public Object[][] savedata()
	{
		ReadExcelUtility re=new ReadExcelUtility("G:\\MAVENAUTO\\seleniumdemo\\pramod.xlsx");
	int rows=re.rowcount(0);
		
		Object[][] data=new Object[rows][2];
		
		for(int i=0;i<rows;i++)
		{
			
			
			data[i][0]=re.getData(0, i, 0);
			data[i][1]=re.getData(0, i, 1);
		}
		return data;
		
	}
	

}
