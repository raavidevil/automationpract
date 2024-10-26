package day2.selenium_driver_GetPageDetails;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get(" https://demo.vtiger.com/vtigercrm/index.php");
		
		String expectedLoginPageTitle ="vtiger";
		String actualLoginPageTitle=driver.getTitle();
		System.out.println("Validation of login page =" +actualLoginPageTitle.equals(expectedLoginPageTitle));
		
		WebElement usernameInputField=driver.findElement(By.id("username"));
		usernameInputField.clear();
		usernameInputField.sendKeys("admin");
		
		WebElement passwordInputfield=driver.findElement(By.name("password"));
		passwordInputfield.clear();
		passwordInputfield.sendKeys("admin");
		
		WebElement SigninButton=driver.findElement(By.tagName("button"));
		SigninButton.click();
		
		String expectedHomePageTitle = "Dashboard";
		String actualHomePageTitle = driver.getTitle();
		System.out.println("Title validation status "+actualHomePageTitle.equals(expectedHomePageTitle));
		
		driver.close();
		
	}

}
/*1)open a chrome browser
2)enter vtiger application url- https://demo.vtiger.com/vtigercrm/index.php
3)validation login page open or not
4)remove existing text from username field
5)type username as 'admin'
6)remove existing text from password field
7)type password as admin'
8)click on login button
9)validate home page
*/