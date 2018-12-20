package POM;
import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
 
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;

    public void readtheExcel (String filePath,  String sheetName) throws Exception{

    
try 
	{
    File file =    new File(filePath);

    //Create an object of FileInputStream class to read excel file

    FileInputStream inputStream = new FileInputStream(file);

    wb = new XSSFWorkbook(inputStream);	
	}
	 catch(Exception e) 
	{
		 System.out.println(e.getMessage());
	 }	
    
   Sheet DataSheet = wb.getSheet(sheetName);

    //Find number of rows in excel file

    int rowCount = DataSheet.getLastRowNum()-DataSheet.getFirstRowNum();

    //Create a loop over all the rows of excel file to read it

    for (int i = 0; i < rowCount+1; i++) {

        Row row = DataSheet.getRow(i);

        //Create a loop to print cell values in a row

        for (int j = 0; j < row.getLastCellNum(); j++) {

            //Print Excel data in console

            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

        }

        System.out.println();

    }
	return ;

    

    }


public static void main(String...String) throws Exception{

    //Create an object of ReadGuru99ExcelFile class

    ReadExcel objExcelFile = new ReadExcel();
    

    //Prepare the path of excel file

    String filePath = System.getProperty("C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\UKTD\\resources\\UKTD Login Credentials.xlsx");

    //Call read file method of the class to read data

    objExcelFile.readtheExcel(filePath,"Datapool");

    	
}

}