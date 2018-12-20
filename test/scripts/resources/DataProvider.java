package scripts.resources;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;
import java.io.File;

import java.io.FileInputStream;
import org.apache.poi.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class DataProvider {
	Workbook wb;
	Sheet sheet;
	Cell cell;

	public String[][] getTableArray(String xlFilePath, String sheetName, String tableName){
        String[][] tabArray=null;
        try 
    	{
        File file =    new File(xlFilePath);
            FileInputStream inputStream = new FileInputStream(file);

            wb = new XSSFWorkbook(inputStream);	
        	}
        	 catch(Exception e) {
        		 System.out.println(e.getMessage());
        	 }	

        	//  Workbook workbook = Workbook.getWorkbook(new File(xlFilePath));
            sheet = wb.getSheet(sheetName);
           // Cell tableStart=sheet.findCell(tableName);
           Row row_no = sheet.getRow(0);
           row_no.getLastCellNum();
           row_no.getCell(0).getStringCellValue();
           int col_no = sheet.getRow().

        		   
        	//for loop row no =i
        		   
        		   
        		   
        		   
       int startRow,startCol, endRow, endCol,ci,cj;
            
            startRow=tableStart.getRow();//2
            startCol=tableStart.getColumn();//1

            Cell tableEnd= sheet.findCell(tableName, startCol+1,startRow+1, 100, 64000,  false);                

            endRow=tableEnd.getRow();//6
            endCol=tableEnd.getColumn();//6
            
            System.out.println("startRow="+startRow+", endRow="+endRow+", " +
                    "startCol="+startCol+", endCol="+endCol);
            tabArray=new String[endRow-startRow-1][endCol-startCol-1];
            ci=0; //array row

            for (int i=startRow+1;i<endRow;i++,ci++){//i represents xls row
                cj=0;//array column
                for (int j=startCol+1;j<endCol;j++,cj++){//j represents xls column
                    tabArray[ci][cj]=sheet.getCell(j,i).getContents();
                }
            }
        }
        catch (Exception e)    {
            System.out.println("Please check if file path, sheet name and tag name are correct");
            
        }

        return(tabArray);
    }