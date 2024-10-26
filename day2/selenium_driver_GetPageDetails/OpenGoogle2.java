package day2.selenium_driver_GetPageDetails;

import org.openqa.selenium.WebDriver;

import day1.browseropening.ToReuse_method;

public class OpenGoogle2 {

	public static void main(String[] args) {

		WebDriver driver = ToReuse_method.setup("chrome","https://www.google.com");
	//	driver.get("https://www.google.com");

		// 3) validate- page title & url
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		System.out.println("Title validation status " + actualTitle.equals(expectedTitle));

		String expectedURL = "https://www.google.com/";
		String actualURL = driver.getCurrentUrl();
		System.out.println("URL validation " + actualURL.equals(expectedURL));

		// page source
		String pageSource = driver.getPageSource();
		System.out.println("Page source length: " + pageSource.length());

		// 4)close browser
		// driver.close();

	}

}
