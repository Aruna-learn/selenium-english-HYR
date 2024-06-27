package com.seleniumpractiseEnglishHYR;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilities {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		DesiredCapabilities caps = new DesiredCapabilities();// desired capabilities class to allow the insecure
																// websites
		caps.setAcceptInsecureCerts(true);
		ChromeOptions options = new ChromeOptions();// after desired capabilities we lose few configuration to get those
													// we use driveroption class
		options.addArguments("--start - maximized");
		options.merge(options);// merging caps desired capabilities with options class
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.cacerts.com");

	}

	private void setAcceptInsecureCerts(boolean b) {

	}

}
