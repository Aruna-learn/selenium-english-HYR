package com.seleniumpractiseEnglishHYR;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePOIeadExcelfileNewVersion {

	public static void main(String[] args) throws Exception, Exception {
		
		File file=new File("C:\\JAVA_PRACTISE\\Git_Practise\\seleniumpractiseEnglishHYR\\ExcelWorkBook\\test3.xlsx");//we hae povide the path for excel sheet having more data for dynamic example
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		//XSSFSheet sheet=workbook.getSheetAt(0);//for static
		
		XSSFSheet sheet=workbook.getSheetAt(1);//for dynamic
		//static data find we can't use in real time projct everytime change index in code so use the dynamic
//	String cellvalue=	sheet.getRow(0).getCell(0).getStringCellValue();//string cell value means get content value
//		System.out.println(cellvalue);
		
		
		
		//dynamically get the data use the below code
		int rowcount=sheet.getPhysicalNumberOfRows();
		
		for(int i=0; i< rowcount; i++) {//row iterate those haing data only
			XSSFRow row=sheet.getRow(i);
			
			int cellcount=row.getPhysicalNumberOfCells();
			
			for(int j=0; i< cellcount; j++) {//celliterate those haing data only
				XSSFCell cell=row.getCell(j);
				String cellValue = getCellValue(cell);//calling method
				System.out.print("||"+cellValue);//print the table in console
			
		}
		
			System.out.println();
		
		}
		
			workbook.close();//to reduce memory leak we have to close workbook
			fis.close();
		
		}
		
		
		
		public static String getCellValue(Cell cell) {//identify the type of cell and convert the data and return in form of string
			switch (cell.getCellType()) {
			case NUMERIC:
				return String.valueOf(cell.getNumericCellValue());
			case BOOLEAN:
				return String.valueOf(cell.getBooleanCellValue());
			case STRING:
				return cell.getStringCellValue();
			case BLANK:
				return "";
			default:
				return cell.getStringCellValue();
			}
		}
		
		
		
	}	
		
		
		
		
		
		
		
		
		
		

	


