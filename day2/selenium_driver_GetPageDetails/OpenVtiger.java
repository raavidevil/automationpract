package day2.selenium_driver_GetPageDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenVtiger {

	public static void main(String[] args) {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demo.vtiger.com/");
	  
	  String pageTitle = driver.getTitle();
      System.out.println("Page Title: " + pageTitle);
    
      int titleLength = pageTitle.length();
      System.out.println("Title Length: " + titleLength);
      
      String expectedpageURL = "https://www.vtiger.com/crm-demo/"; 
      String actualpageURL = driver.getCurrentUrl();
      System.out.println("URL validation = "+ actualpageURL.equals(expectedpageURL));
      
      String pageSource=driver.getPageSource();
      System.out.println("Page source length: "+pageSource.length());
      
       driver.close();

      


	}

}
/*1)Launch a new Chrome browser.
2)Open https://demo.vtiger.com/
3)Get Page Title name and Title length
4)Print Page Title and Title length on the Eclipse Console.
5)Get Page URL and verify if it is a correct page opened
6)Get Page Source (HTML Source code) and Page Source length
7)Close the Browser.*/


