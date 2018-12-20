package scripts.resources;

import java.io.IOException;

public class TestSheetData {

	 public static void main(String...strings) throws IOException{

		    //Create an object of ReadGuru99ExcelFile class

		    ReadExcel objExcelFile = new ReadExcel();

		    //Prepare the path of excel file

		    String filePath = System.getProperty("user.dir")+"\\src\\excelExportAndFileIO";

		    //Call read file method of the class to read data

		    objExcelFile.readExcel(filePath,"ExportExcel.xlsx","ExcelGuru99Demo");

		    }

		}
