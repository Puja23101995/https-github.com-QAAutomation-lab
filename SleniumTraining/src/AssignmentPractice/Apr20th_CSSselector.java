package AssignmentPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Apr20th_CSSselector {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d3= new ChromeDriver();
		d3.get("https://demosite.executeautomation.com/");
		System.out.println("Get Title page"+d3.getTitle());
		System.out.println("Get Title Length"+d3.getTitle().length());
		System.out.println("Get Current Url"+d3.getCurrentUrl());
		//Enter username as "execution"
		d3.findElement(By.cssSelector("#userName>P>input")).sendKeys("execution");
		//Enter pasword as "admin"
		d3.findElement(By.cssSelector("input[name='Password']")).sendKeys("admin");
		//click on login
		d3.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println("current url "+d3.getCurrentUrl());
		System.out.println("current Tilte"+d3.getTitle());
		//close
		d3.findElement(By.cssSelector("#cssmenu")).click();
		d3.close();
		

}
}