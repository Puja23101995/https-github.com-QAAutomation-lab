package AssignmentPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WwwDemoblazecom {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d4= new ChromeDriver();
		d4.get("https://www.demoblaze.com/");
		d4.manage().window().maximize();
		d4.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS );
		WebElement categories=d4.findElement(By.cssSelector(".list-group>*:nth-child(1)"));
		categories.isDisplayed();
		categories.isEnabled();
		categories.isSelected();
		categories.getText().equals("catogories");
		d4.findElement(By.id("tbodyid")).click();
		List<WebElement> categories1=d4.findElements(By.cssSelector(".list-group>a"));
	  System.out.println("count"+categories1.size());
	  List<String> l1=new ArrayList<String>();
		l1.add("CATEGORIES");
		//l1.add("Phones");
		//l1.add("Laptops");
		//l1.add("Monitors");
		//Logic to get one by one element from the list and performing validation on that
		for (int i = 0; i < categories1.size(); i++) {
			WebElement cat = categories1.get(i);
			System.out.println("********* Element of List is: " + cat.getText() + "*********");
			System.out.println(cat.isDisplayed());
			System.out.println(cat.isEnabled());
			System.out.println(cat.getText().equals(l1.get(i)));
		}
	  

}
}
