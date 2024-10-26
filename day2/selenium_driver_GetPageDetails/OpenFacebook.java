package day2.selenium_driver_GetPageDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenFacebook {

	public static void main(String[] args) {
	    WebDriver driver= new EdgeDriver();
	    driver.get("https://www.facebook.com");
	    
	    String homePageTitle = driver.getTitle();
	    
	    String expectedHomePageTitle = "Facebook – log in or sign up";
		String actualHomePageTitle = driver.getTitle();
		System.out.println("Title validation status "+actualHomePageTitle.equals(expectedHomePageTitle));
		System.out.println("Home page title is = "+actualHomePageTitle);
		
		driver.close();
	    

	}

}
/*
Scenario to Automate:
1. Launch the web browser.
 2. Open the URL?https://www.facebook.com?in the current browser.
 3. Fetching home page title.
 4. Verify actual tile of the home page with the expected title.
 5. Print home page title on the console.
 6. Close the browser.
*/