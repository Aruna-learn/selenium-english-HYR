package com.seleniumpractiseEnglishHYR;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class PopUpPermission {

	public static void main(String[] args) throws InterruptedException {

		HashMap<String, Integer> contentSettings = new HashMap<String, Integer>();
		HashMap<String, Object> profile = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		contentSettings.put("notifications", 1);//ask default


		
	//	contentSettings.put("geolocation", 2);//block
	//	contentSettings.put("media_stream", 1);//allow

		profile.put("managed_default_content_settings", contentSettings);
	prefs.put("profile", profile);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://www.justdial.com/Chennai/Nobrokercom/044PXX44-XX44-160614141422-R8Z2_BZDET");
		//options.addArguments("disable-notifications");

	}

}

//pop up websites
//driver.get("https://www.cleartrip.com/");
// driver.get("https://whatmylocation.com/#google_vignette");
//driver.get("https://webcamtests.com/");
//driver.get("https://web-push-book.gauntface.com/demos/notification-examples/ ");
//driver.get("https://mictests.com/");
//driver.findElement(By.xpath("//button[@id='mic-launcher']")).click();

//options.addArguments("disable-notifications");//normal popup
// options.addArguments("disable-media-stream");//disable camera or mic notification

// options.addArguments("disable-geolocation");//disable location notification




//driver.get("https://web-push-book.gauntface.com/demos/notification-examples/");

		//driver.findElement(By.xpath("//input[contains(@class,'c-toggle ')]")).click();
		
//		driver.get("https://mictests.com/");
//		Thread.sleep(6000);
//		driver.findElement(By.id("mic-launcher")).click();
//		
//		Thread.sleep(6000);
//		options.addArguments("disable-notifications");