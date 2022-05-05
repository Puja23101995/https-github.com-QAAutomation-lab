package AssignmentPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SeleniumUtility.SeleniumUtility;

public class Apr27_Saucedemo {

	public static void main(String[] args) {
		SeleniumUtility d1=new SeleniumUtility();
		WebDriver driver=d1.setUp("chrome", "https://www.saucedemo.com/");
		String cred=driver.findElement(By.cssSelector(".login_credentials")).getText();
		String [] loginDetails=cred.split(" ");
		System.out.println(loginDetails[1]);
			
		
		
	}

}
