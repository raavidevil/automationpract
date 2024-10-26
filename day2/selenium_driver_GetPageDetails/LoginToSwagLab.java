package day2.selenium_driver_GetPageDetails;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToSwagLab {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		String expectedURL ="https://www.saucedemo.com/";
		String actualURL = driver.getCurrentUrl();
		System.out.println("URL validation = "+actualURL.equals(expectedURL));
		
		//1)Identify username input field 
		WebElement usernameInputField=driver.findElement(By.id("user-name"));
		usernameInputField.sendKeys("standard_user");
		
		WebElement passwordInputField=driver.findElement(By.id("password"));
		passwordInputField.sendKeys("secret_sauce");
		
		WebElement loginButton=driver.findElement(By.name("login-button"));
		loginButton.click();
		
		

		String expectedHomePageURL ="https://www.saucedemo.com/inventory.html";
		String actualHomePageURL = driver.getCurrentUrl();
		System.out.println("URL validation = "+actualHomePageURL.equals(expectedHomePageURL));
		


	}

}

/**
1)Open browser and enter required application URL
2)validate:
	login page url
3)enter username as "standard_user"
4)enter password as "secret_sauce"
5)click on login button
6)validate:
	home page url
*/