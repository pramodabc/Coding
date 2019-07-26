package utilityPackage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelUtility 
{
	
	XSSFWorkbook wb;
	XSSFSheet sheet=null;
	
	
	public ReadExcelUtility(String excelpath)
	{
		try 
		{
		File file=new File(excelpath);
		
		FileInputStream ip=new FileInputStream(file);
		
		wb=new XSSFWorkbook(ip);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		
		
		
	}

	public String getData(int sheetindex,int rows,int coloum)
	{
		sheet= wb.getSheetAt(sheetindex);
		
	   String da=	sheet.getRow(rows).getCell(coloum).getStringCellValue();
	
	   return da;
	}
	
	public int  rowcount(int shtindex)
	{
	      int rows=wb.getSheetAt(shtindex).getLastRowNum();
	    
	      rows=rows+1;
	      
	      return rows;
	}
	
}
