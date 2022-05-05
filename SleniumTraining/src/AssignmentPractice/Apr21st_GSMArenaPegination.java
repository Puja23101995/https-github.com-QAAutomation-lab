package AssignmentPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Apr21st_GSMArenaPegination {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver d6=new ChromeDriver();
		d6.get("https://www.gsmarena.com/");
		d6.manage().window().maximize();
		d6.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(d6,20);
		//validate homepage 
		WebElement valid=d6.findElement(By.cssSelector("p[class='pad']>*"));
		valid.click();
		System.out.println("enable"+valid.isEnabled());
		System.out.println("enable"+valid.isDisplayed());
		System.out.println("enable"+valid.isSelected());
		
		

	}

}
