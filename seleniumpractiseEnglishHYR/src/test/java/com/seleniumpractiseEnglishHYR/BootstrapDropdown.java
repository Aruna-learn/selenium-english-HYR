package com.seleniumpractiseEnglishHYR;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	
	//single dropdown
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_6");//we can use this also https://www.jquery-az.com/
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		Thread.sleep(3000);
		List<WebElement> options=driver.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]/a"));
		for (WebElement option : options) {//iterate all options and find the selected one perform click action
			String optiontext=option.getText();//for anchor tag we use get text method
			System.out.println(optiontext);
			Thread.sleep(3000);
			if(optiontext.equals("CSS")) {//css/html/jquery/bootstrap
				option.click();
				break;
			}
			
			//System.out.println(options.size());
			
		}
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();

	}
	

}
