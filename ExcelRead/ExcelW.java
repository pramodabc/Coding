package ExcelRead;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelW 
{

	@Test
	public void testmethod() throws IOException
	{
		XSSFWorkbook wb=new XSSFWorkbook();
		
		  XSSFSheet sh=wb.createSheet("sheet1.1");
		  
		  Map<String,Object[] > data=new TreeMap();
		  
		
		  data.put("1", new Object[] {"ID", "NAME", "LASTNAME"});
		  
		  data.put("2", new Object[] {101,"p","p"});
		  data.put("3", new Object[] {102,"r","a"});
		  data.put("4", new Object[] {103,"a","t"});
		  data.put("5", new Object[] {104,"m","i"});
		  
	Set<String>	keys=  data.keySet();
	//System.out.println(keys);
	int rowcount=0;
	
	for (String key : keys) 
	{
		XSSFRow rows=sh.createRow(rowcount++);
		//System.out.println(rows);
		
	Object[] objs=data.get(key);
	int colcount=0;
	for (Object obj : objs) 
	{
		System.out.println(obj);
		
	Cell cell=	rows.createCell(colcount);	
	
	if(obj instanceof String)
	{
		cell.setCellValue((String)obj);
	}
	else if(obj instanceof Integer)
	{
		cell.setCellValue((Integer)obj);
	}
	
	
	
	}
		
		
	}
		  
		try {
			FileOutputStream out=new FileOutputStream("pramod.xlsx");
			wb.write(out);
			out.close();
			
			System.out.println("Excel Sheet succesfully genteated....");
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
