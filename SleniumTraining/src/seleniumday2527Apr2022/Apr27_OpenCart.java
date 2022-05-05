package seleniumday2527Apr2022;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import SeleniumUtility.SeleniumUtility;

public class Apr27_OpenCart {

	public static void main(String[] args) {
		SeleniumUtility d1=new SeleniumUtility();
		WebDriver driver=d1.setUp("chrome", "https://www.opencart.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-username")).sendKeys("pooja",Keys.TAB);
		
		
		
	}

}
