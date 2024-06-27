package com.seleniumpractiseEnglishHYR;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.hyrtutorials.com/");
		Thread.sleep(3000);
		
		
		Set<String> brokenlinkUrls = new HashSet<String>();
	List<WebElement>	links=driver.findElements(By.tagName("a"));//links having tag as a so we used as "a"
	System.out.println(links.size());//prints size of links
	
	for (WebElement link : links) {//ieate each and every link
		
		String linkURL = link.getAttribute("href");//getattribite return the link address and href has the link address and get the link[linkurl is text and url in the form of text stored in string we need to create url instance created in below]
		
		Proxy proxy = new Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress("hostname", 80));//in companys we hve proxy issue so connect proxy
		
		URL url=new URL(linkURL);//URL is class in java and pass the linkurl instance 
		
		URLConnection urlconnection=url.openConnection();//open the connection to url and stores in urlconnection
		//in web application we have 2types of requests http and https and here we use http to send the request to server
		HttpURLConnection httpurlconnection=(HttpURLConnection) urlconnection;//HttpURLConnection is abstract class we can't create in stance so we assign urlconnection and type cast, urlconnection is converted into httpurl connection
		
		
		httpurlconnection.setConnectTimeout(5000);//to reduce timout exception
		
		httpurlconnection.connect();
		
		if(httpurlconnection.getResponseCode()!=200) {
			brokenlinkUrls.add(linkURL);
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	if(httpurlconnection.getResponseCode()==200)//if 200 it prints all the links and if not prints all the broken links also but here we gt all the links we no need to scroll and get duplicate also the broken link to overcome we use the set and hashset
//			System.out.println(linkURL+ "-"+ httpurlconnection.getResponseMessage());
//		else
//			System.err.println(linkURL+ "-"+ httpurlconnection.getResponseCode()+"-"+httpurlconnection.getResponseMessage());
		httpurlconnection.disconnect();

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	driver.quit();
	
	for (String brokenlinkUrl : brokenlinkUrls) {
		System.err.println(brokenlinkUrl);//it prints only invalid and broken urls
	}

	}

}
