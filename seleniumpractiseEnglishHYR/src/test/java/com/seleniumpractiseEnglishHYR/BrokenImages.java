package com.seleniumpractiseEnglishHYR;

import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImages {

	public static void main(String[] args) throws InterruptedException, Exception {
		
	//brokenimagesusingselenium();
		brokenimagesusingJsoup();
		
	}
	
	
	
	public static void brokenimagesusingselenium() throws InterruptedException, Exception {
		
		WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/broken-images");
		Thread.sleep(3000);
		
		List<WebElement>	images=driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		
		for (WebElement image : images) {
			String imageSrc=image.getAttribute("src");
			Proxy proxy = new Proxy(Type.HTTP, new InetSocketAddress("testhost", 8080));
			URL url=new URL(imageSrc);
			URLConnection urlconnection=url.openConnection();
			HttpURLConnection httpurlconnection=(HttpURLConnection) urlconnection;
			httpurlconnection.setConnectTimeout(5000);//to reduce timout exception
			
			httpurlconnection.connect();
			
			if(httpurlconnection.getResponseCode()==200) 
				System.out.println(imageSrc+ "-"+ httpurlconnection.getResponseMessage());
				else
					System.err.println(imageSrc+ "-"+ httpurlconnection.getResponseCode()+"-"+httpurlconnection.getResponseMessage());
				httpurlconnection.disconnect();
			
		}
	}
			
		

	
public static void brokenimagesusingJsoup() throws InterruptedException, Exception {
		
		
		
	Document doc = Jsoup.connect("https://practice.expandtesting.com/broken-images").get();//doc instance created and jus connect to url not open the url
	
	Elements images = doc.select("image");
	for (Element image : images) {
	  String imageSrc=image.attr("src");
	  if(!imageSrc.startsWith("http"))
			imageSrc = "https://practice.expandtesting.com/broken-images" + imageSrc;
	    
	
	  Proxy proxy = new Proxy(Type.HTTP, new InetSocketAddress("testhost", 8080));
			URL url=new URL(imageSrc);
			URLConnection urlconnection=url.openConnection();
			HttpURLConnection httpurlconnection=(HttpURLConnection) urlconnection;
			httpurlconnection.setConnectTimeout(5000);//to reduce timout exception
			
			httpurlconnection.connect();
			
			if(httpurlconnection.getResponseCode()==200) 
				System.out.println(imageSrc+ "-"+ httpurlconnection.getResponseMessage());
				else
					System.err.println(imageSrc+ "-"+ httpurlconnection.getResponseCode()+"-"+httpurlconnection.getResponseMessage());
				httpurlconnection.disconnect();
			
			
			
	

		}

	
}
}

