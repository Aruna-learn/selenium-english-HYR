package com.seleniumpractiseEnglishHYR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		// System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe" );//if browser not opened we need to use driver executable and download it and paste in resources and same for fire fox, edge, internet exploree   
		
		
		//if the browser version changes everytime we can't download new version and update to over come we  use 3rd party library webdrivermanager and update in pom.xml then write like this
				WebDriverManager.chromedriver().setup();//thispc/c/users/hp/.m2/webdriver.chrome/firefox/version download if we run the browser
		
			WebDriverManager.chromedriver().browserVersion("126.0.6478.114").setup();//we can give version also
		
		
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.logicbig.com/tutorials/misc/git/eclipse.html");

		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.logicbig.com/tutorials/misc/git/eclipse.html");
		
//		WebDriver driver=new FirefoxDriver();
//		driver.get("https://www.logicbig.com/tutorials/misc/git/eclipse.html");
		
//		WebDriver driver=new SafariDriver();
//		driver.get("https://www.logicbig.com/tutorials/misc/git/eclipse.html");
		
	}

}
