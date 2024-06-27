package com.seleniumpractiseEnglishHYR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class CSSAttributeSelectors {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		
		//7 attribute selectors
		
		//Attribute  name placeholder and tag input
		System.out.println(driver.findElements(By.cssSelector("input[placeholder]")).size());
		
		//Attribute value
		System.out.println(driver.findElements(By.cssSelector("input[placeholder='First Name']")).size());
		
		//Attibute value-partial text-wholeword uses tilt symbol~
		System.out.println(driver.findElements(By.cssSelector("input[placeholder~='question']")).size());
		
		//Attibute value-partial text-text uses symbol * 
		System.out.println(driver.findElements(By.cssSelector("input[placeholder*='ques']")).size());
		
		//Attibute value-starts with-whole word uses symbol |
		System.out.println(driver.findElements(By.cssSelector("p[class|='my']")).size());
		
		//Attibute value-starts with-textuses symbol ^
		System.out.println(driver.findElements(By.cssSelector("p[class^='my']")).size());
		
		//Attribute value-endswith-text uses $
		System.out.println(driver.findElements(By.cssSelector("p[class$='op']")).size());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
