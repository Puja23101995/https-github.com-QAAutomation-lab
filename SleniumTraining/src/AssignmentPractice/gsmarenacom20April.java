package AssignmentPractice;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gsmarenacom20April {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d2=new ChromeDriver();
		d2.manage().window().maximize();
		d2.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		d2.get("https://www.gsmarena.com/");
		d2.findElement(By.cssSelector(".brandmenu-v2>p>a"));
		WebElement valid=d2.findElement(By.cssSelector(".brandmenu-v2>p>a"));
		System.out.println("Validation"+valid.isDisplayed());
		System.out.println("Validation"+valid.isEnabled());
		System.out.println("Validation"+valid.isSelected());
		List<WebElement>alloptions=d2.findElements(By.cssSelector(".brandmenu-v2>ul>li *:nth-child(1)"));
		System.out.println("all phones"+alloptions.size());
		for(int i=0;i<alloptions.size();i++) {
			System.out.println("all phone name"+alloptions.get(i).getText());
			
		}
		
	}

}
