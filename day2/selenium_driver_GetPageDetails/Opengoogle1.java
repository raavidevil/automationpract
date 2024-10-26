package day2.selenium_driver_GetPageDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opengoogle1 {

	public static void main(String[] args) {
	//1)open chrome browser
		WebDriver driver=new ChromeDriver();
		
		//2) enter google URL
		driver.get("https://www.google.com");
	
		//3)	validate- page title & url
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		System.out.println("Title validation status "+actualTitle.equals(expectedTitle));
		
		String expectedURL = "https://www.google.com/";
		String actualURL =driver.getCurrentUrl();
		System.out.println("URL validation "+actualURL.equals(expectedURL));
		
		//page source
		String pageSource=driver.getPageSource();
		System.out.println("Page source length: "+pageSource.length());
		
		
		//4)close browser
		driver.close();

	}

}


/*
1)Open chrome browser
2)enter google url
3)validate-
	page title
	page url
4)close the browser
*/