package com.seleniumpractiseEnglishHYR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSCombinatorSelectors {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		//4types combinator selectors
		
		//Descendent selectors (child and grand child)
		System.out.println(driver.findElements(By.cssSelector(".container select")).size());
		
		//child selector(for container div child and for div select child)
		System.out.println(driver.findElements(By.cssSelector(".container>div>select")).size());
		
		//Adjacent Sibling selector (just immediate sibling) uses + symbol
		System.out.println(driver.findElements(By.cssSelector("input[placeholder='Verify your personal details']+select")).size());
		
		//General sibling selector(all siblings) uses ~
		System.out.println(driver.findElements(By.cssSelector("input[placeholder='Verify your personal details']~br")).size());
		
		
		
		
		
	}

}
