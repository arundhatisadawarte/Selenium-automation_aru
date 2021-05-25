package Group1.SeleniumFramework;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel extends UpdatedBaseClass {
  @Test
  public void excelMethod() {
  }
  File file= new File("E:\\Arundhati\\selenium\\ReadExcelData.xlsx");
  {
  try {
	  FileInputStream inputFile=new FileInputStream(file);
	  XSSFWorkbook wb=new XSSFWorkbook(inputFile);
	  Sheet sheet=wb.getSheet("Sheet1");
	  int totalRows=sheet.getLastRowNum();
	  for(int i=1;i<=2;i++)
	  {
		  Row row=sheet.getRow(i);
		  int totalColumns=row.getLastCellNum();
		  for(int j=0;j<7;j++)
		  {
			  String data=sheet.getRow(i).getCell(j).getStringCellValue();
			  System.out.print(data);
			  System.out.print(" ");
			  
			  
		}
		  System.out.println();
		  
		
		  
	  }
  }
  catch(Exception e)
  {
	  e.printStackTrace();
	  
}
  }
}



