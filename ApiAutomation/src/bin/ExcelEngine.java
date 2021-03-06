package bin;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelEngine {

	public static void main(String[] args) throws IOException {
		readExcel("/home/ab.srivastava/Desktop/abc.xls","Sheet1");
	}
	
	 public static LinkedList<Request>  readExcel(String filePath,String sheetName) throws IOException{
		 
		   File file =    new File(filePath);

	        LinkedList<Request> objectRequest = new LinkedList<Request>();

		    FileInputStream inputStream = new FileInputStream(file);

		    Workbook guru99Workbook = null;
	        guru99Workbook = new HSSFWorkbook(inputStream);

 
	        Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);

	        //Find number of rows in excel file

	        int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();

	        //Create a loop over all the rows of excel file to read it

	        for (int i = 1; i < rowCount+1; i++) {

	            Row row = guru99Sheet.getRow(i);
	            Request a= null;


	            //Create a loop to print cell values in a row
	            List<String> xlData=new LinkedList<String>();//creating linkedlist    

	            for (int j = 0; j < row.getLastCellNum(); j++) {
	            	Cell cell =row.getCell(j);
	            	String temp=new DataFormatter().formatCellValue(cell);

	            	xlData.add(temp);
 	                //Print Excel data in console

 
	            }
  a = new Request(xlData);
  objectRequest.add(a);
	            System.out.println();

	        }
			return objectRequest;

	 
	 }

}
