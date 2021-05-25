package Group1.SeleniumFramework;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

@Test
public class Excel {
  public void excelMethod() throws IOException {
	  File file=new File("E:\\Arundhati\\selenium\\ReadExcelData.xlsx");
	  try {
	  FileInputStream inputfile=new FileInputStream(file);
	  XSSFWorkbook wb=new XSSFWorkbook(inputfile);
	  Sheet sheet=wb.getSheet("sheet1");
	  int totalRows=sheet.getLastRowNum();
	  for(int i=1;i<=totalRows-1;i++)
	  {
		  Row row=sheet.getRow(i);
		  int totalColumns=row.getLastCellNum();
		  for(int j=0;j<totalColumns;j++)
		  {
			  //String data=sheet.getRow(i).getCell(j).getStringCellValue();
			  Cell cell=sheet.getRow(i).getCell(j);
			  Object data=null;
			  if(cell.getCellType().equals(CellType.STRING)) {
				  data=cell.getStringCellValue();
			  }
			  else if(cell.getCellType().equals(CellType.NUMERIC)) {
				 data=cell.getNumericCellValue();
				 
			  }
			  System.out.print(data);
			  System.out.print(" ");
		  }
		  System.out.println();
			 
		  }
	  
  }catch(Exception e) {
	  e.printStackTrace();
	  
  }
  }
}
	  


		  
		  
	 
	  
  
