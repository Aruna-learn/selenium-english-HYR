package com.seleniumpractiseEnglishHYR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSimpleSelectors {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		driver.findElement(By.cssSelector("#firstName")).sendKeys("Aruna");//id starts with #
		driver.findElement(By.cssSelector(".gender")).sendKeys("female");//class starts with .
		
		System.out.println(driver.findElement(By.cssSelector("button")).getAttribute("id"));//elment  and after button get id attribute value
		System.out.println(driver.findElements(By.cssSelector("*")).size());// * for universal selector and find element always shows first element and if we use find elements it give all elements
		
		
		
	}

}
