package com.seleniumpractiseEnglishHYR;

import java.time.Duration;
import java.time.Instant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XPathVsCSS {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		Instant starttime=Instant.now();
	    System.out.println(starttime.toString());
	    
	    driver.get("https://www.oracle.com/in/cloud/sign-in.html");
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='cloudAccountName']")).sendKeys("aruna");
		//driver.findElement(By.cssSelector("input[id='cloudAccountName']")).sendKeys("reddy");
		
		
		Instant endtime=Instant.now();
	    System.out.println(endtime.toString());
		
			
		Duration duration=Duration.between(starttime, endtime);
		System.out.println("Time taken: " + duration.toSeconds() + "seconds");
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}
