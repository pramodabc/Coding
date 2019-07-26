package ExcelRead;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelR 
{
	
	@Test
	public void testdata()
	{
		
		try 
		{
		File file=new File("G:\\MAVENAUTO\\seleniumdemo\\pramod.xlsx");
		FileInputStream ip=new FileInputStream(file);
		
		XSSFWorkbook woorkbook=new XSSFWorkbook(file);
		
		  XSSFSheet sheet=woorkbook.getSheetAt(0);
		  
      Iterator<Row>rows=sheet.rowIterator();
      
         while(rows.hasNext())
         {
        	 
        Row row=rows.next();
         
    Iterator<Cell> cells= row.cellIterator();
    while(cells.hasNext())
    {
    	
        Cell cell=cells.next();
        
        switch (cell.getCellType()) 
        {
        case Cell.CELL_TYPE_NUMERIC:
        	System.out.println(cell.getNumericCellValue()+"t");
        	break;
        	
        case 	Cell.CELL_TYPE_STRING:
        	System.out.println(cell.getStringCellValue()+"t");
        	break;
		}
    	
    }
    System.out.println("");
        
        
        
         }
		
		
		ip.close();
		
		System.out.println("sucessfully write.....");
		
		
		
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		
	}

}
