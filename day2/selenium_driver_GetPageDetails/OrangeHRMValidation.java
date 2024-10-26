package day2.selenium_driver_GetPageDetails;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMValidation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String expectedPageTitle ="OrangeHRM";
		String actualPageTitle =driver.getTitle();
		System.out.println("Login page validation is = "+actualPageTitle.equals(expectedPageTitle));
		
		WebElement userInputFieldId =driver.findElement(By.name("username"));
		userInputFieldId.sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.tagName("button")).click();
		
		String ExpectedHomePageTitle="OrangeHRM";
		String actualHomePageTitle= driver.getTitle();
		System.out.println("HOme page validation =" +actualHomePageTitle.equals(ExpectedHomePageTitle));
		

	}

}

/*Open chrome browser
Enter App url as https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
Validate login page
Enter user name as Admin
Password as admin123
Click on login button
Validate home page
*/