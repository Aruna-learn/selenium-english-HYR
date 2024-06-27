package com.seleniumpractiseEnglishHYR;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFiles {

	public static void main(String[] args) throws InterruptedException {
		String filetype="PDF";// if we want pdf, doc, ods,exl, odt we directly specify here no need to write in xpath code
		//chrome
		
//		ChromeOptions options=new ChromeOptions();
//		
//		HashMap<String, Object> prefs=new HashMap<String, Object>();
//		prefs.put("plugins.always_open_pdf_externally", true);//download file in download location in our computer for pdf doc only we use this otherwise no need for remaining files
//		prefs.put("download.default_directory", "C:\\Users\\hp\\Documents\\seleniumdownloads");//change pdf download location in our system (folder created)
//		
//		options.setExperimentalOption("prefs", prefs);	
//		
//		
//		WebDriver driver= new ChromeDriver(options);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//h3 xpath element no find so give some time to open 
//		
//		driver.get("https://file-examples.com/");
//		Thread.sleep(6000);
//		driver.findElement(By.xpath("//h3[text()='Documents']/following-sibling::a")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[text()='"+filetype+"']/following-sibling::td[2]/a")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[starts-with(text(),'Download sample ')]")).click();//find element always finds the 1st occurence
//		
//		
		//edge(if we are using edge for selenium below 4 version options different then edge selenium tool add to dependencies and import here  edge options from selenium tools if we are using below seleium 4 version only)
//        EdgeOptions options=new EdgeOptions();
//		
//		HashMap<String, Object> prefs=new HashMap<String, Object>();
//		prefs.put("plugins.always_open_pdf_externally", true);//download file in download location in our computer only for pdf download
//		prefs.put("download.default_directory", "C:\\Users\\hp\\Documents\\seleniumdownloads");//change pdf download location in our system (folder created)
//		
//		options.setExperimentalOption("prefs", prefs);	
//		
//		
//		WebDriver driver= new EdgeDriver(options);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//h3 xpath element no find so give some time to open 
//		
//		driver.get("https://file-examples.com/");
//		Thread.sleep(6000);
//		driver.findElement(By.xpath("//h3[text()='Documents']/following-sibling::a")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[text()='"+filetype+"']/following-sibling::td[2]/a")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[starts-with(text(),'Download sample ')]")).click();//find element always finds the 1st occurence
		
		//firefox
		
		FirefoxOptions options=new FirefoxOptions();
	
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("pdfjs.disabled", true);//preference like hashmap only for pdf
//		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");//mime trype(application/pdf available in url itself of fileexample if we want doc xls in file example link it is available while downloading the mime type availalable) trying to download but popup came for open or save to avoid we use this line
//		profile.setPreference("browser.download.dir", "C:\\Users\\hp\\Documents\\seleniumdownloads");//default download into downloads so change the directory to download
//		profile.setPreference("browser.download.folderList", 2);//0 for desktop, 1 for downloads default, 2 for specified folder
		options.setProfile(profile);
		
		
		
		
		
		
		WebDriver driver= new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//h3 xpath element no find so give some time to open 
		
		driver.get("https://file-examples.com/");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//h3[text()='Documents']/following-sibling::a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[text()='"+filetype+"']/following-sibling::td[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[starts-with(text(),'Download sample ')]")).click();//find element always finds the 1st occurence
		
		
		
		
		//https://kb.mozillazine.org/About:config_entries
		//https://github.com/microsoft/edge-selenium-tools
		
		//https://www.sitepoint.com/mime-types-complete-list/  -mimetype(application/pdf)
		
		

	}

}
