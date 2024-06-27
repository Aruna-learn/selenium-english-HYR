package com.seleniumpractiseEnglishHYR;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoostrapDropdownGenericHDFC {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.xpath("//div[@class='dropdown']//a")).click();
		
	List<WebElement>	producttype=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		
		System.out.println(producttype.size());
		genericdropdown(producttype,"Health Insurance");
	}
		
		
//		for (WebElement product : producttype) {
//			System.out.println(product.getText());
//			
//			if(product.getText().equals("Health Insurance")) {
//				product.click();
//				break;
//			}
//			
//			
//		}
		
		
		

	
	
	//generic dropdown
	public static void genericdropdown(List<WebElement> options, String value) {
		
		
		for (WebElement option : options) {
			//System.out.println(product.getText());
			
			if(option.getText().equals("Health Insurance")) {
				option.click();
				break;
			}
	}
	
	}
	
	}
	

