package com.seleniumpractiseEnglishHYR;

import java.io.IOException;
import java.net.URL;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApachePDFBoxInternetreadData {

	@Test
	public void ReadPDFfileInternet() throws Exception {
		
		
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		driver.get("https://file-examples.com/");
//		
//		driver.findElement(By.xpath("//h3[text()='Documents']/following-sibling::a")).click();
//		
//		driver.findElement(By.xpath("//td[text()='PDF']/following-sibling::td[2]/a")).click();
//		
//		driver.findElement(By.xpath("//a[starts-with(text(),'Download sample ')]")).click();//find element always finds the 1st occurence
//		
		//String urlstring=driver.getCurrentUrl();//reading address of pdf and url
		
		
		//URL url=new URL(urlstring);//create url instance
		URL url=new URL("https://file-examples.com/storage/fed5266c9966708dcaeaea6/2017/10/file-sample_150kB.pdf");//we can directly provide url of pdf instead of all driver click operations then comment the driver quit
		PDDocument pdfDocument =Loader.loadPDF((RandomAccessRead) url.openStream());//open stream to url
		
	
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
	
	//driver.quit();
	
	
	
	}
}
