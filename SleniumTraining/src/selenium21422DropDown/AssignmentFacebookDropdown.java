package selenium21422DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentFacebookDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.get("https://www.facebook.com/");
		
		//WebDriverWait wait=new WebDriverWait(driver,20);
		d1.manage().window().maximize();
		//Validate home page
			
		//Click on create account
		//d1.findElement(By.cssSelector("._6lti ")).click();
	    //d1.navigate().forward();
	    //	//**** Identify dropdown list
	    
		
}
}
	

