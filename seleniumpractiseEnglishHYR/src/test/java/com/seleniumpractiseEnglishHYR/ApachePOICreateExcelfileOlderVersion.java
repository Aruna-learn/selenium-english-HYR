package com.seleniumpractiseEnglishHYR;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ApachePOICreateExcelfileOlderVersion {

	//https://poi.apache.org/download.html-download apache  binary ja for normal java project and  add to build path 
	//	https://mvnrepository.com/search?q=apache+poi-mvn dependency apache for mvn project
	//		https://poi.apache.org/components/index.html- which file(.xls, .xlsx, .ppt,.pptx etc)version requires which mvn artifact
	
	public static void main(String[] args) throws Exception {
		//older version of excel files .xls
		HSSFWorkbook workbook=new HSSFWorkbook();//created excel workbook
		//HSSFSheet sheet=workbook.createSheet();//created sheet without sheet name 
		HSSFSheet sheet=workbook.createSheet("Testsheet");//craeted sheet with name
		
		
		sheet.createRow(0);//create row 0
		sheet.getRow(0).createCell(0).setCellValue("Aruna");//create cell and enter value in cell using set cell value
		sheet.getRow(0).createCell(1).setCellValue("Reddy");
		
		sheet.createRow(1);//create row 1
		sheet.getRow(1).createCell(0).setCellValue("chinni");//create cell and enter value in cell using set cell value
		sheet.getRow(1).createCell(1).setCellValue("amma");
		
		
		//we can create file by using file and fileoutput stream
		//File file=new File("C:\\JAVA_PRACTISE\\Git_Practise\\seleniumpractiseEnglishHYR\\ExcelWorkBook\\test1.xls");
		
		//we can create file by using file
		//workbook.write(file);
		
		
		
		
		//we can create file by using fileoutput stream
		File file=new File("C:\\JAVA_PRACTISE\\Git_Practise\\seleniumpractiseEnglishHYR\\ExcelWorkBook\\test4.xlsx");
		FileOutputStream fos=new FileOutputStream(file);// fileoutput stream write the data
		workbook.write(fos);
		
		
		
		workbook.close();
		
		
		
		
		
		
		
	}

}

//structure of excel is excel workbook-sheet-row-cell