package com.seleniumpractiseEnglishHYR;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.Logs;
import org.w3c.dom.DOMConfiguration;
import org.openqa.selenium.By;

public class log4jexample {

	public static Logger log;

	public static void main(String[] args) throws Exception {
		//  DOMConfigurator.configure("log4j.xml");  
		log = LogManager.getLogger(log4jexample.class);// create logger instance we need to pass class name and logger
													// log in static
		Thread.sleep(3000);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		log.info("logged into hyr toturials");

		driver.findElement(By.id("output"));
		System.out.println(driver.findElement(By.id("output")).getText());// prints output
		Thread.sleep(3000);
		log.info("click on alert box");
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(3000);
		log.info("switch to alert");
		driver.switchTo().alert().getText();
		Thread.sleep(3000);
		log.info("accept alert");
		driver.switchTo().alert().accept();// click on ok button
		Thread.sleep(3000);
		log.info("getoutput");
		System.out.println(driver.findElement(By.id("output")).getText());// prints output
		Thread.sleep(3000);
		log.info("quit driver");
		driver.quit();

	}

}
