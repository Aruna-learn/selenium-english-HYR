package com.seleniumpractiseEnglishHYR;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePOIeadExcelfileOldVersion {

	public static void main(String[] args) throws Exception {
		File file=new File("C:\\JAVA_PRACTISE\\Git_Practise\\seleniumpractiseEnglishHYR\\ExcelWorkBook\\test3.xlsx");//we hae povide the path for excel sheet having more data for dynamic example
		FileInputStream fis=new FileInputStream(file);
		HSSFWorkbook workbook=new HSSFWorkbook(fis);
		//HSSFSheet sheet=workbook.getSheetAt(0);//for static
		
		HSSFSheet sheet=workbook.getSheetAt(1);//for dynamic
		//static data find we can't use in real time projct everytime change index in code so use the dynamic
//	String cellvalue=	sheet.getRow(0).getCell(0).getStringCellValue();//string cell value means get content value
//		System.out.println(cellvalue);
		
		
		int rowcount=sheet.getPhysicalNumberOfRows();
		
		for(int i=0; i< rowcount; i++) {
			HSSFRow row=sheet.getRow(i);
			
			int cellcount=row.getPhysicalNumberOfCells();
			
			for(int j=0; i< cellcount; j++) {
				HSSFCell cell=row.getCell(j);
				String cellValue = getCellValue(cell);
				System.out.print("||"+cellValue);
			
		}
		
			System.out.println();
		
		}
		
			workbook.close();//to reduce memory leak we have to close workbook
			fis.close();
		
		}
		
		
		
		public static String getCellValue(Cell cell) {
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


