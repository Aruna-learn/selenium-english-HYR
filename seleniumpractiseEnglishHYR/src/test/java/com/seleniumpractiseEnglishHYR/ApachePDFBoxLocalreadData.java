package com.seleniumpractiseEnglishHYR;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class ApachePDFBoxLocalreadData {

	@Test
	public void ReadPDFlocalfile() throws Exception {
		
		// if the file is available in local machine
		
		File file=new File("C:/Users/hp/Downloads/Lorem.pdf");//create instance for file
		FileInputStream fis=new FileInputStream(file);//fis read bytes raw data and keep the rawdata into fis
		
		PDDocument pdfDocument =Loader.loadPDF(file);//convert raw data to pdf and PDDocument pdfDocument = PDDocument.load(fis); replaced with PDDocument pdfDocument =Loader.loadPDF(file); loader.loader file 
		System.out.println(pdfDocument.getPages().getCount());//print the pages count
		
		//read data from pdf
		PDFTextStripper  pdftext=new PDFTextStripper();//PDFTextStripper used for reaad the data from pdf file
	   String	textdoc=pdftext.getText(pdfDocument);//tells from which document read data and entire text from pdf store in variable textdox
		
		//System.out.println(textdoc);//prints all the text in pdf
		
		
		//verify whetehr the doc text is pdf or not using assertions in single page
		//Assert.assertTrue(textdoc.startsWith("Lorem"));//if pdf starts with lorem or not
		
		//Assert.assertTrue(textdoc.contains("fringilla"));//verify whether the pdf have the text fringilla and if not thouws error
		
		//verify whetehr the doc text in pdf in multiple pages start and end page
		pdftext.setStartPage(1);
		pdftext.setEndPage(3);
		Assert.assertTrue(textdoc.contains("fringilla"));
		
		
		pdfDocument.close();
		fis.close();
		
		
		

	}

}
