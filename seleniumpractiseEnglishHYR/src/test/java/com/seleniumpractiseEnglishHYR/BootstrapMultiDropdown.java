package com.seleniumpractiseEnglishHYR;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapMultiDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		WebElement dropbtn=driver.findElement(By.xpath("//button[contains(@class,'multiselect ')]"));//instead of writing find element everytime we just store in dropbtn so easy to use
		dropbtn.click();
		
	List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]/li[not(@class='multiselect-item multiselect-group')]/a/label"));
		
	for (WebElement option : options) {//iterate all options and find the selected one perform click action
		WebElement optionChk = option.findElement(By.tagName("input"));
		String optiontext=option.getText();//for anchor tag we use get text method
		System.out.println(optiontext);
		//Thread.sleep(3000);
		if(optiontext.equals("Bootstrap")) 
			option.click();
		Thread.sleep(3000);
		if(optiontext.equals("Oracle")) 
			option.click();//click oracle
		Thread.sleep(3000);
		if(optiontext.equals("Angular")) 
			optionChk.click();
		Thread.sleep(3000);
		
		if(optiontext.equals("Angular") && option.findElement(By.tagName("input")).isSelected()) {
			optionChk.click();//uncheck oraacle
			
			Thread.sleep(3000);
			
			if(optiontext.equals("Bootstrap") && option.findElement(By.tagName("input")).isSelected()) {
				optionChk.click();//uncheck CSS
				Thread.sleep(3000);
				
				if(optiontext.equals("Oracle") && option.findElement(By.tagName("input")).isSelected()) {
					optionChk.click();//uncheck HTML
					Thread.sleep(3000);
			if(Boolean.valueOf(dropbtn.getAttribute("aria-expanded")))//close the dropdown button
				dropbtn.click();
			
			
	}
	
}
	
}
	}
	}
}

	
