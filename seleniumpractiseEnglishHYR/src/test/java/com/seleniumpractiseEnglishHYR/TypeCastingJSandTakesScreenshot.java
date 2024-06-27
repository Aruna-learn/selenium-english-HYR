package com.seleniumpractiseEnglishHYR;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TypeCastingJSandTakesScreenshot {
	static String browserName = "Chrome";
	static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		switch (browserName) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			break;
		}
		}
		
//WebDriverManager.ChromeDriver().setup();
	//ChromeDriver driver = new ChromeDriver();
	
//	WebDriverManager.firefoxdriver().setup();
//	FirefoxDriver driver = new FirefoxDriver();
	//driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		
		
		//typecasting javascript executor
		JavascriptExecutor jsex=(JavascriptExecutor) driver;
		String title=(String) jsex.executeScript(" return document.title");
		//System.out.println(title);
		
		//typecasting takescreenshot executor
		TakesScreenshot ts=(TakesScreenshot) driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file, new File("./Screenshots/img10.jpg"));
		
		
		
		
		
		
		
		
		
		//driver.quit();

	}




//So basically java doesn't allow us to create the interface objects, so that is the reason we always typecast the webdriver instance.