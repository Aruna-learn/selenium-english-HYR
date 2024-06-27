package com.seleniumpractiseEnglishHYR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSConditionsandPseudoClasses {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		
		//conditions
		
		//and no need to tyep and justuse []
		System.out.println(driver.findElements(By.cssSelector("input[class='button'][type='submit']")).size());
		
		
	    //or  no need to tyep and justuse ,
		System.out.println(driver.findElements(By.cssSelector("input[class='button'],input[type='submit']")).size());
		
		
		//not exclude elements uses :not()
		System.out.println(driver.findElements(By.cssSelector("input.button:not([type='button'])")).size());
		
		
		
		
		
		//Pseudo classes
		
		
		//first child not providing tag name uses :first-child
		System.out.println(driver.findElements(By.cssSelector(".container>:first-child")).size());
		
		
		//last child not providing tag name uses :last-child
		System.out.println(driver.findElements(By.cssSelector(".container>:last-child")).size());
		
		
		//nth child not providing tag name uses :nth-child(index) we can find the specific element either 2nd or 5th etc
		System.out.println(driver.findElements(By.cssSelector(".container>:nth-child(6)")).size());
		
		
		
		//first-of-type uses tag name and :first-of-type
		System.out.println(driver.findElements(By.cssSelector(".container>a:first-of-type")).size());
		
		
		//last-of-type uses tag name and :lastst-of-type
		System.out.println(driver.findElements(By.cssSelector(".container>input:last-of-type")).size());
		
		
		
		//nth-of-type uses tag name and :nth-of-type and index
		System.out.println(driver.findElements(By.cssSelector(".container>input:nth-of-type(5)")).size());
		
		
		
		
		
		

	}

}
