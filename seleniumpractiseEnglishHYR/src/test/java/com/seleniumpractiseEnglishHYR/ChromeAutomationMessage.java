package com.seleniumpractiseEnglishHYR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeAutomationMessage {

	public static void main(String[] args) {
		
		// remove chrome is being controlled by automated test softwate in different ways
		ChromeOptions options=new ChromeOptions();
		
		//different ways to remove chrome automation message[collection object or array object to handle multiple values]
		//options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		//options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		//options.setExperimentalOption("excludeSwitches",Collections.singleton("enable-automation"));
		//options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		
//		List<String> eSwitches=new ArrayList<String>();
//		eSwitches.add("enable-automation");
//		options.setExperimentalOption("excludeSwitches", eSwitches);
		//options.setExperimentalOption("useAutomationExtension",true);
		options.addArguments("--disable-infobars");//new chromeversion it is deprecated and above 2 introduced
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		
		
		
driver.quit();
	}

}


//2ways we can remove chrome automation message
//excludeSwitches
//useAutomationExtension
