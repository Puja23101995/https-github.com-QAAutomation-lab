package selenium19422Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDay2Amezon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./\\executables\\chromedriver.exe");
		WebDriver d1= new ChromeDriver();
		d1.get("https://www.testandquiz.com/selenium/testing.html");
		//maximize window
		d1.manage().window().maximize();
		d1.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
		//minimize 
		//d1.manage().window().setSize(new Dimension(500,700));
		d1.manage().timeouts().implicitlyWait(750, TimeUnit.SECONDS);
		//get title 
		System.out.println("Get page Title"+d1.getTitle().length());
		d1.manage().timeouts().implicitlyWait(900, TimeUnit.SECONDS);
		//d1.findElement(By.linkText("Amazon Pay")).click();
		//d1.findElement(By.linkText("Selenium Webdriver Locating Strategies By Partial Link Text")).click();
		d1.manage().timeouts().implicitlyWait(1080, TimeUnit.SECONDS);
		System.out.println("Get New title"+d1.getTitle());
		d1.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		d1.navigate().back();
		if (d1.getTitle().equals(d1.getTitle())){
			System.out.println("Web page sucessful");
		}else {
			System.out.println("Web page not sucessful");
		
		}
		d1.manage().timeouts();
		d1.close();
			
		}
	
		
		

	}

